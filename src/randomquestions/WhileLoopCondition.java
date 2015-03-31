package randomquestions;

public class WhileLoopCondition {
	public static void main(String[] args){
		int[] fives = new int [10];
		fives[5] = 4;
		int index = 0;
		while(index!=fives[index] && index<fives.length){
			index++;
		}
		System.out.println(index + "\t" + fives[index]);
		while(index<fives.length && index!=fives[index]){
			index++;
		}
		System.out.println(index + "\t" + fives[index]);
	}
}
