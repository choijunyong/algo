#include<stdio.h>
int main(void) 
{
	int i;
	float s, e, sum = 0, time = 0, sol = 0;

	for (i = 0; i < 5; i++) 
	{
		scanf("%f %f", &s, &e);
		time = e - s - 1;
		if (time < 0) time = 0;
		else if (time >= 4) time = 4;
		sum += time;
	}

	sol = sum * 10000;
	if (sum >= 15) sol = sol - sol * 0.05;
	else if (sum <= 5) sol = sol + sol * 0.05;
	printf("%d", (int)sol);
	return 0;
}