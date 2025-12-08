package sec05.exam03;

@FunctionalInterface
public interface Creatable2 {
	// id와 name을 매개값으로 받고, Member 객체 만들어서 리턴
	Member create(String id, String name);
}
