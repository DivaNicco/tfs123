$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta Google",
  "description": "",
  "id": "consulta-google",
  "keyword": "Feature"
});
formatter.before({
  "duration": 33685495922,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Volta as Aulas",
  "description": "",
  "id": "consulta-google;volta-as-aulas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site do Google",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso por \"Volta as Aulas\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "exibi no titulo da aba \"Volta as Aulas - Pesquisa Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Google.que_acesso_o_site_do_Google()"
});
formatter.result({
  "duration": 6661059449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Volta as Aulas",
      "offset": 14
    }
  ],
  "location": "Google.pesquiso_por(String)"
});
formatter.result({
  "duration": 6151314417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Volta as Aulas - Pesquisa Google",
      "offset": 24
    }
  ],
  "location": "Google.exibi_no_titulo_da_aba(String)"
});
formatter.result({
  "duration": 12852292,
  "status": "passed"
});
formatter.after({
  "duration": 756983023,
  "status": "passed"
});
});