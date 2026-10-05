public class Cafe {

    // Object properties inicialization
    private String name;
    private double price;
    private double stock;
    // private Vector<lote> v; 

    //Getter and setter methods

    public void setName(String settedName){
        this.name = settedName;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double settedPrice){
        this.price = settedPrice;
    }

    public double getPrice(){
        return this.price;
    }

    public void setStock(double settedStock){
        this.stock = settedStock;
    }

    public double getStock(){
        return this.stock;
    }
}
