package tutorials3d.webservices.core;

// utilizator
public class Utilizator {
	private int id;
	private String nume;
	private String email;
	private String parola;
	
	public Utilizator(int id, String nume, String email, String parola) {
		this.id = id;
		this.nume = nume;
		this.email = email;
		this.parola = parola;
	}
	public int getId() {
		return id;
	}
	public String getNume() {
		return nume;
	}
	public String getEmail() {
		return email;
	}
	public String getParola() {
		return parola;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		/*builder.append("Utilizator [id= ").append(id)
			.append(", nume= ").append(nume).append(", email= ")
			.append(email).append(", parola= ").append(parola).append(" ]");
		*/
		builder.append(nume);
		return builder.toString();
	}
}
