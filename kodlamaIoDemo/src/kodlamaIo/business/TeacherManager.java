package kodlamaIo.business;

import java.util.List;
import kodlamaIo.core.Loggers.ILogger;
import kodlamaIo.dataAccess.ITeacherDao;
import kodlamaIo.entities.Teacher;

public class TeacherManager {
	private ITeacherDao _teacherDao;
	private ILogger _logger;

	public TeacherManager(ITeacherDao teacherDao, ILogger logger) {
		_teacherDao = teacherDao;
		_logger = logger;
	}

	public void add(Teacher teacher) {
		if (getByName(teacher.getName()) == null) {
			_teacherDao.add(teacher);
			_logger.log();
		}
	}

	public void delete(Teacher teacher) {
		_teacherDao.delete(teacher);
		_logger.log();
	}

	public void update(Teacher teacher) {
		if (getByName(teacher.getName()) == null) {
			_teacherDao.update(teacher);
			_logger.log();
		}
	}

	public Teacher getById(int id) {
		Teacher teacher = _teacherDao.getById(id);
		_logger.log();
		return teacher;

	}

	public Teacher getByName(String name) {
		Teacher teacher = _teacherDao.getByName(name);
		_logger.log();
		return teacher;
	}

	public List<Teacher> getAll() {
		List<Teacher> teachers = _teacherDao.getAll();
		_logger.log();
		return teachers;
	}

}
