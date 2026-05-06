class Solution {

    private void moveAlltoTheRight(char[] num) {
        int j = num.length - 1; 
        int i = num.length - 1; 
        
        while (i >= 0) {
            if (num[i] == '*') {
                j = i - 1;
                i--;
            } else if (num[i] == '#') {
                num[i] = '.';
                num[j] = '#';
                j--;
                i--;
            } else {
                i--;
            }
        }
    }

    public char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;

        char[][] rot = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            moveAlltoTheRight(boxGrid[i]);
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rot[j][rows - 1 - i] = boxGrid[i][j];
            }
        }
        
        return rot;
    }
}