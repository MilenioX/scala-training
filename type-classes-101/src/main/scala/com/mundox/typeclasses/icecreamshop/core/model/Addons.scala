package com.mundox.typeclasses.icecreamshop.core.model

sealed trait Addons {
  def name: String
}

case class Chips() extends Addons {
  override val name: String = "chips"
}
case class Cookie() extends Addons {
  override val name: String = "cookie"
}
case class Kellogg() extends Addons {
  override def name: String = "kellogg"
}