package br.com.isaccanedo.micrometer.micrometerspringboot15.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

    @Timed(
            value = "isaccanedo.hello.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/hello")
    public String hello() {
        return "Prometheus";
    }

    @Timed(
            value = "isaccanedo.hello2.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/hello2")
    public String hello2() {
        return "Prometheus 2";
    }
    @Timed(
            value = "isaccanedo.hello3.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/hello3")
    public String hello3() {
        return "Prometheus 3";
    }
    @Timed(
            value = "isaccanedo.hello4.request",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/hello4")
    public String hello4() {
        return "Prometheus 4";
    }
}
