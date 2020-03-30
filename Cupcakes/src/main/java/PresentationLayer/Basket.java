package PresentationLayer;

import DBAccess.CupcakeMapper;
import FunctionLayer.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.UUID;

public class Basket extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, NumberFormatException {
        HttpSession session = request.getSession();

        if (session.getAttribute("basket") == null) {
            ArrayList<BasketLine> basket = new ArrayList<>();
            session.setAttribute("basket", basket);
        }

        ArrayList<Bottom> allBottoms = (ArrayList<Bottom>) session.getAttribute("bottomList");
        ArrayList<Topping> allToppings = (ArrayList<Topping>) session.getAttribute("toppingList");

        int bId = 0;
        int tId = 0;
        int bottomId = 0;
        int toppingId = 0;
        int amount = 0;


        try {
            bId = Integer.parseInt(request.getParameter("bottom"));
            tId = Integer.parseInt(request.getParameter("topping"));
            bottomId = Integer.parseInt(request.getParameter("bottom")) -1;
            toppingId = Integer.parseInt(request.getParameter("topping")) -1;
            amount = Integer.parseInt(request.getParameter("count"));
        } catch (NumberFormatException ex) {
        }


        if(allBottoms == null){
            allBottoms = LogicFacade.getBottoms();
        }else{
            allBottoms = (ArrayList<Bottom>) session.getAttribute("bottomList");
        }
        if(allToppings == null){
            allToppings = LogicFacade.getToppings();
        }else{
            allToppings = (ArrayList<Topping>) session.getAttribute("toppingList");
        }



        request.setAttribute("buttoms", allBottoms);
        request.setAttribute("toppings", allToppings);
        List<Bottom> bottoms = (List<Bottom>) request.getAttribute("buttoms");
        List<Topping> toppings = (List<Topping>) request.getAttribute("toppings");



        String lineId = UUID.randomUUID().toString();
        String bottomName = bottoms.get(bottomId).getName();
        String toppingName = toppings.get(toppingId).getName();
        int bottomPrice = bottoms.get(bottomId).getPrice();
        int toppingPrice = toppings.get(toppingId).getPrice();
        int sum = (bottomPrice + toppingPrice) * amount;
        BasketLine line = new BasketLine(lineId, (bId), (tId), bottomName, toppingName, amount, sum);
        System.out.println(line);
        ((ArrayList<BasketLine>) session.getAttribute("basket")).add(line);

        return "customers/customerpage";
    }
}


