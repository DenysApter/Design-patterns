package filter;

import filter.filters.CountCharFilter;
import filter.filters.StartCharFilter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("al");
        data.add("alalla");
        data.add("bbb");
        data.add("safff");

        List<String> res1 = new CountCharFilter().filter(data);
        List<String> res2 = new StartCharFilter().filter(data);

        System.out.println(res1);
        System.out.println(res2);
    }
}
