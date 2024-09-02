package com.demo.item.model.repository;

import com.demo.item.model.entity.BookingListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingListRepository extends JpaRepository<BookingListEntity, Long> {
}
