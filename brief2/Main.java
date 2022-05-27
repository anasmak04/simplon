package brief2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeFixe emp = new EmployeFixe ("hicham","nessma","02-50-1974",8000);	
		
		EmployeCommission empCom = new EmployeCommission  ("said","lhadana","02-08-1974",9000);	
		
		System.out.println("Mon nom est : " + emp.getName() + " \n" +  "Mon Prenom est : " +   emp.getPrenom() + " \n" +  "Mon date de naissance est : " +  emp.getDate() + " \n" +  "Mon salaire est : " +   emp.salaire );
		System.out.println("---------------------------------------");
		System.out.println("Mon nom est : " + empCom.getName() + " \n" +  "Mon Prenom est : " +   empCom.getPrenom() + " \n" +  "Mon date de naissance est : " +  empCom.getDate() + " \n" + "Mon salaire est : " + empCom.salaire);
		System.out.println("---------------------------------------");
		
		
	}

}
