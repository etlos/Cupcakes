package PresentationLayer;

import FunctionLayer.BasketLine;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class PlaceOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        HttpSession session = request.getSession();

        ArrayList<BasketLine> basket = (ArrayList<BasketLine>) request.getAttribute("basket");
        int totalPrice = 0;
        int userId = 0;
        totalPrice = Integer.parseInt(request.getParameter("totalPrice"));
        userId = (int) session.getAttribute("userId");
        int orderId = LogicFacade.createOrder(userId);

        for(BasketLine b : basket){
            int quantity = b.getAmount();
            int sum = (int) b.getSum();
            int bottomId = b.getBottomId();
            int toppingId = b.getToppingId();

            LogicFacade.createOrderLine(orderId,toppingId,bottomId,quantity,sum);

            LogicFacade.updateUserCredit(userId,totalPrice);
            basket.clear();
        }
        return "index";
    }
}
