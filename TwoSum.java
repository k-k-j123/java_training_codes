public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for (int i = 0; i < numbers.length; i++) {
        // hm.put(numbers[i], i);
        // int req = Math.abs(numbers[i] - target);
        // if (hm.containsKey(req)) {
        // return new int[] { hm.get(req) + 1, i + 1 };
        // }
        // }

        // return new int[] {};
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = { 7, 11, 2, 15 };
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
