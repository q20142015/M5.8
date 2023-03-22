import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cargo cargo=new Cargo(10, 20, 30, 40,
                "SPb", true, "sb102030", true);
        Cargo cargo1=cargo;

        System.out.println(cargo.dim.length+" "+ cargo.dim.width+" "+
                cargo.dim.height +" "+ cargo.mass+" "+cargo.adress+" "+
                cargo.perevorot+" "+cargo.regNumber+" "+cargo.fragile);
        System.out.println(cargo1.dim.length+" "+ cargo1.dim.width+" "+
                cargo1.dim.height +" "+ cargo1.mass+" "+cargo1.adress+" "+
                cargo1.perevorot+" "+cargo1.regNumber+" "+cargo1.fragile);
        cargo=cargo.changeAdress(cargo,"sp");
        System.out.println(cargo.dim.length+" "+ cargo.dim.width+" "+
                cargo.dim.height +" "+ cargo.mass+" "+cargo.adress+" "+
                cargo.perevorot+" "+cargo.regNumber+" "+cargo.fragile);
        System.out.println(cargo1.dim.length+" "+ cargo1.dim.width+" "+
                cargo1.dim.height +" "+ cargo1.mass+" "+cargo1.adress+" "+
                cargo1.perevorot+" "+cargo1.regNumber+" "+cargo1.fragile);

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Vvedite nomer eteza: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
