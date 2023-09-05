package com.crcl.converter.services;

import com.crcl.converter.domain.ConverterType;
import com.crcl.converter.domain.Option;
import com.crcl.converter.repositories.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.FilePart;

public abstract class Converter<T extends Option> {
    @Autowired
    protected ConversionRepository conversionRepository;

    protected abstract void convert(FilePart filePart, T option);

    protected abstract ConverterType getType();
}
