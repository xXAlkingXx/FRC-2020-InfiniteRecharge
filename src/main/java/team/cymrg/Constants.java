/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package team.cymrg;

public final class Constants 
{
    public static final class Controller {
        public static final int controllerLogitech    = 0;
        public static final int controllerXbox360     = 1;
    }

    public static final class Systems {
        public static final int port_Solenoid     = 1;
        public static final int port_Intake1      = 4;
        public static final int port_Intake2      = 5;
        public static final int port_Shootgazin   = 6;

    }

    public static final class Drive {
        // Motor Portlarının Belirtilmesi
        public static final int portMotorLeftFront  = 0;
        public static final int portMotorLeftBack   = 1;
        public static final int portMotorRightFront = 2;
        public static final int portMotorRightBack  = 3;

        public static final int kEncoderCPR = 1024;
        public static final double kWheelDiameterInches = 6;
        public static final double kEncoderDistancePerPulse = (kWheelDiameterInches * Math.PI) / (double) kEncoderCPR;
    }
}