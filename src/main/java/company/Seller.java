package company;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class Seller extends User  {

    ArrayList<Buyer> Buyers = new ArrayList<Buyer>();
    String filename;

    public Seller(String login, ArrayList<Buyer> Buyers) {
        super(login);
        this.Buyers = Buyers;
    }

    public void BrowseActiveBuyersSortedbyFamilyName() {
        Buyers.sort(Comparator.comparing(Buyer::getFullName));
        System.out.println("------------- active ones ---------");

        for (Buyer s : Buyers) {
            /*
            System.out.println(s.getFullName() + " " +
                                s.getPassWord()  + " " +
                                s.getPhoneNumber() + " " +
                                s.getID() + " " +
                                s.isActive());
            */


            if (s.isActive()) {
                System.out.println(s.getFullName() + " " +
                        s.getPassWord() + " " +
                        s.getPhoneNumber() + " " +
                        s.getID());
            }
        }
    }

        public void BrowseActiveAndWriteToFileSorted ( String filename){
        try {
            FileWriter outputfile = new FileWriter(filename);
            CSVWriter writer = new CSVWriter(outputfile);

            Buyers.sort(Comparator.comparing(Buyer::getFullName));
            for (Buyer s : Buyers)
            {
                if (s.isActive())
                {
                    String[] data = {s.getFullName(), s.getPassWord(), s.getPhoneNumber()};
                    writer.writeNext(data);
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

