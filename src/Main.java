public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Margaret", "Mitchell");
        Author author2 = new Author("Dan", "Simmons");

        Book book1 = new Book("Gone With The Wind", author1, 1936);
        Book book2 = new Book("Terror", author2, 2007);

        System.out.println(book1.getBookName());
        System.out.println(book1.getAuthor().getAuthorName());
        System.out.println(book1.getPublishingYear());

        book1.setPublishingYear(1978);
        System.out.println(book1.getPublishingYear());

    }
}