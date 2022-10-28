package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository _languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		_languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return _languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return _languageRepository.getById(id);
	}

	@Override
	public Language getByName(String name) {
		return _languageRepository.getByName(name);
	}

	@Override
	public void add(Language language) {
		if (!isValid(language))
			return;

		_languageRepository.add(language);
	}

	@Override
	public void delete(Language language) {
		if (language == null || getById(language.getId()) == null)
			return;
		_languageRepository.delete(language);
	}

	@Override
	public void update(Language language) {
		if (!isValid(language))
			return;
		_languageRepository.update(language);
	}

	private boolean isValid(Language language) {
		return !(language == null || getByName(language.getName()) != null || language.getName().isEmpty());

	}

}
