public class Camera {
    // These methods are OverLoading methods (Same name but different argument)
    /*
    when an overloaded method is called, Java determines which version to execute ahead of time, during compilation.
    This is why method overloading is also referred to as compile-time polymorphism.
     */

    // Method to take a picture with default settings
    public void takePicture(){
        System.out.println("Taking an 8 megapixels picture in portrait mode.");
    }

    // Method to take a picture with a specific mode
    public void takePictures(String mode){
        System.out.println("Taking picture in " + mode + " mode.");
    }
    // Method to take a picture with a specific resolution
    public void takePicture(int resolution){
        System.out.println("Taking picture in " + resolution + " megapixels.");
    }
    // Method to take a picture with a specific mode and resolution
    public void takePicture(String mode, int resolution){
        System.out.println("Taking a " + resolution + " megapixels picture in " + mode + " mode.");
    }
}
    /*
    when a superclass and its subclass have a method with the same signature, but different processing logic, it’s called method overriding.
    The subclass’s version of the method is known as the overridden method.
    Method overriding happens only when inheritance is implemented because the subclass redefines a method defined in its superclass
    The method signature remains unchanged while overriding.
    For example, if the method signature in the superclass is:
    public void takePicture(String mode) {
	// method body
	}
	The access modifier (public), return type, name, and the method's argument list must not be altered in the subclass.
	Only the method body that contains the logic of the method can change.

     */
class SmartCamera extends Camera{
    @Override
    public void takePicture() {
        // The super keyword is used within a subclass to refer to its immediate superclass.
        // Call the superclass version of the method
        super.takePicture();
        // Add new functionality
        System.out.println("Applying AI to enhance the picture.");
    }
}
