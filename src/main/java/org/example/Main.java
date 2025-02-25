package org.example;

public class Main{
        public static void main(String[] args) {
            int dia = 3;

            String nombreDia = switch (dia) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sábado";
                case 7 -> "Domingo";
                default -> "Día inválido";
            };

            System.out.println("Día seleccionado: " + nombreDia);
        }
    }


