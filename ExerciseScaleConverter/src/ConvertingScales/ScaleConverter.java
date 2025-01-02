package ConvertingScales;


//from instructions in the prompt, i have to implement this interface now 
public interface ScaleConverter{
	public double convertTemperature(double tempIn);
    public double convertDistance(double distanceIn);
    public double convertWeight(double weightIn);
}

//making the english to metric converter class
class EnglishToMetricConverter implements ScaleConverter {
	
	public double convertTemperature(double tempIn) { //variable names come from interface
		return (tempIn - 32) * 5 / 9; //formula from the prompt
	}
	
	public double convertDistance(double distanceIn) { //comes from the interface
		return distanceIn * 1.609; //formula from prompt
	}
	
	public double convertWeight(double weightIn) { //info comes from the interface
		return weightIn / 2.2; //formula from prompt
	}
}


//making the metric to english converter class, reversing the formulas
class MetricToEnglishConverter implements ScaleConverter{
	
	public double convertTemperature(double tempIn) { //variable names come from interface
		return tempIn * 9 / 5 + 32; //forumla from prompt but reversed
	}
	
	public double convertDistance(double distanceIn) { //same as interface names
		return distanceIn / 1.609; //reversed formula from prompt
	}
	
	public double convertWeight(double weightIn) { //same as the interface variable names
		return weightIn * 2.2; //same as other ones
	}
}

//driver class to check both of the implementations
public class ScaleConverterChecking{
	
	public static void main(String [] args) {
		ScaleConverter EnglishToMetricConverter = new EnglishToMetricConverter();
	    ScaleConverter MetricToEnglishConverter = new MetricToEnglishConverter();
	    
	    //printing the english to metric conversion
	    System.out.println("English to Metric Conversion");
		System.out.println("temperature in Celsius: " + EnglishToMetricConverter.convertTemperature(32));
		System.out.println("distance in KM: " + EnglishToMetricConverter.convertDistance(5));
		System.out.println("weight in KG: " + EnglishToMetricConverter.convertWeight(3.5));
		
		//printing the metric to english conversion
		System.out.println("Metric to English conversion");
		System.out.println("temperature in Farenheit: " + MetricToEnglishConverter.convertTemperature(38));
		System.out.println("distance in Miles: "+ MetricToEnglishConverter.convertDistance(98));
		System.out.println("weight in Pounds: " + MetricToEnglishConverter.convertWeight(56));
	}
}




