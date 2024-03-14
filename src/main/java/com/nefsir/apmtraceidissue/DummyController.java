package com.nefsir.apmtraceidissue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DummyController {

    @GetMapping("/dummy")
    public String dummy() {
        log.info("Dummy controller called");
        return "dummy";
    }
}
