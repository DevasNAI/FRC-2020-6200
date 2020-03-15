
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ConstantesMotorLanzador;

public class SubsistemaLanzador extends SubsystemBase
{
  public WPI_TalonSRX MotorLanzapelotas = new WPI_TalonSRX(ConstantesMotorLanzador.Puerto775Pelotas);
  public CANSparkMax AnguloLanzador = new CANSparkMax(ConstantesMotorLanzador.PuertoNEOAngulo, MotorType.kBrushless);
  public CANEncoder EncoderAngulo = AnguloLanzador.getEncoder();







  public SubsistemaLanzador()
  {

    AnguloLanzador.restoreFactoryDefaults();



  }

  public void MovimientoAngulo(double angulo)
  {

    SmartDashboard.putNumber("Posición de Encoder", EncoderAngulo.getPosition());
    SmartDashboard.putNumber("Velocidad de Encoder", EncoderAngulo.getVelocity());

    if(EncoderAngulo.getPosition() >= 40)
    {
      AnguloLanzador.set(0);

    }
    else if(EncoderAngulo.getPosition() >= -40)
    {
      AnguloLanzador.set(0);
    }
    else
    {
      EncoderAngulo.getVelocity();
      if(EncoderAngulo.getVelocity() > 1800)
      {
        
      }
    }
    EncoderAngulo.getCountsPerRevolution();


    EncoderAngulo.setPositionConversionFactor(Math.PI);


  }




  /** 
   * Método para activar el lanzador (las llantas verdes)
  *
  *@param  velocidad Velocidad en porcentaje del lanzador
  *
  */
  @SuppressWarnings("ParameterName")
  public void setLanzador(double velocidad)
  {
    MotorLanzapelotas.set(ControlMode.PercentOutput,velocidad);

  }




  @Override
  public void periodic()
  {
   
  }





}
