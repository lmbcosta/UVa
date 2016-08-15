#include <stdio.h>
#include <stdbool.h>

int main() {
  bool stop = false;
  
  while (!stop) {
    int n;
    scanf("%d", &n);

    if(n == 0)
      stop = true;
    else {
      int xP, yP;
      scanf("%d", &xP);
      scanf("%d", &yP);

      int i;
      for (i = 0; i < n; i++) {
        int x, y;
        scanf("%d", &x);
        scanf("%d", &y);

        if (xP == x || yP == y)
          printf("divisa\n");
        else {
          if (x < xP && y > yP)
            printf("NO\n");
          else {
            if (x < xP && y < yP)
              printf("SO\n");
            else {
              if (x > xP && y > yP)
                printf("NE\n");
              else {
                printf("SE\n");
              }
            }
          }
        }
      }
    }
  }
  return 0;
}