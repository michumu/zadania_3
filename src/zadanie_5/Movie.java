package zadanie_5;

public class Movie extends Product implements Borrowed, Ranking{
    private String cast;
    private String lector;
    private int duration;
    private String writings;

    public Movie(int id, Author author, String title, int index) {
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

    public Movie(int id, Author author, String title, int index, String cast, String lector, int duration, String writings) {
        super(id, author, title, index);
        this.cast = cast;
        this.lector = lector;
        this.duration = duration;
        this.writings = writings;
    }

}
