package SS5;

import java.util.Scanner;

public class HN_KS24_CNTT4_NguyenDoanhTuan {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int choice=0;
        String [] students =new String[100];

      do{
          choice=0;
          System.out.print("----Menu----\n");
          System.out.print("1.Hiển thị: In ra danh sách MSSV hiện có \n");
          System.out.print("2.Thêm mới (Có Regex): * Yêu cầu nhập MSSV mới\n");
          System.out.print("Nhap lua chon\t:");
          choice= sc.nextInt();
          switch (choice){
              case 1:
                    // Hiển thị danh sách MSSV
                    System.out.println("Danh sách MSSV hiện có:");
                    for (String student : students) {
                        if (student != null) {
                            System.out.println("MSSV: " + student);
                        }
                    }
                    break;
              case 2:

                    sc.nextLine();
                    String regex = "^B\\d{7}$";
                    String newMSSV;
                    do {
                        System.out.print("Nhập MSSV mới (dạng Bxxxxxxx): ");
                        newMSSV = sc.nextLine();
                        if (!newMSSV.matches(regex)) {
                            System.out.println("Sai định dạng! MSSV phải bắt đầu bằng B và theo sau là 7 chữ số.");
                        }
                    } while (!newMSSV.matches(regex));

                    boolean added = false;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = newMSSV;
                            System.out.println("Thêm MSSV thành công!");
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        System.out.println("Danh sách đã đầy, không thể thêm MSSV mới.");
                    }
                    break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  break;
              case 6:
                  System.out.print("Thoat chuong trinh");
              default:
                  System.out.print("Lua chon khong phu hop\t");
          }
      }while (choice!=6);
        }
    }

