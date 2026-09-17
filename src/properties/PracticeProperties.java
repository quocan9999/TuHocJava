package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PracticeProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 1. Load file config.properties
        FileInputStream input = new FileInputStream("src/properties/config.properties");
        properties.load(input);
        input.close();

        String appName = properties.getProperty("app.name");
        String appVersion = properties.getProperty("app.version");
        String serverPort = properties.getProperty("server.port");

        // 2. In AppName, AppVersion, ServerPort
        System.out.println("AppName: " + appName + ", Version: " + appVersion + ", Port: " + serverPort);

        // 3. Đọc config default
        String dbName = properties.getProperty("database.name", "default_db");
        System.out.println(dbName);

        // 4. Thêm properties mới
        properties.setProperty("app.author", "Quoc An");

        // 5. Ghi ra file mới
        FileOutputStream output = new FileOutputStream("src/properties/output.properties");
        properties.store(output, "Application Config");
        output.close();
    }
}
