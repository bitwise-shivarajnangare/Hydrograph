package hydrograph.engine.spark.execution.tracking

import org.apache.spark.{Accumulable, Accumulator, AccumulatorParam, SparkContext}

import scala.collection.immutable.HashMap

/**
  * The Class PartitionStageAccumulator.
  *
  * @author Bitwise
  *
  */
class PartitionStageAccumulator extends Accumulator[Long](0L,AccumulatorParam.LongAccumulatorParam ) {
  /*//private var _map = new HashMap[Int, HashMap[Int, (Long, Int)]]()
  private var _map = 0L
  private var _count = 0L

  def isZero: Boolean = _count == 0

  def copy(): PartitionStageAccumulator = {
    val newAcc = new PartitionStageAccumulator
    newAcc._count = this._count
    newAcc._map = this._map
    newAcc
  }

  def reset(): Unit = {
    _count = 0L
    _map = new HashMap[Int, HashMap[Int, (Long, Int)]]()
  }

  override def add(v: Long): Unit = {
    _count += v
  }

  def count: Long = _count

  def partCounts = _map

  override def merge(other: Accumulator[Long]): Unit = other match {
    case o: PartitionStageAccumulator => {
      //this foreach call is required to avoid bug (https://issues.scala-lang.org/browse/SI-9688) in scala
      //where internal private var kv is set to null sometimes
      o.partCounts.foreach(outer => outer._2.foreach(inner => ()))

      _map = _map.merged(o.partCounts)((outer1, outer2) => (outer1._1, outer1._2.merged(outer2._2)((inner1, inner2) => (inner1._1, if (inner1._2._2 > inner2._2._2) inner1._2 else inner2._2))))
    }
    case _ =>
      throw new UnsupportedOperationException(
        s"Cannot merge ${this.getClass.getName} with ${other.getClass.getName}")
  }

  def onEnd(stageId: Int, partitionId: Int, attemptNo: Int): Unit = { _map = _map.updated(stageId, new HashMap[Int, (Long, Int)].updated(partitionId, (_count, attemptNo))) }

  override def value = _map*/
}
