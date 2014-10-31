package com.zenfractal

import com.esotericsoftware.kryo.Kryo
import com.twitter.chill.avro.AvroSerializer
import org.apache.spark.serializer.KryoRegistrator

class AvroRegistrator extends KryoRegistrator {
  override def registerClasses(kryo: Kryo) = {
    kryo.register(classOf[AminoAcid], AvroSerializer.SpecificRecordSerializer[AminoAcid])
  }
}
