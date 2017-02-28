package by.epam.les7.task;


public class Poetry extends  LiteraryWork{
	
	String subType; // ode, fable
	String rhyme ; // iambus, blank verse

	Poetry(String writer, String title, int yearCreated, LiteraryWorkType type, String subtype, String rhyme ) {
		super(writer, title, yearCreated, type);
		this.subType = subtype;
		this.rhyme = rhyme ;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((rhyme == null) ? 0 : rhyme.hashCode());
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
		Poetry other = (Poetry) obj;
		if (rhyme == null) {
			if (other.rhyme != null)
				return false;
		} else if (!rhyme.equals(other.rhyme))
			return false;
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

	public String getRhyme() {
		return rhyme;
	}

	public void setRhyme(String rhyme) {
		this.rhyme = rhyme;
	}
	
	
	public void show(){
		System.out.println("The Poetry item:");

		System.out.println("The Title: " + getTitle() + " The Writer: " + getWriter() + " The Year of Creation: "
				+ getYearCreated() + " The Type: " + getType() + " The SubType: " + getSubType() + " The Rhyme: " + getRhyme ());
	}

}
