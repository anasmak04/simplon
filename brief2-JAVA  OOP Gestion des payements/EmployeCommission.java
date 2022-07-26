package brief2;

public class EmployeCommission extends Employe {
	double salaire;
	double commission;
	int ventes;
	
	public EmployeCommission (String nom, String prenom, String Date, double salaire, double commission, int ventes) {
		super (nom,prenom,Date);
		this.salaire = salaire;
		this.commission = commission;
		this.ventes = ventes;

	}
	
		//////salaire mensuel = salaire + ventes * commission) ;

		/*
		public double calculeSalaire (int ventes, double commission,double salaire) {
		return this.salaire + ventes * commission;
		}
		
		
				public double toString() {	
					return this.calculeSalaire(ventes, commission, salaire);
				
				}*/
	
	
	
	
	
}
