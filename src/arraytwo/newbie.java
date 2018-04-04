package arraytwo;

public class newbie {
public static void main(String[]args) {
	
int [] numbers = {6,18,21,1,72,133};
int largest = numbers[0];
for (int i = 0;i<6;i++)
if (numbers[i]>largest) {
	largest = numbers [i];
}
System.out.print(largest);
	
}

}
