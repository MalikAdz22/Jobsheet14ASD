import java.util.Scanner;

public class GraphMain17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph17 graph = new Graph17(6); // Ganti jumlah vertex sesuai kebutuhan
        
        int choice;
        do {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal1 = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan1 = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak1 = scanner.nextInt();
                    graph.addEdge(asal1, tujuan1, jarak1);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asal2 = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan2 = scanner.nextInt();
                    graph.removeEdge(asal2, tujuan2);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int gedung = scanner.nextInt();
                    graph.degree(gedung);
                    break;
                case 4:
                    graph.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asal5 = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan5 = scanner.nextInt();
                    if (graph.isAdjacent(asal5, tujuan5)) {
                        System.out.println("Gedung " + (char)('A' + asal5) + " dan Gedung " + (char)('A' + tujuan5) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char)('A' + asal5) + " dan Gedung " + (char)('A' + tujuan5) + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    int asal6 = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan6 = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int jarak6 = scanner.nextInt();
                    graph.updateJarak(asal6, tujuan6, jarak6);
                    break;
                case 7:
                    int edgeCount = graph.hitungEdge();
                    System.out.println("Jumlah edge dalam graf: " + edgeCount);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}