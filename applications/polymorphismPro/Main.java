public class Main {
    static void main(String[] args) {
        // Create a new Camera object
        Camera camera = new Camera();
        // Take picture with default settings
        camera.takePicture();
        // Take picture with a specific mode
        camera.takePictures("portrait");
        // Take picture with a specific resolution
        camera.takePicture(12);
        // Take picture with a specific mode and resolution
        camera.takePicture("landscape", 24);

        // Create a new SmartCamera object
        SmartCamera smartCamera = new SmartCamera();

        // Take picture using the smart camera with default settings
        System.out.println("\nInitiating smart camera...");
        smartCamera.takePicture();

        Camera newCamera = new SmartCamera();
        newCamera.takePicture();

    }
}
