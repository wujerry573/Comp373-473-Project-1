package com.facility.dal;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityLocation;

public class FacilityDAO {

    public FacilityDAO() {}

    public Facility getFacility(String facilityId) {
        try {
            //Get Facility
            Statement st = DBHelper.getConnection().createStatement();
            String selectFacilityQuery = "SELECT facilityID, availableCapcity, maxCapacity FROM Facility WHERE facilityID = '" + facilityId + "'";

            ResultSet facilRS = st.executeQuery(selectFacilityQuery);
            System.out.println("FacilityDAO: Query " + selectFacilityQuery);

            //Get Facility
            Facility facility = new Facility();
            while ( facilRS.next() ) {
                facility.setFacilityId(facilRS.getString("customerID"));
                facility.setAvailableCapacity(facilRS.getInt("customerID"));
                facility.setMaxCapacity(facilRS.getInt("customerID"));
                //facility.setLocation((FacilityLocation) facilRS.getObject("location"));
            }
            //close to manage resources
            facilRS.close();

            //Get FacilityLocation
            String selectAddressQuery = "SELECT locationID, street, unit, city, state, zip FROM FacilityLocation WHERE locationId = '" + facilityId + "'";
            ResultSet locatRS = st.executeQuery(selectAddressQuery);
            FacilityLocation location = new FacilityLocation();

            System.out.println("FacilityDAO: Query " + selectAddressQuery);

            while ( locatRS.next() ) {
                location.setLocationId(locatRS.getString("locationId"));
                location.setStreet(locatRS.getString("street"));
                location.setUnit(locatRS.getString("unit"));
                location.setCity(locatRS.getString("city"));
                location.setState(locatRS.getString("state"));
                location.setZip(locatRS.getString("zip"));
            }

            facility.setLocation(location);
            //close to manage resources
            locatRS.close();
            st.close();

            return facility;
        }
        catch (SQLException se) {
            System.err.println("FacilityDAO: Threw a SQLException retrieving the customer object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }

        return null;
    }

    public void addFacility(Facility facil) {
        Connection con = DBHelper.getConnection();
        PreparedStatement facilPst = null;
        PreparedStatement locatPst = null;

        try {
            //Insert the Facility object
            String facilStm = "INSERT INTO Facility(facilityId, availableCapacity, maxCapacity) VALUES(?, ?, ?)";
            facilPst = con.prepareStatement(facilStm);
            facilPst.setString(1, facil.getFacilityId());
            facilPst.setInt(2, facil.getAvailableCapacity());
            facilPst.setInt(3, facil.getMaxCapacity());
            facilPst.executeUpdate();

            //Insert the FacilityLocation object
            String locatStm = "INSERT INTO FacilityLocation(locationId, street, unit, city, state, zip) VALUES(?, ?, ?, ?, ?, ?, ?)";
            locatPst = con.prepareStatement(locatStm);
            locatPst.setString(1, facil.getFacilityId());
            locatPst.setString(2, facil.getLocation().getLocationId());
            locatPst.setString(3, facil.getLocation().getStreet());
            locatPst.setString(4, facil.getLocation().getUnit());
            locatPst.setString(5, facil.getLocation().getCity());
            locatPst.setString(6, facil.getLocation().getState());
            locatPst.setString(7, facil.getLocation().getZip());
            locatPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (locatPst != null) {
                    locatPst.close();
                    facilPst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                System.err.println("CustomerDAO: Threw a SQLException saving the customer object.");
                System.err.println(ex.getMessage());
            }
        }
    }
}
