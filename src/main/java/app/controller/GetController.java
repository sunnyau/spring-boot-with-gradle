package app.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@Component
@RestController
public class GetController
{
    @GetMapping(value = "/")
    public String get()
    {
        return "Web Service is ready.";
    }

}
