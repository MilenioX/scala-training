package com.mundox.typeclasses.icecreamshop.core.model

sealed trait IceCreamPresentation

case class Cup(oz: Int) extends IceCreamPresentation

case class Cone(size: String) extends IceCreamPresentation
