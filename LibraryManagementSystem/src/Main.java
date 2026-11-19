import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        int choice;
        do {
            System.out.println("====================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("====================");
            System.out.println("1. Book Management");
            System.out.println("2. Member Management");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Reports");
            System.out.println("6. Exit");
            System.out.println("Choose an option");
            choice = input.nextInt();
            input.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    int bookChoice;
                    do {
                        System.out.println("==========");
                        System.out.println("1. Add Book");
                        System.out.println("2. View Books");
                        System.out.println("3. Back");
                        System.out.println("Choose an option: ");
                        bookChoice = input.nextInt();
                        input.nextLine();
                        switch (bookChoice) {
                            case 1:
                                System.out.println("Book ID: ");
                                String id = input.nextLine();
                                System.out.println("Title: ");
                                String title = input.nextLine();
                                System.out.println("Author: ");
                                String author = input.nextLine();
                                System.out.println("Genre: ");
                                String genre = input.nextLine();
                                System.out.println("Year Published: ");
                                int year = input.nextInt();
                                input.nextLine();
                                Book newBook = new Book(id, title, author,genre, year);
                                library.addBook(newBook);
                                break;
                            case 2:
                                int memberChoice;
                                do {
                                    System.out.println("==========");
                                    System.out.println("1. Add Member");
                                    System.out.println("2. View Members");
                                    System.out.println("3. Back");
                                    System.out.println("Choose an option: ");
                                    memberChoice = input.nextInt();
                                    input.nextLine();
                                    switch (memberChoice) {
                                        case 1:
                                            System.out.println("Member ID: ");
                                            String memberId = input.nextLine();
                                            System.out.println("Name: ");
                                            String name = input.nextLine();
                                            System.out.println("Surname: ");
                                            String surname = input.nextLine();
                                            System.out.println("Phone Number: ");
                                            String phoneNumber = input.nextLine();
                                            System.out.println("Email: ");
                                            String email = input.nextLine();
                                            Member newMember = new Member(memberId, name, surname, phoneNumber, email);
                                            library.addMember(newMember);
                                            break;
                                        case 2:
                                            library.displayMembers();
                                            break;
                                        case 3:
                                            System.out.println("Returning to Book Management Menu...");
                                            break;
                                        default:
                                            System.out.println("Invalid option");
                                    }
                                } while (memberChoice != 3);
                                break;
                            case 3:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    } while (bookChoice != 3);
                    break;
                    
                case 2:
                    int memberChoice;
                    do {
                        System.out.println("==========");
                        System.out.println("1. Add Member");
                        System.out.println("2. View Members");
                        System.out.println("3. Back");
                        System.out.println("Choose an option:");
                        memberChoice = input.nextInt();
                        input.nextLine();
                        switch (memberChoice) {
                            case 1:
                                System.out.println("Member ID: ");
                                String memberId = input.nextLine();
                                System.out.println("Name: ");
                                String name = input.nextLine();
                                System.out.println("Surname: ");
                                String surname = input.nextLine();
                                System.out.println("Phone: ");
                                String phoneNumber = input.nextLine();
                                System.out.println("Email: ");
                                String email = input.nextLine();
                                Member member = new Member(memberId, name, surname, phoneNumber, email);
                                library.addMember(member);
                                break;
                        }
                    } while (memberChoice != 3);
                    break;
                case 3:
                    System.out.println("Book ID: ");
                    String borrowBookId = input.nextLine();
                    System.out.println("Member ID: ");
                    String borrowMemberId = input.nextLine();
                    System.out.println("Date (e.g 2026-11-19): ");
                    String date = input.nextLine();
                    library.borrowBook(borrowBookId, borrowMemberId, date);
                    break;
                case 4:
                    System.out.println("Book ID: ");
                    String returnBookId = input.nextLine();
                    library.returnBook(returnBookId);
                    break;
                case 5:
                    library.displayBorrowedRecords();
                    break;
                case 6:
                    System.out.println("Exit is selected");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 6);
        input.close();
    }
}
