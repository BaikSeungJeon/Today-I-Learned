# PathVariable & QueryString

<code>PathVariable</code>과 <code>QueryString</code>은 모두 GET 요청에 사용될 수 있는 URL 매개 변수의 두 가지 타입입니다. <code>PathVariable</code>은 URL 경로의 일부를 매개 변수로 전달하는 것이고, <code>QueryString</code>은 URL에 물음표(?)와 함께 추가 매개 변수를 전달합니다.

이것들 중 어떤 것을 사용할지는 요청의 성격과 목적에 따라 달라집니다.

## PathVariable

<code>PathVariable</code>은 URL 경로의 일부로 매개 변수를 전달하기 때문에, 해당 매개 변수가 항상 필요하거나 필수적인 경우에 사용됩니다. 예를 들어, 웹 애플리케이션에서 특정 리소스의 ID를 조회하는 경우, PathVariable을 사용하여 ID 값을 URL 경로에 포함시키는 것이 일반적입니다.

## QueryString

<code>QueryString</code>은 URL의 끝에 추가 매개 변수를 전달하는 것이므로, 선택적인 매개 변수를 전달하거나 검색 결과를 필터링하거나 정렬할 때 유용합니다. 예를 들어, 웹 애플리케이션에서 사용자가 검색어를 입력한 경우, <code>QueryString</code>을 사용하여 해당 검색어를 전달하고 검색 결과를 필터링할 수 있습니다.

따라서 어떤 것을 사용할지는 상황에 따라 다르며, 각각의 장단점을 고려하여 적절한 방법을 선택해야 합니다.