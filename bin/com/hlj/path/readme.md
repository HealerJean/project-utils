FileInputStream 为项目目录
ClassLoader.class.getClassLoader().getResourceAsStream 为项目的src目录
ClassGetResource.class.getResource("ClassGetResource.properties").getFile();  为该类所在位置
this.getServletContext().getResourceAsStream("/NamePath.properties"); 为webroot所在目录