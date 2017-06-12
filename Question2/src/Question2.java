import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<Question2Wrapper> wrappers = new ArrayList<>();

		wrappers.add(assignValue(new Long(33), "Tina", new BigDecimal(3.68)));
		wrappers.add(assignValue(new Long(85), "Louis", new BigDecimal(3.85)));
		wrappers.add(assignValue(new Long(56), "Samil", new BigDecimal(3.75)));
		wrappers.add(assignValue(new Long(19), "Samar", new BigDecimal(3.75)));
		wrappers.add(assignValue(new Long(22), "Lorry", new BigDecimal(3.76)));

		Collections.sort(wrappers, new Question2Wrapper.descOrder());

		for (Question2Wrapper wrapper : wrappers) {
			System.out.println(wrapper.getName());
		}
	}

	public static Question2Wrapper assignValue(Long id, String name, BigDecimal gpa) {
		Question2Wrapper wrapper = new Question2Wrapper();
		wrapper.setId(id);
		wrapper.setName(name);
		wrapper.setGpa(gpa);
		return wrapper;
	}

}
