package online.mokkoji.user.repository;

import online.mokkoji.user.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
