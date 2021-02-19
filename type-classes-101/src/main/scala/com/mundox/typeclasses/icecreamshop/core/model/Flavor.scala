package com.mundox.typeclasses.icecreamshop.core.model

sealed trait Flavor {
  def name: String
}

case class Chocolate() extends Flavor {
  override val name: String = "chocolate"
}

case class Vanilla() extends Flavor {
  override def name: String = "vanilla"
}

case class TuttiFruit() extends Flavor {
  override def name: String = "tutti fruit"
}