# email-template

## variables

```
app.logo (height = 40, width = [40, 200])
code.color
```

## render flow

```
1. getVariablesByClientId
2. render('code.tpl',{
  ...variables,
  ...{code}
})
```

## send

tplConfig = tpl/config
data from biz

```
send({clientId, type}, tplConfig, data);
```
