package stackandqueue;
import java.util.Arrays;
import java.util.Stack;
public class dailytemperature {

	public static void main(String[] args) {
		int temperatures[] = {73,74,75,71,69,72,76,73};
		int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];

            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                int j= stack.pop();
                result[j] = i -j;
                System.out.println(i-j);
            }
            stack.push(i);
            
        }


System.out.println(Arrays.toString(result));
	}

}
