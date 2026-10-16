class Student {
    int roll, m1, m2, m3;
    String name;

    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a; m2 = b; m3 = c;
    }

    void display() {
        int total = m1 + m2 + m3;
        System.out.println(roll + " " + name + " Total=" + total
                + " Percentage=" + total / 3.0 + "%");
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 80, 90, 70);
        Student s2 = new Student(2, "Priya", 85, 75, 95);
        Student s3 = new Student(3, "Rahul", 70, 80, 90);

        s1.display();
        s2.display();
        s3.display();
    }
}
