package Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.devs.business.requests.CreateLanguageRequest;
import Kodlama.io.devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.devs.business.responses.GetLanguageResponse;
import Kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	List<GetAllLanguageResponse> getAllWithSubTechnologies();

	List<GetLanguageResponse> getAll();

	void add(CreateLanguageRequest createLanguageRequest);

	Language getById(int languageId);

	Language getByName(String name);
}
