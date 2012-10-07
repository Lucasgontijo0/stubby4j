package org.stubby.yaml;

import org.junit.Assert;
import org.junit.Test;
import org.stubby.yaml.stubs.StubHttpLifecycle;

import java.io.Reader;
import java.net.URL;
import java.util.List;

/**
 * @author Alexander Zagniotov
 * @since 10/6/12, 8:13 PM
 */
public class YamlParserTest {

   @Test
   public void aaaaa() throws Exception {
      final URL url = this.getClass().getResource("/httplifecycles.yaml");
      Assert.assertNotNull(url);

      final YamlParser yamlParser = new YamlParser(url.getFile());
      final Reader yamlReader = yamlParser.buildYamlReaderFromFilename();
      final List<StubHttpLifecycle> loadedHttpCycles = yamlParser.load(yamlReader);

      Assert.assertNotNull(url);
   }
}