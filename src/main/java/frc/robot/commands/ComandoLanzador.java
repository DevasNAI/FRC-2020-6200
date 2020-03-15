/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ComandoLanzador extends CommandBase {


  public ComandoLanzador() {
    addRequirements(RobotContainer.SubLanzador);
  }


  @Override
  public void initialize()
  {




  }


  
  @Override
  public void execute()
  {

    if(RobotContainer.Control1.getAButton())
    {
      RobotContainer.SubLanzador.setLanzador(.7);
    }
    else if(RobotContainer.Control1.getBButton())
    {
      RobotContainer.SubLanzador.setLanzador(-.7);
    }
    else
    {
      RobotContainer.SubLanzador.setLanzador(0);
    }
   




  }


  @Override
  public void end(boolean interrupted) {
  }


  @Override
  public boolean isFinished() {
    return false;
  }
}
