package frc.robot.Subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TelescopingArm extends SubsystemBase{
    
    TalonFX pull_l = new TalonFX(0);
    TalonFX pull_r = new TalonFX(0);

    private final DutyCycleOut pullCycle = new DutyCycleOut(0);
    
    public TelescopingArm() {
        pull_l.setNeutralMode(NeutralModeValue.Brake);
        pull_r.setNeutralMode(NeutralModeValue.Brake);
    }

    public void pull(int power) {
        pullCycle.Output = power;
        pull_l.setControl(pullCycle);
        pull_r.setControl(pullCycle);
    }

}
