package vn.bongda.livestream.domain.event;

@FunctionalInterface
public interface DomainEventHandler<T> {

  void handle(T event);
}
