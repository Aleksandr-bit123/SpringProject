package ru.maksimov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //создание объектов с помощью Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"//должен лежать в папке resources (mark Resources Root)
        );

        //Внедрение бина
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
