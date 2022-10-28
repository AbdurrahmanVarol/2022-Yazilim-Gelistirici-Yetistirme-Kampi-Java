package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	private List<Language> _languages;

	public InMemoryLanguageRepository() {
		_languages = new ArrayList<Language>();
		_languages.add(new Language(1, "C#"));
		_languages.add(new Language(2, "Java"));
		_languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		return _languages;
	}

	@Override
	public Language getById(int id) {
		return _languages.stream().filter((language) -> language.getId() == id).findFirst().orElse(null);
	}

	@Override
	public Language getByName(String name) {
		return _languages.stream().filter((language) -> language.getName().equals(name)).findFirst().orElse(null);
	}

	@Override
	public void add(Language language) {
		int maxId = _languages.stream().max(Comparator.comparing(Language::getId)).get().getId();
		language.setId(maxId + 1);
		_languages.add(language);

	}

	@Override
	public void delete(Language language) {
		if (_languages.isEmpty())
			return;
		for (int i = 0; i < _languages.size(); i++) {
			if (_languages.get(i).getId() == language.getId()) {
				_languages.remove(i);
				return;
			}
		}
	}

	@Override
	public void update(Language language) {
		if (_languages.isEmpty())
			return;

		for (Language languageInArray : _languages) {
			if (languageInArray.getId() == language.getId()) {
				languageInArray.setName(language.getName());
			}
		}
	}

}
