package example

import org.specs2.mutable.SpecWithJUnit
import org.specs2.specification.Scope

class MissingFailureTest extends SpecWithJUnit {
  
  "should fail" in new Context {
    1 must be_===(2)
  }
  
  trait Context extends Scope {
    throw new Error("Should fail")
  }
}
