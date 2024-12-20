# Library Management System

## Project Context

The **Library Management System** is a console-based Java application designed to manage a library's book inventory. It enables users to perform key operations such as adding, searching, borrowing, returning, deleting, and displaying books, with functionality organized into modular functions for simplicity and clarity.

---

## Features

1. **Display Books**  
   View a list of all books in the library.

2. **Add a Book**  
   Add a new book with the following details:  
   - Title  
   - Author  
   - ISBN  
   - Availability  

3. **Search for a Book**  
   Search for books by:
   - Title
   - Author
   - ISBN  

4. **Delete a Book**  
   Remove a book from the library.

5. **Update Book Details**  
   Modify details of an existing book.

6. **Borrow a Book (Bonus)**  
   Mark a book as borrowed, ensuring it is available before borrowing.

7. **Return a Book (Bonus)**  
   Mark a borrowed book as returned, making it available again.

8. **View Available and Borrowed Books (Bonus)**  
   Generate a report showing:
   - Available books  
   - Borrowed books  

---

## Application Structure

The system is organized into the following Java classes:

1. **Book**  
   Represents a book with attributes like title, author, ISBN, and availability.

2. **Main**  
   - The main entry point of the application.
   - Displays the menu and facilitates user interaction.

3. **Library (Bonus)**  
   - Manages the collection of books.
   - Provides operations for adding, searching, borrowing, and returning books.

---

