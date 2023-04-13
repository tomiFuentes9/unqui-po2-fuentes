package ar.edu.unq.po2.tp3;
import java.util.*;

public class Counter {
	private List<Double> nums;
	
	public Counter(List<Double> nums) {
		super();
		this.nums = nums;
	}

	public double cantDePares() {
		double res = 0;
		for(double numero : nums){
			res += this.unoSi0Sino(this.esPar(numero));
		}
		return res;
	}
	
	public double cantDeImpares() {
		double res = 0;
		for(double numero : nums){
			res += this.unoSi0Sino(!this.esPar(numero));
		}
		return res;
	}
	
	public double cantDeMultiplos() {
		return 0;
	}
	
	public double unoSi0Sino(boolean condicion) {
		double res;
		if(condicion) { 
			res = 1; 
		}else { res = 0; }
		return res;
	}
	
	public boolean esPar(double num) {
		return (num%2) == 0;
	}
	
}
