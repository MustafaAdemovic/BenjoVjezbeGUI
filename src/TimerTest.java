import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * Zadatak Napraviti program koji svake sekunde ispisuje neke brojeve koji se
 * povećavaju brojačem, a svake svije sekunde se ispisuje neki string u mom
 * slučaju "Mustafa"
 * 
 * @author mustafaademovic
 *
 */

public class TimerTest {
	/**
	 * U klasi OtherTimeHandler pravimo neki string u mom slučaju "Mustafa"
	 * 
	 */
	private static class OtherTimeHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Mustafa");

		}// Kraj metode actionPerformed

	}// Kraj klase OtherTimerHandler

	/**
	 * 
	 * U klasi TimerHandler pravimo brojač i metodu actionPreformed u kojoj
	 * ispisujemo brojač i svki put ga povečavamo za jedan
	 *
	 */
	private static class TimerHandler implements ActionListener {
		int counter = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(counter++);

		}// Kraj metode actionPerformed

	}// Kraj klase TimerHandler

	public static void main(String[] args) {

		/*
		 * Svake sekunde ispisuje broj, a svake dvije sekunde ispiše
		 * string("Mustrafa")
		 */
		Timer t = new Timer(100, new TimerHandler());// 1000 su milisekunde znači jedna sekunda
		t.start();// start znaci početak ispisivanja

		Timer t2 = new Timer(2000, new OtherTimeHandler());// 2000 su milisekunde znači 2 sekunde
		t2.start();// start znaci početak ispisivanja

	}// Kraj maina

}// Kraj klase TimerTest
