# Library Management Systems
A console-based Library management application built in Java. It lets a Librarian manage books and members and tracks which books are borrowed.
## Features
- Add and view books (ID, title, author, genre, year published)
- Add and view library members
- Borrow a book (checks that the book and member exist and that the book is available)
- Return a book
- Input handling for missing books, missing members and already-borrowed books
 ## Project Structure
 ```
src/
Main.java # Menu system and user input
Library.java # Core logic: books, members, borrowing, returning
Book.java # Book model
Member.java # Member model
BorrowedRecord.java # Links a book to a member with a borrow date
```
## Concepts Used
-  Object-oriented programming (classes, encapsulation, constructors)
-  Collections (`ArrayList`)
-  Control Flow (`do-while`, nested `switch`)
-  Console input with `Scanner`
## How to Run
1. Install JDK 17 or later
2. Clone the repository:
```
git clone htttps://github.com/funowritescode/LibraryManagementSystem.git
```
3. Open the project in VS Code (or any Java IDE)
4. Run `Main.java`
## Example Flow
1. Choose **1** (Book Management) - **1** (Add Book) and enter the details
2. Choose **2** (Member Management) **1** (Add Member)
3. Choose **3** (Borrow Book) and enter the book ID, member ID and date
4. Choose **4** (Return Book) and enter the book ID
## Roadmap
- [] Reports (borrowed books, available books, member list)
- [] Save and load data from a file
- [] Prevent duplicate book and member IDs
- [] Safer input handling for invalid menu choices
- [] Unit tests with JUnit
- [] Database storage
##
Lufuno Sello
  
