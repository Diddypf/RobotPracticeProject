package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CubeShooterConstants;

public final class CubeShooter extends SubsystemBase{
    private static CubeShooter instance;

    private CANSparkMax feederMotor = new CANSparkMax(CubeShooterConstants.kCubeFeedermotorport,MotorType.kBrushless);
    private CANSparkMax shooterMotor = new CANSparkMax(CubeShooterConstants.kcubeShootermotorport,MotorType.kBrushless);

    public static CubeShooter getInstance() {
        
        if(instance == null){
            instance = new CubeShooter();
        }
        return instance;
    }
    private CubeShooter(){
        feederMotor.restoreFactoryDefaults();
        shooterMotor.restoreFactoryDefaults();  
        feederMotor.burnFlash();
        shooterMotor.burnFlash();

    }
}
