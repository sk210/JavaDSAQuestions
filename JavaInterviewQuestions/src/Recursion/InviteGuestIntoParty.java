package Recursion;

public class InviteGuestIntoParty {
	
	public static int inviteGuestIntoParty(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		int way1 = inviteGuestIntoParty(n-1);
		
		int way2 = (n-1) * inviteGuestIntoParty(n-2);
		
		int totalWays = way1 + way2;
		
		return totalWays;
				
	}

	public static void main(String[] args) {
		System.out.println(inviteGuestIntoParty(4));
	}

}
