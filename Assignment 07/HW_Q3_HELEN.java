public class HW_Q3_HELEN {
    public static void main(String[] args) {
            String str = "HELEN";
            for (int i=0; i<=4; i++){
                char a = str.charAt(i);
                String m = " ";
                switch(a){
                    case 'H':
                        m += "3";
                        break;
                    case 'O':
                        m += "5";
                        break;
                    case 'U':
                        m += "8";
                        break;
                    case 'S':
                        m += "4";
                        break;
                    case 'E':
                        m += "2";
                        break;
                    case 'L':
                        m += "1";
                        break;
                    case 'M':
                        m += "6";
                        break;
                    case 'N':
                        m += "9";
                        break;
                }
                System.out.print(m);
            }
    }
}