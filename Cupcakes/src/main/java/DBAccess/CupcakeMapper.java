package DBAccess;

import FunctionLayer.Bottom;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Topping;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class CupcakeMapper {

    public static ArrayList<Bottom> getBottoms() throws SQLException, LoginSampleException {

        ArrayList<Bottom> bottoms = new ArrayList<>();
        // BOTTOM
        try {
            Connection con = Connector.connection();
            // Prepare SQL.
            String SQL = "SELECT * FROM bottom";
            // Set prepared statement.
            PreparedStatement ps = con.prepareStatement(SQL);
            // Execute SQL.
            ResultSet rs = ps.executeQuery();

            // Create ArrayList and get data from database.
            while (rs.next()) {
                int bottomId = rs.getInt("bottomId");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                Bottom bottom = new Bottom(bottomId, name, price);
                bottoms.add(bottom);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return bottoms;
    }


    public static ArrayList<Topping> getToppings() throws SQLException, LoginSampleException {

        ArrayList<Topping> toppings = new ArrayList<>();
        // TOPPING

        try {
            Connection con = Connector.connection();
            // Prepare SQL.
            String SQL = "SELECT * FROM topping";
            // Set prepared statement.
            PreparedStatement ps = con.prepareStatement(SQL);
            // Execute SQL.
            ResultSet rs = ps.executeQuery();

            // Create ArrayList and get data from database.
            while (rs.next()) {
                int toppingId = rs.getInt("toppingId");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                Topping topping = new Topping(toppingId, name, price);
                toppings.add(topping);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return toppings;
    }

}