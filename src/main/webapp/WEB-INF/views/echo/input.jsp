<html>
<body>
    <h2>入力画面の実装練習</h2>
        <form:form modelAttribute="sampleForm">
            <div>テキストを入力してください ：</div>
            <div>
                <form:input path="text" />
                <form:errors path="text" />
            </div>
            <div>
                <form:button>送信</form:button>
            </div>
        </form:form>
</body>
</html>