package com.crcl.converter.services.impl;

import com.crcl.converter.domain.ConverterType;
import com.crcl.converter.domain.VideoOption;
import com.crcl.converter.services.Converter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VideoConversionServiceImpl extends Converter<VideoOption> {

    @Override
    public void convert(FilePart filePart, VideoOption option) {

    }

    @Override
    public ConverterType getType() {
        return ConverterType.VIDEO;
    }
}
