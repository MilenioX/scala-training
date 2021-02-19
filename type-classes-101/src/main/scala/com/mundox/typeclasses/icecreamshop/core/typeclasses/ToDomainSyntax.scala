package com.mundox.typeclasses.icecreamshop.core.typeclasses

/*
  Step 3: The Api interface
 */
object ToDomainSyntax {

  implicit class ToDomainOps[A, B](value: A) {
    def toDomain(implicit toDomainInstance: TransformToDomain[A, B]): B = {
      toDomainInstance.toDomain(value)
    }
  }
}
