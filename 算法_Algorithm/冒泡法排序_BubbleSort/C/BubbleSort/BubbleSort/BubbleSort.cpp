// BubbleSort.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"

void BubbleSortIntArray(int arrays[], int len)
{
	for (int j = len; j > 1; j--)
	{
		for (int i = 0; i < j - 1; i++)
		{
			if (arrays[i] > arrays[i + 1])
			{
				int tmp = arrays[i];
				arrays[i] = arrays[i + 1];
				arrays[i + 1] = tmp;
			}
		}
	}
}


int main()
{
	int arrays[] = { 2,8,1,5,7,6,3 };

	int len = sizeof(arrays) / sizeof(int);
	
	BubbleSortIntArray(arrays, len);

	for (int i = 0; i < len; i++)
	{
		printf("%d\n", arrays[i]);
	}

	getchar();
    return 0;
}

