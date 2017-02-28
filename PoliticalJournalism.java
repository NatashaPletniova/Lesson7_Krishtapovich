package by.epam.les7.task;

public class PoliticalJournalism extends  LiteraryWork {
	String genre ; 
	String topic; 
	

	PoliticalJournalism (String writer, String title, int yearCreated, LiteraryWorkType type, String genre, String topic) {
		super(writer, title, yearCreated, type);
		
		this.genre = genre;
		this.topic = topic ;

	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		PoliticalJournalism other = (PoliticalJournalism) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}

	
	public void show(){
		System.out.println("The PoliticalJournalism item:");

		System.out.println("The Title: " + getTitle() + " The Writer: " + getWriter() + " The Year of Creation: "
				+ getYearCreated() + " The Type: " + getType() + " The Genre: " + getGenre() + " The Topic: " + getTopic ());
	}
}
