import java.util.ArrayList;
public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<Member> members = new ArrayList<>();
  private  ArrayList<BorrowedRecord> borrowRecords = new ArrayList<>();

public void addBook(Book book) {
    books.add(book);
    System.out.println("Book added successfully!");
}
public void displayBooks() {
    if (books.isEmpty()) {
        System.out.println("No books avalailable");
        return;
    } 
    for (Book book : books) {
        book.displayBook();
    }
}
public Book searchBook(String bookId) {
    for (Book book : books) {
        if (book.getBookId().equalsIgnoreCase(bookId)) {
            return book;
        }
    }
    return null;
}

public void addMember(Member member) {
    members.add(member);
    System.out.println("Member added successfully!");
}
public void displayMembers() {
    if (members.isEmpty()) {
        System.out.println("No members available");
        return;
    }
    for (Member member : members) {
        member.displayMember();
    }
}
public Member searchMember(String memberId) {
    for (Member member : members) {
        if (member.getMemberId().equalsIgnoreCase(memberId)) {
            return member;
        }
    }
    return null;
}

public void borrowBook(String bookId, String memberId, String date) {
    Book book = searchBook(bookId);
    Member member = searchMember(memberId);
    if (book == null) {
        System.out.println("Book not found");
        return;
    }
    if (member == null) {
        System.out.println("Member not found");
        return;
    }
    if (!book.isAvailable()) {
        System.out.println("Book is not available for borrowing");
        return;
    }
    book.setAvailable(false);
    BorrowedRecord record = new BorrowedRecord(book, member, date);
    borrowRecords.add(record);
    System.out.println("Book borrowed successfully!");
}
public void returnBook(String bookId) {
    for (BorrowedRecord record : borrowRecords) {
        if (record.getBook().getBookId().equalsIgnoreCase(bookId)) {
            record.getBook().setAvailable(true);
            borrowRecords.remove(record);
            System.out.println("Book returned successfully!");
            return;
        }
    }
    System.out.println("No borrow record found for that book");
}
public void displayBorrowedRecords() {
    if (borrowRecords.isEmpty()) {
        System.out.println("No borrowed records available");
        return;
    }
    for (BorrowedRecord record : borrowRecords) {
        record.displayRecord();
    }
}
}
