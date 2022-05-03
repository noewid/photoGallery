package com.bzz.bildergalerie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class BgController {
    @Autowired
    private ImageRepository repository;
    @Autowired
    private ImageService service;

    @RequestMapping("/home")
    String home(Model model) {

        return "page.html";
    }

    @RequestMapping("/upload")
    String upload(Model model) {
        model.addAttribute("images", repository.findAll());
        return "upload.html";
    }

    @RequestMapping("/uploadImage")
    String uploadImage(@RequestParam("image") MultipartFile image) {
        System.out.println(image.getName() + " is being read...");
        service.uploadImage(image);
        return "redirect:/upload";
    }
}