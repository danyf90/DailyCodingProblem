package com.formichelli.dailycodingproblem.util

open class Node<T>(val value: T, val left: Node<T>? = null, val right: Node<T>? = null) {
    override fun equals(other: Any?): Boolean {
        if (other !is Node<*>)
            return false

        if (value?.equals(other.value) != true)
            return false

        if (left == null && other.left != null)
            return false

        if (left?.value?.equals(other.left?.value) != true)
            return false

        if (right == null && other.right != null)
            return false

        if (right?.value?.equals(other.right?.value) != true)
            return false

        return true
    }

    override fun hashCode(): Int = (value?.hashCode() ?: 0) + (left?.hashCode() ?: 0) + (right?.hashCode() ?: 0)

    override fun toString() = "($value,$left,$right)"
}