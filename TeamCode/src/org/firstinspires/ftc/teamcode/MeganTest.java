package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MeganTest")
public class MeganTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("name", "Megan");
        telemetry.update();
        waitForStart();
        while(opModeIsActive()){
        }
    }
}
