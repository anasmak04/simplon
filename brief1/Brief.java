package brief1;

import java.util.Scanner;
public class Brief {
	public static void main(String[] args) {		 
		
		String name;
				double 
				heursHob, heuresMens,result, TarifHobHeure, TarifheuresMens,overTime, 
				minheuresHob = 40,
				minheuresMens= 180,
				maxheursHob = 50, 
				maxheuresMens = 200;
				char ModePayment;
				
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter your Name: ");
		name = reader.next();
		System.out.println("Bonjour : " + name);

		do {
			System.out.println("choisir le  mode de payement m for mensuel / h for hebdomadaire :");
			System.out.print("entrer le mode de payment !! ");
			
			////////// check the first letter 
			ModePayment = reader.next().charAt(0);

			if (ModePayment == 'h') {
				
				System.out.print("le nombre d’heure travaillée par semaine: ");
				heursHob = reader.nextDouble();
				System.out.print("entrer le salaire en heure: ");
				TarifHobHeure = reader.nextDouble();
				
				if (TarifHobHeure < 25) {
					System.out.print("TLe tarif par heure ne doit pas être inférieur à 25 DH !\r\n");
					
			}
				
				
				if (heursHob > maxheursHob) {
					System.out.print(" Le nombre d’heure total ne doit pas dépasser 50 heures par semaine \r\n");
					
				}

				/////// NB : salaire de base= taux horaire * heures prestées
				
				result = heursHob * TarifHobHeure;
				if (minheuresHob < heursHob && heursHob <= maxheursHob) {
					overTime = heursHob - minheuresHob;
					result = (minheuresHob * TarifHobHeure) + overTime * (TarifHobHeure + TarifHobHeure / 2);
				}
				
				System.out.println("hebdomadaire saliare est : " + result + " DH");

			} 
			
			
			else if (ModePayment == 'm') {

				System.out.print("le nombre d’heure travaillée par semaine : ");
				heuresMens = reader.nextDouble();
				System.out.print("entrer le salaire en heure: : ");
				TarifheuresMens = reader.nextDouble();
				if (TarifheuresMens < 20) {
					System.out.print("TLe tarif par heure ne doit pas tre inferieur a 20 DH !\r\n");
					return;
				}
				if (heuresMens > maxheuresMens) {
					System.out.print(" Le nombre d'heure total ne doit pas depasser 50 heures par semaine \r\n");
					return;
				}
				
				/////// NB : salaire de base= taux horaire * heures prestées
				
				result = heuresMens * TarifheuresMens;
				if (minheuresMens < heuresMens && heuresMens <= maxheuresMens) {
					overTime = heuresMens - minheuresMens;
					result = (minheuresMens * TarifheuresMens) + overTime * (TarifheuresMens + TarifheuresMens / 2);
				}
				System.out.println("mensuel salaire est :  " + result + " DH");

			} else {
				System.out.println("Eroooooooooooooooooooooooooor");

			}

		} while (true);
				
			

}
}