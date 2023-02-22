package comp3111.lab2.ex1;

public class Book {
	private String chapters[];
	private int numberOfChapters;
	private static final int DEFAULT_CHAPTERS = 10;

	public Book() {
		this.chapters = new String[DEFAULT_CHAPTERS];
		for (int i=0; i < this.chapters.length; i++)
			this.chapters[i] = "n/a";
	}
	
	public Book(String chapterTitles[]) {
		this.numberOfChapters = chapterTitles.length; 
		this.chapters  = new String[this.numberOfChapters];
		for (int i=0; i < this.chapters.length; i++)
			this.chapters[i] = chapterTitles[i];
		
	}
	
	public String getChapter(int i) {
		try {
			return this.chapters[i];
		}
		catch (Exception e){
			return "Chapter number invalid";
			
		}
	}
	
	public String[] getChapters() {
		String[] anotherArray = new String[this.numberOfChapters];
		for (int i=0; i < this.numberOfChapters; i++) {
			anotherArray[i] = this.getChapter(i);
		}
		return anotherArray;
	}

}
