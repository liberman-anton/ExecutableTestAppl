
public class ExecutableJarTestAppl {

	private static String[] type = {"byte", "short", "int", "long", "float", "double", "char"};
	private static String[] minValue = {objToString(Byte.MIN_VALUE), objToString(Short.MIN_VALUE), 
			objToString(Integer.MIN_VALUE), objToString(Long.MIN_VALUE),
			objToString(Float.MIN_VALUE), objToString(Double.MIN_VALUE),
			charToString(Character.MIN_VALUE)};
	private static String[] maxValue = {objToString(Byte.MAX_VALUE), objToString(Short.MAX_VALUE), 
			objToString(Integer.MAX_VALUE), objToString(Long.MAX_VALUE),
			objToString(Float.MAX_VALUE), objToString(Double.MAX_VALUE),
			charToString(Character.MAX_VALUE)};
	private static int lengthType = type.length;
	
	public static void main(String[] args) {
		int lengthArgs = args.length;
		int flag = 0;
		int i = 0;
			while(i < lengthArgs){
				int j = 0;
				while ((j < lengthType) && !(args[i].equals(type[j]))){
					j++;
				}
				if(j != lengthType){
					display(j);
					flag = 1;
				}
				i++;
			}
		if(flag == 0) displayAll();
	}

	private static void displayAll() {
		int i = 0;
		while(i < lengthType){
			display(i);
			i++;
		}
	}

	private static String charToString(Character value) {
		return (value - '0') + "";
	}

	private static String objToString(Object obj) {
		return "" + obj;
	}

	private static void display(int i) {
		System.out.println("Type: " + type[i] + "\t min: " + 
									minValue[i] + "\t max: " + maxValue[i]);
		
	}

}
