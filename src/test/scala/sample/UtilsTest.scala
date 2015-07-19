package sample

import org.scalatest.FunSuite


class StringUtilsSuite extends FunSuite {

  test("StringUtils#isEmpty returns true for null") {
    assert(StringUtils.isEmpty(null))
  }

  test("StringUtils#isEmpty returns true for the empty string") {
    assert(StringUtils.isEmpty(""))
  }

  test("StringUtils#isEmpty returns false for any other strings") {
    assert(!StringUtils.isEmpty("a"))
  }
}

