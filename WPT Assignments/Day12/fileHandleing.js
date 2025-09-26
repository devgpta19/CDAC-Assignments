// 3)   Try File Handling Write and Read data synchronous method 
//    and try asynchronous method 

const fs = require('fs');
const constants = require('constants');

fs.writeFile('sample.txt', 'Hello I am here to help you', (err) => {
  if (err) {
    console.error('Write error:', err);
    return;
  }

  fs.access('sample.txt', constants.F_OK, (err) => {
    if (err) {
      console.error('Access error:', err);
      return;
    }

    fs.readFile('sample.txt', 'utf8', (err, data) => {
      if (err) {
        console.error('Read error:', err);
        return;
      }

      for (let a = 1; a < 11; a++) {
        console.log(a);
      }

      console.log('File content:', data);
    });
  });
});
