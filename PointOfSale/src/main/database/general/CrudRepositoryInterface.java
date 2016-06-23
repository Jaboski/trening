package main.database.general;

public interface CrudRepositoryInterface<Entity, Id> {
    void add(Entity entity);
    void update(Entity entity);
    Entity get(Id id);
    void remove(Id id);
    boolean contains(Id id);
}
