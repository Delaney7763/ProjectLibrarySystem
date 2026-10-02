public class LibraryBook {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public LibraryBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "TODO";
    }

}
