//package com.godaddy.sonar.ruby.metricfu;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import junit.framework.TestCase;
//import org.junit.Before;
//import org.junit.Test;
//
//public class MetricfuComplexityYamlParserTest extends TestCase
//{
//	private final static String YML_SYNTAX_FILE_NAME = "src/test/resources/test-data/metricfu_report.yml";
//    private final static String YML_PARSE_FILE_NAME = "src/test/resources/test-data/results.yml";
//	
//	private MetricfuComplexityYamlParserImpl parser = null;
//	
//	@Before
//	public void setUp() throws Exception
//	{
//		parser = new MetricfuComplexityYamlParserImpl();
//	}
//
//	
//    @Test
//    public void testParseFunctionSyntaxHandling() throws IOException
//    {
//        File reportFile = new File(YML_SYNTAX_FILE_NAME);
//        List<RubyFunction> rubyFunctions = parser.parseFunctions("lib/some_path/foo_bar.rb", reportFile, "Saikuro");
//
//        RubyFunction rubyFunction0 = new RubyFunction("FooBar#validate_user_name", 4, 5);       
////        assertTrue(rubyFunctions.size()==2);
////        assertTrue(rubyFunctions.get(0).toString().equals(rubyFunction0.toString()));
//    }   
//	
//	@Test
//	public void testParseFunction() throws IOException
//	{
//		File reportFile = new File(YML_PARSE_FILE_NAME);
//		List<RubyFunction> rubyFunctions = parser.parseFunctions("lib/some_path/foo_bar.rb", reportFile, "Saikuro");
//
//		RubyFunction rubyFunction0 = new RubyFunction("FooBar#validate_user_name", 4, 5);		
//		assertTrue(rubyFunctions.size()==2);
//		assertTrue(rubyFunctions.get(0).toString().equals(rubyFunction0.toString()));
//	}	
//}
