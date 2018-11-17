package nl.GraphqlProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(GraphqlApplication.class);
    public static void main(String[] args){
        SpringApplication.run(GraphqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
