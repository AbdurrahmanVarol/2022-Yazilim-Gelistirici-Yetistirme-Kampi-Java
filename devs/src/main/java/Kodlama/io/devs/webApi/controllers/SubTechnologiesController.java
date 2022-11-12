package Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.devs.business.abstracts.SubTechnologyService;
import Kodlama.io.devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.devs.business.responses.GetAllSubTechnologyResponse;
import Kodlama.io.devs.business.responses.GetSubTechnologyResponse;

@RestController
@RequestMapping("api/subtechnologies")
public class SubTechnologiesController {

	private SubTechnologyService subTechnologyService;

	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}

	@GetMapping("/getAllWithLanguage")
	public List<GetAllSubTechnologyResponse> getAllWithLanguage() {
		return this.subTechnologyService.getAllWithLanguage();
	}

	@GetMapping("/getAll")
	public List<GetSubTechnologyResponse> getAll() {
		return this.subTechnologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		this.subTechnologyService.add(createSubTechnologyRequest);
	}
}
