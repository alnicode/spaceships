package com.alnicode.spaceships;

import com.alnicode.spaceships.view.MenuUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpaceshipsApplication implements CommandLineRunner {

	@Autowired
	private MenuUI menuUI;

	public static void main(String[] args) {
		SpringApplication.run(SpaceshipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menuUI.showMenu();
	}
}
