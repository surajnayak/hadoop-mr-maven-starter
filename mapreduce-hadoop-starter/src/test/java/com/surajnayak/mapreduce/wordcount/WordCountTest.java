package com.surajnayak.mapreduce.wordcount;

import java.io.File;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

public class WordCountTest {

	@Test
	public void test() {
		String args[] = { "src/main/resources/input/words.txt", "src/main/resources/output/wordcount.txt" };
		try {
			FileSystem fileSystem = FileSystem.get(new Configuration());
			fileSystem.delete(new Path(args[1]), true);
			WordCount.main(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
