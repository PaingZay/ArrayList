import java.util.ArrayList;

public class Club {

	 private int currentNumber = 1;
    private ArrayList<Member> memberList = new ArrayList<>();

    public Member addMember (String surname, String firstName,
						String secondName) {
        Member m = new Member (surname, firstName, secondName,
        		currentNumber);
        memberList.add(m);
        currentNumber++;
        
        return m;
    }

    public void showMembers () {
        for (Member member: memberList) {
        	member.show();
        }
    }

    public Member findMember (int memberNumber) {
    	for (Member member: memberList) {
    		if (member.getMemberNumber() == memberNumber) {
    			return member;
    		}
    	}
    	
    	return null;
    }
    
    public void removeMember (int memberNumber) {
        Member memberToRemove = findMember(memberNumber);
    	
        if (memberToRemove != null) {
        	memberList.remove(memberToRemove);
        }
    }
}
