
class Demo {
    Demo() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;

        System.gc();
        System.out.println("End of Program");
    }
}

