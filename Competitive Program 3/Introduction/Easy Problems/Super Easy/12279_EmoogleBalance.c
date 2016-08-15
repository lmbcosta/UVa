#include <stdio.h>
#include <stdbool.h>

int main() {
  bool stop = false;
  int input = 0;

  while (!stop) {

    int tests;
    scanf("%d", &tests);
    stop = tests == 0 ? true : false;
    int zero = 0;
    int nonZero = 0;

    int i;
    for (i = 0; i < tests; i++) {
      int x;

      scanf("%d", &x);

      if (x == 0)
        zero++;
      else
        nonZero++;
    }
    input++;
    if (!stop)
      printf("Case %d: %d\n", input, nonZero - zero);
  }
  return 0;
}