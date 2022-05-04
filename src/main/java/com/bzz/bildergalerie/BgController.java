package com.bzz.bildergalerie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Controller
public class BgController {
    @Autowired
    private ImageRepository repository;
    @Autowired
    private ImageService service;

    @RequestMapping(value = {"/", "/home"})
    String home(Model model) {
        return "page.html";
    }

    @RequestMapping("/upload")
    String upload(Model model) {
        model.addAttribute("images", repository.findAll());
        return "upload.html";
    }

    @RequestMapping("/uploadImage")
    String uploadImage(@RequestParam("imageTitle") String title, @RequestParam("imageLink") String link) {
        Image image = new Image((int) (repository.count() + 1), title, link);
        repository.save(image);
        return "redirect:/upload";
    }

    @RequestMapping("/deleteImage")
    String deleteImage(@RequestParam("imageId") Integer id) {
        repository.deleteById(id);
        return "redirect:/upload";
    }
}