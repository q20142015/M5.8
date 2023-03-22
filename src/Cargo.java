public class Cargo {
    final Dimensions dim;
    final double mass;
    final String adress;
    final boolean perevorot;
    final String regNumber;
    final boolean fragile;

    Cargo(double length, double width, double height, double mass,
          String adress, boolean perevorot, String regNumber, boolean fragile) {
        this.dim = new Dimensions(length, width, height);
        this.mass = mass;
        this.adress = adress;
        this.perevorot = perevorot;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Cargo changeAdress(Cargo cargo, String adress) {
        return new Cargo(cargo.dim.length, cargo.dim.width, cargo.dim.height, cargo.mass,
                adress, cargo.perevorot, cargo.regNumber, cargo.fragile);

    }

    public Cargo changeDimensions(Cargo cargo, double length, double width, double height) {
        return new Cargo(length, width, height, cargo.mass,
                cargo.adress, cargo.perevorot, cargo.regNumber, cargo.fragile);

    }

    public Cargo changeMass(Cargo cargo, double mass) {
        return new Cargo(cargo.dim.length, cargo.dim.width, cargo.dim.height, mass,
                cargo.adress, cargo.perevorot, cargo.regNumber, cargo.fragile);

    }

}
