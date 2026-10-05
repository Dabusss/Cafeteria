public class Lote {
    // We initialize the class' properties
    private double weight;
    private String expirationDate;
    

    // Getters and setters methods
    public void setWeight(double settedWeigth){
        this.weight = settedWeigth;
    }

    public double getWeigth(){
        return this.weight;
    }

    public void setExpirationDate(String settedDate){
        this.expirationDate = settedDate;
    }

    public String getExpirationDate(){
        return this.expirationDate;
    }
}