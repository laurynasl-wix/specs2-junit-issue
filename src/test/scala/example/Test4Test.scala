package example

import org.specs2.mutable.SpecWithJUnit
import org.specs2.specification.Scope

class Test4Test extends SpecWithJUnit {
  "Test" should {
    "have less than 50 running threads" in new Context {

      ThreadCount() must beLessThan(50)
    }
  }

  trait Context extends Scope

}
