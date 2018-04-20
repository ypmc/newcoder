package leetcode;

/**
 * @author kangkang lou
 */
public class Main_130 {

    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        int h = board.length;
        int w = board[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                char c = board[i][j];
                if ((i == 0 || j == 0 || i == h - 1 || j == w - 1) && c == 'O') {
                    continue;
                } else if (c == 'O') {
                    boolean a0 = false;
                    boolean a1 = false;
                    boolean a2 = false;
                    boolean a3 = false;
                    int m = i - 1;
                    int n = j;
                    while (m >= 0) {
                        if (board[m][n] == 'X') {
                            a0 = true;
                            break;
                        } else if (board[m][n - 1] == 'O' && board[m][n + 1] == 'O') {
                            a0 = false;
                            break;
                        } else if (board[m][n - 1] == 'O') {
                            int temp = n - 2;
                            while (temp >= 0) {
                                if (board[m][n] == 'X') {
                                    a0 = true;
                                    break;
                                }
                                temp--;
                            }
                        } else if (board[m][n + 1] == 'O') {
                            int temp = n + 2;
                            while (temp < w) {
                                if (board[m][n] == 'X') {
                                    a0 = true;
                                    break;
                                }
                                temp++;
                            }
                        }
                        m--;
                    }
                    m = i + 1;
                    n = j;
                    while (m < h) {
                        if (board[m][n] == 'X') {
                            a1 = true;
                            break;
                        } else if (board[m][n - 1] == 'O' && board[m][n + 1] == 'O') {
                            a1 = false;
                            break;
                        } else if (board[m][n - 1] == 'O') {
                            int temp = n - 2;
                            while (temp >= 0) {
                                if (board[m][n] == 'X') {
                                    a1 = true;
                                    break;
                                }
                                temp--;
                            }
                        } else if (board[m][n + 1] == 'O') {
                            int temp = n + 2;
                            while (temp < w) {
                                if (board[m][n] == 'X') {
                                    a1 = true;
                                    break;
                                }
                                temp++;
                            }
                        }
                        m++;
                    }
                    n = j - 1;
                    m = i;
                    while (n >= 0) {
                        if (board[m][n] == 'X') {
                            a2 = true;
                            break;
                        } else if (board[m - 1][n] == 'O' && board[m + 1][n] == 'O') {
                            a2 = false;
                            break;
                        } else if (board[m - 1][n] == 'O') {
                            int temp = m - 2;
                            while (temp >= 0) {
                                if (board[temp][n] == 'X') {
                                    a2 = true;
                                    break;
                                }
                                temp--;
                            }
                        } else if (board[m + 1][n] == 'O') {
                            int temp = m + 2;
                            while (temp < h) {
                                if (board[temp][n] == 'X') {
                                    a2 = true;
                                    break;
                                }
                                temp++;
                            }
                        }
                        n--;
                    }
                    n = j + 1;
                    m = i;
                    while (n < w) {
                        if (board[m][n] == 'X') {
                            a3 = true;
                            break;
                        } else if (board[m - 1][n] == 'O' && board[m + 1][n] == 'O') {
                            a3 = false;
                            break;
                        } else if (board[m - 1][n] == 'O') {
                            int temp = m - 2;
                            while (temp >= 0) {
                                if (board[temp][n] == 'X') {
                                    a3 = true;
                                    break;
                                }
                                temp--;
                            }
                        } else if (board[m + 1][n] == 'O') {
                            int temp = m + 2;
                            while (temp < h) {
                                if (board[temp][n] == 'X') {
                                    a3 = true;
                                    break;
                                }
                                temp++;
                            }
                        }
                        n++;
                    }
                    if (a0 && a1 && a2 && a3) {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] arr = {{'O', 'X', 'O', 'O', 'O', 'X'}, {'O', 'O', 'X', 'X', 'X', 'O'}, {'X', 'X', 'X', 'X', 'X', 'O'}, {'O', 'O', 'O', 'O', 'X', 'X'}, {'X', 'X', 'O', 'O', 'X', 'O'}, {'O', 'O', 'X', 'X', 'X', 'X'}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        new Main_130().solve(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
