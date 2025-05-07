package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController     // responsebody 리턴
public class HomeController {

    // log 사용 이유
    // 24시간 서버를 보고 있는게 아니기 때문에 어디서 서버가 죽었는지 알기위해 사용

    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer num) {
        if (num == 1) {
            log.info("🥎/aws/v1 호출. info로그 ");
        } else if (num == -1) {
            log.error("⚽/aws/v1 호출. error로그 ");
        } else if (num == 0) {
            log.warn("🏀/aws/v1 호출. warning로그 ");
        }

        return "<h1>AWS 배포 v1.1</h1>";
    }
}
