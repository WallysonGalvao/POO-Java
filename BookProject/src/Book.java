/**
 * Created by Wallyson Galvão on 08/07/2017.
 */
public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int actualPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = false;
        this.actualPage = 0;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String details() {
        return "Book \n[" +
                "\nTitle: '" + title + '\'' +
                ", \nAuthor: '" + author + '\'' +
                ", \nTotal of pages: " + totalPages +
                ", \nActual page: " + actualPage +
                ", \nOpen: " + open +
                ", \nReader: " + reader.getName() +
                ", \nAge of reader: " + reader.getAge() +
                ", \nGenre of reader: " + reader.getGenre() +
                " \n" +
                ']';
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void browse(int page) {
        if (page > this.totalPages) {
            this.actualPage = 0;
        } else {
            this.actualPage = page;
        }
    }

    @Override
    public void nextPage() {
        this.actualPage++;
    }

    @Override
    public void backPage() {
        this.actualPage--;
    }
}
