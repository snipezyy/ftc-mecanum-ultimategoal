package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
public class Motion {

    /* Declare OpMode members. */
    //private ElapsedTime runtime = new ElapsedTime();
    private DcMotorEx frontright = null;
    private DcMotorEx backright = null;
    private DcMotorEx frontleft = null;
    private DcMotorEx backleft = null;

    public Motion(HardwareMap hardwareMap){

        /* Initialize the hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names assigned during the robot configuration
         * step (using the FTC Robot Controller app on the phone).
         */
        backleft = hardwareMap.get(DcMotorEx.class, "back1");
        backright = hardwareMap.get(DcMotorEx.class, "back2");
        frontleft = hardwareMap.get(DcMotorEx.class, "front1");
        frontright = hardwareMap.get(DcMotorEx.class, "front2");
        frontright.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        frontleft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        backleft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        backright.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
    }

    private void setVelocity (double motorVelocity) {
        frontright.setVelocity(motorVelocity);
        frontleft.setVelocity(motorVelocity);
        backright.setVelocity(motorVelocity);
        backleft.setVelocity(motorVelocity);
    }

    public void forward (double motorVelocity){

        setVelocity(motorVelocity);
        frontright.setDirection(DcMotor.Direction.FORWARD);
        frontleft.setDirection(DcMotor.Direction.REVERSE);
        backright.setDirection(DcMotor.Direction.FORWARD);
        backleft.setDirection(DcMotor.Direction.REVERSE);

    }

    public void backward (double motorVelocity){

        setVelocity(motorVelocity);
        frontright.setDirection(DcMotor.Direction.REVERSE);
        frontleft.setDirection(DcMotor.Direction.FORWARD);
        backright.setDirection(DcMotor.Direction.REVERSE);
        backleft.setDirection(DcMotor.Direction.FORWARD);

    }

    public void stop (){

        setVelocity(0);

    }

        /*telemetry.addData("Encoder value - front right", frontright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - front left", frontleft.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back right", backright.getCurrentPosition());
        telemetry.update();
        telemetry.addData("Encoder value - back left", backleft.getCurrentPosition());
        telemetry.update();*/
}