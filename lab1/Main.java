import java.util.Scanner;
import controllers.*;
import models.*;

public class Main {

    private static SongController songController = new SongController();
    private static PlayerController playerController = new PlayerController();
    private static HistoryController historyController = new HistoryController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menú UDP Music ---");
            System.out.println("1. Añadir canción");
            System.out.println("2. Eliminar canción por título");
            System.out.println("3. Buscar canción por título");
            System.out.println("4. Añadir canción a lista de reproducción");
            System.out.println("5. Reproducir siguiente canción");
            System.out.println("6. Ver próxima canción en lista de reproducción");
            System.out.println("7. Añadir canción al historial");
            System.out.println("8. Ver última canción reproducida");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (choice) {
                case 1:
                    System.out.print("Introduce el título de la canción: ");
                    String title = scanner.nextLine();
                    System.out.print("Introduce el artista de la canción: ");
                    String artist = scanner.nextLine();
                    // Aquí puedes agregar más detalles como duración, etc.
                    songController.addSong(new Song(title, artist, 0));  // 0 es un placeholder para la duración
                    System.out.println("Canción añadida!");
                    break;
                case 2:
                    System.out.print("Introduce el título de la canción a eliminar: ");
                    title = scanner.nextLine();
                    songController.deleteSongByTitle(title);
                    System.out.println("Canción eliminada!");
                    break;
                case 3:
                    System.out.print("Introduce el título de la canción a buscar: ");
                    title = scanner.nextLine();
                    Song foundSong = songController.searchSongByTitle(title);
                    if (foundSong != null) {
                        System.out.println("Canción encontrada: " + foundSong.getTitle() + " - " + foundSong.getArtist());
                    } else {
                        System.out.println("Canción no encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el título de la canción a añadir a la lista de reproducción: ");
                    title = scanner.nextLine();
                    Song songToAdd = songController.searchSongByTitle(title);
                    if (songToAdd != null) {
                        playerController.addSongToPlaylist(songToAdd);
                        System.out.println("Canción añadida a la lista de reproducción!");
                    } else {
                        System.out.println("Canción no encontrada.");
                    }
                    break;
                case 5:
                    Song nextSong = playerController.playNextSong();
                    if (nextSong != null) {
                        System.out.println("Reproduciendo: " + nextSong.getTitle() + " - " + nextSong.getArtist());
                        historyController.addSongToHistory(nextSong);
                    } else {
                        System.out.println("No hay más canciones en la lista de reproducción.");
                    }
                    break;
                case 6:
                    Song upcomingSong = playerController.peekNextSong();
                    if (upcomingSong != null) {
                        System.out.println("Próxima canción: " + upcomingSong.getTitle() + " - " + upcomingSong.getArtist());
                    } else {
                        System.out.println("No hay más canciones en la lista de reproducción.");
                    }
                    break;
                case 7:
                    System.out.print("Introduce el título de la canción a añadir al historial: ");
                    title = scanner.nextLine();
                    Song songToHistory = songController.searchSongByTitle(title);
                    if (songToHistory != null) {
                        historyController.addSongToHistory(songToHistory);
                        System.out.println("Canción añadida al historial!");
                    } else {
                        System.out.println("Canción no encontrada.");
                    }
                    break;
                case 8:
                    Song lastPlayed = historyController.peekLastPlayedSong();
                    if (lastPlayed != null) {
                        System.out.println("Última canción reproducida: " + lastPlayed.getTitle() + " - " + lastPlayed.getArtist());
                    } else {
                        System.out.println("No hay canciones en el historial.");
                    }
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
