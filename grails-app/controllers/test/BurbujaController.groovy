package test

class BurbujaController {

    def index() { 
    	def a = [2,68,64.98475,65,9272,7546,5433,2,1,3223,2,3,2,6372,334,23,465,46,4675,7876,76,12,32,765,87,2,1,345,876,987456]
		def b = a 
		
		for(out in (a.size()-2)..2)
		{
			0.upto(out) { index ->
				if(a[index] > a[index+1])
				{
					use(Collections) {
					a.swap(index,index+1)
					}
				}
			}
		}
		render a
		return

//test cases... these are passing!! Yipeee :D 
}
}
