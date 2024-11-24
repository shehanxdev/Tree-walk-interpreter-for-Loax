package org.Lox;

import java.util.List;

abstract class test {
  interface Visitor<R> {
    R visitClass1test(Class1 test);
    R visitClass2test(Class2 test);
    R visitClass3test(Class3 test);
    R visitClass4test(Class4 test);
  }

  // Nested test classes here...
  static class Class1 extends test {
    Class1(expr left, token op, expr right) {
      this.left = left;
      this.op = op;
      this.right = right;
    }

    @Override
    <R> R accept(Visitor<R> visitor) {
      return visitor.visitClass1test(this);
    }

    final expr left;
    final token op;
    final expr right;
  }
//< test-class1
  static class Class2 extends test {
    Class2(expr left, token op, expr right) {
      this.left = left;
      this.op = op;
      this.right = right;
    }

    @Override
    <R> R accept(Visitor<R> visitor) {
      return visitor.visitClass2test(this);
    }

    final expr left;
    final token op;
    final expr right;
  }
//< test-class2
  static class Class3 extends test {
    Class3(expr left, token op, expr right) {
      this.left = left;
      this.op = op;
      this.right = right;
    }

    @Override
    <R> R accept(Visitor<R> visitor) {
      return visitor.visitClass3test(this);
    }

    final expr left;
    final token op;
    final expr right;
  }
//< test-class3
  static class Class4 extends test {
    Class4(expr left, token op, expr right) {
      this.left = left;
      this.op = op;
      this.right = right;
    }

    @Override
    <R> R accept(Visitor<R> visitor) {
      return visitor.visitClass4test(this);
    }

    final expr left;
    final token op;
    final expr right;
  }
//< test-class4

  abstract <R> R accept(Visitor<R> visitor);
}
