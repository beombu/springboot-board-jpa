package com.programmers.jpa_board.post.exception;

public class NotFoundPostException extends RuntimeException {
    public NotFoundPostException(String message) {
        super(message);
    }
}
