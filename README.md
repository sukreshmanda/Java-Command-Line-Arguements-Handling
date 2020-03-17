## Java-Command-Line-Arguements-Handling

# Usage

for using please follow the instructions as follows 

1. import Parser.Parser; or import Parser //directly from java or class file
2. Parser p = new Parser(args); // args[] is the command line input for java
3. int a = p.getInt("age");
4. float[] b = p.getFloatArray("name");
5. float c = p.getFloat("salary");

![$ javac Test _age 123 _name [123,234,34] _salary 23.324 ](http://www.google.com/)


# documentation

all avilable methods 
	1. getString()				return String
	2. getInt()					return int
	3. getFloat()				return float
	4. getDouble()				return double
	5. getStringArray()			return String[]
	6. getIntArray()			return int[]
	7. getFloatArray()			return float[]
	8. getDoubleArray()			return double[]
	
#Note
	1. While giving array as input use only square braces ex: [213,34,345] no other type.
	2. Unlike Python you have to use only underscore for defining vars ex : _name // but not -name.
	3. Use of numeric or special chars as args is also allowed.
	
#Internal Structure
	There are two different HashMaps used
		1. One for storing primitive types.
		2. Another for storing arrays.
		
