# springboot-btc-wallet

URL : http://localhost:8080/wallet/postTransaction
Type : POST 

Payload :
{
"datetime": "2019-10-05T14:45:05+07:00",
"amount": 10
}

========================================================
URL : http://localhost:8080/wallet/getWalletTransactionHistory
Type : POST 

Payload :
{
"startDatetime": "2019-10-05T13:00:00+00:000",
"endDatetime": "2019-10-05T19:45:05+07:00"
}
