package example

import java.lang.management.ManagementFactory

object ThreadCount {
  def apply(): Int = {
    val count = ManagementFactory.getThreadMXBean.getThreadCount
    println(s"Current thread count: $count\n")
    count
  }
}
