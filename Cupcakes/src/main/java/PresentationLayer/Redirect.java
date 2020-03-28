package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String gotopage = request.getParameter("redirect");
        switch (gotopage){
            case "addcredit":
                return "admin/addcredit";
            case "basket":
                return "customers/basket";
        }

        return "Ups";
    }

}
