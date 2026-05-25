package org.example.bai1.controller;

import org.example.bai1.service.FlashSaleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flash-sale")
public class FlashSaleController {

    private final FlashSaleService flashSaleService;

    public FlashSaleController(FlashSaleService flashSaleService) {
        this.flashSaleService = flashSaleService;
    }

    @PostMapping("/apply")
    public ResponseEntity<String> applyDiscount(@RequestParam String userId, @RequestParam String code) {
        flashSaleService.applyDiscount(userId, code);
        return ResponseEntity.ok("Đã xử lý xong");
    }
}
