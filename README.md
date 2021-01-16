# M4 Discord Bot

## What

A Discord bot for Technovation Girls Japan 2021! Originally created by team M4 😊

## How can I use it?

1. Create a new application on Discord from the [Discord Developer Portal](https://discord.com/developers/applications)
2. Next, add a bot user from the oauth2 page, with **only these settings**:
   ![oauth](https://lh3.googleusercontent.com/8zR-j4c60RAiXFXdDILiUd9DOdyh8Dco2epsouWVnnKDl0sC608kff6lkBwJJ6caq4pTpJBPcOQ4LG7VFus2WTPl2jJjdGIk_eLJYM2-vUTmz1RlBIpkhDBpkJE9D6HXqbW1kzDWXHLMh-J45ifN5YCXZCJPDW1pWdwZ57-amHyx3UIQkYArzPhYMbYLV4zU6dMfobomBmX1sqnLcQyBvfSwpI9MMLzBDnOePYl-FE548a-jyiD-l7EGuw6f6U7GQQoKCxrHd4cBtza7M6u4cVhClHIiSHLkFui21qgmKtq0VoV7EX8FoIQFJCSM4WV6CpVUXy-FupiaT4Xt_jAIq-C1hib1MXzJfz5w5GtyfqXExM34eZWY_vbUKCHLl2L7iYGo975Cc-ufUeixzg_ZOS7_sUC5zutfJo15_9bbVVVB4lGkOx0TuichE5OdmrPZxdTTzad-OSWMlDEsRw1Yv1-ESoEFmN2m2a2nO5RasXzm9ZtW6eIIrIFh3x5gPYZ1whBOz4kOPjB1kdlj-otTulkQaA82_4rRbEVaqGrCZ4ZXIQVEQQ9figluJbMPgvDq2NKTmu5W_AY_6VpjUwbIzu7EFoRqQ93t2wbGO2CGtSJHyffJJvG--GGpXxcROEjPYnDeCiusss46m7KnIqmTV7M2HZ19ZfchvjGZbYFFdV9jT764w0zf7HhRjDTrSVnGz7LRXeko5O8n9_SdKpQMKUjGL1RbzuQ1tba5mZwrDFEwAyKkbW_Av8g=w1120-h814-no)
3. Copy the oauth2 URL, and ask your Mentor to add the bot to Technovation Girls Japan Discord (they can get help from Waffle members if needed)
4. From the `bot` page, create a new bot, and copy the bot token
   ![bot](https://lh3.googleusercontent.com/lW5BjcefTHRmTyBFHcflFtOhafK_30SQvdl7Srvd5YVgWtulwkCOZqGHCac_GnoyvecAwS_-JABCw4xgPePWWiQuygsOt4lsjf6OVRJLlm3N_fLx16UQZ9Mx7vNYxmizygIwDeE4qvBfprLluGNQZcHQE0uZMovhOnnykOvOwJdDKNPGrPZ2N23_jK4oag_OG9t8Lj_ojdUsue4ffCCV6t-uY-GWnfdeanDsrK9QrxILzxKEm4vfAd9uPDvGqYKpCqkEv8XagCiqsv_eDnqCQg0SDnkbgz0D1Fufsu0Kwjep7PLWJK_ay6aOZBO-GI6YVuTa_LuUU_pNAYVWdQqitbuis9YJVtH98j4aFxXtxwQ5SQF8Pvaqa8dxM3N2Da2dRpn6gNgXyLAUYBs292eEJJkUuGgZNuzokkZ8xclNDBeE5LB1fYXiBtS1FTnUSdDJrHP-yJ9o6w2utSip_v2OAtbr5N39CB6CXNkjBBaaRXLxFAIJONLhR-IM6PgQRycsDeRuWFnQcipo4n4tN7s9j_Ber0N1AJ8JSMPNgQWyFKiojfq3sNTUhUnNRzpk3Pv4iLKtZnUN0p-2Srkq6nIXcW7elS6kyLppbCsh5lDk8IzhhqO2I657v7r8QqCndMhOWtllt4kzU4IJnNNb8Jlbi8kS7f-SLj4DWQs9wcPDJHiDQ1W98Q2g9JYF1DDK1Z5NqAu3j3jr1HRjLGsXK65QVLZhNymp-x43ssY9B7j81gacCMsVcSLJ240=w1189-h468-no)
5. add a new file to the repl called `.env`. This is a private file that only you can see, so its good for storing secrets like bot token.
6. create a new `environment variable` called `TOKEN` inside the `.env` file, and copy your bot token here.
   ![environment variable](https://lh3.googleusercontent.com/ORWQsfEqookeL8TS4KKyAG8tcWEo1iqQM3SFVMDlhPsYrjGnELV40SirsSLJIpYXemxf5KRhZ71kjV1TzQuHQDIidfr1_WhDynslgKz8IOdXwvi3GtYbECM2QiGbtGFsM8l2oUsLOaqgb9IAUUL5yr1owL5VlF84R6pZi_gq2-XeQ4Zrt6kaRBxNz5msEE4CLpNc0dP4MONsCqfiBHNfPXJHISdxtVR2xJDTIttZfn-R-IKVcmB29wDb4SnPnjAZ4UYJsMu2SASpSC9KSLh1VIL-Rhk_m3muz9j9LKf7fb1Ybsdi0C9oUEemVDdWLvAlbTK3OZfjPGCzkv2Wc0H_OjRR0sEnbZubgYo8_UWxB2cqfyIwl0U9IEa0WOTwXcg0KgBU_ulVEMeCrWF9NywwOqVts7ssCGzETJl0Tsdg6otZlYAUnJEyg-em2YTRqm2K1HIA9qfyZmEXP1tjEh05ncjdM5_MFLjRNTgiYvi94k9QKfamQo6MWe5h4oZUMIQgoLa-PH3keu7Olyl77rj1XqP2rx9eKkb_lhaTHsVb8cmUkEtd2K_U4_PenoCVml5GJitfxTSPt8VoYR97pNF5Of4leqCrLpdrOT2Dh55sH70CN1ZOAMmPwKH8FUlsF-ZIaJ4m_jwbYqriTHiXLpzcEhrZ7SuhsglOcuDvlD1AZPQKatPdyqrwMXcfUHixJA=w1646-h584-no)
7. Press the run button! you should be able to see your bot in Discord now 🎉

## How can I add things to the bot?
Take a look at the [MessageHandlerImpl.java](https://repl.it/@panpanini/M4bot#src/MessageHandlerImpl.java) class. This is where you can add new bot responses.