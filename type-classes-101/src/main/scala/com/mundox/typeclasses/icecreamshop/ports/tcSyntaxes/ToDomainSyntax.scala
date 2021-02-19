package com.mundox.typeclasses.icecreamshop.ports.tcSyntaxes

import com.mundox.typeclasses.icecreamshop.core.typeclasses.TransformToDomain

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
