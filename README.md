# Book Management

サンプルのAPI定義になります。 
以下のツールを使って、OpenAPI からコードを自動生成します。  https://github.com/OpenAPITools/openapi-generator 
 
コード生成の実行コマンドは以下です。
```
openapi-generator generate -g scala-play-server -i docs/api-spec.yaml 
```
 
アプリの実行コマンドは以下です。 
```
sbt 'run -Dconfig.file=conf/application.dev.conf' 
```

This Scala Play Framework project was generated by the OpenAPI generator tool at 2021-09-23T01:43:18.946563+09:00[Asia/Tokyo].

## API

### 

|Name|Role|
|----|----|
|`api.Controller`|Play Framework API controller|
|`api.Api`|Representing trait|
|`api.ApiImpl`|Default implementation|

* `DELETE /v1/books/:bookId` - 書籍削除API
* `GET /v1/books/:bookId` - 書籍詳細取得API
* `GET /v1/books/findByTags?tags=[value]` - タグ絞り込み検索API
* `GET /v1/books` - 書籍一覧取得API
* `POST /v1/books` - 書籍登録API
* `PUT /v1/books` - 書籍更新API
* `GET /v1/tags` - タグ一覧取得API
* `GET /v1/users` - ユーザー一覧取得API
* `GET /v1/users/login?username=[value]&password=[value]` - ログインAPI
* `GET /v1/users/logout` - ログアウトAPI
* `POST /v1/users` - ユーザー登録API
* `DELETE /v1/users/:username` - ユーザー削除API
* `GET /v1/users/:username` - ユーザー詳細取得APi
* `PUT /v1/users/:username` - ユーザー更新API

