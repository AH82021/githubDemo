package builder_buffer;

public class StringDemo {
    public static void main(String[] args) {
        //String in java
        //immutable you can not change it
        //String pool
        System.out.println(5/0);
        String s = "";
        s.concat("Hello");
       s=  s+"World";
        for (int i = 0; i < 1000; i++) {
            s+=" Java";
        }

        //mutable String
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello,");
        //sb ="";
      sb.append("Java ");
      sb.append(21);
        sb.insert(0, "Hello ");
        // Hello Java 21
        // delete
        sb.delete(0,6);
        sb.deleteCharAt(0);
        System.out.println(sb);

     sb2.reverse();
        System.out.println(sb2);

        StringBuilder name = new StringBuilder("Ibrahim");
        name.reverse();

        String reveredString = name.toString();

        // Chaining Operatorations
        StringBuilder chain = new StringBuilder("java")
                .append(" is")
                .append( " awesome!")
                .insert(7,"programming")
                .delete(0,5);
        System.out.println(chain);

        // String in java
        //StringBuilder not thread safe

        //Database
        // DBMS (Database Management System)
        // Table (Rows and Columns) Relational Database mysql database
        //Document (MangoDb, NoSQl )

        //Oracle Database
        //IMB DB@
        //PostGres
        //Amzon SimpleDb
        //Microsoft SQL server
        //SQl 





    }
}
