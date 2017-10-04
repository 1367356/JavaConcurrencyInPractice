package intruction;

public class UnsafeSequence {
			private int value;
			
			/**
			 * 返回一个唯一的数值
			 * 这个方法是线程不安全的，因为当多线程访问时，可能返回的值不同
			 */
			public int getNext(){
				return value++;
			}
}
