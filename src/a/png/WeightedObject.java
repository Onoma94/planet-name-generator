package a.png;

public class WeightedObject<E> {
	double weight;
	E result;
	public double getWeight() 
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public E getResult() 
	{
		return result;
	}
	public void setResult(E result) 
	{
		this.result = result;
	}
	public WeightedObject(double weight, E result) 
	{
		super();
		this.weight = weight;
		this.result = result;
	}
	
	

}
