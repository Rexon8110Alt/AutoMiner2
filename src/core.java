import java.awt.*;

import static java.awt.event.InputEvent.BUTTON1_DOWN_MASK;

import static java.lang.Thread.sleep;

public class core {

    public static void core() throws AWTException, InterruptedException {

        //sleep(800);

        Robot robot = new Robot();
        /*clicks the button
        robot.mouseMove(650,435);
        robot.mousePress(BUTTON1_DOWN_MASK);
        */
        robot.mouseMove(550, 435);


        for (int x = 0; x < 3; x++) {
            for (int i = 0; i < 6; i++) {

                robot.mousePress(BUTTON1_DOWN_MASK);
                robot.mouseMove(655, 435);
                robot.mouseRelease(BUTTON1_DOWN_MASK);
                sleep(3000);

                robot.mouseMove(550, 435);


            }
            robot.mouseMove(655, 435);
            robot.mousePress(BUTTON1_DOWN_MASK);
            robot.mouseRelease(BUTTON1_DOWN_MASK);
        }
    }
}