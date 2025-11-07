# Menu de Lanchonete - Sistema de Gestão

## 📋 Descrição
Sistema de gerenciamento para lanchonete desenvolvido em Java, que permite o controle completo de sanduíches, bebidas, clientes e pedidos da **Lanchonete Santa Clara**.

## 🚀 Funcionalidades

### 1. Menu de Sanduíches
- **Cadastrar Sanduíche**: Adicione novos sanduíches ao cardápio
- **Editar Sanduíche**: Modifique informações de sanduíches existentes
- **Listar Sanduíches**: Visualize todos os sanduíches cadastrados

#### Opções do Cardápio:
1. **X-Milho** - R$ 8,00
2. **Americano** - R$ 9,00
3. **Americano Burguer** - R$ 10,00
4. **X-Calabresa** - R$ 11,00
5. **X-Bacon** - R$ 13,50
6. **X-Tudo** - R$ 12,00
7. **Especial da Casa** - R$ 17,00
8. **X-Toscana** - R$ 13,00

### 2. Menu de Bebidas
- **Cadastrar Bebida**: Adicione sucos e refrigerantes
- **Editar Bebida**: Modifique bebidas cadastradas
- **Listar Bebidas**: Visualize todas as bebidas disponíveis

#### Sucos Disponíveis:
- Abacaxi, Acerola, Goiaba, Morango, Manga, Maracujá
- Tamanhos: 200ml (R$ 3,00), 300ml (R$ 4,00), 400ml (R$ 4,00), 700ml (R$ 7,00)

#### Refrigerantes Disponíveis:
- Hiran 1L (R$ 5,00) e 2L (R$ 7,00)
- Coca-Cola 1L (R$ 6,50) e 2L (R$ 9,00)

### 3. Menu de Clientes
- **Cadastrar Cliente**: Registre novos clientes com nome, endereço e telefone
- **Editar Cliente**: Atualize informações dos clientes
- **Listar Clientes**: Visualize todos os clientes cadastrados

### 4. Menu de Pedidos
- **Verificar Pedido**: Consulte detalhes de um pedido específico com valor total
- **Listar Pedidos**: Visualize todos os pedidos realizados

## 🛠️ Tecnologias Utilizadas
- Java
- Scanner (para entrada de dados)

## 📦 Como Executar

1. Certifique-se de ter o JDK instalado
2. Compile o arquivo:
```bash
javac menu.java
```
3. Execute o programa:
```bash
java Main
```

## 💡 Como Usar

1. Ao iniciar, você verá o menu principal com 5 opções
2. Digite o número correspondente à opção desejada
3. Navegue pelos submenus para cadastrar produtos, clientes e realizar pedidos
4. Os dados são armazenados em arrays durante a execução do programa
5. Para sair, selecione a opção 5 no menu principal

## 📝 Observações
- O sistema suporta até 10 registros simultâneos de cada tipo (sanduíches, bebidas, clientes)
- Os dados não são persistidos após o encerramento do programa
- É necessário cadastrar clientes antes de realizar pedidos

## 🤝 Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## 📄 Licença
Este projeto é de código aberto e está disponível para uso educacional.

---
**Lanchonete Santa Clara** - Sistema de Gestão de Pedidos