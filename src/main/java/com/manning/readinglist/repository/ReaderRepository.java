package com.manning.readinglist.repository;

import com.manning.readinglist.entity.Reader;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepository extends CrudRepository<Reader, Long> {
}
