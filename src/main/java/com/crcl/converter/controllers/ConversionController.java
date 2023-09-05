package com.crcl.converter.controllers;

import com.crcl.converter.services.Converter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.URLConnection;
import java.util.Map;

@RestController
@RequestMapping("conversions")
@RequiredArgsConstructor
@Slf4j
public class ConversionController {

    private final Map<String, Converter> converterMap;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<?> save(@RequestPart("file") Mono<FilePart> file) {

        return file.map(filePart -> URLConnection.guessContentTypeFromName(filePart.filename()))
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().body("Error processing the video or audio is empty."));
    }
}
