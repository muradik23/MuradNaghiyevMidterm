package web.and.mobile.midterm.library.model.service;

import web.and.mobile.midterm.library.model.entity.Books;

import java.util.List;

public interface BooksService {


    List<Books> allBooks();

    List<Books> byCategory(String category);

    List<Books> byAuthor(String author);

    Books byName(String name);

}
