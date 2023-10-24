<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-23
  Time: 오후 2:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<div>
    <button onclick="ajax1()">button1</button>
</div>
<div>
    <button onclick="ajax2()">button2</button>
</div>
<div>
    <button onclick="ajax3()">button3</button>
</div>
<div>
    <button onclick="ajax4()">button4</button>
</div>
<div>
    <input type="text" id="input1" value="서울">
</div>
<div>
    <input type="text" id="input2" value="33">
</div>
<div>
    <input type="text" id="input3" value="88.7">
</div>
<div>
    <input type="text" id="input4" value="한국">
</div>
<div>
    <button onclick="ajax5()">button5</button>
</div>
<div>
    <input type="text" id="input5" value="서울">
</div>
<div>
    <input type="text" id="input6" value="흥민">
</div>
<div>
    <input type="text" id="input7" value="30">
</div>
<div>
    <input type="text" id="input8" value="shm@google.com">
</div>
<div>
    <button onclick="ajax6()">button6</button>
</div>
<div>
    <button onclick="ajax7()">button7</button>
</div>
<div>
    <button onclick="ajax8()">button8</button>
</div>
<div>
    <button onclick="ajax9()">button9</button>
</div>
<div>
    <button onclick="ajax10()">button10</button>
</div>
<div>
    <input type="text" id="input9">
</div>
<div>
    <input type="text" id="input10">
</div>
<div>
    <input type="text" id="input11">
</div>
<div>
    <button onclick="ajax11()">button11</button>
</div>
<div>
    <div>
        <input type="text" id="input12" value="이강인">
    </div>
    <div>
        <input type="file" multiple id="input13" accept="image/*">
    </div>
    <div>
        <button onclick="ajax12()">button12</button>
    </div>
</div>
<div>
    <div>
        <button onclick="ajax13()">button13</button>
    </div>
</div>
<script>
    function ajax13() {
        // axios.request({
        //     url: "/main35/sub11"
        // });
        axios.get("/main35/sub11");
    }
    function ajax12() {
        axios.postForm("/main35/sub10", {
            name: document.querySelector("#input12").value,
            files: document.querySelector("#input13").files
        });
    }
    function ajax11() {
        const id = document.querySelector("#input9").value;
        const lastName = document.querySelector("#input10").value;
        const firstName = document.querySelector("#input11").value;
        axios.post("/main35/sub9", {
            id,
            lastName,
            firstName
        }, {
            headers: {
                "content-type": "application/x-www-form-urlencoded"
            }
        })
    }
    //city=seoul&country=korea
    function ajax10() {
        axios.post("/main35/sub8", {
            city: "seoul",
            country: "korea"
        }, {
            headers: {
                "content-type": "application/x-www-form-urlencoded"
            }
        });
    }
    function ajax9() {
        axios.post("/main35/sub7");
    }
    function ajax8() {
        axios.request({
            url: "/main35/sub7",
            method: "post"
        });
    }
    function ajax7() {
        axios.request({
           url: "/main35/sub6",
           params: {
               id: 9,
               lastName: "손",
               firstName: "흥민"
           }
        });
    }
    function ajax1() {
        axios.request({
            url: "/main35/sub2"
        });
    }
    function ajax2() {
        axios.request({
           url: "/main35/sub3?address=seoul"
        });
    }
    function ajax3() {
        axios.request({
            url: "/main35/sub4",
            params: {
                address: "seoul",
                name: "son",
                age: 33,
                email: "abc@naver.com"
            }
        });
    }
    function ajax4() {
        axios.request({
            url: "/main35/sub5",
            params: {
                city: "seoul",
                id: 2,
                score: 90.5,
                country: "korea"
            }
        });
    }
    function ajax5() {
        const city = document.querySelector("#input1").value;
        const id = document.querySelector("#input2").value;
        const score = document.querySelector("#input3").value;
        const country = document.querySelector("#input4").value;
        axios.request({
           url: "/main35/sub5",
           params: {
               city: city,
               id: id,
               score: score,
               country: country
           }
        });
    }
    function ajax6() {
        const address = document.querySelector("#input5").value;
        const name = document.querySelector("#input6").value;
        const age = document.querySelector("#input7").value;
        const email = document.querySelector("#input8").value;
        axios.request({
           url: "/main35/sub4",
           params: {
               address,
               name,
               age,
               email
           }
        });
    }
</script>
</body>
</html>
