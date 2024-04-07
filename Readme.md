# DNS-01 Acme Challenge with dns.he.net

- manually create a TXT record ("New TXT" pseudo button )
  - name `_acme-challenge`
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
