package org.example

import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin


fun main() {}

// this function doesn't compiler with kotlin 2.0.0-Beta2: Unresolved reference 'GET_PROPERTY'.
// but it compiles with kotlin 2.0.0-Beta1
private fun testOrigin(origin: IrStatementOrigin): Boolean {
    val canUseOriginHere = IrStatementOrigin.GET_PROPERTY

    // but can't use it in when:
    return when (origin) {
        is IrStatementOrigin.GET_PROPERTY -> true
        else -> false
    }
}