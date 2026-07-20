import java.util.Scanner ;


public class Main {
    // Hàm tìm điểm cao nhất
    public static double findMax(double[] arr) {
        double max = arr[0]; // Giả định người đầu tiên cao nhất
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Cập nhật lại nếu tìm thấy điểm cao hơn
            }
        }
        return max; // Trả kết quả về nơi gọi hàm
    }
    // Hàm tính điểm trung bình cả lớp
    public static double calculateAverage(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Cộng dồn điểm
        }
        return sum / arr.length; // Trả về điểm trung bình
    }
    // Hàm đếm số học sinh < 5.0 bằng vòng lặp for-each
    public static int countFailedStudents(double[] arr) {
        int count = 0;
        // score sẽ đại diện trực tiếp cho điểm của từng học sinh qua mỗi lượt lặp
        for (double score : arr) {
            if (score < 5.0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap so luong hoc sinh
        int n;
        do {
            System.out.print("Nhập số lượng học sinh N (N > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Số lượng học sinh không hợp lệ! Phải lớn hơn 0.");
            }
        } while (n <= 0);
        // tao mang va nhap du lieu
        double[] arr = new double[n];
        System.out.println("\n--- NHẬP ĐIỂM CHO TỪNG HỌC SINH ---");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập điểm cho học sinh thứ " + (i + 1) + " (0.0 - 10.0): ");
                arr[i] = sc.nextDouble();
                if (arr[i] < 0.0 || arr[i] > 10.0) {
                    System.out.println("Điểm số phải nằm trong khoảng từ 0.0 đến 10.0! Vui lòng nhập lại.");
                }
            } while (arr[i] < 0.0 || arr[i] > 10.0);
        }
        // Bước 4: Gọi các hàm xử lý và hiển thị kết quả
        System.out.println("\n--- KẾT QUẢ THỐNG KÊ ---");

        // 1. Gọi hàm tìm điểm cao nhất
        double maxScore = findMax(arr);
        System.out.println("- Điểm số cao nhất trong lớp: " + maxScore);

        // 2. Gọi hàm tính điểm trung bình và dùng printf để làm tròn 2 chữ số thập phân
        double avgScore = calculateAverage(arr);
        System.out.printf("- Điểm số trung bình cả lớp: %.2f\n", avgScore);

        // 3. Gọi hàm đếm số học sinh dưới trung bình
        int failedCount = countFailedStudents(arr);
        System.out.println("- Số lượng học sinh dưới trung bình (< 5.0): " + failedCount);



    }
}