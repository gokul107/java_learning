import java.util.Stack;
class BalancedOrNot
{
	public static void main(String[] args) 
	{
		String tempString="{[()]()}";
		
		if(isBalanced(tempString))
			System.out.println("It is balanced string");
		else
			System.out.println("It is not balanced string");
	}
	//callie method
	public static boolean isBalanced(String s)
	{
		Stack<Character>  stack=new Stack<Character>();

		for(char c : s.toCharArray())
		{
			if(c=='{' || c== '[' || c=='(')
			{
				stack.push(c);
			}
			else if(c=='}' && !stack.empty() && stack.peek()=='{')
			{
				stack.pop();
			}
			else if(c==']' && !stack.empty() && stack.peek()=='[')
			{
				stack.pop();
			}
			else if(c==')' && !stack.empty() && stack.peek()=='(')
			{
				stack.pop();
			}
			else
			{
				return false;
			}
		}

		return stack.isEmpty();
	}
	
}
