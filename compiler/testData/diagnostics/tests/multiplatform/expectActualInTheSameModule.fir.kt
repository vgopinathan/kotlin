// MODULE: m1-common
// FILE: common.kt

<!NO_ACTUAL_FOR_EXPECT{JVM}!>expect class <!EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE!>A<!><!>
actual class <!ACTUAL_WITHOUT_EXPECT, EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE!>A<!>

// MODULE: m1-jvm()()(m1-common)
// FILE: jvm.kt

expect class <!EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE!>B<!>
actual class <!ACTUAL_WITHOUT_EXPECT, EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE!>B<!>
