package filter.filters;

import java.util.List;
import java.util.stream.Collectors;

public class CountCharFilter implements IFilter {

    @Override
    public List<String> filter(List<String> data) {
        return data.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
    }
}
