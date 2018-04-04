package arraytwo;

public class numberthree {
public static void main(String[]args) {

	int [] secondsmall = {18,21,2,12,70,60};
	int smallest = secondsmall[0];
	int nextsmallest = secondsmall[1];
	for (int i = 0;i<6;i++)
	if (secondsmall[i]<smallest) {
	smallest = secondsmall [i];

	
	}
	System.out.print(smallest);
	for(int i = 0;i<6;i++)
	if (secondsmall[i]< nextsmallest && secondsmall[i]>smallest) {
		
		nextsmallest = secondsmall[i];
	
		
}
	System.out.print(nextsmallest);
	
}
}