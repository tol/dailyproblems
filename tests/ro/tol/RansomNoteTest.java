package ro.tol;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RansomNoteTest extends TestCase {
     RansomNote rn;
	public void setUp() throws Exception {

		super.setUp();
	}

	public void tearDown() throws Exception {
	}

	public void testCheckMagazine() {
		List<String> magazine =new ArrayList<>();
		magazine.add("one");
		//magazine.add("note");

		List<String> note =new ArrayList<>();
		note.add("one");
		note.add("note");


		RansomNote.checkMagazine(magazine,note);
	}
}
