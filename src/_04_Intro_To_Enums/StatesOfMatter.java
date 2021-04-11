package _04_Intro_To_Enums;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class StatesOfMatter{
public enum Matter {
	SOLID, LIQUID, GAS, PLASMA, BOSE_EINSTEIN_CONDENSATE
	
	
}
public static void main(String[] args) {
	Matter data = Matter.SOLID;

switch(data) {
case SOLID:{
	System.out.println("solid");
	break;
}
case LIQUID:{
	System.out.println("liquid");
	break;
}
case GAS:{
	System.out.println("gas");
	break;
}
case PLASMA:{
	System.out.println("plasma");
	break;
}
case BOSE_EINSTEIN_CONDENSATE:{
	System.out.println("bose einstein condensate");
	break;
}

}

}

}