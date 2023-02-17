package miniproject.RestaurantBillGenerator;

public class Order {
 public static int count=999;
    public int orderCode;
    public int numOfDish;
    public double orderPrice;
    public Dish dish;
//8-yemek ve adet parametreleri ile obje olusturalim
    public Order(Dish dish,int numberOfDish){
        count++;
        this.orderCode=count;
        this.dish=dish;
        this.numOfDish=numberOfDish;
    }

    //9=siparis fiyatini hesaplayalim
    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }
}
