package tugas_jobsheet.percobaan2;

import tugas_jobsheet.percobaan1.*;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.printf(
        """
        %s
        ------------------------------
        %s
        """,
        e.getEmployeeInfo(),
        pEmp.getEmployeeInfo()
        );
    }
}
