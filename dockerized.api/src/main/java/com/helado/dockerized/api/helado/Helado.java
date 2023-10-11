package com.helado.dockerized.api.helado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "helados")
public class Helado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "sabor")
    private String sabor;
    
    @Column(name = "stock")
    private int stock;
    
    public Long getId(){ return this.id; }
    public void setId(Long id){ this.id = id; }
    
    public String getSabor(){ return this.sabor; }
    public void setSabor(String sabor){ this.sabor = sabor; }
    
    public int getStock(){ return this.stock; }
    public void setStock(int stock){ this.stock = stock; }
}
