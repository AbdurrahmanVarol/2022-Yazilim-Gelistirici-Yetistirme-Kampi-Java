package kodlamaIo.business;

import java.util.List;

import kodlamaIo.business.validators.CourseValidator;
import kodlamaIo.core.Loggers.ILogger;
import kodlamaIo.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private ICourseDao _courseDao;
	private ILogger _logger;

	public CourseManager(ICourseDao courseDao, ILogger logger) {
		_courseDao = courseDao;
		_logger = logger;
	}

	public void add(Course course) {
		if (CourseValidator.isValid(course)) {
			_courseDao.add(course);
			_logger.log();
		}
	}

	public void delete(Course course) {
		_courseDao.delete(course);
		_logger.log();
	}

	public void update(Course course) {
		if (CourseValidator.isValid(course)) {
			_courseDao.update(course);
			_logger.log();
		}
	}

	public Course getById(int id) {
		Course course = _courseDao.getById(id);
		_logger.log();
		return course;

	}

	public Course getByName(String name) {
		Course course = _courseDao.getByName(name);
		_logger.log();
		return course;
	}

	public List<Course> getAll() {
		List<Course> courses = _courseDao.getAll();
		_logger.log();
		return courses;
	}
}
