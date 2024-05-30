const CONECT_PROXY = [
  {
    context: ['/api'],
    target: 'http://localhost:8080',
    secure: false,
    LogLevel: 'debug'
  }
];

module.exports = CONECT_PROXY;
