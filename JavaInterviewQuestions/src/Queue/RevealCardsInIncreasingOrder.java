package Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {

	public static int[] deckRevealedIncreasing(int[] deck) {
		int length = deck.length;
		Arrays.sort(deck);
		int[] result = new int[length];
		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < length; i++) {
			deque.add(i);
		}

		for (int i = 0; i < length; i++) {
			result[deque.poll()] = deck[i];
			deque.add(deque.poll());
		}

		return result;
	}

	public static void main(String[] args) {
		int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
		System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));

	}

}
