package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book chemistry = new Book("Химия 10 класс", 350);
        Book philosophy = new Book("Гегель. Наука логики", 150);
        Book physics = new Book("Физика. Механика. Высшая школа", 600);
        Book programming = new Book("Clean code", 270);

        Book[] lib = new Book[4];
        lib[0] = chemistry;
        lib[1] = philosophy;
        lib[2] = physics;
        lib[3] = programming;

        for (Book lb : lib) {
            System.out.println("Книга: " + lb.getName() + " ,содержит: "
                    + lb.getCount() + " страниц.");
        }

        System.out.println("Replace index 0 to 3.");
        Book tmp = lib[0];
        lib[0] = lib[3];
        lib[3] = tmp;

        for (Book lb : lib) {
            System.out.println("Книга: " + lb.getName() + " ,содержит: "
                    + lb.getCount() + " страниц.");
        }

        System.out.println("Show book with name  -  Clean code");
        for (Book lb : lib) {
            if (lb.getName().equals("Clean code")) {
                System.out.println("Книга: " + lb.getName() + " ,содержит: "
                        + lb.getCount() + " страниц.");
            }
        }
    }
}
