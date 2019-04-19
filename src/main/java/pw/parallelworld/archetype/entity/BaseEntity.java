package pw.parallelworld.archetype.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "pw.parallelworld.archetype.util.SnowflakeGenId")
    private long id;

    @CreationTimestamp
    private Timestamp addTime;

    @UpdateTimestamp
    protected Timestamp updateTime;
}
