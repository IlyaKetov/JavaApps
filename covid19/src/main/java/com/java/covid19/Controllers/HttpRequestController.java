package com.java.covid19.Controllers;

import com.java.covid19.Entities.Summary;
import com.java.covid19.Sevices.DefaultServices;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
@AllArgsConstructor
@Log
public class HttpRequestController {
    private final DefaultServices services;

    @GetMapping("/summary")
    public Summary summary() throws Exception {
        log.info("trying to get summary info");
        return services.getSummaryInfo();
    }
}
