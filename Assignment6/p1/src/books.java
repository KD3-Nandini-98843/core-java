import java.util.*;
class Book {
    String isbn;
    double price;
    String authorName;
    int quantity;

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return String.format("ISBN: %-10s | Price: %-8.2f | Author: %-15s | Qty: %d", 
                             isbn, price, authorName, quantity);
    }
}

public class books{
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books (Forward Order)");
            System.out.println("3. Display all books (Reverse Order)");
            System.out.println("4. Delete a book at given index");
            System.out.println("5. Sort books by price (Descending)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.next();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Author Name: ");
                    sc.nextLine(); // Consume newline
                    String author = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    bookList.add(new Book(isbn, price, author, qty));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Forward Order List ---");
                    if (bookList.isEmpty()) System.out.println("List is empty.");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Reverse Order List ---");
                    if (bookList.isEmpty()) System.out.println("List is empty.");
                    for (int i = bookList.size() - 1; i >= 0; i--) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Enter the index to delete (0 to " + (bookList.size() - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < bookList.size()) {
                        bookList.remove(index);
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    bookList.sort((b1, b2) -> Double.compare(b2.price, b1.price));
                    System.out.println("\nBooks sorted by price (High to Low):");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
