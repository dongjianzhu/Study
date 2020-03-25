package pdream.demo;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author dongjianzhu
 * @date 2020/3/23 20:31
 */
public class DataListener extends AnalysisEventListener<Data> {


    Set<String> xSet = new HashSet<>();
    Set<String> ySet = new HashSet<>();

    private List<Long> indexes = new LinkedList<>();

    private List<Long> numbers = new LinkedList<>();

    @Override
    public void invoke(Data data, AnalysisContext analysisContext) {
        Long index = data.getIndex();
        Long number = data.getNumber();
        String s = index + "";
        if (xSet.contains(s)) {
            System.out.println(index + " --> " + number);
            return;
        } else {
            xSet.add(s);
        }
        String s1 = data.getNumber() + "";
        if (ySet.contains(s1)) {
            System.out.println(index + " --> " + number);
        } else {
            ySet.add(s1);
        }
        indexes.add(index);
        numbers.add(number);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("index size is " + indexes.size());
        System.out.println("numbers size is " + numbers.size());
        String x = StringUtils.join(indexes, ",");
        String y = StringUtils.join(numbers, ",");
        System.out.println("x = [" + x + "];");
        System.out.println("y = [" + y + "];");
    }
}
