package kodlamaIo.business.validators;

import kodlamaIo.entities.Course;

public class CourseValidator {
	public static boolean isValid(Course course) {
		return !hasCourse(course.getName()) && isPriceGreaterThanZero(course.getPrice());
	}

	private static boolean hasCourse(String name) {
		return false;
	}

	private static boolean isPriceGreaterThanZero(double price) {
		return price > 0;
	}
}
