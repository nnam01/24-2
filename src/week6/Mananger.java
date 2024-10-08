package week6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Mananger {
    ArrayList<Manageable> mList = new ArrayList<>();

    void search(Scanner scan) {
        // TODO Auto-generated method stub
        String kwd;
        while (true) {
            System.out.print("검색 키워드: ");
            kwd = scan.next();
            if (kwd.equals("end")) break;
            for (Manageable m: mList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }

    void printAll() {
        // TODO Auto-generated method stub
        for (Manageable m: mList)
            m.print();
    }

    void readAll(String filename, Factory fac) {
        Scanner filein = openFile(filename);
        Manageable m = null;
        while (filein.hasNext()) {
            m = fac.create(filein);
            m.read(filein);
            mList.add(m);
        }
    }
    Scanner openFile(String filename) {
        Scanner filein = null;
        try {
            filein = new Scanner(new File(filename));
        } catch (Exception e) {
            System.out.printf("파일 오픈 실패: %s\n", filename);
            throw new RuntimeException(e);
        }
        return filein;
    }
}
