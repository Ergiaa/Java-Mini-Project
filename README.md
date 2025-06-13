# 📚 Library Mini-Project — Java

## 🔹 Project Description 🔹

This mini-project is designed to help you practice and consolidate your understanding of **String Manipulation, Looping, Conditional Statements, Exception Handling, Classes, and Two-Dimensional Arrays in Java**.
Additionally, you’ll implement **Recursive Methods** to solve a small but realistic problem.

---

## 🔹 Project Goals 🔹

- Apply Java fundamentals to solve a real-world scenario.
- Develop confidence in coding routines, methods, classes, and control structures.
- Handle invalid inputs gracefully with Exception Handling.
- Implement a recursive algorithm in a non-trivial context.

---

## 🔹 Application Concept 🔹

We’re developing a simplified **Library System** which lets you:

- **Add books** to a library.
- **View all books in the library.**
- **Search for a book by its title.**
- **Borrow and return books** by a user.
- **Count total borrowed books by a particular user** (using recursion).

This lets you combine all the fundamentals you’ve learned in a realistic setting.

---

## 🔹 Implemented Java Concepts 🔹

✅ **String Manipulation**
✅ **Variables and Data Types**
✅ **Conditional Statements (if-else, switch)**
✅ **Looping (for, while, do-while)**
✅ **One-Dimensional and Two-Dimensional Arrays**
✅ **Recursive Method**
✅ **Classes and Objects**
✅ **Error Handling (Try/Catch)**

---

## 🔹 File Structure 🔹

```txt
Library/
 └ src/
   └ Main.java
   └ Book.java
   └ User.java
   └ Library.java
README.md
```

---

## 🔹 Guidelines and Clue to Implement 🔹

✅ The main entry point is **Main.java** — here’s where you will:

- Display a **text-menu** for the users’ choices.
- Handle the **input and output**.
- Call methods implemented in other classes.

✅ The **Book** class encapsulates the properties of a book (id, title, author, price).

✅ The **User** class encapsulates a user's properties (id and name).

✅ The **Library** class contains:

- An array of books.
- An array for borrowing (a 2D array).
- Methods to add books, view books, search, borrow, return, and count borrowed books (with recursion).

---

## 🔹 What You Should Implement 🔹

✅ Implement **String Manipulation** (using `String.trim()` and `String.equalsIgnoreCase()`).

✅ Implement **Variables and Data Types** with `int, double, String`.

✅ Implement **Conditional Statements** to manage menus, borrowing, and more.

✅ Implement **Looping** to:

- Loop through books.
- Loop through borrowing info.

✅ Implement **One-Dimensional and Two-Dimensional Arrays** (array of books and borrowing).

✅ Implement **Recursive Method** to calculate total borrowed books for a user.

✅ Implement **Classes with Encapsulation** (Book, User, Library).

✅ Implement **Error Handling with Try/Catch** when invalid input is provided.

---

## 🔹 Additional Challenge (Optional) 🔹

✅ Implement **sorting of books by title or price**.
✅ Implement **return messages to aid users’ understanding**.
✅ Handle invalid inputs gracefully instead of crashing.
✅ Expand functionality (like adding authors, due dates, or penalties).

---

## 🔹 How to Run 🔹

1. Compile:

```bash
javac src/Main.java src/Book.java src/User.java src/Library.java
```

2. Run:

```bash
java src.Main
```

---

## 🔹 What to Submit 🔹

✅ Your **full Java code** (with comments).
✅ The **README.md** with your instructions and explanations.
✅ Short **steps you implemented or problems you solved**.

---

## 🔹 Grading Criteria 🔹

✅ Proper application of **String Manipulation, Looping, Conditionals, Exception Handling, Classes, and 2D arrays**.
✅ Implementing **Recursive Method** for total borrowed books.
✅ Code is well-structured, clear, and easy to follow.
✅ Exception Handling gracefully guides users instead of crashing.
✅ Comments and explanations reflect understanding.
