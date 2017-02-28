package by.epam.les7.task;
import java.util.Collections;

public class Task7Execution {

	/*
	 * Сборник литературных произведений. Реализовать приложение, позволяющее
	 * создавать сборники произведений (объект, представляющий собой сборник).
	 * Составляющими сборника являются литературные произведения(стихи, проза и
	 * т.д.) и форма сборника(журнал, книга и т.д.). Реализуйте возможность
	 * определения, есть ли конкретное произведение в сборнике. Реализуйте
	 * минимум три компаратора, для сортировки списка произведений, и добавьте в
	 * код возможность такой сортировки.
	 */

	public static void main(String[] args) {


		Prose prose1 = new Prose("Mikhail Bulgakov", "The Master and Margarita", 1928, LiteraryWorkType.PROSE, "novel");
		Prose prose2 = new Prose("Mikhail Bulgakov", "Heart of a Dog", 1928, LiteraryWorkType.PROSE, "story");
		Prose prose3 = new Prose("Mikhail Bulgakov", "The Fatal Eggs", 1924, LiteraryWorkType.PROSE, "story");
		Prose prose4 = new Prose("Agatha Christie", "The Secret Adversary", 1922, LiteraryWorkType.PROSE, "novel");
		Prose prose5 = new Prose("Agatha Christie", "The Secret Adversary", 1922, LiteraryWorkType.PROSE, "novel");

		Poetry poetry1 = new Poetry("Mikhail Lermontov", "Mtsyri", 1831, LiteraryWorkType.POETRY, "poem", "iambic tetrameter");
		Poetry poetry2 = new Poetry("Pushkin", "Evgeny Onegin", 1831, LiteraryWorkType.POETRY, "novel", "iambic tetrameter");
		Poetry poetry3 = new Poetry("Pushkin", "The Tale of the Dead Princess and the Seven Knights", 1833, LiteraryWorkType.POETRY, "poem", "unknown");
		Poetry poetry4 = new Poetry("Pushkin", "The Tale of the Dead Princess and the Seven Knights", 1833, LiteraryWorkType.POETRY, "poem", "unknown");
		LiteraryWork poetry5 = new Poetry("Smith", "Title1", 2015, LiteraryWorkType.POETRY, "poem", "blank verse");

		PoliticalJournalism journalism1 = new PoliticalJournalism("Pupkin", "The life of Trump", 2017	, LiteraryWorkType.JOURNALISM, "article", "Trump");
		PoliticalJournalism journalism2 = new PoliticalJournalism("Ivanov", "The life of Putin", 2016, LiteraryWorkType.JOURNALISM, "article", "Putin");
		PoliticalJournalism journalism3 = new PoliticalJournalism("Lafare", "About Trump's student life", 2016, LiteraryWorkType.JOURNALISM, "article", "Trump");
		PoliticalJournalism journalism4 = new PoliticalJournalism("Pupkin", "The life of Trump", 2017, LiteraryWorkType.JOURNALISM, "article", "Trump");

		LiteraryCollection literaryCollection1 = new LiteraryCollection("NataPublishing", "The best poetries", 2017,
				LiteraryWorkType.POETRY, "book"); // This collection is created
													// based on the type means
													// collection of prose or
													// collection of poetry
													// items.
		
		//Creation based on the poetry type
		System.out.println();
		literaryCollection1.addLiteraryWork(poetry1);
		literaryCollection1.addLiteraryWork(poetry2);
		literaryCollection1.addLiteraryWork(poetry3);
		literaryCollection1.addLiteraryWork(poetry4); // will not be added; poetry4 is the same as poetry3
		literaryCollection1.addLiteraryWork(poetry5);
		literaryCollection1.addLiteraryWork(prose1); // will not be added
		System.out.println();
		System.out.println("This collection is created as collection of poetry items");
		literaryCollection1.showLiteraryCollection();
		
		//Creation based on the prose type
		LiteraryCollection literaryCollection2 = new LiteraryCollection("NataPublishing", "The best prose", 2017, LiteraryWorkType.PROSE, "book");
		System.out.println();
		literaryCollection2.addLiteraryWork(poetry1); // will not be added
		literaryCollection2.addLiteraryWork(prose1);
		literaryCollection2.addLiteraryWork(prose2);
		literaryCollection2.addLiteraryWork(prose3);
		literaryCollection2.addLiteraryWork(prose4);
		literaryCollection2.addLiteraryWork(prose5);// will not be added
		System.out.println();
		System.out.println("This collection is created as collection of prose items");
		literaryCollection2.showLiteraryCollection();

		
		//Creation based on the prose type and author
		LiteraryCollection literaryCollection3 = new LiteraryCollection("NataPublishing", "The Bulgakov's prose", 2017, LiteraryWorkType.PROSE, "book");
		System.out.println();
		literaryCollection3.addLiteraryWork(poetry1, "Mikhail Bulgakov"); // will not be added
		literaryCollection3.addLiteraryWork(prose1, "Mikhail Bulgakov");
		literaryCollection3.addLiteraryWork(prose2, "Mikhail Bulgakov");
		literaryCollection3.addLiteraryWork(prose3, "Mikhail Bulgakov");
		literaryCollection3.addLiteraryWork(prose4, "Mikhail Bulgakov"); // will not be added
		literaryCollection3.addLiteraryWork(prose5, "Mikhail Bulgakov"); // will not be added
		literaryCollection3.addLiteraryWork(journalism1, "Mikhail Bulgakov"); // will not be added
		System.out.println();
		System.out.println("This collection is created as collection of Mikhail Bulgakov prose");
		literaryCollection3.showLiteraryCollection();

		
		//Creation based on the journalism type and topic
		LiteraryCollection literaryCollection4 = new LiteraryCollection("NataPublishing", "Trump", 2017, LiteraryWorkType.JOURNALISM, "magazine");
		System.out.println();
		literaryCollection4.addLiteraryWork(journalism1, "Trump"); 																
		literaryCollection4.addLiteraryWork(journalism2, "Trump"); // will not be added
		literaryCollection4.addLiteraryWork(journalism3, "Trump");
		literaryCollection4.addLiteraryWork(journalism4, "Trump"); // will not be added
		literaryCollection4.addLiteraryWork(prose4, "Mikhail Bulgakov"); //  will not be added
		System.out.println();
		System.out.println("This collection is created about Trump life");
		literaryCollection4.showLiteraryCollection();
		
		System.out.println();
		System.out.println(" "+ literaryCollection1.findInCollection(poetry1));
		System.out.println(" "+ literaryCollection3.findInCollection(prose4));
		System.out.println(" "+ literaryCollection3.findInCollection(prose1));
		System.out.println();
		
		System.out.println ("The sorting is done according to the title and compareTo for LiteraryWork class.");
		System.out.println();
		System.out.println ("Before");
		literaryCollection4.showLiteraryCollectionWork();
		System.out.println ("After");
		Collections.sort(literaryCollection4.getLiteraryWork());
		literaryCollection4.showLiteraryCollectionWork();
		System.out.println();
		
		System.out.println ("Before");
		literaryCollection1.showLiteraryCollectionWork();
		System.out.println ("After");
		Collections.sort(literaryCollection1.getLiteraryWork());
		literaryCollection1.showLiteraryCollectionWork();
		System.out.println();
		
		
		System.out.println ("The sorting is done according to the different parametrs and LiteraryWorkComparator class.");
		

		System.out.println ("Before");
		literaryCollection2.showLiteraryCollectionWork();
		System.out.println ("After TITLE:");		
		Collections.sort(literaryCollection2.getLiteraryWork(), new LiteraryWorkComparator(LiteraryWorkSort.TITLE));
		literaryCollection2.showLiteraryCollectionWork();
		System.out.println();		
		System.out.println ("After WRITER:");
		Collections.sort(literaryCollection2.getLiteraryWork(), new LiteraryWorkComparator(LiteraryWorkSort.WRITER));
		literaryCollection2.showLiteraryCollectionWork();
		System.out.println();
		System.out.println ("After YEARCREATED:");
		Collections.sort(literaryCollection2.getLiteraryWork(), new LiteraryWorkComparator(LiteraryWorkSort.YEARCREATED));
		literaryCollection2.showLiteraryCollectionWork();
		System.out.println();


	}
}
