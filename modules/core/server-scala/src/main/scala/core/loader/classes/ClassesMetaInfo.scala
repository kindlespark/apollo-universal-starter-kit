package core.loader.classes

import org.clapper.classutil.ClassInfo

trait ClassesMetaInfo {
  def retrieve: List[ClassInfo]
}