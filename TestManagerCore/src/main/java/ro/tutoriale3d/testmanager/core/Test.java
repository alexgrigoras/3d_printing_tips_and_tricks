package ro.tutoriale3d.testmanager.core;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author alexgrigoras
 * @created 18 feb 2018
 * @version 1.0
 */
@XmlRootElement
public class Test {
	private int Nr_intrebare;
	private String Enunt;
	private String Rasp1;
	private String Rasp2;
	private String Rasp3;
	private String Rasp4;
	private String Solutie;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(int Nr_intrebare, String Enunt, String Rasp1, String Rasp2,String Rasp3,String Rasp4,String Solutie) {
		this.Nr_intrebare = Nr_intrebare;
		this.Enunt = Enunt;
		this.Rasp1 = Rasp1;
		this.Rasp2 = Rasp2;
		this.Rasp3 = Rasp3;
		this.Rasp4 = Rasp4;
		this.Solutie=Solutie;
	}
	public int getNr_intrebare() {
		return Nr_intrebare;
	}
	public String getEnunt() {
		return Enunt;
	}
	public String getRasp1() {
		return Rasp1;
	}
	public String getRasp2() {
		return Rasp2;
	}
	public String getRasp3() {
		return Rasp3;
	}
	public String getRasp4() {
		return Rasp4;
	}
	public String getSolutie() {
		return Solutie;
	}
	@Override
	public String toString() {
		/*
		JsonObject personObject = Json.createObjectBuilder()
                .add("Nr_intrebare", Nr_intrebare)
                .add("Enunt", Enunt)
                .add("Rasp1", Rasp1)
                .add("Rasp2", Rasp2)
                .add("Rasp3", Rasp3)
                .add("Rasp4", Rasp4)
                .add("Solutie", Solutie)
                .build();
		*/
        System.out.println("Object: test");
        
        return "Object: test";
	}
	
}