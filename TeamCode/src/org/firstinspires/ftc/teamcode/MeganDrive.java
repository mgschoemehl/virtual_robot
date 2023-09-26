package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "MeganDrive")
public class MeganDrive extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor front_left = hardwareMap.dcMotor.get("front_left_motor");
        DcMotor front_right = hardwareMap.dcMotor.get("front_right_motor");
        DcMotor back_left = hardwareMap.dcMotor.get("back_left_motor");
        DcMotor back_right = hardwareMap.dcMotor.get("back_right_motor");

        front_left.setDirection(DcMotorSimple.Direction.REVERSE);
        back_left.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()){
            double left_stick_y = -gamepad1.left_stick_y;

            front_left.setPower(left_stick_y);
            front_right.setPower(left_stick_y);
            back_left.setPower(left_stick_y);
            back_right.setPower(left_stick_y);

            telemetry.addData("left_stick_y",left_stick_y);
            telemetry.update();
        }
    }
}