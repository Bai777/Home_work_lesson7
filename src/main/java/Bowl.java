public class Bowl {
    private int foodAmount;

    public boolean putFood(int amount){
        if (amount <= 0){
            System.out.printf("The food in the bowl is not be negative or zero\n", this.foodAmount);
            return false;
        }else {
            this.foodAmount += amount;
            System.out.printf("Bowl food amount increased, now %d\n", this.foodAmount);
            return true;
        }
    }


    public void decreaseFood(int amount){
            this.foodAmount -= amount;
            System.out.printf("Bowl food amount decreased, now %d\n", this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
