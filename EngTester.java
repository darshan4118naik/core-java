class EngTester
{
public static void main(String a[])
{
CivilEng civil = new CivilEng();
civil.field = "Construction";
civil.job = "Building Construction";
civil.toBuildObject();
System.out.println(civil.field + ":" + civil.job );

MechEng mech = new MechEng();
mech.field = "Machine Technician ";
mech.job = "Machine repair";
mech.toBuildMechanicalDevice();
System.out.println(mech.field + ":" + mech.job );

RoboticsEng robo = new RoboticsEng();
robo.field = "Robotics design ";
robo.job = "To build robos";
robo.toBuildRobots();
System.out.println(robo.field + ":" + robo.job );

EcEng ec = new EcEng();
ec.job="Communication engineer";
ec.field="ECe field";
ec.toMakeMicroChips();
System.out.println(ec.job+" : "+ec.field);
 
EeEng ee = new EeEng();
ee.job="Electrician";
ee.field="HESCOM";
ee.electricSystem();
System.out.println(ee.job+" : "+ee.field);
 
CsEng cs = new CsEng();
cs.job="Developer";
cs.field="IT";
cs.developerOrTester();
System.out.println(cs.job+" : "+cs.field);
}

}