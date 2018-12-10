var osmosis = require('osmosis');
var jsonfile = require('jsonfile');

var id = 373;
for (id; id <= 431; id++) {
    var offset = 0;
    for (offset; offset <= 600; offset += 30) {
        osmosis.get('https://api.bilkatogo.dk/shop/display/productsclean?group_id=' + id + '&sortid=0&offset=' + offset)
            .find('.plistpcontainer')
            .set({
                name: '.product_list_name',
                price: '.product_list_price/text()[1]',
                offer: '.label-offer',
                unit: '.product_list_unit',
                img: 'img@src'
            })
            .data(function (result) {
                jsonfile.writeFileSync('src/Services/Scripts/Bilka.json', result, {flag: 'a'});
            })
            .error(console.log)
            .debug(console.log)
    }
}