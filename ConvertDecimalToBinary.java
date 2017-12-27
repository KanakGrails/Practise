package com.practice.deleteit.later;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		covertDtoB obj = new covertDtoB();
		obj.printBinary(234);

	}

}
class covertDtoB
{
	int binary[]  = new int[25];
	int index=0;
	public void printBinary(int numbers)
	{
		while(numbers>0)
		{
			binary[index++] = numbers%2;
			numbers = numbers/2;
		}
		for(int i=index-1;i>0;i--)
		{
			System.out.print(binary[i]);
		}
	}
}
