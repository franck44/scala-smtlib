package smtlib
package sexpr

import common._

object Tokens {

  sealed trait Token extends Positioned

  case object OParen               extends Token /* ( */
  case object CParen               extends Token /* ) */

  case class StringLit(s: String)  extends Token /* "hello" */
  case class SymbolLit(s: String)  extends Token /* hello */
  case class QualifiedSymbol(pre: Option[String], post: String)  extends Token /* foo:bar */
  //integer literals can be represented in any base. Check s-expr "standard" for details
  case class IntLit(n: BigInt)     extends Token /* 42, #b101, #xFF1D */
  case class DoubleLit(d: Double)  extends Token /* 42.24 */

}
