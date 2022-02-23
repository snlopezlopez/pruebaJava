package GeeksForGeeks;


public class gfg {
        public static void main(String[] args) {
            /*StringBuilder sb = new StringBuilder();
            //sb.append('c').append(3.0);
            //String salida = sb.toString();
            //System.out.println(
                    "El valor de StringBuilder es-->" + salida);
            */
            String fieldName = "20220201";
            StringBuilder aux = new StringBuilder();
            aux.append("if (trim(" )
                .append(fieldName)
                .append(")='', '', cast(concat(substr(")
                .append(fieldName)
                .append(", 1,4), '-', substr(")
                .append(fieldName)
                .append(", 5,2), '-', substr(")
               .append(fieldName)
               .append(", 7,2)) as ")
               .append("STRING")
               .append("))");
            System.out.println(
                    "El valor de StringBuilder es-->" + aux.toString());
            //System.out.println("cast(concat(substr(20220201, 1,4)" + cast(concat(substr(20220201, 1,4));

            String v1 = "20220201";
            System.out.println("El valor es-->" + v1.substring(0, 4));

        }
    }
