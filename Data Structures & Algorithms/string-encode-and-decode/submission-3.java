class Solution {

    public String encode(List<String> strs) {


        StringBuffer encodedStr = new StringBuffer();

        for(String str: strs){

            encodedStr = encodedStr.append(str.length());
            encodedStr = encodedStr.append("#");
            encodedStr = encodedStr.append(str);
        }

        return encodedStr.toString();

    }

    public int findLength(String str){

        int i = 0;
        for(char c : str.toCharArray()){
            if( c != '#'){
                i++;
            }else {
                break;
            }
        }

        return Integer.parseInt(str.substring(0,i));

    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strs = new ArrayList<>();
        while( i < str.length()){

            int currStrLength = findLength(str.substring(i));
            int init = i+1+String.valueOf(currStrLength).length();
            strs.add(str.substring(init, init+currStrLength));
            i = init+currStrLength;

        }
        return strs;

    }
}
