package org.example.bai1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FlashSaleService {

    private static final Logger logger = LoggerFactory.getLogger(FlashSaleService.class);

    public void applyDiscount(String userId, String code) {
        logger.info("Dang xu ly ma: {} cho user: {}", code, userId);
        try {
            if (code == null || code.isEmpty()) {
                throw new IllegalArgumentException("Ma giam gia khong hop le");
            }
            logger.info("Ap dung ma giam gia thanh cong cho user: {}", userId);
        } catch (Exception e) {
            logger.error("Loi khi ap dung ma: {} cho user: {}", code, userId, e);
        }
    }
}
