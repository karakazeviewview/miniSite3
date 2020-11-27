1から20までカウントアップしていく、ただし、３の倍数の時は「Fizz」,5の倍数の時は「Bazz」,3と5の公倍数のときは「FizzBazz」と表示する。

[実行例]
1
2
Fizz
4
Bazz
Fizz
7
8
Fizz
Bazz
11
Fizz
13
14
FizzBazz
16
17
Fizz
19
Bazz

public class FizzBazz{
	public static void main(String[] args){
	for(int i=1;i<=20;i++){
		if((i%3==0) && (i%5==0)){
			System.out.println("Fizzbazz");
		}else if(i%3==0){
			System.out.println("Fizz");
		}else if(i%5==0){
			System.out.println("Bazz");
		}else{
			System.out.println(i);
		}
		}
	}
}