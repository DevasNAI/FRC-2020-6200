/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

// import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.PuertosControlXbox;
import frc.robot.commands.ComandoIntake;
import frc.robot.subsystems.SubsistemaIntake;
import frc.robot.subsystems.SubsistemaLanzador;
// import edu.wpi.first.wpilibj2.command.Command;


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final static SubsistemaLanzador SubLanzador = new SubsistemaLanzador();
  public final static SubsistemaIntake SubIntake = new SubsistemaIntake();


  public final static ComandoIntake Intake = new ComandoIntake();

  // private final ExampleCommand autoCommand = new ExampleCommand(exampleSubsystem);

  public static XboxController Control1 = new XboxController(PuertosControlXbox.control1);


  public static Button BotonY = new JoystickButton(Control1, PuertosControlXbox.botonY1);


  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }


  private void configureButtonBindings()
  {
    BotonY.whenPressed(Intake);
    
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   *
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return autoCommand;
  }
  */
}
