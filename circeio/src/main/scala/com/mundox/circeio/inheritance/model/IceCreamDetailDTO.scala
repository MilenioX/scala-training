package com.mundox.circeio.inheritance.model

import cats.syntax.functor._
import io.circe.{ Decoder, Encoder }, io.circe.generic.auto._
import io.circe.syntax._

trait IceCreamDetailDTO

object IceCreamDetailDTO {

  implicit val encoder: Encoder[IceCreamDetailDTO] = Encoder.instance {
    case one @ OneScoopIceCreamDTO(_) => one.asJson
    case two @ TwoScoopsIceCreamDTO(_, _) => two.asJson
  }

  implicit val decoder: Decoder[IceCreamDetailDTO] =
    List[Decoder[IceCreamDetailDTO]](
      Decoder[TwoScoopsIceCreamDTO].widen,
      Decoder[OneScoopIceCreamDTO].widen
    ).reduceLeft(_ or _)
  /*
  implicit val encoder: Encoder[IceCreamDetailDTO] = new Encoder[IceCreamDetailDTO] {
    override def apply(obj: IceCreamDetailDTO): Json =
      obj match {
        case one: OneScoopIceCreamDTO =>
          one.asJson
        case two: TwoScoopsIceCreamDTO =>
          two.asJson
      }
  }

  implicit val decoder: Decoder[IceCreamDetailDTO] = new Decoder[IceCreamDetailDTO] {
    override def apply(c: HCursor): Result[IceCreamDetailDTO] = ???
  }
   */

}