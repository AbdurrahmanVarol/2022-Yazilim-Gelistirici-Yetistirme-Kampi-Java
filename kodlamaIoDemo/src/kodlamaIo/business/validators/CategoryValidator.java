package kodlamaIo.business.validators;

import kodlamaIo.entities.Category;

public class CategoryValidator {
	public static boolean isValid(Category category) {
		return !hasCategory(category.getName());
	}

	private static boolean hasCategory(String name) {
		return false;
	}
}
