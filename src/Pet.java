
public class Pet extends Animal{
	private String name;
	private int age;
	private double weight;
	
	public String toString(){
		return("Name :"+name+"Age:"+age+"years"+"\nWeight:"+weight+"pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight){
		if(initialAge<0 || initialWeight<0)
			System.exit(0);
		name= initialName;
		age=initialAge;
		weight=initialWeight;
	}
	public Pet(String initialName){
		
		name= initialName;
		age=0;
		weight=0;
	}
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
		
		super(iniGender);  // 부모 클래스 생성자 초기화
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
		}
	public Pet(int initialAge){
		if(initialAge<0 )
			System.exit(0);
		age=initialAge;
		name="no name yet.";
		weight=0;
	}
	public void set(String newName, int newAge, double newWeight) {
		if(newAge<0 || newWeight<0)
			System.exit(0);
		name=newName;
		age=newAge;
		weight=newWeight;
	}
	
	public void setAge( int newAge) {
		if(newAge<0 )
			System.exit(0);
		age=newAge;
	}
	
	public void setWeight( double newWeight) {
		if(newWeight<0)
			System.exit(0);
		weight=newWeight;
      }
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
}

