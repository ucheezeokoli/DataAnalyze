import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the sample size: ");
		int samp = input.nextInt();

		int [] arr = new int [samp];
		int [] brr = new int [samp];
		int [] crr = new int [samp];
		int [] drr = new int [samp];
		int i = 0;
		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		int avg = 0, avg1 = 0, avg2 = 0, avg3 = 0;

		System.out.println("Enter numbers for Trial 0");
		for (i = 0; i < samp; i++) {
			System.out.println("Enter sample # " + i + ":");
			arr[i] = input.nextInt();
			sum += arr[i];
			avg = (sum / samp);
		}

		System.out.println("Enter numbers for Trial 1");
		for (i = 0; i < samp; i++) {
			System.out.println("Enter sample # " + i + ":");
			brr[i] = input.nextInt();
			sum1 += brr[i];
			avg1 = (sum1 / samp);
		}

		System.out.println("Enter numbers for Trial 2");
		for (i = 0; i < samp; i++) {
			System.out.println("Enter sample # " + i + ":");
			crr[i] = input.nextInt();
			sum2 += crr[i];
			avg2 = (sum2 / samp);
		}

		System.out.println("Enter numbers for Trial 3");
		for (i = 0; i < samp; i++) {
			System.out.println("Enter sample # " + i + ":");
			drr[i] = input.nextInt();
			sum3 += drr[i];
			avg3 = (sum3 / samp);
		}

		System.out.print("\tSample # ");
		System.out.print(" Trial 1 ");
		System.out.print(" Trial 2 ");
		System.out.print(" Trial 3 ");
		System.out.println(" Trial 4 ");

		int count = 0;
		for (i = 0; i < samp; i++) { 
			System.out.println("\t" + i + "         " + arr[i] + "        " + brr[i] + "        " + crr[i] + "        " + drr[i]);
			count++;
			if (count == 4) {
				System.out.println(" ");
				count = 0;
			}
		}
		System.out.println("\t--------------------------------------------");
		System.out.println("Average:          " + avg + "        " + avg1 + "        " + avg2 + "        " + avg3);
		System.out.println(" ");

		int [] avg0 = {avg, avg1, avg2, avg3};
		int MIN = Integer.MAX_VALUE;
		for (i = 0; i <= 3; i++) {
			if (avg0[i] < MIN) {
				MIN = avg0[i];
			}
		}
		System.out.println("\tMin Average: " + MIN);

		int MAX = Integer.MIN_VALUE;
		for (i = 0; i <= 3; i++) {
			if (avg0[i] > MAX) {
				MAX = avg0[i];
			}
		}
		System.out.println("\tMax Average: " + MAX);
		System.out.println(" ");

		if (MIN == MAX) {
			System.out.print("\tThe trials match EXACTLY!");
		}
		else if ((2 * MIN) > MAX) {
			System.out.print("\tThe trials concur with each other!");
		}
		else {
			System.out.print("\tThe trials do NOT concur!");
		}
	}
}