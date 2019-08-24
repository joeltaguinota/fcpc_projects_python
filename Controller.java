mport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class Controller {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Employee employee = new Employee();
        Salary salary = new Salary();
        Report report = new Report(employee, salary);
        ArrayList list = new ArrayList();
        String option;
        String addtoRecord, removetoRecord;
        boolean loop = true;
        while (loop != false){
            System.out.println("\t Selection Option: \n"+
                           "----------------------------------\n+
                           "[1] - Add Record\n"+
                           "[2] - Remove Record\n"+
                           "[3] - View Record\n"+
                           "[4] - Exit\n"+
                           "----------------------------------");
            System.out.println("Choice: ");

        try{
            option = reader.readLine();
            int choice = Integer.parseInt(option);

            switch (choice){
                case 1:
                    System.out.println("Enter First Name: ");
                    String FNAME = reader.readLine();
                    employee.getFIRST_NAME();
                    System.out.println("Enter Middle Name: ");
                    String MNAME = reader.readLine();
                    employee.getMIDDLE_NAME();
                    System.out.println("Enter Last Name: ");
                    String LNAME = reader.readLine();
                    employee.getLAST_NAME();
                    System.out.println("Enter Age: ");
                    int EMP_AGE = reader.read();
                    employee.getEMP_AGE();
                    System.out.println("Enter Gender: ");
                    String EMP_GEN = reader.readLine();
                    employee.getEMP_GEN();
                    System.out.println("Enter Position: ");
                    String EMP_POS = reader.readLine();
                    employee.getEMP_POS();
                    System.out.println("Enter Tax: ");
                    double TAX = Integer.parseInt();
                    salary.getEMP_TAX();
                    System.out.println("Enter Deduction Rate: ");
                    double DED_RATE = Integer.parseInt();
                    salary.getDED_RATE();
                    System.out.println("Enter Final Rate: ");
                    double FIN_RATE = Integer.parseInt();
                    salary.getFIN_RATE();
                    list.add(addtoRecord);
                    System.out.println("You added: "+addtoRecord);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Record List");
                    Iterator previewList = list.listIterator();
                    while(previewList.hasNext()){
                        System.out.println(previewList.next());
                    }
                    System.out.println("--------------------");
                    System.out.println("");


            }



        }catch (IOException e){
            e.printStackTrace();
        }


        }
    }
}
