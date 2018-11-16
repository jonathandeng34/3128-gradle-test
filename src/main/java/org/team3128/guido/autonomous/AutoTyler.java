package org.team3128.guido.autonomous;
import edu.wpi.first.wpilibj.Timer;
import org.team3128.guido.autonomous.AutoGuidoBase;
import org.team3128.guido.autonomous.AutoScaleFromSide;
import org.team3128.guido.autonomous.AutoSwitchFromSide;
import org.team3128.common.util.enums.Direction;
import org.team3128.common.drive.SRXTankDrive;
import org.team3128.common.util.Log;
import org.team3128.common.util.units.Length;

import org.team3128.common.autonomous.primitives.CmdRunInParallel;

import org.team3128.guido.mechanisms.Forklift;
import org.team3128.guido.mechanisms.Forklift.ForkliftState;
import org.team3128.guido.mechanisms.Intake.IntakeState;

import org.team3128.guido.util.PlateAllocation;

import org.team3128.guido.autonomous.util.PowerUpAutoValues;

public class AutoTyler extends AutoGuidoBase
{
    public int sides=4;
    public float angle=((sides-2)*180)/sides;
    public AutoTyler(double delay)
	{
        
        super(delay);
        for (int i=0;i<sides;i++){
            Log.info("tyler", "eeeeeeeeeee");
            addSequential(
					drive.new CmdMoveForward(3 * Length.ft, 1500, 0.75)
					//forklift.new CmdRunIntake(IntakeState.INTAKE, 1500)
            );
           // Timer.delay(5);
            addSequential(drive.new CmdInPlaceTurn(angle, 1.0, 5000, Direction.RIGHT));
           // Timer.delay(5);
        }
           // Log.info("tyler", "It didn't fail that bad");
            
    }
}