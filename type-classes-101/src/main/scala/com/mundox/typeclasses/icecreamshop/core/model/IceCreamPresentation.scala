package com.mundox.typeclasses.icecreamshop.core.model

sealed trait IceCreamPresentation

case class Cup(size: Int) extends IceCreamPresentation

case class Cone() extends IceCreamPresentation
