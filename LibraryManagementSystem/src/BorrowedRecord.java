public class BorrowedRecord {
    private Book book;
    private Member member;
    private String borrowDate;
    public BorrowedRecord(Book book, Member member, String borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
    }
    public void displayRecord() {
        System.out.println("Book: " + book.getTitle());
        System.out.println("Member ID: " + member.getMemberId());
        System.out.println("Borrow Date: " + borrowDate);
    }
    public Book getBook() {
        return book;    
    }
}