import javax.swing.JOptionPane;

public class JavaLibs5026211088 {
    public static void main(String[] args){
        // Opening
        JOptionPane.showMessageDialog(null, "Opening..." , "Opening Jasa Joki Tugas Matematika", 2);
        JOptionPane.showMessageDialog(null, "Selamat datang di Jasa Joki Tugas Matematika!" +
        " Kalau kalian ke sini pasti kalian sedang bingung tentang tugas matematika kalian bukan?", "Selamat Datang!", 1);
        JOptionPane.showMessageDialog(null, "Kalau gitu, langsung aja isi data diri kalian untuk masuk ke database kita yaa! (Tenang aja nggak beneran kok hehe)", "Selamat Datang!", 1);

        // 1 Input Nama sebagai String
        String nama = JOptionPane.showInputDialog("Siapa namamu?");

        // 2 Input Tahun Kelahiran untuk menghitung usia
        int tahunLahir = Integer.parseInt(JOptionPane.showInputDialog("Halo, " + nama + "! Kamu lahir tahun berapa?"));
        int usia = 2022 - tahunLahir;
        JOptionPane.showMessageDialog(null, "Okay, " + nama + ". Usiamu tahun ini berarti " + usia + " kan?");

        // 3 Input Tempat Lahir
        String tempatLahir = JOptionPane.showInputDialog("Kamu lahir dimana?");
        JOptionPane.showMessageDialog(null, "Okay, " + nama + ". " + tempatLahir + " itu yang dideketnya Menara Eiffel bukan? (Bercanda :D)");

        // 4 Input Jenis Kelamin
        String[] jenisKelamin = {"Laki-Laki", "Perempuan"};
        String jenisKelaminPilihan =(String)JOptionPane.showInputDialog(null, "Jenis Kelamin", "Apa jenis kelaminmu?", 3, null, jenisKelamin, jenisKelamin[0]);
        JOptionPane.showMessageDialog(null, "Okay, " + nama + ". Ternyata kamu " + jenisKelaminPilihan + ", kalau admin sih Laki-laki.");

        // Transisi
        JOptionPane.showMessageDialog(null, "Terima kasih " + nama + " sudah mengisi data diri! Sekarang langsung saja ke soal matematika yang mau di joki kan.", "Jasa Joki Tugas Matematika", 1);

        // 5 dan 6 Input bilangan bulat
        JOptionPane.showMessageDialog(null, "Untuk yang pertama, " + nama + " bisa memasukkan 2 bilangan bulat bebas, asalkan masih masuk di rentang \"int\" pada Java.\n" +
                                            "Nanti kita akan mengalikan kedua bilangan bulat tersebut.", "Jasa Joki Tugas Matematika", 1);
        int bilbul1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan bulat pertama"));
        int bilbul2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan bulat kedua"));
        int hasilbilbul = bilbul1 * bilbul2;
        JOptionPane.showMessageDialog(null, "Calculating... (Tenang bukan error kok)" , "Calculating...", 2);
        JOptionPane.showMessageDialog(null, bilbul1 + " x " + bilbul2 + " = " + hasilbilbul , "Hasil Perkalian Bilangan Bulat", 1);

        // Transisi 1
        JOptionPane.showMessageDialog(null, "Keren bukan? Bisa langsung otomatis gitu. Iya dongg jelass.", "Jasa Joki Tugas Matematika", 1);
        
        // 7 dan 8 Input bilangan double
        JOptionPane.showMessageDialog(null, "Nah untuk yang kedua, " + nama + " bisa memasukkan 2 bilangan desimal bebas, bebas ajaa asal nggak usah banyak banyak kasian komputernya.\n" +
                                            "Nanti kita akan menjumlahkan kedua bilangan desimal tersebut. ", "Jasa Joki Tugas Matematika", 1);
        double bildes1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan desimal pertama (Gunakan \".\" sebagai koma)"));
        double bildes2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan desimal kedua (Gunakan \".\" sebagai koma)"));
        double hasilbildes = bildes1 + bildes2;
        JOptionPane.showMessageDialog(null, "Calculating... (Tenang bukan error kok)" , "Calculating...", 2);
        JOptionPane.showMessageDialog(null, bildes1 + " + " + bildes2 + " = " + hasilbildes , "Hasil Pertambahan Bilangan Desimal", 1);
        
        // Transisi 2
        JOptionPane.showMessageDialog(null, "Waduhhh keren banget gak sihh? Namanya aja \"Jasa Joki Tugas Matematika\", gimana nggak kerenn.", "Jasa Joki Tugas Matematika", 1);
        
        // 9 Input Survey Kepuasan
        JOptionPane.showMessageDialog(null, "Sekarang, admin minta ratingnya yaa. Dari 1 sampai 5, kira-kira \"Jasa Joki Tugas Matematika\" ini bagaimana?", "Jasa Joki Tugas Matematika", 1);
        int ratingKepuasan = Integer.parseInt(JOptionPane.showInputDialog("Rating 1-5"));
        if (ratingKepuasan < 3) {
            JOptionPane.showMessageDialog(null, "Waduh, maaf banget ya, " + nama + ". Semoga kedepannya kami bisa lebih baik lagi.", "Jasa Joki Tugas Matematika", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Wahh, makasih banyak, " + nama + ". Semoga harinya menyenangkan!", "Jasa Joki Tugas Matematika", 1);
        }

        // 10 Input Survey Membagikan ke Orang Lain
        JOptionPane.showMessageDialog(null, "Terakhir ya ini. Dari 1 sampai 5, kira kira seberapa besar keinginan " + nama + " untuk membagikan aplikasi ini ke teman/kerabat?", "Jasa Joki Tugas Matematika", 1);
        int ratingMembagikan = Integer.parseInt(JOptionPane.showInputDialog("Rating 1-5"));
        if (ratingMembagikan < 3) {
            JOptionPane.showMessageDialog(null, "Waduh, maaf banget ya, " + nama + ". Semoga kedepannya kami bisa lebih baik lagi agar mau untuk membagikan aplikasi ini ke teman/kerabat.", "Jasa Joki Tugas Matematika", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Wahh, makasih banyak, " + nama + ". Semoga semakin banyak yang bisa menggunakan aplikasi ini untuk kebaikan!", "Jasa Joki Tugas Matematika", 1);
        }

        // Closing
        JOptionPane.showMessageDialog(null, "Aplikasi nya cuma sampai sini aja, kalau ada tugas lagi bisa bangett buka aplikasi ini lagi. \nTerima kasih " + nama + " telah menggunakan aplikasi kami!", "Jasa Joki Tugas Matematika", 1);
        JOptionPane.showMessageDialog(null, "Closing..." , "Closing Jasa Joki Tugas Matematika", 2);

    }
}
