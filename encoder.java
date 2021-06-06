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

@TeleOp(name="Mecanum Proto Manual 2", group="Linear Opmode") // @Autonomous(...) is the other common choice
// @Disabled
public class encoder extends LinearOpMode {

    /* Declare OpMode members. */
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotorEx frontright = null;
    private DcMotorEx backright = null;
    private DcMotorEx frontleft = null;
    private DcMotorEx backleft = null;
    //private DcMotorEx INTAKE = null;
    // declare motor speed variables
    double RF; double LF; double RR; double LR;
    // declare joystick position variables
    double X1; double Y1; double X2; double Y2;
    // operational constants
    double joyScale = 1;
    double motorMax = 1; // Limit motor power to this value for Andymark RUN_USING_ENCODER mode

    @Override
    public void runOpMode() {
        waitForStart();
        while (opModeIsActive()) {

        /* Initialize the hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names assigned during the robot configuration
         * step (using the FTC Robot Controller app on the phone).
         */
        backleft = hardwareMap.get(DcMotorEx.class, "back1");
        backright = hardwareMap.get(DcMotorEx.class, "back2");
        frontleft = hardwareMap.get(DcMotorEx.class, "front1");
        frontright = hardwareMap.get(DcMotorEx.class, "front2");
        //INTAKE = hardwareMap.get(DcMotorEx.class, "intake");

        frontright.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        double motorVelocity = 2000;
        frontright.setVelocity(motorVelocity);
        frontright.setDirection(DcMotor.Direction.FORWARD);

        frontleft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        frontleft.setVelocity(motorVelocity);
        frontleft.setDirection(DcMotor.Direction.REVERSE);

        backright.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        backright.setVelocity(motorVelocity);
        backright.setDirection(DcMotor.Direction.FORWARD);

        backleft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        backleft.setVelocity(motorVelocity);
        backleft.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Encoder value - front right", frontright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - front left", frontleft.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back right", backright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back left", backleft.getCurrentPosition());
        telemetry.update();

        }
    }
}