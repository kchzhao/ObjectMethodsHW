public class Main {
    public static void main(String[] args) {
        //HW
        Author author1 = new Author("Jack","London");
        Author author2 = new Author("Leo","Tolstoy");
        Book book1 = new Book("Martin Eden", author1, 1909);
        Book book2 = new Book("War and Peace", author2,1865);
        book1.setYear(2022);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}