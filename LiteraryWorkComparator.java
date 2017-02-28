package by.epam.les7.task;

import java.util.Comparator;

public class LiteraryWorkComparator implements Comparator<LiteraryWork> {
	
	private LiteraryWorkSort sortingIndex;
	
	public  LiteraryWorkComparator (LiteraryWorkSort sortingIndex) {
	setSortingIndex(sortingIndex);
	}
	
/*	@Override
	public int compare(LiteraryWork ob1, LiteraryWork ob2) {
		int year1 = ob1.getYearCreated();
		int year2 = ob2.getYearCreated();
		return (year1>year2)?1:((year1==year2)?0:-1);
	}
*/
	/**
	 * To set the sorting column
	 * @param sortingIndex column to sort
	 */
	public final void setSortingIndex(LiteraryWorkSort sortingIndex) {
		if(sortingIndex == null) {
		throw new IllegalArgumentException();
		} 
		this.sortingIndex = sortingIndex;
		}
	
	@Override
	public int compare(LiteraryWork ob1, LiteraryWork ob2) {
	switch(sortingIndex) {
	case WRITER:
	return ob1.getWriter().compareTo(ob2.getWriter()); 
	case TITLE:
	return ob1.getTitle().compareTo(ob2.getTitle()); 
	case YEARCREATED:
	return  (ob1.getYearCreated()>ob2.getYearCreated()?1:(ob1.getYearCreated()==ob2.getYearCreated()?0:-1));
	default:
	throw new EnumConstantNotPresentException(LiteraryWorkSort.class, sortingIndex.name());
	}
	}
		
	
	
}
