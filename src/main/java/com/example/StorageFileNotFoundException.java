package com.example;

import org.springframework.stereotype.Component;

@Component
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException() {
    }

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

