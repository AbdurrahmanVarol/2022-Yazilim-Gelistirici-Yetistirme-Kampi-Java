package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();

	Language getById(int id);

	Language getByName(String name);

	void add(Language language);

	void delete(Language language);

	void update(Language language);
}
