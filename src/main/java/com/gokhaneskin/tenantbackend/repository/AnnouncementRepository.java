package com.gokhaneskin.tenantbackend.repository;

import com.gokhaneskin.tenantbackend.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
