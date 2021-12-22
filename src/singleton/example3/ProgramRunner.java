package singleton.example3;

public class ProgramRunner {
    public static void main(String[] args) {
        showHashCodeOfObjects();
        writeAndShowLogInfo();
    }

    public static void showHashCodeOfObjects(){
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
    }

    public static void writeAndShowLogInfo(){
       ProgramLogger.getProgramLogger().addLogInfo("First log...");
       ProgramLogger.getProgramLogger().addLogInfo("Second log...");
       ProgramLogger.getProgramLogger().addLogInfo("Third log...");

       ProgramLogger.getProgramLogger().showLogInfo();
    }
}
