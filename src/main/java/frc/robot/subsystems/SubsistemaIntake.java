/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.ConstantesControlpanel;
import frc.robot.Constants.ConstantesIntake;

public class SubsistemaIntake extends SubsystemBase {

  public WPI_TalonSRX SistemadeBandas = new WPI_TalonSRX(ConstantesIntake.TalonSistemadeBandas);
  public TalonSRXConfiguration configuracion = new TalonSRXConfiguration();
  public Solenoid IntakeExtiende = new Solenoid(Constants.PuertoCompresor, ConstantesControlpanel.SolenoideIntake);
  public Compressor Compresor1 = new Compressor(Constants.PuertoCompresor);



  public SubsistemaIntake()
  {
    SistemadeBandas.configAllSettings(configuracion);
    SistemadeBandas.configFactoryDefault();
    Compresor1.getClosedLoopControl();
    Compresor1.setClosedLoopControl(true);
  }



  public void setIntakeout(double porcentaje, boolean estatus)
  {

    IntakeExtiende.set(estatus);
    SistemadeBandas.set(ControlMode.PercentOutput, porcentaje);

  }



  
  @Override
  public void periodic()
  {
    // This method will be called once per scheduler run
  }
}
