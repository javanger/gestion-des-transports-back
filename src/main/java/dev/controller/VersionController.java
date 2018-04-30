package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.domain.Version;
import dev.repository.VersionRepository;

@RestController
@CrossOrigin
public class VersionController {

	@Value("${app.version}")
	private String appVersion;
	@Autowired
	private VersionRepository versionRepo;

	@EventListener(ContextRefreshedEvent.class)
	public void onStart() {
		this.versionRepo.save(new Version(appVersion));
	}

	@GetMapping("/versions")
	public List<Version> getVersion() {
		return this.versionRepo.findAll();
	}

}
