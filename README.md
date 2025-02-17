# email-template

## variables

```
app.logo
app.name
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
