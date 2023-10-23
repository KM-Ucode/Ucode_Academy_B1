package day_45_oop_abstraction_continue;

interface ExtendsAndImplements2 {
}
interface I44{

}
interface I33 extends ExtendsAndImplements2, I44{

}
abstract class A22{

}
class A3 extends A22 implements ExtendsAndImplements2, I44, I33{  // extending one abstract class and multiple interfaces

}
