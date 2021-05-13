public class Cat_Wild extends Cats{


    public Cat_Wild(String name, int appetite, boolean satiety) {
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
