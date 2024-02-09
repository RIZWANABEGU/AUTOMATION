package practicetask;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="my name is surya";
String[] s=str.split(" ");
for (int i=s.length-1;i>0;i--) {
	System.out.print(s[i]+" ");
}
	}

}
