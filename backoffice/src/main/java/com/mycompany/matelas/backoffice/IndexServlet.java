
package com.mycompany.matelas.backoffice;

import com.mycompany.matelas.core.entity.Matelas;
import com.mycompany.matelas.core.entity.PanierItem;
import com.mycompany.matelas.core.entity.Stock;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "IndexServlet", urlPatterns = {"/Index"})
public class IndexServlet extends HttpServlet {
    
    Stock stock = new Stock();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      request.setAttribute("stock", stock.stock);
      
      int quantite = 0;
      HttpSession session = request.getSession();
       ArrayList<PanierItem> panier = (ArrayList<PanierItem>)session.getAttribute("panier");
       if(panier != null) {
           quantite = panier.size();
       }
      request.setAttribute("quantite", quantite);
      
      request.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp")
              .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Matelas newMatelas = new Matelas();
        
        newMatelas.setNom(request.getParameter("nom"));
        newMatelas.setPrix(Integer.parseInt(request.getParameter("prix")));
        
        stock.stock.add(newMatelas);
        
        
        doGet(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
