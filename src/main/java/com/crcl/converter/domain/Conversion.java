package com.crcl.converter.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Accessors(chain = true)
public class Conversion {
    @Id
    private String id;
}
