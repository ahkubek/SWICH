public class Main {
    public static void main(String[] args) {
        char color = 'y';
        switch (color){
            case 'r':
                System.out.println("красный, ехать нельзя");
                break;
            case  'y':
                System.out.println("желтый");
                break;
            case 'g':
                System.out.println("зеленый");
                break;
            case 'l':
                System.out.println("налево");
                break;
            default:
                System.out.println("светофор, сломался");
        }

    }
}