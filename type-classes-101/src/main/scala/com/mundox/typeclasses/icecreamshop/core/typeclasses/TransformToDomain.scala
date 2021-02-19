package com.mundox.typeclasses.icecreamshop.core.typeclasses

/*
  Step 1: Type Class Name
 */
trait TransformToDomain[A, B] {
  def toDomain(portsModel: A): B
}