package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
 
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase; 

import frc.robot.Constants;

public class Chassis extends SubsystemBase {

    WPI_TalonFX leftmotor;
    WPI_TalonFX rightmotor;
    DifferentialDrive exampledrive;
    private final double forwardscale = 0.5;
    private final double rotationscale = 0.5;


    public Chassis(){
        leftmotor = new WPI_TalonFX(0);
        rightmotor = new WPI_TalonFX(1);
        exampledrive = new DifferentialDrive(leftmotor, rightmotor);

    }
    public void exampledrive(double forward, double rotation){
     exampledrive.arcadeDrive(forward * forwardscale, rotation * rotationscale);

    }

    @Override
    public void periodic() {
        exampledrive.feed();
    }
}