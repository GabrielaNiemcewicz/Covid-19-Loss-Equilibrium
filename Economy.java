
public enum Economy {
//percentges of whole population, with no regard to age
	double age [] = new double[] {15,30,45,65,72,80};
	double proportions [] = new double [] {0.15,0.25,0.33,0.17,0.07,0.4};
	int database_size = (int) age.length;
	
	double EMPLOYMENT_RATE= 0.2;
	double AT_RISK = 0.04;
double [][] AGE_PROPORTIONS = new double [database_size][2];
	for(int ages = 0; ages<database_size; ages++) 
			{AGE_PROPORTIONS[ages][0] = age[ages];
			 AGE_PROPORTIONS[ages][1] = proportions[ages];}

	
	
	
	
}
