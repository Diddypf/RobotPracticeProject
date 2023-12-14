package commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CubeShooter;

public class ShootCube extends CommandBase{
    public CubeShooter cubeShooter = CubeShooter.getInstance();

    public ShootCube(){
        this.addRequirements(cubeShooter);
    }

    @Override
    public void initialize() {

    }


    @Override
    public void execute() {
        cubeShooter.ShootCube(1);
    }

    @Override
    public void end(boolean end) {
        cubeShooter.StopShooter();
        cubeShooter.Stopfeeder();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}