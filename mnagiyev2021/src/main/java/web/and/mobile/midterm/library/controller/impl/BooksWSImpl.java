package web.and.mobile.midterm.library.controller.impl;

import web.and.mobile.midterm.library.controller.BooksWS;
import web.and.mobile.midterm.library.model.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksWSImpl implements BooksWS {

    @Autowired
    private BooksService booksService;

    @Override
    @RequestMapping(value = "/searchByName", method = RequestMethod.GET)

    public ResponseEntity ByName(@RequestParam("book") String name) {
        return ResponseEntity.ok(booksService.byName(name));
    }

    @Override
    @RequestMapping(value = "/searchByCategory", method = RequestMethod.GET)

    public ResponseEntity ByCategory(@RequestParam("category") String category) {

        return ResponseEntity.ok(booksService.byCategory(category));
    }

    @Override
    @RequestMapping(value = "/bookByAuthor", method = RequestMethod.GET)

    public ResponseEntity ByAuthor(@RequestParam("author") String author) {

        return ResponseEntity.ok(booksService.byAuthor(author));
    }

    @Override
    @RequestMapping(value = "/list", method = RequestMethod.GET)

    public ResponseEntity listOfBooks() {
        return ResponseEntity.ok(booksService.allBooks());
    }
}
