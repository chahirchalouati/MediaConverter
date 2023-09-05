package com.crcl.converter.repositories;

import com.crcl.converter.domain.Conversion;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionRepository extends ReactiveMongoRepository<Conversion, String> {
}
