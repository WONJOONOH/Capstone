# 식자재 가드 (Food Guard)

1.식자재 가드 소개
------------------------
사용자가 바코드 또는 제품명을 입력하여 나온 제품의 유통기한을 입력받아 해당 날짜가 다가옴에 따라 알림을 보내는 어플

2.문제
------------
### 2.1 필요성
```
음식물 쓰레기 관리 시스템 통계에 따르면 2017년 일평균 15,903톤이 발생한다고 합니다.
배출장소로는 많은 분들께서 집단급식소나 대형음식점을 생각 하시겠지만 놀랍게도 70%정도가 가정 및 소형 음식점에서 발생한다고 합니다.
또한 전체의 43%의 음식물 쓰레기가 먹고 남기거나 먹지 않고 보관중에 발생한다고 합니다.
특히 가정에서는 음식물쓰레기의 10%는 보관하다가 먹지 못하게 되어 버리는 식재료.
다시 말해, 유통기한이 지나 버려지는 식품이 가정에서만 10%가 된다는 이야기입니다.
저희는 이러한 문제점을 보고 이를 해결할 방법을 찾던 중 유통기한이 지나기 전에 알려주는 알리미 어플에 대해 생각을 가지게 되었습니다.
```
### 2.2 사례
```
기존 유사 프로젝트는 많지만 해당 어플과 같이 유통기한 알림 + 영양 정보를 알려주는 기능을 하는 어플은 없습니다.
- 유통기한 관리 : 유통기한이 다가옴에 따라 알림이 오게 할 수는 있지만 바코드 스캔을 통해 제품이름 및 사진을 가져오는 기능이 없으며, 
특이한 점으로 음식물의 보관 장소에 따른 카테고리가 나뉘어져 있었습니다.
- BEEP : 바코드 인식을 통해 제품명과 사진을 불러오는 기능과 유통기한이 다가옴에 따라 알림을 주는 방식은 같았으나, 소셜 로그인을 통해
기숙사와 같은 냉장고를 공유하는 상황에서 쓸 수 있는 팀 플레이 기능이 있었습니다.
```
### 2.3 간략한 작동 방식
![핵심 기능 1](https://user-images.githubusercontent.com/74997073/235429935-a57eadc7-99f3-49d4-8452-5e13d085bea2.PNG)
```
- 바코드를 읽어서 해당 제품의 이름과 영양정보를 알아온다.
```
![핵심 기능 2](https://user-images.githubusercontent.com/74997073/235429957-ec1a4e56-34cb-4e69-b7ca-7249f1561f10.PNG)
```
- 유통기한을 입력 받아서 해당 제품의 유통기한이 다가옴에 따라 알림을 보내는 기능을 수행한다.
```
![핵심 기능 3](https://user-images.githubusercontent.com/74997073/235429964-23f5eb20-062f-4f1a-9bd4-f2bcea8dc3c9.PNG)
```
- 바코드가 읽히지 않거나 없는 경우 제품명을 검색 또는 직접 입력할 수 있는 기능.
```

3.해결방법
-----------
### 3.1 시스템 아키텍쳐
![시스템 아키텍처](https://github.com/gfdsa8/Capstone/assets/74997073/cfef0205-e250-4dfe-ae2b-51ba233d3e2e)


### 3.2 데이터 수집방법
- (http://www.koreannet.or.kr/home/hpisSrchGtin.gs1?) 코리아넷
- (https://www.fatsecret.kr/%EC%B9%BC%EB%A1%9C%EB%A6%AC-%EC%98%81%EC%96%91%EC%86%8C/search?q=) Fatsecret
- (https://www.khidi.or.kr/kps/dhraStat/result5?menuId=MENU01657&gubun=sex&year=2020) 국민영양통계

```
- 바코드 스캔하여 제품 이름과 사진을 찾는 곳은  코리아넷으로 13자리 바코드를 입력하면 제품이름, 사진, 제조회사 등의 자료가 나온다.
- 제품명을 사용하여 영양정보를 가려올 곳은 Fatsecret으로 제품의 칼로리, 탄수화물, 단백질, 당, 나트륨, 지방 정보가 나온다.
- 오늘의 영양정보에서 나이, 성별을 입력받으면 일일 권장 영양소별 섭취량을 가져올 곳은 국민영양통계로
해당 성별과 나이에 맞는 칼로리, 탄수화물, 단백질, 당, 나트륨, 지방 등의 정보가 나온다.
```

### 3-3. 예상 결과
![어플 구상 1](https://user-images.githubusercontent.com/74997073/235430702-2318d700-0b05-413d-98b5-da2228d94b5e.PNG)
- 왼쪽부터 메인 화면, 음식 저장 카테고리 중 하나인 냉장실을 선택 했을 경우의 화면, 메인에서 "오늘의 영양"을 선택 했을 경우 나오는 화면
![어플 구상 2](https://user-images.githubusercontent.com/74997073/235430816-061f4a10-f2f1-4615-9cd8-4fe9ffb23ea6.PNG)
- 왼쪽부터 화면 왼쪽 위에 있는 메뉴 버튼을 눌렀을 경우 나오는 화면, 음식 저장 카테고리 화면 오른쪽 밑의 '+' 버튼을 눌렀을 경우 나오는 화면

![디자인](https://github.com/gfdsa8/Capstone/assets/74997073/714c939c-923d-4a3f-b15d-d025562d3eec)
- 2학기에 제작 중인 디자인

4.최종발표 이전까지 구현된 기능
![Screenshot_20231107_221942_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/0365ea57-85ed-468f-bcac-533946b4ca84)
- 메인 화면
![Screenshot_20231108_134032_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/7a84bc66-6fac-45ef-9bb2-43ee6b053df0)
- 카테고리 화면 (4개 중 1개)
![Screenshot_20231108_134028_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/6c0b46dd-739c-4dc6-ad6e-ae4637081ed2)
- 제품 추가하기 화면
![Screenshot_20231108_134023_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/805cf3a2-3936-47d7-b35c-1910b629fccb)
- 직접 입력 기능 (영양소 입력 창)
![Screenshot_20231108_134012_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/b3d2257a-0a45-47da-a36b-64eb1a1e8060)
- 바코드 스캔 화면
![Screenshot_20231108_143004_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/57dfcd8d-568f-4cb4-b6e3-10d927132bb6)
- 제품명 검색 화면
![Screenshot_20231108_134036_Food Guard](https://github.com/gfdsa8/Capstone/assets/74997073/85a9e788-311b-443d-94ca-8d729b6502ba)
- 오늘의 영양 화면
