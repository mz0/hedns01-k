package net.x320.heac01.cli

class App {
    // https://letsencrypt.org/docs/staging-environment/
    // - Duplicate Certificate limit is 30,000 per week
    // - Failed Validations limit is 60 per hour.
    // - Accounts per IP Address limit is 50 accounts per 3 hour period per IP
    // - New Orders limit is 1,500 new orders per 3 hour period per account.
    val qaDir = "https://acme-staging-v02.api.letsencrypt.org/directory"
    val leDir = "https://acme-v02.api.letsencrypt.org/directory"

    // - Failed Validation limit of 5 failures per account, per hostname, per hour.
    val greeting: String
        get() {
            return """
                TODO
                - see https://github.com/alexpeattie/letsencrypt-fromscratch
                - make pub/priv key pair
                - register account/public key
                - ...
                - read he.token
                - ...
            """.trimIndent()
        }
}
// TODO Authentication and Updating using POST
// curl https://dyn.dns.he.net/nic/update \
//   -d "hostname=_acme-challenge.example.org" \
//   -d "password=password" \
//   -d "txt=evaGxfADs6pSRb..."

fun main() {
    println(App().greeting)
}
