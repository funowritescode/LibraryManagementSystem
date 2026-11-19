public class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private int yearPublished;
    private boolean available;
    public Book(String bookId, String title, String author,
        String genre, int yearPublished) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.yearPublished = yearPublished;
            this.available = true;
        }
        public String getBookId() {
            return bookId;
        }
        public String getTitle() {
            return title;
        }
        public boolean isAvailable() {
            return available;
        }
        public void setAvailable(boolean available) {
            this.available = available;
        }
        public void displayBook() {
            System.out.println("--------------------");
            System.out.println("Book ID : " + bookId);
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("Genre : " + genre);
            System.out.println("Year : " + yearPublished);
            if (available) {
                System.out.println("Status : Available");
            } else {
                System.out.println("Status : Borrowed");
            }
        }
    }