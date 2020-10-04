package com.monikaslimak.module.mapper;

import com.monikaslimak.module.dto.BookDetailsDto;
import com.monikaslimak.module.entity.BooksDetailEntity;

public class BookDetailsMapper {
    public static BookDetailsDto map(BooksDetailEntity details ) {
        if (details == null) {
            return new BookDetailsDto();
        }
            return new BookDetailsDto()
                    .setIsbn(details.getIsbn())
                    .setLang(details.getLang());

    }
}
