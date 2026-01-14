package org.example.structural.patterns.adapter;

import org.example.structural.dto.BookDto;

// Target interface expected by new code.
public interface BookCatalog {
    BookDto findBookByIsbn(String isbn);
}
