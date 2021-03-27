package web.and.mobile.midterm.library.model.service.impl;

import web.and.mobile.midterm.library.model.entity.Books;
import web.and.mobile.midterm.library.model.service.BooksService;
import web.and.mobile.midterm.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public Books byName(String bookName) {
        return booksRepository.findByName(bookName);
    }

    @Override
    public List<Books> allBooks() {
        return booksRepository.findAll();
    }

    @Override
    public List<Books> byCategory(String category) {
        return booksRepository.findAllByCategory(category);
    }

    @Override
    public List<Books> byAuthor(String author) {
        return booksRepository.findAllByAuthor(author);
    }


}
