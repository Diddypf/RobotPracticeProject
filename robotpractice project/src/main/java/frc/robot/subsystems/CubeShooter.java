package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CubeShooterConstants;

public final class CubeShooter extends SubsystemBase{
    
    private CANSparkMax FeederMotor = new CANSparkMax(CubeShooterConstants.kCubeFeedermotorport,MotorType.kBrushless);
    
    private CANSparkMax ShoterMotor = new CANSparkMax(CubeShooterConstants.kcubeShootermotorport,MotorType.kBrushless);
}
