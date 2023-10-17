package zadanie_5;

public class Music extends Product implements Borrowed, Ranking{
    private String contractor;
    private String carrier;

    public Music(int id, Author author, String title, int index) {
        super(id, author, title, index);
    }

    @Override
    public String addReview() {
        return null;
    }

    @Override
    public String removeReview() {
        return null;
    }

    @Override
    public double addScore() {
        return 0;
    }

    @Override
    public double removeScore() {
        return 0;
    }

    public Music(int id, Author author, String title, int index, String contractor, String carrier) {
        super(id, author, title, index);
        this.contractor = contractor;
        this.carrier = carrier;
    }
}


