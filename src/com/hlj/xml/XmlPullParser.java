package com.hlj.xml;
/*package com.hlj.xml;


public class CityPullParse {

    public static ArrayList<City> Parse(String CityString){
        ArrayList<City> CityArray = new ArrayList<City>();

        try {
            //定义工厂 XmlPullParserFactory
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

            //定义解析器 XmlPullParser
            XmlPullParser parser = factory.newPullParser();

            //获取xml输入数据
            parser.setInput(new StringReader(CityString));

            CityArray = ParseXml(parser);
        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return CityArray;
    }


    public static ArrayList<City> ParseXml(XmlPullParser parser){
        ArrayList<City> CityArray = new ArrayList<City>();
        City CityTemp = null;
        int provinceId = 0;
        int cityId;
        String cityName;

        try {
            //开始解析事件
            int eventType = parser.getEventType();

            //处理事件，不碰到文档结束就一直处理
            while (eventType != XmlPullParser.END_DOCUMENT) {
                //因为定义了一堆静态常量，所以这里可以用switch
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:

                        //给当前标签起个名字
                        String tagName = parser.getName();
                        //  Log.d("", "====XmlPullParser.START_TAG=== tagName: " + tagName);

                        if(tagName.equals("province")){
                           
                            provinceId = Integer.parseInt(parser.getAttributeValue(0));
                        }else if(tagName.equals("item")){
                            CityTemp = new City();
                        }else if(tagName.equals("id")){
                            cityId = Integer.parseInt(parser.nextText());                            
                            parser.next();
                            cityName = parser.nextText();
                            
                            Log.v("", "id getText: "+cityId);
                            Log.v("", "name getText: "+cityName);                            
                            Log.e("", "=========================");
                            
                            CityTemp.setProvinceId(provinceId);
                            CityTemp.setCityId(cityId);
                            CityTemp.setCityName(cityName);
                            
                            CityArray.add(CityTemp);
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        break;
                    case XmlPullParser.END_DOCUMENT:
                        break;
                }

                //别忘了用next方法处理下一个事件，忘了的结果就成死循环#_#
                eventType = parser.next();
            }
        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return CityArray;
    }
}*/