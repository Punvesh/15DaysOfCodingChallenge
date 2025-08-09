class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, res);
        return res;
    }
    private void backtrack(int[] candidates, int target, List<Integer> combo, int start, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(combo));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            combo.add(candidates[i]);
            backtrack(candidates, target - candidates[i], combo, i, res);
            combo.remove(combo.size() - 1);
        }
    }
}