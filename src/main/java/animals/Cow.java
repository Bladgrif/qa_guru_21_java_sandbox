package animals;

public class Cow extends Animal {

    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }

    public String getSay() {
        String say = super.getSay();
        return say + " New !";
    }

    void mu() {
        System.out.println(getSay() + " in all he " + getTeeth() + " teeth");
    }
}
