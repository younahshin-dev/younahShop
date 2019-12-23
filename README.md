# [문제] 장바구니 구현하기

## 문제

- 다음 데이터셋을 보고 **상품 리스트 웹 페이지**와 **장바구니 웹 페이지**를 구현해 주세요
    - link: [클릭](#file-goods-json)
- 상품 리스트 페이지
    - 상품 리스트를 조회할 수 있다.
    - 단일 상품을 장바구니에 추가할 수 있다.
- 장바구니 페이지
    - 현재 장바구니에 담긴 상품들을 조회할 수 있다.
    - 현재 장바구니에 담긴 상품들을 N개 구매할 수 있다.
    - 현재 장바구니에 담긴 상품들을 N개 제거할 수 있다.
    - 최종 결제 금액을 조회 할 수 있다.

## 주의 사항

- 사용 언어에 대한 제약은 없습니다.
- 데이터셋 json 파일(goods.json)을 보고 데이터베이스(DBMS)를 구성하여 구현해주세요.
- 모든 기능을 모두 구현할 필요도 없습니다. 반대로 시간이 더 필요하시면 말씀(연락)해주세요.
- 그 외에 필요하다고 생각되는 기능을 추가 개발하셔도 좋습니다.
- 제출한 프로젝트를 다른 개발자가 로컬환경에서 셋팅 하는 것을 가정해주세요. 따라서 README 파일에 어플리케이션 실행 방법에 대한 설명을 작성해야 합니다.

## 평가기준

- 웹 서비스에 대한 이해가 있는지를 평가합니다.
- 문제의 전체 기능이 구현이 안 되어도 무관합니다. 하지만 결과물은 작동해야 합니다.
- 코드는 방어적으로 작성해야 합니다. (예외 처리, 타입 처리, ..etc)
- 코드는 의미적으로 분리되어야 합니다.
- Git의 commit message는 의미를 가져야 합니다.
- 결과물에 대해 아무것도 모르는 개발자도 프로그램을 구동할 수 있도록 구동방법을 자세히 설명해야 합니다.
- Docker를 사용하여 환경 구성 시 가산점이 있습니다.

## 제출 방법

- Git 사용을 권장합니다.
- 결과물은 이메일을 통해 repository url 혹은 zip 파일로 전달해주세요.
- 보내실 메일 주소는 rokee@stylesha.re 입니다.

## **데이터에 대한 (goods.json) 설명**
```
{
  "goods":[
    {
      // 상품 ID
      "id": 1,
      
      // 상품 이름
      "name": "goods_name",
      
      // 입점사(상품 등록자) 이름
      "provider": "styleShare",
      
      // 상품 가격
      "price": 20000,
      
      // 상품 옵션
      "options": [
        {
          // 옵션 ID
          "id": 1001,

          // 옵션 제목: 옵션명
          "color": "yellow", 

          // 옵션제목: 옵션명
          "size": "S",

          // 재고
          "stock": 10 
        }
      ],
      // 배송정책
      "shipping": { 

        // 배송비 부과 여부. 
        //  - 무료배송(`FREE`), 유료배송(`PREPAY`).
        "method": "{FREE | PREEPAY}", 

        // 배송비
        "price": 0,

        // 같은 입점사 상품의 묶음배송 가능 여부, 
        // - 가능시 묶음배송가능한 상품의 배송비는 한번만 부과. 
        // - 묶음 배송가능 상품들의 배송 비용이 다를경우 최저금액을 적용. 
        // - 불가능시 상품마다 배송비 부과
        "canBundle": true
      }
    }
  ]
}
```
