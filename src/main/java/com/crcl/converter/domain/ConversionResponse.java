package com.crcl.converter.domain;


import org.springframework.core.io.ByteArrayResource;

public record ConversionResponse(ByteArrayResource byteArrayResource,
                                 String fileName,
                                 String contentType) {
}
