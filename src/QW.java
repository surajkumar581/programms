import java.util.*;
public class QW {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter the row length of an array");
int row=sc.nextInt();
System.out.println("enterr the column length of an array ");
int column=sc.nextInt();
int a[][]=new int[row][column];
System.out.println("enter"+row*column+"element to store  in array");
for(int i=0;i<=row;i++) {
	for(int j=0;j<=column;j++) {
		a[i][j]=sc.nextInt();
	}
}
System.out.println( "element in array");
for(int i=0;i<=row;i++) {
	for(int j=0;j<=column;j++) {
		System.out.println("Row["+i+"]:Column["+j+"]:+a[i][j]);
	}
}
}

}
