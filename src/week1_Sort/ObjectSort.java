package week1_Sort;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ObjectSort {
	
	// Phương thức sắp xếp cho dữ liệu có giao diện Comparable (có thể so sánh được)
	public static void sort(Comparable[] a)
	{
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j].compareTo(a[j+1]) > 0) {
					Comparable temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
	}
	
	// Phương thức sắp xếp cho dữ liệu tổng quát T, thông qua bộ so sánh compare
	public  static <T> void sort(T[] a, Comparator<T> compare){
		for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare.compare(a[j],a[j+1]) > 0) {
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		
//		Integer[] a = {5, 1, 8, 41, 2, 7, 9, 4};
		String[] b= {"hung", "tung", "tuan", "hiep", "chinh"};
		Student[] sts= new Student[4];
		Student st1= new Student("Hung", 20);
		Student st2= new Student("Tuan", 15);
		Student st3= new Student("Khanh", 19);
		Student st4= new Student("Hanh", 19);
		sts[0]= st1;
		sts[1]= st2;
		sts[2]= st3;
		sts[3]= st4;
		
		Comparator<Student> comp = new Comparator<Student>() {			
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAge() == o2.getAge()) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getAge() - o2.getAge();
			}
		};
		
		
		
		sort(b);
		sort(sts, comp);
		
		for(int i = 0 ; i < sts.length ; i++)
			System.out.println(sts[i].toString());
		
		for(int i = 0 ; i < b.length ; i++)
			System.out.println(b[i]);
		
	}


}
