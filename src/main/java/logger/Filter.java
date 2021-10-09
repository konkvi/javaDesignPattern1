package logger;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int step;

    public Filter(int step) {
        this.step = step;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i < this.step) {
                logger.log(" Элемент " + i + " проходит");
                result.add(i);
            } else {
                logger.log(" Элемент " + i + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента");
        return result;
    }
}
