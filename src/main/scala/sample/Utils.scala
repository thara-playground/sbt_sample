package sample


object StringUtils {
  def isEmpty(value: String): Boolean =
    value == null || value.length() == 0
}

