package com.bzz.bildergalerie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BgController {

    @RequestMapping("/home")
    String home(Model model) {

        return "page.html";
    }

    @RequestMapping("/upload")
    String upload(Model model) {


        return "upload.html";
    }
}