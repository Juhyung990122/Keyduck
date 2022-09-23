package com.yoeleum.keyduck.member.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyduckRepository<T,ID> {

    Long save(T entity);

    List<T> findAll();

    T findById(ID id);

    void update(T targetEntity);

    void deleteById(ID id);

}
