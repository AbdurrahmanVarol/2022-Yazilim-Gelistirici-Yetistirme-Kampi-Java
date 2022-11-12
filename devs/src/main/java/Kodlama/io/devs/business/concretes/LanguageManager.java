package Kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.devs.business.abstracts.LanguageService;
import Kodlama.io.devs.business.requests.CreateLanguageRequest;
import Kodlama.io.devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.devs.business.responses.GetLanguageResponse;
import Kodlama.io.devs.business.responses.GetSubTechnologyResponse;
import Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageResponse> getAllWithSubTechnologies() {
		return this.languageRepository.findAll().stream()
				.map(l -> new GetAllLanguageResponse(l.getId(), l.getName(),
						l.getSubTechnologies().stream().map(s -> new GetSubTechnologyResponse(s.getName())).toList()))
				.toList();
	}

	@Override
	public List<GetLanguageResponse> getAll() {
		return this.languageRepository.findAll().stream().map(l -> new GetLanguageResponse(l.getName()))
				.collect(Collectors.toList());
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		if (hasLanguage(createLanguageRequest.getName()))
			return;

		Language language = new Language();
		language.setName(createLanguageRequest.getName());

		this.languageRepository.save(language);
	}

	@Override
	public Language getById(int languageId) {
		return this.languageRepository.findById(languageId).get();
	}

	@Override
	public Language getByName(String name) {
		return this.languageRepository.findAll().stream().filter(l -> l.getName().equals("name")).findFirst()
				.orElse(null);
	}

	private boolean hasLanguage(String name) {
		return getByName(name) != null;
	}

}
