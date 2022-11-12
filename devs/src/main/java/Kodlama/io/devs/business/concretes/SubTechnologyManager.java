package Kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.business.abstracts.SubTechnologyService;
import Kodlama.io.devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.devs.business.responses.GetAllSubTechnologyResponse;
import Kodlama.io.devs.business.responses.GetLanguageResponse;
import Kodlama.io.devs.business.responses.GetSubTechnologyResponse;
import Kodlama.io.devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.devs.entities.concretes.Language;
import Kodlama.io.devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepository subTechnologyRepository;
	private LanguageService languageService;

	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, LanguageService languageService) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
		this.languageService = languageService;
	}

	@Override
	public List<GetAllSubTechnologyResponse> getAllWithLanguage() {
		return this.subTechnologyRepository.findAll().stream().map(s -> new GetAllSubTechnologyResponse(s.getId(),
				s.getName(), new GetLanguageResponse(s.getLanguage().getName()))).toList();
	}

	@Override
	public List<GetSubTechnologyResponse> getAll() {
		return this.subTechnologyRepository.findAll().stream().map(s -> new GetSubTechnologyResponse(s.getName()))
				.toList();
	}

	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		if (hasSubTechnology(createSubTechnologyRequest.getName(), createSubTechnologyRequest.getLanguageId()))
			return;
		
		Language language = this.languageService.getById(createSubTechnologyRequest.getLanguageId());

		SubTechnology subTechnology = new SubTechnology();
		subTechnology.setName(createSubTechnologyRequest.getName());
		subTechnology.setLanguage(language);

		this.subTechnologyRepository.save(subTechnology);
	}

	public GetSubTechnologyResponse getById(int id) {
		SubTechnology subTechnology = this.subTechnologyRepository.findById(id).get();
		return new GetSubTechnologyResponse(subTechnology.getName());
	}

	public SubTechnology getByNameAndLanguageId(String name, int languageId) {
		return this.subTechnologyRepository.findAll().stream()
				.filter(s -> s.getName().equals(name) && s.getLanguage().getId() == languageId).findFirst()
				.orElse(null);

	}

	private boolean hasSubTechnology(String name, int languageId) {
		return getByNameAndLanguageId(name, languageId) != null;
	}

}
