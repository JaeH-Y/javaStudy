package sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
	// id를 매개값으로 받고, Member 객체를 만들어서 리턴
	Member create(String id);
}
