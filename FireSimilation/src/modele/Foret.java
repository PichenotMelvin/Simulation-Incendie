package modele;

public class Foret {
	
	public int nbArbreenFlamme;
	public int nbArbre;
	public int taille = 140;
	float densite;
	public int[][] grille_foret;

	
	public Foret(int nbArbreenFlamme,float densite) {
		this.nbArbreenFlamme = nbArbreenFlamme;
		this.densite = densite;
		this.grille_foret = new int[taille][taille];
		this.grille_foret = init_Foret(grille_foret, densite);
	}
	
	

	public int[][] init_Foret(int[][] foret ,float d){		
		int i,j;
		double hasard;
		nbArbre = 0;
		for(i=1; i<taille; i++){
			for(j=1; j<taille; j++) {
				hasard = (int)Math.floor(Math.random()*1000);
				if(hasard<(int)(d*1000)) {
					foret[i][j]=1;
					nbArbre++;				 
				}
				else {
					foret[i][j]=0;					
				}
			}
		}
		return foret;
		 
	} 
	
}
	


