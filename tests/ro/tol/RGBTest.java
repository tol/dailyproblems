package ro.tol;

import static org.junit.Assert.*;

import junit.framework.TestCase;

public class RGBTest extends TestCase {

	public void testSwap() {
		Character a='x';
		Character b='y';
		new RGB().swap(a,b);

		assertEquals('x',b.charValue());
	}

	public void testResolve() {
		char[] t={'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		char[] result=new RGB().resolve(t);
		assertArrayEquals( new char[] {'R', 'R', 'R', 'G', 'G', 'B', 'B'}, result );

	}

	public void testResolve2() {
		char[] t={'G', 'B', 'R', 'R', 'B', 'R', 'G','G','R','R'};
		char[] result=new RGB().resolve(t);
		assertArrayEquals( new char[] {'R', 'R', 'R','R','R', 'G', 'G','G', 'B', 'B'}, result );

	}
}
