package com.websitegood.main.main;

import org.springframework.context.annotation.Configuration;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

@Configuration
public class EnvConfig {
    static {
        try {
            File envFile = new File(".env");
            if (envFile.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(envFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("=") && !line.startsWith("#")) {
                        String[] parts = line.split("=", 2);
                        System.setProperty(parts[0].trim(), parts[1].trim());
                    }
                }
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
