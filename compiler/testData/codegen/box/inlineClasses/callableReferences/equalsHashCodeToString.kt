// IGNORE_BACKEND: WASM
// WASM_MUTE_REASON: IGNORED_IN_JS
// IGNORE_BACKEND: JS, JS_IR, JS_IR_ES6, NATIVE
// IGNORE_BACKEND_K2: JVM_IR
// WITH_REFLECT
// WITH_STDLIB
// WORKS_WHEN_VALUE_CLASS
// LANGUAGE: +ValueClasses

import kotlin.test.*

OPTIONAL_JVM_INLINE_ANNOTATION
value class Z(val s: String)

fun box(): String {
    val a = Z("a")
    val b = Z("b")

    val equals = Z::equals
    assertTrue(equals.call(a, a))
    assertFalse(equals.call(a, b))

    val hashCode = Z::hashCode
    assertEquals(a.s.hashCode(), hashCode.call(a))

    val toString = Z::toString
    assertEquals("Z(s=${a.s})", toString.call(a))

    return "OK"
}