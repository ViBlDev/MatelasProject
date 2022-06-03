
package com.mycompany.matelas.core.entity;

public class PanierItem {
    
    private Long matelasId;
    private int quantite;

    public PanierItem(Long matelasId, int quantite) {
        this.matelasId = matelasId;
        this.quantite = quantite;
    }

    public PanierItem() {
    }
    
    

    public Long getMatelasId() {
        return matelasId;
    }

    public void setMatelasId(Long matelasId) {
        this.matelasId = matelasId;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "PanierItem{" + "matelasId=" + matelasId + ", quantite=" + quantite + '}';
    }
    
    
    
}
