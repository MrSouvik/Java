package Sealed_class_Interface;
/*
 * Problem Description:

	ABC Confectionary is a chocolate manufacturer company. There are different units based on the type of chocolate like whiteChocolate, darkChocolate, bitterChocolate and milkChocolate

	Create a class Chocolate, that permit three subclasses, whiteChocolate, darkChocolate and milkChocolate.

	In this subsclasses darkChocolate has a further subclass , cocoaPowder  and milkChocolate class cannnot be futher extended.
 */

sealed class Chocolate permits whiteChocolate, darkChocolate, milkChocolate{
	
}

final class whiteChocolate extends Chocolate{
	
}

sealed class darkChocolate extends Chocolate permits cocoaPowder{
	
}

final class milkChocolate extends Chocolate{
		
}
 
final class cocoaPowder extends darkChocolate{
	 
}

public class Exercise {

}
