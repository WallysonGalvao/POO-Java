/**
 * Created by Wallyson Galvão on 08/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jake", 25, "M");

        Book book = new Book("Le Muret", "Fraipont & Bailly", 191, person);

        book.open();
        book.browse(20);
        book.nextPage();
        book.backPage();

        System.out.println( book.details());

        book.close();
    }
}
