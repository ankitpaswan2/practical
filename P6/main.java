class Book {
    String title;
    int price;

    Book() {
        title = "Java";
        price = 100;
    }

    Book(String t, int p) {
        title = t;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        price = b.price;
    }

    void show() {
        System.out.println(title + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python", 200);
        Book b3 = new Book(b2);

        b1.show();
        b2.show();
        b3.show();
    }
}

