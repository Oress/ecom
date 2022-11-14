db.product.insertOne({
   title: "Мобільний телефон Samsung Galaxy M32 6/128 GB",
   code: "samsung-sm-m325fzwgsek",
   description: "Екран (6.4\", Super AMOLED, 2400x1080) / MediaTek Helio G80 (2.0 ГГц + 1.8 ГГц) / основна квадрокамера: 64 Мп + 8 Мп + 2 Мп + 2 Мп, фронтальна камера: 20 Мп / RAM 6 ГБ / 128 ГБ вбудованої пам'яті + microSD (до 1 ТБ) / 3G / LTE / GPS / підтримка 2 SIM-карток (Nano-SIM) / Android 11 / 5000 мА·год",
   category: "Samsung_Phones",
   isActive: true,
   variations: [
       {
           type: "Color",
           title: "Білий",
           code: "samsung-sm-m325fzwgsek-white",
           sku: "123",
           quantity: 20,
           price: {
               base: 8900,
               currency: 'UAH'
           }
       }
   ],
   features: [
       {
           groupCode: "Display",
           features: [
               {
                   key: "Diagonal",
                   value: "6.4"
               },
               {
                   key: "Matrix",
                   value: "Super AMOLED"
               },
               {
                   key: "Refresh Rate",
                   value: {
                       value: "90",
                       units: "Hz"
                   }
               }
           ]
       },
       {
           groupCode: "SIM",
           features: [
               {
                   key: "Number",
                   value: "2"
               },
               {
                   key: "Type",
                   value: "Nano-SIM"
               }
           ]
       },
       {
           groupCode: "Memory",
           features: [
               {
                   key: "RAM",
                   value: {
                      value: "6",
                      units: "GB"
                   }
               },
               {
                   key: "Memory",
                   value: {
                       value: "128",
                       units: "GB"
                   }
               }
           ]
       }
   ]
})