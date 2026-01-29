package SS3.bai3;

public class bai3 {
    public static void maxQuantityOfBook(String[] names, int[] quantities){
        int max=quantities[0];
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]>max){
                max=quantities[i];
            }
        }
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]==max){
                System.out.printf("Ten sach : %s \n Quantity: %d \n",names[i],quantities[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min=quantities[0];
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]<min){
                min=quantities[i];
            }
        }
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]==min){
                System.out.printf("Ten sach : %s \n Quantity: %d \n",names[i],quantities[i]);
            }
        }
    }
    public static void main(String[] args){
        String[] names = { "Java Basics", "OOP Concepts", "Data Structures", "Algorithms", "Database Systems", "Operating Systems", "Computer Networks", "Software Engineering", "Web Development", "Mobile Programming" };
        int[] quantities = { 5, 10, 7, 8, 12, 6, 9, 4, 11, 3 };
        maxQuantityOfBook(names,quantities);
        minQuantityOfBooks(names,quantities);
    }
}
