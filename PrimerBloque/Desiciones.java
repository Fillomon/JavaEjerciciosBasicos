public class Desiciones{

    public static void main(String[] args) {
        int fechaLanzamiento=1999;
        boolean incluidoEnElPlan=true;
       // double notaDeLaPelicula=8.2;
        String tipoPlan="plus";

        if(fechaLanzamiento>2022){
            System.out.println("Peliculas Mas populares");
        }else{
            System.out.println("Pelicula Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible en su plan!");
        }
    }
}