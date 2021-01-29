package id.co.bni.otf.bootcamp.repository;

import id.co.bni.otf.bootcamp.entity.ClosingPrice;
import id.co.bni.otf.bootcamp.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ClosingPriceRepository extends JpaRepository<ClosingPrice, Long>, QuerydslPredicateExecutor<ClosingPrice> {
    ClosingPrice findOneByDate(LocalDate date);
}
