/**
 * 
 */
package com.imie.main.java;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class MainClass {

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		ShifuEnum shif = ShifuEnum.fromValue(scan.next());
		
		scan.close();
		
		Random ran = new Random(new Date().getTime());
		int i = ran.nextInt(3);
		
		MainClass main = new MainClass();
		main.checkIfWin(shif, i);

	}
	
	/**
	 * Check if the game is win.
	 * @param shifu the {@link ShifuEnum}.
	 * @param bot ia value.
	 * @return int result.
	 */
	public int checkIfWin(ShifuEnum shifu, int bot) {
		int result = 0;
		
		if (shifu != null) {
		
			if (shifu.equals(ShifuEnum.ROCK)) {
				this.rockVS(bot);
			} else if (shifu.equals(ShifuEnum.PAPER)) {
				this.paperVS(bot);
			} else if (shifu.equals(ShifuEnum.SCISSOR)) {
				this.scissorVS(bot);
			}
			
			result = 1;
			
		} else {
			System.out.println("Entrer une valeur : P, S ou R");
		}
		
		return result;
	}
	
	/**
	 * Check if the rock win or not.
	 * @param bot the bot value.
	 * @return int result.
	 */
	public int rockVS(int bot) {
		
		int result = -1;
		
		if (bot == ShifuEnum.ROCK.getId()) {
			result = 0;
			System.out.println("L'IA a choisi " + ShifuEnum.ROCK.getName()
					+ ". Égalite.");
		} else if (bot == ShifuEnum.PAPER.getId()) {
			result = 2;
			System.out.println("L'IA a choisi " + ShifuEnum.PAPER.getName()
					+ ". Tu as perdu.");
		} else if (bot == ShifuEnum.SCISSOR.getId()) {
			result = 1;
			System.out.println("L'IA a choisi " + ShifuEnum.SCISSOR.getName()
					+ ". Tu as gagné !");
		}
		
		return result;
	}
	
	/**
	 * Check if the paper win or not.
	 * @param bot the bot value.
	 * @return int result.
	 */
	public int paperVS(int bot) {
		
		int result = -1;
		
		if (bot == ShifuEnum.ROCK.getId()) {
			result = 1;
			System.out.println("L'IA a choisi " + ShifuEnum.ROCK.getName()
					+ ". Tu as gagné !");
		} else if (bot == ShifuEnum.PAPER.getId()) {
			result = 0;
			System.out.println("L'IA a choisi " + ShifuEnum.PAPER.getName()
					+ ". Égalité.");
		} else if (bot == ShifuEnum.SCISSOR.getId()) {
			result = 2;
			System.out.println("L'IA a choisi " + ShifuEnum.SCISSOR.getName()
					+ ". Tu as perdu.");
		}
		
		return result;
	}
	
	/**
	 * Check if the scissor win or not.
	 * @param bot the bot value.
	 * @return int result.
	 */
	public int scissorVS(int bot) {
		
		int result = -1;
		
		if (bot == ShifuEnum.ROCK.getId()) {
			result = 2;
			System.out.println("L'IA a choisi " + ShifuEnum.ROCK.getName()
					+ ". Tu as perdu.");
		} else if (bot == ShifuEnum.PAPER.getId()) {
			result = 1;
			System.out.println("L'IA a choisi " + ShifuEnum.PAPER.getName()
					+ ". Tu as gagné !");
		} else if (bot == ShifuEnum.SCISSOR.getId()) {
			result = 0;
			System.out.println("L'IA a choisi " + ShifuEnum.SCISSOR.getName()
					+ ". Égalité.");
		}
		
		return result;
	}

}
