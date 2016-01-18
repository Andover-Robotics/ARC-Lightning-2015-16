package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Chairman Zhao on 1/17/2016.
 */

import com.qualcomm.robotcore.util.Range;

public class Teleop2 extends ConfiguredOpMode {
    /*
    * Motors:
    ** dLeft/dRight - Drivetrain
    ** sLeft/sRight - Linear Slide
    ** sweep - Sweeper
    * Servos:
    ** bRack - Rack & Pinion for bucket
    ** bTilt - Bucket Tilt
    ** hLeft/hRight - Hanger Manipulators
    * */
    private final float JOY_PWR_MULT = (float) 0.8;
    public void init(){
        super.init();

    }
    public void loop(){
        float lThrottle = Range.clip(JOY_PWR_MULT * gamepad1.left_stick_y, -1, 1);     //Range.clip ensures that the throttles remain within a reasonable range
        float rThrottle = Range.clip(JOY_PWR_MULT * gamepad1.right_stick_y, -1, 1);
        float sThrottle = Range.clip(JOY_PWR_MULT * gamepad2.right_stick_y, -1, 1);
        dLeft.setPower(lThrottle);
        dRight.setPower(rThrottle);
        sLeft.setPower(sThrottle);
        sRight.setPower(sThrottle);
    }
    public void stop(){

    }
}
