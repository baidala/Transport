package transport;


import java.io.Serializable;
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

public class Route implements Serializable {
    @Id
    @Column (name="ID", unique=true, nullable=false)
    private int id;
    
    @Column (name="NUMBER", unique=false, nullable=false)
    private int number;
    
    @Column (name="FROMPOINT", unique=false, length=50)
    private String fromPoint;
    
    @Column (name="TOPOINT", unique=false, length=50)
    private String toPoint;
    
    @Column (name="PRICE", unique=false, nullable=false)
    private int price;
    
    
    public int getPrice() {
        return this.price;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getFromPoint() {
        return fromPoint;
    }

    public String getToPoint() {
        return toPoint;
    }
    
    

    void setNumber(int i) {
        number = i;
        
    }

    void setFromPoint(String khreschatik) {
        fromPoint = khreschatik;
        
    }

    void setPrice(int i) {
        price = i;
    }

    void setToPoint(String zulyany) {
        toPoint = zulyany;
    }
    
    
    
}
