package rest1.pkg1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class utilityController {
	@GetMapping("/util/factorial/{num1}")
	public Map<String, Object> factorial(@PathVariable int num1)
	{
		List<Character> l =new ArrayList<>();
		Map<String, Object> obj = new HashMap<>();
		int fact=1;
		for(int i=1;i<=num1;i++)
		{
			fact=fact*i;
		}
		obj.put("factorial",fact);
		return obj;
	}
	
	@GetMapping("/util/even/{num1}")
	public Map<String, Object> Even(@PathVariable int num1)
	{
		List<Integer> even =new ArrayList<>();
		List<Integer> odd =new ArrayList<>();
		Map<String, Object> obj = new HashMap<>();
		for(int i=0;i<=num1;i++)
		{
			if(i%2==0) {				
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		obj.put("Even",even);
		obj.put("Odd",odd);
		return obj;
	}
	
	@GetMapping("/util/ascii")
	public Map<Character, Integer> Ascii()
	{
		Map<Character, Integer> obj = new HashMap<>();
		for(int i=65;i<65+26;i++)
		{
			obj.put((char)i, i);			
		}
		return obj;
	}
}
