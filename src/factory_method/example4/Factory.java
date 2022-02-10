package factory_method.example4;

public class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equalsIgnoreCase("windows")) {
            os = new WindowsOS();
        } else if (inputos.equalsIgnoreCase("linux")) {
            os = new LinuxOS();
        } else if (inputos.equalsIgnoreCase("mac")) {
            os = new MacOS();
        }
        return os;
    }
}
