package kodlamaIo.dataAccess;

import java.util.List;

public interface IEntityRepository<TEntity> {

	void add(TEntity entity);

	void delete(TEntity entity);

	void update(TEntity entity);

	TEntity getById(int id);

	TEntity getByName(String name);

	List<TEntity> getAll();
}
