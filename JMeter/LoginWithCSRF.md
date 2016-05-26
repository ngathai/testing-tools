**How to login the site requests post CSRF data?** <br>
CSRF = Cross-Site Request Forgery <br>
1. Thread Group > Add > Config Element > HTTP Cookie Manager <br>
2. Thread Group > Add > Config Element > HTTP Header Manager <br>
3. Thread Group > Add > Sampler > HTTP Request (Open Site) <br>
- Server Name or IP: theluxurycloset.com <br>
- Method: GET <br>
4. HTTP Request (Open Site) > Add > Post Processors > Regular Expressiom Extractor (Get CSRF) <br>
- Filed to check is Body <br>
- Reference Name: token <br>
- Regular Expression: name="_csrf" value="(.*) (These are attributes of CSRF on Login form code. F12 to view) <br>
- Template: $1$ <br>
- Match No.: 1 <br>
5. HTTP Request (Open Site) > Add > Listener > View result in tree <br>
6. Thread Group > Add > Sampler > HTTP Request (Login) <br>
- Server Name or IP: theluxurycloset.com <br>
(Open this site on Firefox, login the wrong info then open Firebug > Net tab > find the raw name "POST login > Post tab" to get some need info) <br>
- Path: /site/login <br>
- Method: GET <br>
- Parameters: (Don't select Encode) <br>
+ LoginForm[password] : 123456 <br>
+ LoginForm[rememberMe]: 0 <br>
+ LoginForm[username : tester@gmail.com <br>
+ _csrf : ${token} (This is the Reference Name at step 4) <br>
7. HTTP Request (Login) > Add > Listener > View result in tree <br>
8. Thread Group > Add > Sampler > HTTP Request (Refresh Homepage) <br>
- This is the same as Open Site above. <br>
9. Homepage > Add > Assertions > HTML Assertion <br>
- This one is used for find the text "My account" to make sure Login successfully. <br>
- Add Patterns to Test: My account
