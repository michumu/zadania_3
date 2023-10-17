package zadanie_4;

public class Worker implements Cook, Pilot {
    @Override
    public boolean flyingPlane() {
        return false;
    }

    @Override
    public boolean cooking() {
        return false;
    }
}
