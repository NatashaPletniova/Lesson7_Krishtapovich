package by.epam.les7.task;

import java.util.ArrayList;
import java.util.List;

public class LiteraryCollection {

	private String publishingHouse;
	private String title;
	private int yearPublished;
	private LiteraryWorkType type; // The principle to be included in one
									// collection. For
	// example, detective story or
	private String form;
	private List<LiteraryWork> literaryWork = new ArrayList<LiteraryWork>();

	public LiteraryCollection() {

	}

	public LiteraryCollection(String publishingHouse, String title, int yearPublished, LiteraryWorkType type,
			String form) {
		this.publishingHouse = publishingHouse;
		this.title = title;
		this.yearPublished = yearPublished;
		this.type = type;
		this.form = form;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public LiteraryWorkType getType() {
		return type;
	}

	public void setType(LiteraryWorkType type) {
		this.type = type;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public List<LiteraryWork> getLiteraryWork() {
		return literaryWork;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((literaryWork == null) ? 0 : literaryWork.hashCode());
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearPublished;
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
		LiteraryCollection other = (LiteraryCollection) obj;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (literaryWork == null) {
			if (other.literaryWork != null)
				return false;
		} else if (!literaryWork.equals(other.literaryWork))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

	public void setLiteraryWork(List<LiteraryWork> literaryWork) {
		this.literaryWork = literaryWork;
	}

	/**
	 * To add the new literary Work based on the type - means collection of prose,
	 * collection of poetry items
	 * 
	 * @param newLiteraryWork
	 *            the new item to add
	 * @return false or true
	 */

	public boolean addLiteraryWork(LiteraryWork newLiteraryWork) {

		System.out.println("addLiteraryWork is working based on Type ");

		if (this.literaryWork.contains(newLiteraryWork)) {
			return false;
		}

		if (this.type != newLiteraryWork.getType()) {
			return false;
		}

		return this.literaryWork.add(newLiteraryWork);

	}

	/**
	 * To add the new literary Work based on the type and the author.
	 * 
	 * @param newLiteraryWork
	 *            the new item to add
	 * @param author
	 *            the author, which works will be added to the particular collection
	 * @return false or true
	 */

	public boolean addLiteraryWork(LiteraryWork newLiteraryWork, String author) {

		System.out.println("addLiteraryWork is working based on Type and Author");

		if (this.literaryWork.contains(newLiteraryWork)) {
			return false;
		}

		if ((newLiteraryWork.getClass() == Prose.class) || (newLiteraryWork.getClass() == Poetry.class)) {
			if ((this.type != newLiteraryWork.getType()) || (!newLiteraryWork.getWriter().equals(author))) { // compare
				// based
				// on
				// type
				// and
				// author
				return false;
			}
		}

		return this.literaryWork.add(newLiteraryWork);
	}

	/**
	 * To add the new literary Work for Political Journalism based on the type and the topic
	 * 
	 * @param newLiteraryWork
	 *            the new item to add
	 * @param topic
	 *            to gather different literary Works in one collection
	 * @return
	 */
	public boolean addLiteraryWork(PoliticalJournalism newLiteraryWork, String topic) { // compare
																						// based
																						// on
																						// type
																						// and
																						// topic

		System.out.println("addLiteraryWork is working based on Type and Topic");

		if (this.literaryWork.contains(newLiteraryWork)) {
			return false;
		}

		if ((this.type != newLiteraryWork.getType()) || (!newLiteraryWork.topic.equals(topic))) {
			return false;
		}

		return this.literaryWork.add(newLiteraryWork);

	}

	public void showLiteraryCollection() {

		System.out.println("The Literary Collection:");
		System.out.println("Publishing House: " + this.getPublishingHouse());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Published Year: " + this.getYearPublished());
		System.out.println("The Type: " + this.getType());
		System.out.println("The Form: " + this.getForm());

		System.out.println();

		for (LiteraryWork a : this.getLiteraryWork()) {
			a.show();
		}
		System.out.println();
	}

	public void showLiteraryCollectionWork() {

		for (LiteraryWork a : this.getLiteraryWork()) {
			a.show();
		}
		System.out.println();
	}

	public boolean findInCollection(LiteraryWork newLiteraryWork) {
		boolean res = false;

		if (newLiteraryWork != null) {
			for (LiteraryWork a : this.getLiteraryWork()) {
				if (a.hashCode() == newLiteraryWork.hashCode()) {
					if (a.equals(newLiteraryWork)) {
						res = true;
					}
				}
			}
		}

		return res;
	}
}
