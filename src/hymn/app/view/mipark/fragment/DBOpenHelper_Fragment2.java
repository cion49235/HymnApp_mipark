package hymn.app.view.mipark.fragment;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBOpenHelper_Fragment2 extends SQLiteOpenHelper {
	public static String [] title = {
			"001 만복의 근원 하나님     ",
		    "002 찬양 성부 성자 성령    ",
		    "003 성부 성자와 성령       ",
		    "004 성부 성자와 성령       ",
		    "005 이 천지간 만물들아     ",
		    "006 목소리 높여서    ",
		    "007 성부 성자 성령   ",
		    "008 거룩 거룩 거룩   ",
		    "009 하늘에 가득찬    ",
		    "010 전능왕 오셔서    ",
		    "011 홀로 한분 하나님께    ",
		    "012 다 함께 주를 경배하세 ",
		    "013 영원한 하늘 나라 ",
		    "014 주 우리 하나님   ",
		    "015 하나님의 크신 사랑    ",
		    "016 은혜로신 하나님  ",
		    "017 사랑의 하나님    ",
		    "018 성도들아 찬양하자",
		    "019 찬송하는 소리 있어    ",
		    "020 큰 영광중에 계신 주   ",
		    "021 다 찬양 하여라   ",
		    "022 만유의 주 앞에   ",
		    "023 만입이 내게 있으면    ",
		    "024 왕되신 주 다 찬양하여라    ",
		    "025 면류관 벗어서    ",
		    "026 구세주를 아는 이들    ",
		    "027 빛나고 높은 보좌와    ",
		    "028 복의 근원 강림하사    ",
		    "029 성도여 다 함께   ",
		    "030 전능하고 놀라우신",
		    "031 찬양하라 복되신 구세주 예수",
		    "032 만유의 주재 ",
		    "033 영광스런 주를 보라    ",
		    "034 참 놀랍도다 주 크신 이름   ",
		    "035 큰 영화로신 주   ",
		    "036 주 예수 이름 높이어   ",
		    "037 주 예수 이름 높이어   ",
		    "038 예수 우리 왕이여 **   ",
		    "039 주 은혜를 받으려 ",
		    "040 찬송으로 보답할 수 없는    ",
		    "041 내 영혼아 주 찬양하여라    ",
		    "042 거룩한 주님께    ",
		    "043 즐겁게 안식할 날 ",
		    "044 지난 이레 동안에 ",
		    "045 거룩한 주의 날   ",
		    "046 이 날은 주님 정하신   ",
		    "047 하늘이 푸르고    ",
		    "048 거룩하신 주 하나님    ",
		    "049 하나님이 언약하신",
		    "050 내게 있는 모든 것을   ",
		    "051 주님 주신 거룩한 날   ",
		    "052 거룩하신 나의 하나님  ",
		    "053 성전을 떠나 가기전    ",
		    "054 주여 복을 구하오니    ",
		    "055 주의 이름으로 모였던  ",
		    "056 우리의 주여 폐회하기 전    ",
		    "057 오늘 주신 말씀에 ",
		    "058 지난밤에 보호하사",
		    "059 하나님 아버지    ",
		    "060 영혼의 햇빛 예수님    ",
		    "061 우리가 기다리던  ",
		    "062 고요히 머리숙여  ",
		    "063 주가 세상을 다스리니  ",
		    "064 기뻐하며 경배하세",
		    "065 내 영혼아 찬양하라    ",
		    "066다 감사드리세",
		    "067 영광의 왕께 다 경배하며    ",
		    "068 오 하나님 우리의 창조주시니",
		    "069 온 천하 만물 우러러   ",
		    "070 피난처 있으니    ",
		    "071 예부터 도움되시고",
		    "072 만왕의 왕앞에 나오라  ",
		    "073 내 눈을들어 두루 살피니    ",
		    "074 오 만세 반석이신 ",
		    "075 주여 우리 무리를 ",
		    "076 창조주 아버지께  ",
		    "077 거룩하신 하나님  ",
		    "078 저 높고 푸른 하늘과   ",
		    "079 주 하나님 지으신 모든 세계 ",
		    "080 천지에 있는 이름중    ",
		    "081 주는 귀한 보배   ",
		    "082 성부의 어린양이  ",
		    "083 나의 맘에 근심 구름   ",
		    "084 온 세상이 캄캄하여서  ",
		    "085 구주를 생각만 해도    ",
		    "086 내가 늘 의지하는 예수 ",
		    "087 내 주님 입으신   ",
		    "088 내 진정 사모하는 ",
		    "089 샤론의 꽃 예수   ",
		    "090 주 예수 내가 알기전   ",
		    "091 슬픈 마음 있는 사람   ",
		    "092 위에 계신 나의 친구   ",
		    "093 예수는 나의 힘이요    ",
		    "094 주 예수보다 더   ",
		    "095 나의 기쁨 나의 소망되시며  ",
		    "096 예수님은 누구신가",
		    "097 정혼한 처녀에게  ",
		    "098 예수님 오소서    ",
		    "099 주님 앞에 떨며 서서   ",
		    "100 미리암의 여인들이",
		    "101 이새의 뿌리에서  ",
		    "102 영원한 문아 열려라    ",
		    "103 우리 주님 예수께 ",
		    "104 곧 오소서  임마누엘   ",
		    "105 오랫동안 기다리던",
		    "106 아기예수 나셨네  ",
		    "107 거룩한 밤 복된 이 밤  ",
		    "108 그 어린 주 예수  ",
		    "109 고요한 밤 거룩한 밤   ",
		    "110 고요하고 거룩한 밤    ",
		    "111 귀중한 보배합을  ",
		    "112 그 맑고 환한 밤중에   ",
		    "113 저 아기 잠이 들었네   ",
		    "114 그 어린 주 예수  ",
		    "115 기쁘다 구주 오셨네    ",
		    "116 동방에서 박사들  ",
		    "117 만백성 기뻐하여라",
		    "118 영광 나라 천사들아    ",
		    "119 옛날 임금 다윗성에    ",
		    "120 오 베들레헴 작은골    ",
		    "121 우리 구주 나신날 ",
		    "122 참 반가운 성도여 ",
		    "123 저 들밖에 한 밤중에   ",
		    "124 양지키는 목자여  ",
		    "125 천사들의 노래가  ",
		    "126 천사 찬송하기를  ",
		    "127 그 고요하고 쓸쓸한    ",
		    "128 거룩하신 우리 주님    ",
		    "129 마리아는 아기를  ",
		    "130 찬란한 주의 영광은    ",
		    "131 다나와 찬송부르세",
		    "132 주의 영광 빛나니 ",
		    "133 하나님 말씀으로  ",
		    "134 나 어느날 꿈속을 헤매며    ",
		    "135 어저께나 오늘이나",
		    "136 가나안의 혼인잔치",
		    "137 하나님의 아들이  ",
		    "138 햇빛을 받는 곳마다    ",
		    "139 오 영원한 내 주 예수  ",
		    "140 왕되신 우리 주께 ",
		    "141 호산나 호산나    ",
		    "142 시온에 오시는 주 ",
		    "143 웬 말인가 날 위하여   ",
		    "144 예수 나를 위하여 ",
		    "145 오 거룩하신 주님 ",
		    "146 저 멀리 푸른 언덕에   ",
		    "147 거기 너 있었는가 ",
		    "148 영화로운 주 예수의    ",
		    "149 주 달려 죽은 십자가   ",
		    "150 갈보리산 위에    ",
		    "151 만왕의 왕 내 주께서   ",
		    "152 귀하신 예수 정죄 당하심은  ",
		    "153 가시 면류관 가시 면류관    ",
		    "154 생명의 주여 면류관    ",
		    "155 십자가 지고 주님 가신 길   ",
		    "156 머리에 가시관    ",
		    "157 겟세마네 동산에서",
		    "158 서쪽하늘 붉은 노을    ",
		    "159 기뻐 찬송하세    ",
		    "160 무덤에 머물러    ",
		    "161 할렐루야 우리 예수    ",
		    "162 부활하신 구세주  ",
		    "163 할렐루야 할렐루야",
		    "164 예수 부활 했으니 ",
		    "165 주님께 영광 ",
		    "166 할렐루야 할렐루야",
		    "167 즐겁도다 이 날   ",
		    "168 하늘에 찬송이    ",
		    "169 사망의 권세가    ",
		    "170 내 주님은 살아계셔    ",
		    "171 하나님의 독생자 예수  ",
		    "172 사망을 이긴 주   ",
		    "173 다 함께 찬송부르자    ",
		    "174 대속하신 구주께서",
		    "175 신랑되신 예수께서",
		    "176 주 어느때 다시 오실는지    ",
		    "177 오랫동안 고대하던",
		    "178 주 예수 믿는자여 ",
		    "179 주 예수의 강림이 ",
		    "180 하나님의 나팔소리",
		    "181 부활 승천하신 주께서  ",
		    "182 강물같이 흐르는 기쁨  ",
		    "183 빈들에 마른 풀같이    ",
		    "184 불길 같은 주 성령",
		    "185 이기쁜 소식을    ",
		    "186 영화로신 주 성령 ",
		    "187 비둘기 같이 온유한    ",
		    "188 무한하신 주 성령 ",
		    "189 진실하신 주 성령 ",
		    "190 성령이여 강림하사",
		    "191 내가 매일 기쁘게 ",
		    "192 임하소서 임하소서",
		    "193 성령의 봄바람 불어오니",
		    "194 저 하늘 거룩하신 주여 ",
		    "195 성령이여 우리 찬송부를 때  ",
		    "196 성령의 은사를    ",
		    "197 은혜가 풍성한 하나님은",
		    "198 하나님 아버지 주신책은",
		    "199 나의 사랑하는 책 ",
		    "200 달고 오묘한 그 말씀   ",
		    "201 참 사람되신 말씀 ",
		    "202 하나님 아버지 주신 책은    ",
		    "203 하나님의 말씀은  ",
		    "204 주의 말씀 듣고서 ",
		    "205 주 예수 크신 사랑",
		    "206 주님의 귀한 말씀은    ",
		    "207 귀하신 주님 계신곳    ",
		    "208 내 주의 나라와   ",
		    "209 이 세상 풍파 심하고   ",
		    "210 시온성과 같은 교회    ",
		    "211 값비싼 향유를    ",
		    "212 겸손히 주를 섬길때    ",
		    "213 나의 생명 드리니 ",
		    "214 나 주의 도움 받고자   ",
		    "215 내 죄 속해주신 주께   ",
		    "216 성자의 귀한몸    ",
		    "217 하나님이 말씀하시기를 ",
		    "218 네 맘과 정성을 다하여서    ",
		    "219 주 하나님의 사랑은    ",
		    "220 사랑하는 주님앞에",
		    "221 주 믿는 형제들   ",
		    "222 우리 다시 만날때까지  ",
		    "223 하나님은 우리들의",
		    "224 정한 물로 우리 죄를   ",
		    "225 실로암 샘물가에 핀    ",
		    "226 성령으로 세례받아",
		    "227 주 앞에 성찬받기 위하여    ",
		    "228 오 나의 주님 친히 뵈오니   ",
		    "229 아무 흠도 없고   ",
		    "230 우리의 참되신 구주시니",
		    "231 우리 다같이 무릎 꿇고서    ",
		    "232 유월절 때가 이르러    ",
		    "233 자비로 몸 찢기시고    ",
		    "234 구주 예수 그리스도    ",
		    "235 보아라 즐거운 우리집  ",
		    "236 우리 모든 수고끝나    ",
		    "237 저 건너편 강언덕에    ",
		    "238 해지는 저편 새 하늘에는    ",
		    "239 저 뵈는 본향집   ",
		    "240 주가 맡긴 모든 역사   ",
		    "241 아름다운 본향 천국 바라보며",
		    "242 황무지가 장미꽃같이   ",
		    "243 저 요단강 건너편에    ",
		    "244 구원받은 천국의 성도들",
		    "245 저 좋은 낙원 이르니   ",
		    "246 나 가나안 땅 귀한 성에",
		    "247 보아라 저 하늘에 ",
		    "248 언약의 주 하나님 ",
		    "249 주 사랑하는 자   ",
		    "250 구주의 십자가 보혈로  ",
		    "251 놀랍다 주님의 큰 은혜 ",
		    "252 나의 죄를 씻기는 ",
		    "253 그 자비하신 주님 ",
		    "254 내 주의 보혈은   ",
		    "255 너희죄 흉악하나  ",
		    "256 나의 죄 모두 지신 주님",
		    "257 마음에 가득한    ",
		    "258 샘물과 같은 보혈은    ",
		    "259 예수 십자가에 흘린 피로써  ",
		    "260 우리를 죄에서 구하시려",
		    "261 이 세상의 모든 죄를   ",
		    "262 날 구원하신 예수님    ",
		    "263 이 세상 험하고   ",
		    "264 정결하게 하는 샘이    ",
		    "265 주 십자가를 지심으로  ",
		    "266 주의 피로 이룬 샘물   ",
		    "267 주의 확실한 약속의    ",
		    "268 죄에서 자유를 얻게 함은    ",
		    "269 그 참혹한 십자가에    ",
		    "270 변챦는 주님의 사랑과  ",
		    "271 나와 같은 죄인위해    ",
		    "272 고통의 멍에 벗으려고  ",
		    "273 나 주를 멀리 떠났다   ",
		    "274 나 행한것 죄 뿐이니   ",
		    "275 날마다 주와 멀어져    ",
		    "276 아버지여 이 죄인을    ",
		    "277 양떼를 떠나서    ",
		    "278 여러해 동안 주 떠나   ",
		    "279 인애하신 구세주여",
		    "280 천부여 의지 없어서    ",
		    "281 요나처럼 순종않고",
		    "282 큰 죄에 빠진 날 위해  ",
		    "283 나 속죄함을 받은 후   ",
		    "284 오랫동안 모든    ",
		    "285 주의 말씀 받은 그 날  ",
		    "286 주 예수님 내 맘에 오사",
		    "287 예수 앞에 나오면 ",
		    "288 예수로 나의 구주삼고  ",
		    "289 주 예수 내맘에   ",
		    "290 우리는 주님을 늘 배반하나  ",
		    "291 외롭게 사는이 그 누군가    ",
		    "292 주 없이 살 수 없네    ",
		    "293 주의 사랑 비칠때에    ",
		    "294 하나님은 외아들을",
		    "295 큰 죄에 빠진 나를",
		    "296 죄인 구원하시려고",
		    "297 양 아흔 아홉 마리는   ",
		    "298 속죄하신 구세주를",
		    "299 하나님 사랑은    ",
		    "300 내 맘이 낙심되며 ",
		    "301 지금까지 지내온 것    ",
		    "302 내 주 하나님 넓고 큰 은혜는",
		    "303 날 위하여 십자가의    ",
		    "304 그 크신 하나님의 사랑 ",
		    "305 나 같은 죄인 살리신   ",
		    "306 죽을 죄인 살려주신    ",
		    "307 소리없이 보슬 보슬    ",
		    "308 내 평생 살아온 길",
		    "309 목마른 내 영혼   ",
		    "310 아 하나님의 은혜로    ",
		    "311 내 너를 위하여   ",
		    "312 너 하나님께 이끌리어  ",
		    "313 내 임금 예수 내 주여  ",
		    "314 내 구주 예수를 더욱 사랑   ",
		    "315 내 주 되신 주를 참 사랑하고",
		    "316 주여 나의 생명   ",
		    "317 내 주 예수 주신 은혜  ",
		    "318 순교자의 흘린피가",
		    "319 말씀으로 이 세상을    ",
		    "320 나의 죄를 정케하사    ",
		    "321 날 대속하신 예수께    ",
		    "322 세상의 헛된 신을 버리고    ",
		    "323 부름받아 나선 이 몸   ",
		    "324 예수 나를 오라하네    ",
		    "325 예수가 함께 계시니    ",
		    "326 내 죄를 회개하고 ",
		    "327 주님 주실 화평   ",
		    "328 너 주의 사람아   ",
		    "329 주 날 불러 이르소서   ",
		    "330 어둔밤 쉬 되리니 ",
		    "331 영광을 받으신 만유의 주여  ",
		    "332 우리는 부지런한  ",
		    "333 충성하라 죽도록  ",
		    "334 위대하신 주를    ",
		    "335 크고 놀라운 평화가    ",
		    "336 환난과 핍박 중에도    ",
		    "337 내 모든 시험 무거운 짐을   ",
		    "338 내 주를 가까이 하게 함은   ",
		    "339 내 주님지신 십자가    ",
		    "340 어지러운 세상 중에    ",
		    "341 십자가를 내가 지고    ",
		    "342 너 시험을 당해   ",
		    "343 시험을 받을때에  ",
		    "344 믿음으로 가리라  ",
		    "345 캄캄한 밤 사나운 바람불때  ",
		    "346 주 예수 우리 구하려   ",
		    "347 허락하신 새 땅에 ",
		    "348 마귀들과 싸울지라",
		    "349 나는 예수 따라가는    ",
		    "350 우리들이 싸울것은",
		    "351 믿는 사람들은    ",
		    "352 십자가 군병들아  ",
		    "353 십자가 군병되어서",
		    "354 주를 앙모하는 자 ",
		    "355 다같이 일어나    ",
		    "356 주 예수 이름 소리 높여",
		    "357 주 믿는사람 일어나    ",
		    "358 주의 진리 위해   ",
		    "359 천성을 향해 가는 성도들아  ",
		    "360 행군 나팔 소리에 ",
		    "361 기도하는 이 시간 ",
		    "362 주여 복을 주시기를    ",
		    "363 내가 깊은 곳에서 ",
		    "364 내 기도하는 그 시간   ",
		    "365 마음속에 근심있는 사람",
		    "366 어두운 내 눈 밝히사   ",
		    "367 인내하게 하소서  ",
		    "368 주 예수여 은혜를 ",
		    "369 죄짐 맡은 우리 구주   ",
		    "370 주 안에 있는 나에게   ",
		    "371 구주여 광풍이 불어    ",
		    "372 그 누가 나의 괴롬알며 ",
		    "373 고요한 바다로    ",
		    "374 나의 믿음 약할 때",
		    "375 나는 갈 길 모르니",
		    "376 나그네와 같은 내가    ",
		    "377 전능하신 주 하나님    ",
		    "378 내 선한 목자",
		    "379 내 갈 길 멀고 밤은 깊은데  ",
		    "380 나의 생명 되신 주",
		    "381 나 캄캄한 밤 죄의 길에",
		    "382 너 근심 걱정 말아라   ",
		    "383 눈을 들어 산을 보니   ",
		    "384 나의 갈길 다 가도록   ",
		    "385 못박혀 죽으신 하나님  ",
		    "386 만세 반석 열린 곳에   ",
		    "387 멀리 멀리 갔더니 ",
		    "388 비바람이 칠때와  ",
		    "389 내게로 오라 하신 ",
		    "390 예수가 거느리시니",
		    "391 오 놀라운 구세주 예수 내 주",
		    "392 주여 어린 사슴이 ",
		    "393 오 신실하신 주   ",
		    "394 이 세상의 친구들 ",
		    "395 자비하신 예수여  ",
		    "396 우리 주님 밤새워 ",
		    "397 주 사랑안에 살면 ",
		    "398 어둠의 권세에서  ",
		    "399 어린양들아 두려워 말아라   ",
		    "400 험한 시험 물속에서    ",
		    "401 주의 곁에 있을때 ",
		    "402 나의 반석 나의 방패   ",
		    "403 영원하신 주님의  ",
		    "404 바다에 놀이 일때에    ",
		    "405 주의 친절한 팔에 안기세    ",
		    "406 곤한 내 영혼 편히 쉴곳과   ",
		    "407 구주와 함께 나 죽었으니    ",
		    "408 나 어느곳에 있든지    ",
		    "409 나의 기쁨은 사랑의    ",
		    "410 내 맘에 한 노래 있어  ",
		    "411 아 내 맘 속에    ",
		    "412 내 영혼의 그윽히 깊은데서  ",
		    "413 내 평생의 가는 길",
		    "414 이 세상은 요란하나    ",
		    "415 십자가 그늘 아래 ",
		    "416 너희 근심 걱정을 ",
		    "417 주 예수 넓은 품에",
		    "418 기쁠때나 슬플때나",
		    "419 주 날개 밑 내가  ",
		    "420 너 성결키 위해   ",
		    "421 내가 예수 믿고서 ",
		    "422 거룩하게 하소서  ",
		    "423 먹 보다도 더 검은",
		    "424 아버지여 나의 맘을    ",
		    "425 주님의 뜻을 이루소서  ",
		    "426 이 죄인을 완전케 하시옵고  ",
		    "427 맘 가난한 사람 복이 있나니 ",
		    "428 내 영혼에 햇빛 비치니 ",
		    "429 세상 모든 풍파 너를 흔들어 ",
		    "430 주와 같이 길 가는것   ",
		    "431 주 안에 기쁨있네 ",
		    "432 큰 물결이 설레는 ",
		    "433 귀하신 주여 날 붙드사 ",
		    "434 귀하신 친구 내게 계시니    ",
		    "435 나의 영원하신 기업    ",
		    "436 나이제 주님의 새생명 얻은몸",
		    "437 하늘 보좌 떠나서 ",
		    "438 내 영혼이 은총 입어   ",
		    "439 십자가로 가까이  ",
		    "440 어디든지 예수 나를 이끌면  ",
		    "441 은혜구한 내게 은혜의 주님  ",
		    "442 저 장미꽃 위에 이슬   ",
		    "443 아침 햇살 비칠 때",
		    "444 겟세마네 동산에서",
		    "445 태산을 넘어 험곡에 가도    ",
		    "446 주 음성 외에는   ",
		    "447 이 세상 끝날까지 ",
		    "448 주님 가신 길을 따라   ",
		    "449 예수 따라가며    ",
		    "450 내 평생 소원 이것뿐   ",
		    "451 예수 영광 버리사 ",
		    "452 내 모든 소원 기도의 제목   ",
		    "453 예수 더 알기 원함은   ",
		    "454 주와 같이 되기를 ",
		    "455 주님의 마음을 본받는 자    ",
		    "456 거친 세상에서 실패하거든   ",
		    "457 겟세마네 동산의  ",
		    "458 너희 마음에 슬픔이 가득차도",
		    "459 누가 주를 따라 섬기려는가  ",
		    "460 뜻없이 무릎 꿇는 ",
		    "461 십자가를 질 수 있나   ",
		    "462 생명 진리 은혜 되신   ",
		    "463 신자 되기 원합니다    ",
		    "464 믿음의 새빛을    ",
		    "465 주 믿는 나  ",
		    "466 죽기까지 사랑하신 주  ",
		    "467 높으신 주께서    ",
		    "468 큰 사랑의 새 계명을   ",
		    "469 내 주 하나님",
		    "470 나의 몸이 상하여 ",
		    "471 주여 나의 병든 몸을   ",
		    "472 네 병든 손 내밀라고   ",
		    "473 괴로움과 고통을  ",
		    "474 의원되신 예수님의",
		    "475 인류는 하나되게  ",
		    "476 꽃이 피고 새가 우는   ",
		    "477 하나님이 창조하신",
		    "478 참 아름다워라    ",
		    "479 괴로운 인생길 가는 몸이    ",
		    "480 천국에서 만나보자",
		    "481 때 저물어서 날이 어두니    ",
		    "482 참 즐거운 노래를 ",
		    "483 구름 같은 이 세상",
		    "484 내 맘의 주여 소망되소서    ",
		    "485 세월이 흘러 가는데    ",
		    "486 이 세상에 근심된 일이 많고 ",
		    "487 어두움 후에 빛이 오며 ",
		    "488 이 몸의 소망 무엔가   ",
		    "489 저 요단강 건너편에    ",
		    "490 주여 지난 밤 내 꿈에  ",
		    "491 저 높은 곳을 향하여   ",
		    "492 잠시 세상에 내가 살면서    ",
		    "493 하늘가는 밝은 길이    ",
		    "494 만세 반석 열리니 ",
		    "495 익은곡식 거둘자가",
		    "496 새벽부터 우리    ",
		    "497 주 예수 넓은 사랑",
		    "498 저 죽어가는 자   ",
		    "499 흑암에 사는 백성들을 보라  ",
		    "500 물 위에 생명줄 던지어라    ",
		    "501 너 시온아 이 소식",
		    "502 빛의 사자들이여  ",
		    "503 세상 모두 사랑 없어   ",
		    "504 주님의 명령 전할 사자여    ",
		    "505 온 세상 위하여   ",
		    "506 땅끝까지 복음을  ",
		    "507 저 북방 얼음산과 ",
		    "508 우리가 지금은    ",
		    "509 기쁜 일이 있어   ",
		    "510 하나님의 진리 등대    ",
		    "511 예수 말씀 하시기를    ",
		    "512 천성길을 버리고  ",
		    "513 헛된 욕망 길을 가며   ",
		    "514 먼동 튼다 일어나라    ",
		    "515 눈을 들어 하늘 보라   ",
		    "516 옳은 길 따르라 의의 길을   ",
		    "517 가난한 자 돌봐주며    ",
		    "518 기쁜 소리 들리니 ",
		    "519 구주께서 부르되  ",
		    "520 듣는 사람마다 복음 전하여  ",
		    "521 구원으로 인도하는",
		    "522 웬일인가 내 형제여    ",
		    "523 어둔 죄악 길에서 ",
		    "524 갈 길을 밝히 보이시니 ",
		    "525 돌아와 돌아와    ",
		    "526 목마른 자들아    ",
		    "527 어서 돌아오오    ",
		    "528 예수가 우리를 부르는 소리  ",
		    "529 온유한 주님의 음성    ",
		    "530 주께서 문에 오셔서    ",
		    "531 자비한 주께서 부르시네",
		    "532 주께로 한 걸음씩 ",
		    "533 우리 주 십자가   ",
		    "534 주님 찾아 오셨네 ",
		    "535 주 예수 대문 밖에",
		    "536 죄짐에 눌린 사람은    ",
		    "537 형제여 지체 말라 ",
		    "538 죄 짐을 지고서 곤하거든    ",
		    "539 너 예수께 조용히 나가 ",
		    "540 주의 음성을 내가 들으니    ",
		    "541 꽃이 피는 봄날에만    ",
		    "542 구주 예수 의지함이    ",
		    "543 어려운 일 당할때 ",
		    "544 울어도 못하네    ",
		    "545 이 눈에 아무 증거 아니 뵈어도   ",
		    "546 주님 약속하신 말씀위에 서  ",
		    "547 나 같은 죄인까지도    ",
		    "548 날 구속하신 주께 엎드려    ",
		    "549 내 주여 뜻대로   ",
		    "550 시온의 영광이 빛나는 아침  ",
		    "551 오늘까지 복과 은혜    ",
		    "552 아침 해가 돋을 때",
		    "553 새해 아침 환희 밝았네 ",
		    "554 종소리 크게 울려라    ",
		    "555 우리 주님 모신 가정   ",
		    "556 날마다 주를 의지하는  ",
		    "557 에덴의 동산처럼  ",
		    "558 미더워라 주의 가정    ",
		    "559 사철에 봄바람 불어 잇고    ",
		    "560 발자취를 따름이  ",
		    "561 예수님의 사랑은  ",
		    "562 예루살렘 아이들  ",
		    "563 예수 사랑하심을  ",
		    "564 예수께서 오실 때에    ",
		    "565 예수께로 가면 나는기뻐요   ",
		    "656 사랑의 하나님    ",
		    "567 다정하신 목자 예수    ",
		    "568 하나님은 나의 목자시니",
		    "569 선한 목자 되신 우리 주",
		    "570 주는 나를 기르시는 목자요  ",
		    "571 역사 속에 보냄 받아   ",
		    "572 바다같이 넓은 은혜    ",
		    "573 말씀에 순종하여  ",
		    "574 가슴마다 파도 친다    ",
		    "575 주님께 귀한것 드려    ",
		    "576 하나님의 뜻을 따라    ",
		    "577 낳으시고 길러주신",
		    "578 언제나 바라봐도  ",
		    "579 어머니의 넓은 사랑    ",
		    "580 삼천리 반도 금수강산  ",
		    "581 주 하나님 이 나라를   ",
		    "582 어둔밤 마음에 잠겨    ",
		    "583 이 민족에 복음을 ",
		    "584 우리나라 지켜주신",
		    "585 내 주는 강한 성이요   ",
		    "586 어느 민족 누구게나    ",
		    "587 감사하는 성도여  ",
		    "588 공중 나는 새를 보라   ",
		    "589 넓은 들에 익은 곡식   ",
		    "590 논밭에 오곡백과  ",
		    "591 저 밭에 농부 나가",
		    "592 산마다 불이탄다  ",
		    "593 아름다운 하늘과  ",
		    "594 감사하세 찬양하세",
		    "595 나 맡은 본분은   ",
		    "596 영광은 주님 홀로 ",
		    "597 이전에 주님을 내가 몰라    ",
		    "598 천지 주관하는 주님    ",
		    "599 우리의 기도를    ",
		    "600 교회의 참된 터는 ",
		    "601 하나님이 정하시고",
		    "602 성부님께 빕니다  ",
		    "603 태초에 하나님이  ",
		    "604 완전한 사랑 ",
		    "605 오늘 모여 찬송함은    ",
		    "606 해보다 더 밝은 저 천국",
		    "607 내 본향 가는 길 보이도다   ",
		    "608 후일에 생명 그칠 때   ",
		    "609 이 세상 살때에   ",
		    "610 고생과 수고가 다 지난후    ",
		    "611 주님 오라 부르시어    ",
		    "612 이 땅에서 주를 위해   ",
		    "613 사랑의 주 하나님 ",
		    "614 얼마나 아프셨나  ",
		    "615 그 큰 일을 행하신",
		    "616 주를 경배하리    ",
		    "617 주님을 찬양합니다",
		    "618 나 주님을 사랑합니다  ",
		    "619 놀라운 그 이름   ",
		    "620 여기에 모인 우리 ",
		    "621 찬양하라 내 영혼아    ",
		    "622 거룩한 밤 별빛이 찬란하다  ",
		    "623 주님의 시간에    ",
		    "624 우리 모두 찬양해 ",
		    "625 거룩 거룩 거룩한 하나님    ",
		    "626 만민들아 경배하라",
		    "627 할렐루야 할렐루야",
		    "628 아멘 아멘 아멘   ",
		    "629 거룩 거룩 거룩   ",
		    "630 진리와 생명 되신 주   ",
		    "631 우리 기도를 들어주시고",
		    "632 주여 주여 우리를 불쌍히    ",
		    "633 나의 하나님 받으소서  ",
		    "634 모든 것이 주께로부터  ",
		    "635 하늘에 계신 아버지    ",
		    "636 하늘에 계신 우리 아버지    ",
		    "637 주님 우리의 마음을 여시어  ",
		    "638 주 너를 지키시고 ",
		    "639 주 함께 하소서   ",
		    "640 두번 아멘",
		    "641 두번 아멘",
		    "642 두번 아멘",
		    "643 세번 아멘",
		    "644 네번 아멘",
		    "645 일곱번 아멘"
	};
	public DBOpenHelper_Fragment2(Context context) {
		super(context, "twentyone_hymn.db", null, 2);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
			String createtable = "create table twentyone_hymn( _id integer primary key autoincrement,"+
			"title text, description integer);";
			db.execSQL(createtable);
			for(int i = 0; i < 645; i++){
				db.execSQL("insert into twentyone_hymn values (null,'"+title[i]+"', 2)");
			}
	}		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               		
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		boolean check_DB = false;
		Cursor cursor = db.rawQuery("select * from twentyone_hymn", null);
		while(cursor.moveToNext()){
			if((cursor.getString(cursor.getColumnIndex("title")).equals("640 두번 아멘"))){
				check_DB = true;
				break;		
			}
		}
		if(check_DB == false){
			db.execSQL("insert into twentyone_hymn values (null,'640 두번 아멘','2')");
			db.execSQL("insert into twentyone_hymn values (null,'641 두번 아멘','2')");
			db.execSQL("insert into twentyone_hymn values (null,'642 두번 아멘','2')");
			db.execSQL("insert into twentyone_hymn values (null,'643 세번 아멘','2')");
			db.execSQL("insert into twentyone_hymn values (null,'644 네번 아멘','2')");
			db.execSQL("insert into twentyone_hymn values (null,'645 일곱번 아멘','2')");
		}
	}
}