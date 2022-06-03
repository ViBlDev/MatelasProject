
package com.mycompany.matelas.backoffice;

import com.mycompany.matelas.core.entity.PanierItem;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PanierServlet", urlPatterns = {"/panier"})
public class PanierServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        HttpSession session = request.getSession();
        ArrayList<PanierItem> panier = (ArrayList<PanierItem>)session.getAttribute("panier");
        if(panier == null) {
           panier = new ArrayList<>();
        }
        
        request.setAttribute("panier", panier);
        
        request.getServletContext().getRequestDispatcher("/WEB-INF/panier.jsp")
              .forward(request, response);
     
     }
        

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       Long matelasId = Long.parseLong(request.getParameter("matelasId"));
       System.out.println("ID: "+matelasId);

       HttpSession session = request.getSession();
       
       ArrayList<PanierItem> panier = (ArrayList<PanierItem>)session.getAttribute("panier");
       if(panier == null) {
           panier = new ArrayList<>();
       }
       
              boolean produitExistantDansPanier = false;
       /*
        for(PanierItem item: panier){
           if(item.getMatelasId().equals(matelasId)){
               item.setQuantite(item.getQuantite()+1);
               produitExistantDansPanier = true;
           }
       }*/
       // On optimise la boucle pour arreter le parcours du Panier 
       // si on a trouvé l'élément qu'on cherchait
       // On choisit donc un while avec une double condition
       int i = 0;
       while(i<panier.size() && !produitExistantDansPanier) {
           PanierItem item = panier.get(i);
           if(item.getMatelasId().equals(matelasId)){
               item.setQuantite(item.getQuantite()+1);
               produitExistantDansPanier = true;
           }
           i++;
       }
       if(! produitExistantDansPanier){
           panier.add(new PanierItem(matelasId, 1));
       }
       

       session.setAttribute("panier", panier);
       
       // afficher la page Panier
       doGet(request, response);
    }

    

}
