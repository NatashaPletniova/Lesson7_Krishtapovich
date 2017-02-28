package by.epam.les7.task;

public class Prose extends LiteraryWork {

	private String subType; // novel, story, play

	Prose(String writer, String title, int yearCreated, LiteraryWorkType type, String subType) {
		super(writer, title, yearCreated, type);
		this.subType = subType;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subType == null) ? 0 : subType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prose other = (Prose) obj;
		if (subType == null) {
			if (other.subType != null)
				return false;
		} else if (!subType.equals(other.subType))
			return false;
		return true;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public void show() {

		System.out.println("The Prose item:");

		System.out.println("The Title: " + getTitle() + " The Writer: " + getWriter() + " The Year of Creation: "
				+ getYearCreated() + " The Type: " + getType() + " The SubType: " + getSubType());
	}
}