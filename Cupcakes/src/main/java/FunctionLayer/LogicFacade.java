package FunctionLayer;

import DBAccess.CupcakeMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;

import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    }

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static ArrayList<Bottom> getBottoms() throws LoginSampleException {
        return CupcakeMapper.getBottoms();
    }

    public static ArrayList<Topping> getToppings() throws LoginSampleException {
        return CupcakeMapper.getToppings();
    }

    public static int createOrder(int userId) throws LoginSampleException {
        return OrderMapper.createOrder(userId);
    }
    public static void createOrderLine(int orderId, int toppingId, int bottomId, int quantity, int sum) throws LoginSampleException {
        OrderMapper.createOrderLine(orderId, toppingId, bottomId, quantity, sum);
    }
    public static void updateUserCredit(int userId, double totalPrice) throws LoginSampleException {
        OrderMapper.updateUserCredit(userId,totalPrice);
    }
    public static ArrayList<OrderLine> getAllOrders() throws LoginSampleException {
        return OrderMapper.getAllOrders();
    }



}
