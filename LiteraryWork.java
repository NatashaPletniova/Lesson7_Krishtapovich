package by.epam.les7.task;

public class LiteraryWork  implements Comparable<LiteraryWork>{
	private String writer;
	private String title;
	private int yearCreated;
	private LiteraryWorkType type;

	public LiteraryWork() {

	};

	public LiteraryWork(String writer, String title, int yearCreated, LiteraryWorkType type) {

		this.writer = writer;
		this.title = title;
		this.yearCreated = yearCreated;
		this.type = type;

	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearCreated() {
		return yearCreated;
	}

	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}



	public LiteraryWorkType getType() {
		return type;
	}

	public void setType(LiteraryWorkType type) {
		this.type = type;
	}

	public void show() {

		System.out.println("The LiteraryWork item:");

		System.out.println("The Title: " + getTitle() + " The Writer: " + getWriter() + " The Year of Creation: "
				+ getYearCreated() + " The Type: " + getType());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		result = prime * result + yearCreated;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiteraryWork other = (LiteraryWork) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type != other.type)
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		if (yearCreated != other.yearCreated)
			return false;
		return true;
	}

	
	// реализация метода интерфейса Comparable
	@Override
	public int compareTo(LiteraryWork ob) {
	return this.title.compareTo(ob.getTitle());

	}
	
}
