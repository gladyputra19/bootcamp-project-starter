package id.co.bni.otf.bootcamp.service;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.OrderSpecifier;
import id.co.bni.otf.bootcamp.entity.ClosingPrice;
import id.co.bni.otf.bootcamp.entity.QStocks;
import id.co.bni.otf.bootcamp.entity.Stocks;
import id.co.bni.otf.bootcamp.repository.ClosingPriceRepository;
import id.co.bni.otf.bootcamp.service.dto.ClosingPriceDTO;
import id.co.bni.otf.bootcamp.service.dto.StocksDTO;
import id.co.bni.otf.bootcamp.service.mapper.ClosingPriceMapper;
import id.co.bni.otf.bootcamp.service.mapper.StocksMapper;
import id.co.bni.otf.bootcamp.validation.contract.OnCreate;
import id.co.bni.otf.bootcamp.validation.contract.OnUpdate;
import id.co.bni.otf.bootcamp.web.exception.DataNotFoundException;
import id.co.bni.otf.bootcamp.web.exception.DataNotUniqueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QSort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
//
//import java.util.Calendar;
//import java.util.Date;

@Service
@Validated
@Transactional
public class ClosingPriceService {
    private static final Logger LOG = LoggerFactory.getLogger(StocksService.class);

    private final ClosingPriceRepository closingPriceRepository;
    private final ClosingPriceMapper closingPriceMapper;

    public ClosingPriceService(ClosingPriceRepository closingPriceRepository, ClosingPriceMapper closingPriceMapper) {
        this.closingPriceRepository = closingPriceRepository;
        this.closingPriceMapper = closingPriceMapper;
    }

    public int getClosingPrice(LocalDate buyDate, LocalDate rangeSellDate){

    int minStockPrice = Integer.MAX_VALUE;
    int maxClosingPrice = 0;
    int buyPrice = closingPriceRepository.findOneByDate(buyDate);
    int[] prices = [];
    for (buyDate; buyDate.isBefore(rangeSellDate); buyDate.plusDays(1);) {
        if ( prices[price]< minStockPrice)
        minStockPrice = prices[buyPrice];
        else if (prices[buyPrice] - minStockPrice > maxClosingPrice)
            maxClosingPrice = prices[buyPrice] - minStockPrice;
    }
    return maxClosingPrice;
}
}
}
