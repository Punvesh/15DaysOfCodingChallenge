class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); // Stores all combinations
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) { // Found valid combination
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return; // Exceeded target

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose
            backtrack(candidates, target - candidates[i], i, current, result); // Stay on same 'i' for unlimited usage
            current.remove(current.size() - 1); // Undo choice
        }
    }
}
