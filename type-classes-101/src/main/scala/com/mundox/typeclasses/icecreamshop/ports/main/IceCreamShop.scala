package com.mundox.typeclasses.icecreamshop.ports.main

import com.mundox.typeclasses.icecreamshop.ports.adapters.IceCreamMachineAdapter
import com.mundox.typeclasses.icecreamshop.ports.ui.model.DTODummies

object IceCreamShop extends App {

  println(s"Welcome to our Ice Cream Store")
  println(s"So, your order is a Chocolate with Vanilla Ice Cream and with a Cookie, please hold on...")
  val iceCreamRequested = DTODummies.buildChocolateVanillaCookieIceCream()
  val iceCreamMachineService = new IceCreamMachineAdapter
}
