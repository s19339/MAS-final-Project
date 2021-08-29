package minipro5.demo.Repositories;

import minipro5.demo.Model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicReposditory extends CrudRepository <Topic ,Long> {
}
