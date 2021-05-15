public class Cats {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl){
        if (bowl.decreaseFood(this.appetite)) {
            System.out.printf("%s eat for some food\n", this.name);
            this.satiety = true;
        }else {
            System.out.println("There is not enough food in the bowl.");
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
        return "Cats{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
