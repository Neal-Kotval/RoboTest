package frc.robot.Commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.TelescopingArm;

public class telescopeArm extends Command{
    XboxController controller;
    TelescopingArm telescope;
    Joystick joystick;

    public telescopeArm(XboxController controller, TelescopingArm telescope){
        this.controller = controller;
        this.telescope = telescope;
        addRequirements(telescope);
    }

    
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        if (controller.getRightBumper()){
            telescope.pull(30);
        } 

        if (controller.getLeftBumper()){
            telescope.pull(-30);
        }
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
