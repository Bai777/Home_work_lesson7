public class Cat_Home extends Cats{

    public Cat_Home(String name, int appetite, boolean satiety) {
        super(name, appetite, satiety);
    }

    @Override
    public void eat(Bowl bowl) {
        super.eat(bowl);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAppetite() {
        return super.getAppetite();
    }

    @Override
    public void setAppetite(int appetite) {
        super.setAppetite(appetite);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
