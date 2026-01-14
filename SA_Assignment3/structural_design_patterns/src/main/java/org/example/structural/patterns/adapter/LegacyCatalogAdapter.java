package org.example.structural.patterns.adapter;

import org.example.structural.dto.BookDto;

// Adapter converts the legacy string into a BookDto.
public class LegacyCatalogAdapter implements BookCatalog {
    private final LegacyCatalogSystem legacyCatalog;

    public LegacyCatalogAdapter(LegacyCatalogSystem legacyCatalog) {
        this.legacyCatalog = legacyCatalog;
    }

    @Override
    public BookDto findBookByIsbn(String isbn) {
        String data = legacyCatalog.findBookData(isbn);
        String[] parts = data.split("\\|");
        BookDto dto = new BookDto();
        dto.setTitle(parts[0]);
        dto.setAuthor(parts[1]);
        dto.setPrice(Double.parseDouble(parts[2]));
        return dto;
    }
}
