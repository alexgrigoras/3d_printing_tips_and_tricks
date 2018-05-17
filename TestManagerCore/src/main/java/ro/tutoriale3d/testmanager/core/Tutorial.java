package ro.tutoriale3d.testmanager.core;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Tutorial {
	private int Id_tutorial;
	private String Titlu;
	private String Image;
	private String Teach;
	private String Use;
	private String Level;
	private String Type;
	
	public int getId_tutorial() {
		return Id_tutorial;
	}
	
	public String getTitlu() {
		return Titlu;
	}
	
	public String getImage() {
		return Image;
	}

	public String getTeach() {
		return Teach;
	}
	
	public String getUse() {
		return Use;
	}
	
	public String getLevel() {
		return Level;
	}
	
	public String getType() {
		return Type;
	}

	public Tutorial(int id_tutorial, String titlu, String image, String teach, String use, String level, String type) {
		super();
		Id_tutorial = id_tutorial;
		Titlu = titlu;
		Image = image;
		Teach = teach;
		Use = use;
		Level = level;
		Type = type;
	}

	@Override
	public String toString() {
		
		JSONObject tutorialObject = new JSONObject();
		tutorialObject.put("Id_tutorial", Id_tutorial);
		tutorialObject.put("Titlu", Titlu);
		tutorialObject.put("Image", Image);
		tutorialObject.put("Teach", Teach);
		tutorialObject.put("Use", Use);
		tutorialObject.put("Level", Level);
		tutorialObject.put("Typr", Type);
		
        System.out.println("Object: " + tutorialObject);
        
        return tutorialObject.toString();
	}	
}
