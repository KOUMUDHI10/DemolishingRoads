#DemolishingRoads

package Roads;
import java.util.Scanner;
public class Demolish {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n, m;
System.out.print("Enter the number of houses(n): ");
n = scanner.nextInt();
System.out.print("Enter the subset size(m): ");
m = scanner.nextInt();
int result = minimumRoadsToDemolish(n,m);
System.out.println("Minimum number of roads to demolish:"+result);
}
public static int minimumRoadsToDemolish(int n, int m) {
if(n<m) {
return 0;
}
else if (m==3) {
return n-1;
}
else {
return m-1;
}
}
}
