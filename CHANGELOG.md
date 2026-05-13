# Changelog

## 0.1.0-alpha.1 (2026-05-13)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/phoebe-bird/phoebe-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### ⚠ BREAKING CHANGES

* **client:** change precision of some numeric types
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** manual updates ([d712abb](https://github.com/phoebe-bird/phoebe-java/commit/d712abbfc3f4e8e54e8391ae34616bae45510b27))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([31f7acd](https://github.com/phoebe-bird/phoebe-java/commit/31f7acd90ff3c222f4db984e29ef8a090ce557d6))
* **client:** add `HttpRequest#url()` method ([a145b94](https://github.com/phoebe-bird/phoebe-java/commit/a145b94467e13633c59889cccd0c26b0b3789a44))
* **client:** add a `withOptions` method ([008f2ee](https://github.com/phoebe-bird/phoebe-java/commit/008f2ee04e6216121f6bfdf31616a69f0143d55e))
* **client:** add https config options ([74d088e](https://github.com/phoebe-bird/phoebe-java/commit/74d088e2486ecc1d43474dc0e928905c7eecdfe8))
* **client:** allow configuring dispatcher executor service ([ef7c266](https://github.com/phoebe-bird/phoebe-java/commit/ef7c2660841ba59c269caa78b58f9a9f59fa162c))
* **client:** allow configuring env via system properties ([f1de279](https://github.com/phoebe-bird/phoebe-java/commit/f1de279091ccdbf3ace91ed860f1d00345fb6c71))
* **client:** allow providing some params positionally ([b24d6c0](https://github.com/phoebe-bird/phoebe-java/commit/b24d6c0cd3ecc5a55a382454f96bbf89a84fd3d7))
* **client:** extract auto pagination to shared classes ([13f571f](https://github.com/phoebe-bird/phoebe-java/commit/13f571f7baf0caef24ce9c554b244476ed3e812b))
* **client:** implement per-endpoint base URL support ([f493836](https://github.com/phoebe-bird/phoebe-java/commit/f4938363ced1c863b72b10c787c73c56ab6aac51))
* **client:** send `X-Stainless-Kotlin-Version` header ([d9f18bd](https://github.com/phoebe-bird/phoebe-java/commit/d9f18bd66b86423c4ae710ea0987fe35f53ed457))


### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([73b4311](https://github.com/phoebe-bird/phoebe-java/commit/73b4311a77e11406a4c591ef9bf111ef84970605))
* **client:** cancel okhttp call when future cancelled ([5823aba](https://github.com/phoebe-bird/phoebe-java/commit/5823abafce2a92fbb69a0f6c23db79a78b78f2a8))
* **client:** disallow coercion from float to int ([d00944f](https://github.com/phoebe-bird/phoebe-java/commit/d00944fd323009658808104c8a4b3954211b3559))
* **client:** don't close client on `withOptions` usage when original is gc'd ([3d3f673](https://github.com/phoebe-bird/phoebe-java/commit/3d3f673ecda4ce417d1ec954ea670cf629ae373a))
* **client:** ensure error handling always occurs ([c4327a3](https://github.com/phoebe-bird/phoebe-java/commit/c4327a3c088df1b9398337114f3316f5e355a7f3))
* **client:** fully respect max retries ([7c71f9d](https://github.com/phoebe-bird/phoebe-java/commit/7c71f9dc52f85d1a055e25f5d940ac1fc6d807b0))
* **client:** preserve time zone in lenient date-time parsing ([50bb540](https://github.com/phoebe-bird/phoebe-java/commit/50bb540673b947b6f5b2da24bb3cac46e3ca498a))
* **client:** remove `@MustBeClosed` for future returning methods ([a6e5c78](https://github.com/phoebe-bird/phoebe-java/commit/a6e5c78fcb9b3107791323d3c3da12791634939a))
* **client:** send retry count header for max retries 0 ([7c71f9d](https://github.com/phoebe-bird/phoebe-java/commit/7c71f9dc52f85d1a055e25f5d940ac1fc6d807b0))
* date time deserialization leniency ([9d5f042](https://github.com/phoebe-bird/phoebe-java/commit/9d5f042b85f9bdaec3a56ad6ea180a32f6a5f454))


### Chores

* **ci:** enable for pull requests ([30e9e4a](https://github.com/phoebe-bird/phoebe-java/commit/30e9e4af5c35b09de9c58934e263d3a6b667d3fa))
* **ci:** only run for pushes and fork pull requests ([a3e1190](https://github.com/phoebe-bird/phoebe-java/commit/a3e119093c0f9c11ee28bef632aca42deb6635b2))
* **ci:** skip uploading artifacts on stainless-internal branches ([5945140](https://github.com/phoebe-bird/phoebe-java/commit/5945140f250d2b0ae6c2d9cd3fc3ee386a65ffc8))
* **ci:** upgrade `actions/github-script` ([43107c0](https://github.com/phoebe-bird/phoebe-java/commit/43107c0efbf857c052a1ce799f14a45add565375))
* **ci:** upgrade `actions/setup-java` ([75d7ae3](https://github.com/phoebe-bird/phoebe-java/commit/75d7ae3dc40b246a7fe1e4a0316122c579779edd))
* configure new SDK language ([30ab2b2](https://github.com/phoebe-bird/phoebe-java/commit/30ab2b26361936249dbea4db64787cfc7c6b7e2d))
* **docs:** grammar improvements ([33fa7c5](https://github.com/phoebe-bird/phoebe-java/commit/33fa7c53610ea31ad671e5c5437fa6d4d02290a9))
* **internal:** allow running specific example from cli ([56695c9](https://github.com/phoebe-bird/phoebe-java/commit/56695c9e55d80e78608e41f4f90297f13d100c22))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([6a0f2ca](https://github.com/phoebe-bird/phoebe-java/commit/6a0f2cab131804296e2b29cc2e29c58de3603a2b))
* **internal:** codegen related update ([12ed0de](https://github.com/phoebe-bird/phoebe-java/commit/12ed0dea61da9bc7219cf8035da1dddd4d181bb4))
* **internal:** codegen related update ([9aace9a](https://github.com/phoebe-bird/phoebe-java/commit/9aace9acfc99eb6c17a5927cf83025a618693dcf))
* **internal:** codegen related update ([e3ecdf4](https://github.com/phoebe-bird/phoebe-java/commit/e3ecdf4278628e8312d92d6fee0cf03b7496e534))
* **internal:** codegen related update ([4df92d1](https://github.com/phoebe-bird/phoebe-java/commit/4df92d16dba984fc52df7b61479044eda9ee0fa5))
* **internal:** codegen related update ([a347782](https://github.com/phoebe-bird/phoebe-java/commit/a347782ee8a5b1b811fec738acd5c715681c5db0))
* **internal:** codegen related update ([e83306b](https://github.com/phoebe-bird/phoebe-java/commit/e83306b870272fab014cc872529eec6ebcc8817c))
* **internal:** codegen related update ([354d517](https://github.com/phoebe-bird/phoebe-java/commit/354d5177e6816e06d62e4ab27e032efa7bfa528d))
* **internal:** codegen related update ([f24ff7d](https://github.com/phoebe-bird/phoebe-java/commit/f24ff7de7b1830d92d031d6482e506b1a5806101))
* **internal:** codegen related update ([4349d53](https://github.com/phoebe-bird/phoebe-java/commit/4349d5372ce68b707353a71d8db12dffcbb0475f))
* **internal:** codegen related update ([8beb9ab](https://github.com/phoebe-bird/phoebe-java/commit/8beb9ab95768a177d22b20aa3d4c1291b516cd31))
* **internal:** codegen related update ([d13e25d](https://github.com/phoebe-bird/phoebe-java/commit/d13e25d23ef3cf150699d27a46026d78c64ecc9d))
* **internal:** codegen related update ([98d74bf](https://github.com/phoebe-bird/phoebe-java/commit/98d74bf8a9919494cd924d1a35c43e76effb9128))
* **internal:** codegen related update ([8d85b73](https://github.com/phoebe-bird/phoebe-java/commit/8d85b734b31a8fbf779fb80be8e6a12ac0a97e12))
* **internal:** codegen related update ([a76719e](https://github.com/phoebe-bird/phoebe-java/commit/a76719edc99a3a43bb71f9d7399d7fcc19fa4327))
* **internal:** codegen related update ([102eb54](https://github.com/phoebe-bird/phoebe-java/commit/102eb54ea114aa3741df602701d022c2bf7f038f))
* **internal:** codegen related update ([ea5500a](https://github.com/phoebe-bird/phoebe-java/commit/ea5500a64b0688e57f2ca9f3dee0eaaa74d9f860))
* **internal:** codegen related update ([9b9b899](https://github.com/phoebe-bird/phoebe-java/commit/9b9b899e5b9186438c76ddc90a0b2fe65a21ef17))
* **internal:** codegen related update ([b07058d](https://github.com/phoebe-bird/phoebe-java/commit/b07058d9f6e68617a2c01194deabd50547848f87))
* **internal:** codegen related update ([26cd70c](https://github.com/phoebe-bird/phoebe-java/commit/26cd70c6547384e153a6abf88178fbed6e8c2951))
* **internal:** codegen related update ([2082664](https://github.com/phoebe-bird/phoebe-java/commit/20826641ea001336618b19ceaf63acd87ed82d9f))
* **internal:** codegen related update ([17f6183](https://github.com/phoebe-bird/phoebe-java/commit/17f6183f74d414255db7fe82cbc6e73b09430d06))
* **internal:** codegen related update ([fa74474](https://github.com/phoebe-bird/phoebe-java/commit/fa744740ab0421e1a3ed33aad5952fde2e80c4df))
* **internal:** codegen related update ([78f6424](https://github.com/phoebe-bird/phoebe-java/commit/78f64241e6e1a7f11b3004ea3b40e282688e473d))
* **internal:** codegen related update ([704a4e1](https://github.com/phoebe-bird/phoebe-java/commit/704a4e190b022602ad545cf926ef21ce4bac5d96))
* **internal:** codegen related update ([e57fa55](https://github.com/phoebe-bird/phoebe-java/commit/e57fa556588b355f889962a6e57cf041a2ab7b5c))
* **internal:** codegen related update ([44125db](https://github.com/phoebe-bird/phoebe-java/commit/44125db5522d48fb720c0753aeada71cab6e3105))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([adfd7da](https://github.com/phoebe-bird/phoebe-java/commit/adfd7da05a09ef5622316700c031b6ac6ef4d05f))
* **internal:** depend on packages directly in example ([7c71f9d](https://github.com/phoebe-bird/phoebe-java/commit/7c71f9dc52f85d1a055e25f5d940ac1fc6d807b0))
* **internal:** improve maven repo docs ([da49cb7](https://github.com/phoebe-bird/phoebe-java/commit/da49cb77739c9becf5d45b12095298950f1e32f9))
* **internal:** refactor delegating from client to options ([4ea1ff5](https://github.com/phoebe-bird/phoebe-java/commit/4ea1ff5ee41e8e81d62000b0bac199c47d645b8e))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([bed463e](https://github.com/phoebe-bird/phoebe-java/commit/bed463e241505d386c28f49a7c0edbfaa9c4e3be))
* **internal:** support uploading Maven repo artifacts to stainless package server ([37c89f8](https://github.com/phoebe-bird/phoebe-java/commit/37c89f8c816525461bce82b5550d796ff1ff3023))
* **internal:** update `actions/checkout` version ([3a146bb](https://github.com/phoebe-bird/phoebe-java/commit/3a146bbdb3ab84f558391f3b8e6bc7e2c8fd77f6))
* **internal:** update maven repo doc to include authentication ([cf7eb23](https://github.com/phoebe-bird/phoebe-java/commit/cf7eb239f388de322581a476a6e6845cebd5e019))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/phoebe-bird/phoebe-java/issues/3240) in tests ([9d5f042](https://github.com/phoebe-bird/phoebe-java/commit/9d5f042b85f9bdaec3a56ad6ea180a32f6a5f454))


### Documentation

* fix missing readme comment ([4fd91a7](https://github.com/phoebe-bird/phoebe-java/commit/4fd91a77d9e1291a5d81ee0cc950d4a83e2ab753))
* more code comments ([f8420f4](https://github.com/phoebe-bird/phoebe-java/commit/f8420f4dfd2e03fae3e61c5b7884f425c92b69d8))
* prominently feature MCP server setup in root SDK readmes ([7754ce1](https://github.com/phoebe-bird/phoebe-java/commit/7754ce1495022f309ff26d5c2f06f3c4c8e913b7))
* remove `$` for better copy-pasteabality ([fe8a020](https://github.com/phoebe-bird/phoebe-java/commit/fe8a02007be585c2c162442e968a4fe8909eb39e))


### Refactors

* **client:** change precision of some numeric types ([c593d52](https://github.com/phoebe-bird/phoebe-java/commit/c593d52bf58fc1324aef2f61d1411a0923b15a2e))
* **internal:** minor `ClientOptionsTest` change ([b9a8ca8](https://github.com/phoebe-bird/phoebe-java/commit/b9a8ca82aa21e634734848084170f7930b906684))
