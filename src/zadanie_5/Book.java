package zadanie_5;

public class Book extends Product implements Borrowed, Ranking{
    private String cover;
    private String originalLanguage;
    private int issueNo;

    public Book(int id, Author author, String title, int index) {
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

    public Book(int id, Author author, String title, int index, String cover, String originalLanguage, int issueNo) {
        super(id, author, title, index);
        this.cover = cover;
        this.originalLanguage = originalLanguage;
        this.issueNo = issueNo;
    }

}
