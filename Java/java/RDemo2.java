class RDemo {
    public static void main(String[] args) {
        try {
            Runtime r = Runtime.getRuntime();

            // Microsoft Word
            r.exec("cmd /c start winword");
            Thread.sleep(5000);
            r.exec("taskkill /IM winword.exe /F");

            // MS Paint
            r.exec("cmd /c start mspaint");
            Thread.sleep(5000);
            r.exec("taskkill /IM mspaint.exe /F");

            // PotPlayer (make sure the path or exe name is correct)
            r.exec("cmd /c start C:\Program Files\DAUM\PotPlayer\PotPlayerMini64.exe");
            Thread.sleep(5000);
            r.exec("taskkill /IM C:\Program Files\DAUM\PotPlayer\PotPlayerMini64.exe /F");

            // Visual Studio Code
            r.exec("cmd /c start Code");
            Thread.sleep(5000);
            r.exec("taskkill /IM Code.exe /F");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
