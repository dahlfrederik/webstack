import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"} )
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String til servlet
        String navn = request.getParameter("navn");
        System.out.println(navn);
        request.setAttribute("minAtribut", navn);

        //Arraylist til servlet:
        List<String> liste = new ArrayList<>();
        liste.add("Jørgen");
        liste.add("Emma");
        liste.add("Karsten");
        liste.add("Johnny");
        request.setAttribute("rockerListe",liste);

        Map<String,String> map = new HashMap<>();
        map.put("Jørgen","22");
        map.put("Emma","42");
        map.put("Karsten","21");
        map.put("Johnny","33");
        request.setAttribute("map",map );

        Set<String> setEx = new HashSet<>(liste);
        request.setAttribute("set",setEx );

        request.getRequestDispatcher("Velkommen.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
