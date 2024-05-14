# e-bambu

## Fluxo da informação request
Controler => UseCase => Mapper (transformação) => Repository



## Fluxo da informação response
Repository => UseCase => Mapper (transformação) => Controller

-Crie um repository

-Crie um mapper na pasta mapper

-Adicione uma pasta com o nome da referencia em negocio/usecase/

    -crie uma classe Save, FindAll e uma FindBy dessa referencia

-Crie um Controller