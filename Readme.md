# DNS-01 Acme Challenge with dns.he.net

- manually create a TXT record ("New TXT" pseudo button )
  - name `_acme-challenge` for wildcard (domain) certificate / `_acme-challenge.myhost` for 'myhost'
  - value - leave as-is
  - TTL - leave as-is
  - "Enable entry for dynamic dns" checkbox (sets 5 minutes TTL)
  - "Submit" TXT Record
- make a token - press DDNS column "Generate a DDNS key" button 🗘 /
  as seen in page: ![CLOCKWISE RIGHT AND LEFT SEMICIRCLE ARROWS U+1F5D8](doc/img/generate.gif)
  - "Generate a key" button
  - copy the key from one of the fields above, and save it to `he.token` file using `he.token.sample` template
  - "Submit" update key (token) to dsn.he.net
- logout from he.net

## TODO 2
- see https://slsa.dev/spec/v1.0/levels, https://github.blog/2022-04-07-slsa-3-compliance-with-github-actions/
- https://medium.com/@callmeryan/gradle-version-catalog-728111fa210f
  - https://docs.gradle.org/7.0/userguide/platforms.html#sub:central-declaration-of-dependencies
  - https://docs.gradle.org/7.3/release-notes.html#new-features-and-usability-improvements
  - `settings.gradle`:
    ```
    enableFeaturePreview("VERSION_CATALOGS")
    //include ':app'

    dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
          mavenCentral()
      }
    }
    ```
- [gradle/libs.versions.toml](gradle/libs.versions.toml)
  
