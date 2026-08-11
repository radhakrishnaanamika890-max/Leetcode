class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0, max = 0;

        for (int j = 0; j < fruits.length; j++) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while (map.size() > 2) {
                int fruit = fruits[i];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0)
                    map.remove(fruit);

                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}