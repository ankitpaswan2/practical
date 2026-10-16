
class Product {
    String name;
    int price, quantity;

    Product() {
        name = "Pen";
        price = 10;
        quantity = 2;
    }

    Product(String n) {
        name = n;
        price = 20;
        quantity = 3;
    }

    Product(String n, int p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    void show() {
        System.out.println(name + " Total: " + (price * quantity));
    }

    public static void main(String[] args) {
        new Product().show();
        new Product("Book").show();
        new Product("Bag", 500, 2).show();
    }
}

