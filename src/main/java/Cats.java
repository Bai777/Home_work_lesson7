public class Cats {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Bowl bowl){
        if (bowl.getFoodAmount() > appetite) {
            System.out.printf("%s eat for some food and he is full = %b\n", this.name, this.satiety = true);
            bowl.decreaseFood(appetite);
        }else {
            System.out.printf("There is not enough food in the bowl. %s is not full = %b\n", this.name, this.satiety);
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    @Override
    public String toString() {
        return "Cat_Home{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
