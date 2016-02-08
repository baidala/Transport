/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;


import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Student
 */
@Entity
@Table (name="ROUTE")

public class Route {
    @Id
    @Column (name="ID", unique=true, nullable=false)
    private int id;
    
    @Column (name="NUMBER", unique=false, nullable=false)
    private int number;
    
    @Column (name="FROM_POINT", unique=false, length=50)
    private String fromPoint;
    
    @Column (name="TO_POINT", unique=false, length=50)
    private String toPoint;
    
    @Column (name="PRICE", unique=false, nullable=false)
    private int price;
    
    
    public int getPrice() {
        return this.price;
    }
    
    public void set() {
    }
    
    
    
}
