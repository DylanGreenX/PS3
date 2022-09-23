object hw3 extends eecs.cs478:
  def userName = "ADD YOUR NAME(S) HERE"

  // DOCUMENTATION SIGNATURE BLOCK GOES HERE

  /*
  If working by yourself, delete this comment block; otherwise, fill it out.
    Contribution of <insert team member 1's name here>: <team member 1's contribution>
    Contribution of <insert team member 2's name here>: <team member 2's contribution>
    ...
    Contribution of <insert team member n's name here>: <team member n's contribution>
  */


  /***************** Proof by Structural Induction Problem ***********************/

  /***************** Language Creation, Phase 3 ***********************/
  /*<type> = "int"|"float"|"char"|"string"|"Bool"
  <variable> = (a-z)((a-z)|(A-Z)|(0-9)|_)*
  <operator> = '+'|'-'|'*'|'/'|'^'|'%'
  <statement> = <declaration> | <assignment> | <function> | <expression> | <loop> | <if> | <return>
  <declaration> = (<type> <variable>) | (<type> <assignment>)
  <assignment> = <variable> '=' (<literal> | <expression>)
  <function> = <type> <variable>'('( <declaration> ',')* <declaration>)?')''{'<statement>+'}'

  -----------------------Addresses ambiguity of <expression> from part B-----------------------

  <expression0> = <literal> | <variable> | '(' <expression4> ')'
  <expression1> = <expression1> '%' <expression0> | <expression0>
  <expression2> = <expression2> '^' <expression1> | <expression1>
  <expression3> = <expression3> ('/'|'*') <expression2> | <expression2>
  <expression4> = <expression4> ('-'|'+') <expression3> | <expression3>

  ----------------------------------------------------------------------------------------------

  <loop> = <for> | <while>
  <for> = "for" '(' <assignment> ',' <conditional> ',' <modification> ')' '\n' '{' <statement>+ '}'
  <modification> = <variable> ('+'|'-'|'*'|'/')'=' <literal> | <variable>("++"|"--")
  <while> = "while" '('<conditional>')' '\n' '{'<statement>+'}'

  -----------------------Addresses ambiguity of <conditional> from part B-----------------------

  <conditional0> = <expr><comp><expr> | '(' <conditional2> ')'
  <conditional1> = <conditional1> "&&" <conditional0> | <conditional0>
  <conditional2> = <conditional2> "||" <conditional1> | <conditional1>

  ----------------------------------------------------------------------------------------------
  <comp> = "=="|"!="|'>'|'<'|">="|"<="
  <if> = "if" '('<conditional>')' '\n' '{' <statement>+ '}' '\n' (<else if> '\n')* <else>?
  <else if> = "else if" '('<conditonal>')' '\n' '{' <statement>+ '}'
  <else> = "else" '\n' <statement>+
  <return> = "return" <expr>
  */
