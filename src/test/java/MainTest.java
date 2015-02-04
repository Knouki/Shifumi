package java;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testCheckIfWinPaper() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.checkIfWin(ShifuEnum.PAPER, 2);
		
		Assert.assertEquals(result, 1);
	}

	@Test
	public void testCheckIfWinRock() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.checkIfWin(ShifuEnum.ROCK, 2);
		
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void testCheckIfWinScissor() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.checkIfWin(ShifuEnum.SCISSOR, 2);
		
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void testRockVSRock() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.rockVS(0);
		
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testRockVSScissor() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.rockVS(1);
		
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void testRockVSPaper() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.rockVS(2);
		
		Assert.assertEquals(result, 2);
	}
	
	@Test
	public void testPaperVSPaper() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.paperVS(2);
		
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testPaperVSRock() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.paperVS(0);
		
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void testPaperVSScissor() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.paperVS(1);
		
		Assert.assertEquals(result, 2);
	}

	@Test
	public void testScissorVSScissor() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.scissorVS(1);
		
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testScissorVSRock() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.scissorVS(0);
		
		Assert.assertEquals(result, 2);
	}

	@Test
	public void testScissorVSPaper() {
		MainClass mainClass = new MainClass();
		
		int result = mainClass.scissorVS(2);
		
		Assert.assertEquals(result, 1);
	}
	
	
	
}
