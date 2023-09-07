# CS.12.01-Tutorial.1.2.8

Many encoded strings contain delimiters. A delimiter is a non-empty string that acts as a boundary between different parts of a larger string. The delimiters involved in this question occur in pairs that must be balanced, with each pair having an open delimiter and a close delimiter. There will be only one type of delimiter for each string. The following are examples of delimiters. 

Expressions in mathematics use open parentheses “ ( “ and close parentheses “ ) “ as delimiters,. For each open parenthesis, there must be a matching close parenthesis.

Example 1

(x + y) * 5	is a valid mathematical expression

(x + (y)		is not a valid mathematical expression because there are more open delimiters than close delimiters.

Example 2

HTML uses < b > and < /b > as delimiters. For each open delimiter < b >, there must be a matching close delimiter < /b >

< b > Make this text bold < /b >		is valid HTML

< b > Make this text bold < /ub >	is not valid HTML because there is one open delimiter and no matching close delimiter.

In this tutorial, you will write two methods in the following Delimiters class.

public class Delimiters 
{

	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close) 
{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<Sttring> getDelimitersList(String[] token) 
	{

		// To be implemented.

	}

public boolean isBalanced(ArrayList<String> delimiters)
{

	// To be implemented.

}


a) A string containing text and possibly delimiters has been split into tokens and stored in String[] tokens. Each token is either an open delimiter, a close delimiter, or a substring that is not a delimiter. You will write the method getDelimitersList, which returns an ArrayList containing all the open and close delimiters found in tokens in their original order.

The following examples show the contents of an ArrayList returned by getDelimitersList for different open and close delimiters and different tokens arrays.

Example 1

	openDel: “(“
	closeDel: “)”

	tokens:		

<img width="387" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.8/assets/57818506/04fdaaa3-be4e-445c-b8b3-3415378652f1">

ArrayList of delimiters

<img width="205" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.8/assets/57818506/c4fcf8a3-0006-454a-a591-c8597c4b125e">

Example 2

	openDel: “<q>”
	closeDel: “</q>”

	tokens:

<img width="478" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.8/assets/57818506/ce2a7764-7477-4787-be41-9a38470c8fcb">

ArrayList of delimiters

<img width="304" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.8/assets/57818506/6efe786d-2b6b-4c5e-8705-d4512b2844ec">

Complete the method getDelimitersList.

b) Write the method isBalanced, which returns true when the delimiters are balanced and returns false, otherwise. The delimiters are balanced when both of the following conditions are satisfied; otherwise, they are not balanced.

When traversing the ArrayList from the first element to the last element, there is no point at which there are more close delimiters than open delimiters at or before that point.

The total number of open delimiters is equal to the total number of close delimiters.
