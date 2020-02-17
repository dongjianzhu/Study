package pdream.demo.converter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

/**
 * @author dongjianzhu
 * @date 2020年1月13日
 */
public class StringToNullConverter implements Converter<String, String> {
    @Override
    public String convert(String source) {
        return StringUtils.trimToNull(source);
    }
}
