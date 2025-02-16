package example.micronaut.chess.repository;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Requires;
import io.micronaut.data.jdbc.annotation.JdbcRepository;

import static io.micronaut.context.env.Environment.ORACLE_CLOUD;
import static io.micronaut.context.env.Environment.TEST;
import static io.micronaut.data.model.query.builder.sql.Dialect.ORACLE;

@Primary
@JdbcRepository(dialect = ORACLE)
@Requires(env = {ORACLE_CLOUD, TEST})
public interface OracleGameStateRepository extends GameStateRepository {
}
