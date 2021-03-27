package web.and.mobile.midterm.library.controller.impl;

import web.and.mobile.midterm.library.controller.StudentHistoryWS;
import org.springframework.http.ResponseEntity;

public class StudentHistoryWSLDAImpl implements StudentHistoryWS {

    @Override
    public ResponseEntity pickup(int bookId, int studentId) {
        return null;
    }

    @Override
    public ResponseEntity dropoff(int studentHistoryId) {
        return null;
    }

    @Override
    public ResponseEntity currentPickUP(int studentId) {
        return null;
    }

    @Override
    public ResponseEntity wholeHistory(int studentId) {
        return null;
    }
}
