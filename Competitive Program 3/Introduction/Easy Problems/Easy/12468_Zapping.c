#include <stdio.h>
#include <stdbool.h>

int main() {
  bool stop = false;

  while (!stop) {
    int ch1, ch2;
    
    scanf("%d", &ch1);
    scanf("%d", &ch2);

    if (ch1 == -1 && ch2 == -1)
      stop = true;

    int down = ch1 >= ch2 ? (ch1 - ch2) : (ch2 - ch1);
    int up = ch1 <= ch2 ? (ch1 + 100 - ch2) : (ch2 + 100 - ch1);

    if (!stop)
      printf("%d\n", down < up ? down : up);
  }
  return 0;
}