#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable:4996)

int arr[2187][2187];
int result[3] = { 0,0,0 };
int main() {
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
			scanf("%d", &arr[i][j]);
	}
	divide(0, 0, n);
	for (int i = 0; i < 3; i++)
		printf("%d\n", result[i]);
	return 0;
}
int check(int a, int b, int size) {
	int temp = arr[a][b];
	for (int i = a; i < a + size; i++) {
		for (int j = b; j < b + size; j++) {
			if (arr[i][j] != temp)
				return 0;
		}
	}
	result[temp+1]++;
	return 1;
}
int divide(int a, int b, int size) {
	if (!check(a,b,size)) {
		for (int i = a; i < a + size; i+=size/3) {
			for (int j = b; j < b + size; j += size / 3)
				divide(i, j, size / 3);
		}
	}
	return 0;
}