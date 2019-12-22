package lizzy.medium.compare;

import com.sun.istack.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Repository {
    Optional<Issue> findById(@NotNull UUID id);

    Issue insert(@NotNull Issue issue);

    void deleteById(@NotNull UUID id);

    List<Issue> findAll();

    Issue update(@NotNull Issue issue);
}
