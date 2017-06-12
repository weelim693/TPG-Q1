import java.math.BigDecimal;
import java.util.Comparator;

public class Question2Wrapper {
	private Long id;
	private String name;
	private BigDecimal gpa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getGpa() {
		return gpa;
	}

	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
	}
	
	public static class descOrder implements Comparator<Question2Wrapper> {
        @Override
        public int compare(Question2Wrapper o1, Question2Wrapper o2) {
            return o1.gpa.compareTo(o2.gpa) < 0 ? 1
                    : (o1.gpa.compareTo(o2.gpa) > 0 ? -1 : 0);
        }
    }
}
