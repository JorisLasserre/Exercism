class GameOfLife {
    public int[][] tick(int[][] matrix) {
        if(matrix.length == 0){
            return matrix;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] nextGen = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int aliveNeighbors = countAliveNeighbors(matrix, i, j);

                if (matrix[i][j] == 1) {
                    nextGen[i][j] = (aliveNeighbors == 2 || aliveNeighbors == 3) ? 1 : 0;
                } else {
                    nextGen[i][j] = (aliveNeighbors == 3) ? 1 : 0;
                }
            }
        }
        return nextGen;
    }

    private int countAliveNeighbors(int[][] matrix, int x, int y) {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] directions = {-1, 0, 1};

        for (int dx : directions) {
            for (int dy : directions) {
                if (dx == 0 && dy == 0) continue;
                int nx = x + dx;
                int ny = y + dy;

                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && matrix[nx][ny] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}