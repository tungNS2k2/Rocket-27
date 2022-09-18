import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scanner = new Scanner(System.in);
//		Exercise 1:
//			Question 1:
//			Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet
//			(cm).
//			Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch
//			(số thực, có 2 số lẻ thập phân).
//			Với 1 inch = 2.54 cm và 1 foot = 12 inches.
			System.out.println("\nExsercise 1:\nQuestion 1:");
			System.out.println("Nhập vào 1 số thực: ");
			float varFloat = scanner.nextFloat();
			float foot = (float) ((varFloat/2.54)/12);
			float inch = (float) (varFloat/2.54);
			System.out.printf("foot: " + "'%5.2f'%n", foot);
			System.out.printf("inches" + "'%5.2f'%n", inch);
		
		
		
//			Question 2:
//			Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
//			[giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
//			Ví dụ: 02:11:05
			System.out.println("\n Question 2: ");
			int soGiay;
			do {
				System.out.println("Nhập số giây: ");
				soGiay = scanner.nextInt();
			}while (soGiay > 68399 || soGiay < 0);
			String var1 = "HH-mm-ss";
			SimpleDateFormat simp = new SimpleDateFormat(var1);
			String Date = simp.format(soGiay);
			System.out.println(Date);
			
//			Question 3:
//			Viết chương trình nhập vào 4 số nguyên.
//			Hiển thị ra số lớn nhất và nhỏ nhất
//			Ví dụ:
//			nhập vào 4 số 1,2,3,4 thì kết quả là:
//			Số lớn nhất là: 4
//			Số nhỏ nhất là: 1
	//
			int a, b, c, d;
			System.out.println("\n Question 3:\nNhập lần luotsj 4 số nguyên: ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			d = scanner.nextInt();
			
			int arr[] = new int [] {a,b,c,d};
			int max = arr[0];
			int min = arr[0];
			for (int index = 0; index <arr.length; index++) {
				if(arr[index] > max)
					max = arr[index];
				if(arr[index] < min)
					min = arr[index];
			}
			System.out.println("Max: " + max + "\nMin: " + min );
			
			
//			Question 4:
//			Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
//			Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ
//			hai].
//			Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ
//			hai].
			System.out.println("\n Question 4: ");
			int x, y;
			System.out.println("\n nhập lần lượt 2 số nguyên a, b: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			if(x - y > 0) {
				System.out.println("Số thứ nhất lớn hơn số thứ hai");
			}
			else if (x - y < 0) {
				System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
			}
			else {
				System.out.println("\n số thứ nhất bằng số thứ 2");
			}
			
			
//			Question 5:
//			Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không
			int x1, x2;
			System.out.println("\nQuestion 5:\n Nhập lần lượt 2 số tự nhiên:");
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			if(x1 % x2 == 0) {
				System.out.println("a không chia hết cho b");
			}
			else {
				System.out.println("a chia hết cho b");
			}
			
//			Question 6:
//			Xếp loại sinh viên theo các qui luật dưới đây:
//			Nếu điểm >= 9.0 - Loại xuất sắc
//			Nếu 8.0<= điểm < 9.0 - Loại giỏi
//			Nếu 7.0<= điểm < 8.0 - Loại khá
//			Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
//			Nếu 5.0 <= điểm < 6.0 - Loại trung bình
//			Nếu điểm < 5.0 - Loại kém
//			Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4
//			Viết Chương trình:
//			a. Nhập vào điểm 3 môn học
//			b. Tính điểm trung bình
//			c. Xác định học lực của học sinh dựa trên điểm trung bình
//			d. Hiển thị học lực của học sinh
			
			
			
			float diemToan, diemHoa, diemLy;
			System.out.println("\n Question 6:\na. Nhập diểm môn toán: ");
			diemToan = scanner.nextInt();
			System.out.println("Nhập điểm hóa: ");
			diemHoa = scanner.nextInt();
			System.out.println("Nhập điểm lý: ");
			diemLy = scanner.nextInt();
			float diemTB = (diemToan + diemHoa + diemLy)/3;
			System.out.println("b. Điểm trung bình: "+ diemTB);
			if(diemTB >= 9.0)
				System.out.println("Học Sinh loại xuất sắc");
			else if(8.0 <= diemTB && diemTB <= 9.0)
				System.out.println("Loại giỏi");
			else if(diemTB >=7.0 && diemTB <= 8.0)
				System.out.println("Loại khá");
			else if(6.0 <= diemTB && diemTB <= 7.0)
				System.out.println("loại TB khá");
			else if(diemTB >= 5.0 && diemTB <= 6.0)
				System.out.println("Loại TB");
			else
				System.out.println("Loại yếu");
	//
//			Exercise 2:
//			Question 1:
//			Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
//			Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
			System.out.println("\n Execrcise 2:\nQuestion 1:");
			int n = scanner.nextInt();
			float[] arr1 = new float [n];
			for (int index = 0; index < n; index ++) {
				arr1[index] = scanner.nextFloat();
			}
			for(int index = 0; index <n; index ++) {
				System.out.println(arr1[index]);
			}
			
			
			
			
//			Question 2:
//			Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1.
//			Hãy liệt kê các phần tử xuất hiện trong dãy đúng 2 lần.
//			Question 3:
//			Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
//			In ra màn hình số lần xuất hiện của các phần tử.
//			Question 4:
//			Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//			Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
//			Question 5:
//			Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//			Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
//			Question 6:
//			Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
//			Question 7:
//			Viết chương trình liệt kê n số nguyên tố đầu tiên.
//			Question 8:
//			Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số
//			tự nhiên a và b.
//			Question 9:
//			Dãy số Fibonacci được định nghĩa như sau:
	//
//			F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2.
	//
//			Hãy viết chương trình tìm số Fibonacci thứ n.
	//
//			3
	//
//			Question 10:
//			Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ
//			phải sang trái số đó ta vẫn nhận được một số giống nhau.
//			Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).
//			Question 11:
//			Viết chương trình liệt kê tất cả các hoán vị của 1, 2, .., n.
//			Question 12:
//			Nhập số liệu cho 2 dãy số thực a0 , a1 ,..., am-1 và b0 , b1 ,..., bn-1. Giả sử
//			cả 2 dãy này đã được sắp theo thứ tự tăng dần.
//			Hãy tận dụng tính sắp xếp của 2 dãy và tạo dãy c0 , c1 ,..., cm+n-1 là hợp của
//			2 dãy trên, sao cho dãy ci cũng có thứ tự tăng dần .
//			Question 13:
//			Nhập số n và dãy các số thực a0 , a1 ,..., an-1. Không đổi chỗ các phần tử và
//			không dùng thêm mảng số thực nào khác (có thể dùng mảng số nguyên nếu
//			cần)
//			Hãy cho hiện trên màn hình dãy trên theo thứ tự tăng dần
//			Question 14:
//			Nhập một số tự nhiên n.
//			Hãy liệt kê các số Fibonaci nhỏ hơn n là số nguyên tố
//			Question 15:
//			Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng
//			sau:
//			a) Tính tổng các chữ số của n.
//			b) Phân tích n thành các thừa số nguyên tố.
//			Question 16:
//			Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
//			a) Liệt kê các ước số của n. Có bao nhiêu ước số.
//			b) Liệt kê các ước số là nguyên tố của n.
	//
//			Question 17:
//			Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//			a) Là số nguyên tố.
//			b) Là số thuận nghịch.
//			c) Tổng các chữ số của số đó là một số thuận nghịch
	//
//			Question 18:
//			Viết chương trình nhập vào vào mảng A có n phần tử
//			(các phần tử là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ
//			bàn phím. )
	//
//			4
//			Thực hiện các chức năng sau:
//			a) Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
//			b) Sắp xếp mảng theo thứ tự giảm dần .
//			c) Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính
//			sắp xếp giảm dần.
	//
//			Question 19:
//			Viết chương trình nhập vào vào mảng A có n phần tử, các phần tử là những số
//			nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ bàn phím.
//			Thực hiện các chức năng sau:
//			a) Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
//			b) Sắp xếp mảng theo thứ tự giảm dần .
//			c) Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính
//			sắp xếp giảm dần.
	//
//			Question 20:
//			Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ
//			các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành
//			chữ thường)
//			Question 21:
//			Viết chương trình thực hiện nhập một xâu ký tự
//			a) Tìm từ dài nhất trong xâu đó.
//			b) Từ đó xuất hiện ở vị trí nào?
//			(Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm
//			thấy).
	//
//			Exercise 3:
//			Question 1: Sử dụng for, while, do while để cho ra kết quả a, b, c, d như ảnh
	//
//			Question 2:
//			Viết chương trình tính n! với n là số tự nhiên không âm nhập vào từ bàn phím.
//			Trong đó: 0! = 1 n! = 1.2.3...n


	}

}
