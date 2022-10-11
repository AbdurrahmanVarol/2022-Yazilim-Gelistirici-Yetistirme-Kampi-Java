package kodlamaIo.business.validators;

import kodlamaIo.entities.Teacher;

public class TeacherValidator {
	public static boolean isValid(Teacher teacher) {
		return !hasTeacher(teacher.getName());
	}

	private static boolean hasTeacher(String name) {
		return false;
	}
}
