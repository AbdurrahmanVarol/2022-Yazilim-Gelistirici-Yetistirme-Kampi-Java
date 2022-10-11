package kodlamaIo.business;

import java.util.List;

import kodlamaIo.business.validators.CategoryValidator;
import kodlamaIo.core.Loggers.ILogger;
import kodlamaIo.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	private ICategoryDao _categoryDao;
	private ILogger _logger;

	public CategoryManager(ICategoryDao categoryDao, ILogger logger) {
		_categoryDao = categoryDao;
		_logger = logger;
	}

	public void add(Category category) {
		if (CategoryValidator.isValid(category)) {
			_categoryDao.add(category);
			_logger.log();
		}
	}

	public void delete(Category category) {
		_categoryDao.delete(category);
		_logger.log();
	}

	public void update(Category category) {
		if (CategoryValidator.isValid(category)) {
			_categoryDao.update(category);
			_logger.log();
		}
	}

	public Category getById(int id) {
		Category category = _categoryDao.getById(id);
		_logger.log();
		return category;

	}

	public Category getByName(String name) {
		Category category = _categoryDao.getByName(name);
		_logger.log();
		return category;
	}

	public List<Category> getAll() {
		List<Category> categories = _categoryDao.getAll();
		_logger.log();
		return categories;
	}
}
