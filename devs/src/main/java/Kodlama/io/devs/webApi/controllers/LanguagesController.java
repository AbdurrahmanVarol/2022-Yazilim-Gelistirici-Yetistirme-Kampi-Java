package Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.business.requests.CreateLanguageRequest;
import Kodlama.io.devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.devs.business.responses.GetLanguageResponse;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getAllWithSub")
	public List<GetAllLanguageResponse> getAllWithSubTechnologies() {
		return this.languageService.getAllWithSubTechnologies();
	}

	@GetMapping("/getAll")
	public List<GetLanguageResponse> getAllWith() {
		return this.languageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
}
