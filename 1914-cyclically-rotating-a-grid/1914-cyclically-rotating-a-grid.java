class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            List<Integer> arr = new ArrayList<>();

            // top row
            for (int j = left; j <= right; j++) {
                arr.add(grid[top][j]);
            }

            // right column
            for (int i = top + 1; i <= bottom; i++) {
                arr.add(grid[i][right]);
            }

            // bottom row
            for (int j = right - 1; j >= left; j--) {
                arr.add(grid[bottom][j]);
            }

            // left column
            for (int i = bottom - 1; i > top; i--) {
                arr.add(grid[i][left]);
            }

            int size = arr.size();
            int rotate = k % size;

            // counter-clockwise rotation
            List<Integer> rotated = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                rotated.add(arr.get((i + rotate) % size));
            }

            int idx = 0;

            // top row
            for (int j = left; j <= right; j++) {
                grid[top][j] = rotated.get(idx++);
            }

            // right column
            for (int i = top + 1; i <= bottom; i++) {
                grid[i][right] = rotated.get(idx++);
            }

            // bottom row
            for (int j = right - 1; j >= left; j--) {
                grid[bottom][j] = rotated.get(idx++);
            }

            // left column
            for (int i = bottom - 1; i > top; i--) {
                grid[i][left] = rotated.get(idx++);
            }
            rotated = new ArrayList<>();
            arr = new ArrayList<>();
        }

        return grid;
    }
}