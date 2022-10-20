package nhl69.luansapp.tonghopandroid;

public class Books {
    private String nameBook,author, state;
    private int imageBook;

    public Books(String nameBook, String author, String state, int imageBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.state = state;
        this.imageBook = imageBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getImageBook() {
        return imageBook;
    }

    public void setImageBook(int imageBook) {
        this.imageBook = imageBook;
    }
}
