package com.example.bookinfo.controller;

import com.example.bookinfo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Controlador para manejar las solicitudes relacionadas con el libro.
@Controller
public class BookController {

    // Método para manejar la solicitud GET en la ruta "/book".
    @GetMapping("/book")
    public String getBookInfo(
            @RequestParam(value = "title", required = false, defaultValue = "Sin Título") String title,
            @RequestParam(value = "author", required = false, defaultValue = "Desconocido") String author,
            @RequestParam(value = "year", required = false, defaultValue = "2000") int year,
            Model model) {

        // Crear un objeto Book con los parámetros recibidos.
        Book book = new Book(title, author, year);

        // Agregar el objeto Book al modelo para pasarlo a la vista.
        model.addAttribute("book", book);

        // Retornar el nombre de la vista (archivo HTML) que se va a renderizar.
        return "bookDetails";
    }
}
