package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
	private LanguageService _languageService;

	public LanguagesController(LanguageService languageService) {
		_languageService = languageService;
	}

	@GetMapping
	public List<Language> getAll() {
		return _languageService.getAll();
	}

	@GetMapping("/getById/{id}")
	public Language getById(int id) {
		return _languageService.getById(id);
	}

	@GetMapping("/getByName/{name}")
	public Language getById(String name) {
		return _languageService.getByName(name);
	}

	@PostMapping
	public void add(@RequestBody Language language) {
		_languageService.add(language);
	}

	@DeleteMapping("{id}")
	public void delete(int id) {
		Language language = _languageService.getById(id);
		_languageService.delete(language);
	}

	@PutMapping
	public void update(@RequestBody Language language) {
		_languageService.update(language);
	}
}
