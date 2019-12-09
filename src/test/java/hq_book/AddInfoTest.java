package hq_book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hq.bean.Book;
import com.hq.bean.Error_record;
import com.hq.common.utils.NumUtil;
import com.hq.common.utils.StringUtil;
import com.hq.service.BookService;

public class AddInfoTest{
	// 单元测试导入数据
	@SuppressWarnings("resource")
	@Test
	public void test1() throws Exception {
		File file = new File("C:\\Users\\liu\\Desktop\\dataInfo.txt");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service = applicationContext.getBean(BookService.class);
		FileReader fd=new FileReader(file);
		BufferedReader br = new BufferedReader(fd);
		String str=br.readLine();
		while(str!=null) {
			String[] split = str.split("\t");
		// split[0]名字   split[1] 价格	split[2] 出版社	split[3]  手机号
			
			if(StringUtil.isPhone(split[3])&&NumUtil.isNumber(split[1])) {
				Book book = new Book(split[0],Integer.parseInt(split[1]),split[2],split[3]);
				int i=service.addBook(book);
			}else {
				Error_record error_record = new Error_record(split[0],split[1],split[2],split[3]);
				int i=service.addError(error_record);
			}
			str=br.readLine();
		}
	}
}
