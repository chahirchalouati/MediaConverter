package com.crcl.converter.services.impl;

import com.crcl.converter.domain.AudioOption;
import com.crcl.converter.domain.ConverterType;
import com.crcl.converter.services.Converter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AudioConversionServiceImpl extends Converter<AudioOption> {

    @Override
    public void convert(FilePart filePart, AudioOption option) {

    }

    @Override
    public ConverterType getType() {
        return ConverterType.AUDIO;
    }
}
