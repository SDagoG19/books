package com.example.bookinfo.model;

// Clase de modelo que representa un libro.
public class Book {

    // Atributos del libro.
    private String title;
    private String author;
    private int year;

    // Constructor con parámetros para inicializar un objeto Book.
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters y setters para acceder y modificar los atributos del libro.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.authopackage com.example.bookinfo.model;

// Clase de modelo que representa un libro.
        public class Book {

            // Atributos del libro.
            private String title;
            private String author;
            private int year;

            // Constructor con parámetros para inicializar un objeto Book.
            public Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            // Getters y setters para acceder y modificar los atributos del libro.
            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }
        r = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
