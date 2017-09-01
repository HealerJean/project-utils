package com.hlj.xml;
/*package com.hlj.xml;


public class CityPullParse {

    public static ArrayList<City> Parse(String CityString){
        ArrayList<City> CityArray = new ArrayList<City>();

        try {
            //���幤�� XmlPullParserFactory
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

            //��������� XmlPullParser
            XmlPullParser parser = factory.newPullParser();

            //��ȡxml��������
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
            //��ʼ�����¼�
            int eventType = parser.getEventType();

            //�����¼����������ĵ�������һֱ����
            while (eventType != XmlPullParser.END_DOCUMENT) {
                //��Ϊ������һ�Ѿ�̬�������������������switch
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:

                        //����ǰ��ǩ�������
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

                //��������next����������һ���¼������˵Ľ���ͳ���ѭ��#_#
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