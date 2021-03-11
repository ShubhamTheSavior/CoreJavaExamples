package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainEmployee {
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor){
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
	
	
	

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("shubham",1000,"software"));
		employees.add(new Employee("ak",2000,"software"));
		employees.add(new Employee("rushabh",5000,"civil"));
		employees.add(new Employee("mayur",1000,"mech"));
		employees.add(new Employee("srushti",3000,"elec"));
		
		


		
		
		List<Employee> sortedList=employees.stream().sorted((e1,e2)->{
			return e2.getSal().compareTo(e1.getSal());
		}).filter(distinctByKey(e1->e1.getDept())).collect(Collectors.toList());
		
		System.out.println(sortedList);
	}

}
