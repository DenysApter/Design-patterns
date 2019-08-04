package filter.filters;

import java.util.List;
import java.util.stream.Collectors;

public class StartCharFilter implements IFilter {
    @Override
    public List<String> filter(List<String> data) {
        return data.stream().filter(s -> s.charAt(0) == 'a').collect(Collectors.toList());
    }
}
