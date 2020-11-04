package com.gokhaneskin.tenantbackend.controller;

import com.gokhaneskin.tenantbackend.entity.Announcement;
import com.gokhaneskin.tenantbackend.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/announcement")
public class AnnouncementController {

    @Autowired
    AnnouncementRepository announcementRepository;

    @GetMapping
    public ResponseEntity<List<Announcement>> getAnnouncements(){
        return  ResponseEntity.ok(announcementRepository.findAll());
    }
}
