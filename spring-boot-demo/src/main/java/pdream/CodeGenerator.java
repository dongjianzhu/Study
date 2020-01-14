package pdream;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CodeGenerator {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        //

        gc.setOutputDir(projectPath + "/spring-boot-demo/src/main/java");
        gc.setAuthor("dongjianzhu");
        // 是否覆盖同名文件，默认是false
        gc.setFileOverride(false);
        gc.setOpen(false);
        // 配置生成的日期类型
        gc.setDateType(DateType.ONLY_DATE);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        //设置主键策略
        gc.setIdType(IdType.INPUT);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();

        dsc.setDbType(DbType.MYSQL);
        // dsc.setTypeConvert(new MySqlTypeConvert() {
        // // 自定义数据库表字段类型转换【可选】
        // @Override
        // public DbColumnType processTypeConvert(String fieldType) {
        // System.out.println("转换类型：" + fieldType);
        // // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
        // return super.processTypeConvert(fieldType);
        // }
        // });

        dsc.setUrl("jdbc:mysql://118.190.69.246:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("pdream");
        dsc.setPassword("pdream-group");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("pdream.demo");
//        pc.setModuleName(scanner("模块名"));
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        // 自定义配置
        // InjectionConfig cfg = new InjectionConfig() {
        // @Override
        // public void initMap() {
        // // to do nothing
        // }
        // };

        // 如果模板引擎是 freemarker
        /*
         * String templatePath = "/templates/mapper.xml.ftl"; // 如果模板引擎是 velocity // String templatePath =
         * "/templates/mapper.xml.vm";
         *
         * // 自定义输出配置 List<FileOutConfig> focList = new ArrayList<>(); // 自定义配置会被优先输出 focList.add(new
         * FileOutConfig(templatePath) {
         *
         * @Override public String outputFile(TableInfo tableInfo) { // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意
         * xml 的名称会跟着发生变化！！ return projectPath + "/src/main/resources/mapper/" + pc.getModuleName() + "/" +
         * tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML; } });
         *
         * cfg.setFileOutConfigList(focList); mpg.setCfg(cfg);
         */

        // 自定义模板配置
        /*
         * TemplateConfig templateConfig = new TemplateConfig();
         *
         * // 配置自定义输出模板 // 指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别 //
         * templateConfig.setEntity("templates/entity2.java"); // templateConfig.setService(); //
         * templateConfig.setController(); templateConfig.setMapper("..."); templateConfig.setXml(null);
         * mpg.setTemplate(templateConfig);
         */

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();

        // 全局大写命名 ORACLE 注意
        // strategy.setCapitalMode(true);
        // 此处可以修改为您的表前缀
        // strategy.setTablePrefix(pc.getModuleName() + "_");
        // strategy.setTablePrefix(new String[] { "user_" });

        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 列名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.pdream.module.common.BaseEntity");

        // strategy.setSuperEntityColumns("id");

        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.pdream.module.common.BaseController");

        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.pdream.module.common.BaseMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.pdream.module.common.BaseService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.pdream.module.common.BaseServiceImpl");

        // set get方法
        strategy.setEntityLombokModel(true);
        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setEntityTableFieldAnnotationEnable(true);
        // @RestController注解
        // strategy.setRestControllerStyle(true);
        // 是否生成builder模式
        // strategy.setEntityBuilderModel(false);
        // 指定乐观锁字段
        // strategy.setVersionFieldName("");
        // 关于is_xxx字段的处理
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        // 指定逻辑删除字段  @TableLogic
        strategy.setLogicDeleteFieldName("is_deleted");
        // 需要生成的表
        strategy.setInclude(scanner("表名"));
//        strategy.setInclude(new String[] {"statistics_data","statistics_data_total"});
        // 排除生成的表
        // strategy.setExclude(new String[]{"test"});

        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}
