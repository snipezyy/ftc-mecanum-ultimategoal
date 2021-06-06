package org.firstinspires.ftc.teamcode;
// import lines were omitted. OnBotJava will add them automatically.

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Autonomus", group="Linear Opmode") // @Autonomous(...) is the other common choice
// @Disabled
public class Autonomus extends LinearOpMode {

    /* Declare OpMode members. */
    private ElapsedTime runtime = new ElapsedTime();

    /* Instantiate Motion class. */
    Motion motion = new Motion(hardwareMap);

    @Override
    public void runOpMode() {
        waitForStart();
        while (opModeIsActive()) {

        motion.forward(200);
        sleep(2000);
        motion.stop();



        /*telemetry.addData("Encoder value - front right", frontright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - front left", frontleft.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back right", backright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back left", backleft.getCurrentPosition());
        telemetry.update();*/

        }
    }
}