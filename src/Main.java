public class Main {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.setmarca("Mazda");
        miCarro.setmodelo("CX-5");
        miCarro.setasientos(5);
        miCarro.setllantas(4);
        miCarro.setnumeroPuertas(4);

        System.out.println("Carro: " + miCarro.getmarca() + " " + miCarro.getmodelo()
                + " - " + miCarro.getasientos() + " asientos - "
                + miCarro.getnumeroPuertas() + " puertas");

        Camion miCamion = new Camion();
        miCamion.setmarca("Volvo");
        miCamion.setmodelo("FH16");
        miCamion.setllantas(10);
        miCamion.setcapacidadCarga(12000);

        System.out.println("Camion: " + miCamion.getmarca() + " " + miCamion.getmodelo()
                + " - " + miCamion.getllantas() + " llantas - carga: "
                + miCamion.getcapacidadCarga() + " kg");

        Moto miMoto = new Moto();
        miMoto.setmarca("Yamaha");
        miMoto.setmodelo("MT-07");
        miMoto.setllantas(2);
        miMoto.settieneSidecar(false);



    }