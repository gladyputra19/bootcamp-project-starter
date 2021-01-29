package id.co.bni.otf.bootcamp.web.controller.closingprice;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = "/closingprice", produces = MediaType.APPLICATION_JSON_VALUE)
public class closingPriceController {
    private final closingPriceService closingPriceService;

    public closingPriceController(closingPriceService closingPriceService) {
        this.closingPriceService = closingPriceService;


    }
}
