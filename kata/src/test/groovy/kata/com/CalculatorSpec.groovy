package kata.com

import spock.lang.Specification

class CalculatorSpec extends Specification{
	def Calculator calc = new Calculator();
	
	def "test to add string input"() {
		given : "input as string"
			input
		when : "calc.add(input) is called"
			def output = calc.add(input)
		then : "It should add numbers from input"
			output == expectedOutput
		where : "Provided inputs"
			input				||		expectedOutput
			""					||			0
	}
	
}
