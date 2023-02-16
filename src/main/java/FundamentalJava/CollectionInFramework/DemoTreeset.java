package FundamentalJava.CollectionInFramework;

import java.util.TreeSet;

public class DemoTreeset
{
    public static void main(String[] args)
    {
        TreeSet<Supermarket> Joy=new TreeSet<Supermarket>();
        Joy.add(new Supermarket("SakthiMasala",500,110.0));

        Supermarket obj=new Supermarket("SelvamMasala",1000,30.0);

        Joy.add(obj);

        Joy.add(new Supermarket("AachiMasala",100,300.0));

        System.out.println(Joy);



    }
}

class Supermarket implements  Comparable<Supermarket>
{
    String productName;
    Integer quantity;
    Double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Supermarket(String productName, Integer quantity, Double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int compareTo(Supermarket obj) {
//        return obj.productName.compareTo(this.productName);
        return obj.price.compareTo(this.price);
    }
}