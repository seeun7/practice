#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable:4996)

int result = 0;
void divide(int n, int row, int column) {
    int size = 1;
    for (int i = 0; i < n; i++) 
        size *= 2;
    if (n == 0)
        return;
    int resize = size / 2; 
    if (row < resize && column <resize) {
        divide(n - 1, row, column);
    }
    else if (row < resize && column >= resize) {
        result += resize * resize;
        divide(n - 1, row, column - resize);
    }
    else if (row >=resize && column < resize) {
        result += 2 * resize * resize;
        divide(n - 1, row - resize, column);
    }
    else {
        result += 3 * resize * resize;
        divide(n - 1, row - resize, column - resize);
    }
}

int main() {
    int n, r, c;
    scanf("%d%d%d", &n, &r, &c);
    divide(n, r, c); 
    printf("%d\n", result);
    return 0;
}