package com.jr.webapp.models.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEogIBAAKCAQEAp86rjDOoGxLorls9qlCtZWiMvsr5TN9M/RDSPiYXVJhjhc5b\n" +
            "XCr5YDmpJi6Be207KGkZLwggDIwWKKt/WL5w0cHJhiABYY43YKpwiRlhl0BSgHSB\n" +
            "2A9BWC6F9PnStj9o/w8NHCdp79qA2K6XeYTuGsayseXULhj3xT0IlCoDkSzhC/6z\n" +
            "uI/zJ5QyeJKW5TmMtfmSl6alw8GQzM1vX5USr1dMrYipnTZ28kmiEaJ7pkCVa5IJ\n" +
            "0I357ikjDCWJStICR9cG+X18lthOTwx7TsDEZWd/8pm6M5faxEMq6qKxzh7WO/o0\n" +
            "rVVknbDMJJxzZcuJQ1fFZYY6Gfp1xxAupRl6zwIDAQABAoIBAHMXf3cwcsrm5Cm5\n" +
            "sIigvtx/oZC2O9hqiy5CnEA99eByiEfcqbKEUveZdJcYbHxQBbQIqVolk32nkwcf\n" +
            "4L7oFw72f5Z7Wxci6H5nR7nwa4vGdQ9fWTLr+6BUgFHuCoQu53+QPiiiK7lzPs3e\n" +
            "qUuSTZCV2TfEbwuS2lUwMDMWwc2OQoIlUR1wEvwHLAZZ2ri2VC6YQpmlj+cTD3Ys\n" +
            "Jiq5lx3uo8keNYpFbwZEkLFD/S6G4bNmT/X8sjSu9czGRQaY+Y9P96FAm7v6N+6T\n" +
            "l1R6o8poabsTS+rhLbBxTOxP24dlnumuLBYM+DRn3aqcrObHfTA4E1dffQmB8G/e\n" +
            "xTMfbXkCgYEA3P+WiItSErafNIn2/1pI0kX1/7kpNu5YvTBMUi2sreTsBMjoVrs6\n" +
            "sgZjoJbuZ4cgYj7NfZpKgGnrG7AkjmtYLPb0iRXrggksh6SzjZneODJr1bseYPoi\n" +
            "+O08ecph1ykla4VJW0y+ix6qWktp46/ut8lL8KbCE0f/QYqusdF5sHsCgYEAwmJx\n" +
            "F365UiXv4gWbNEreELMdLcnmf10UFpZWqLV0W5Ekcw84xeFhQjE4BNoXQq2Wt/0a\n" +
            "dbyHDfU1X/DJ4O/mujLj2m/hHZfwoh0msMEubk3UauG4n/FI3YZomqpvXPgzEa02\n" +
            "mZOouc+UaAy6HnegmIw5aF2tvPX+OQ+XaSTnkL0CgYBtW5Rz8O0mEXRqnTK6XUTX\n" +
            "uILojgmVAxCqXbIGoE9opXUdUQWXlYKQAZVfLBDA7h7aPtWUp7riHIeY5erRBtFV\n" +
            "Psb25v/pEv0UCi5HjbJnAJxX4QZBWsXfhBV+9uS/gb7gm84W/bz0PrJxiAvX/YEV\n" +
            "NOj9Jqe2vtPS7PtRRqT+7QKBgFETjEYXdiacajSkz/p8q6jdfHMnvjsrUICnThfq\n" +
            "L1Et9b0EAVMP0WgxbUMg0AjgrHerWwj2jII2339XyGxIw7ywEzd96LBWOmjzrbqV\n" +
            "qM8bKVk3MrGLiy/Sqviv0+k8INjjnV1rKDnwKd9IR60Dinl2K0+rmxawp8uXBDk3\n" +
            "ylolAoGAYMWLSVw0V/vwXk42LpIch3YUmwI/nSJw5GIA8iq6KSWpOI3HHgpvqfMB\n" +
            "XyCj2gicM+fMSpOB1IfHuxKv0z4Pq9lPPxIJGVwKDA9kcYKpDXvS3BZeh0ADcSlr\n" +
            "tYSFmFPwfHKZa5K8NiwaaG+gqnP5ZQRAG36heWmsiM3Q+6swfDQ=\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp86rjDOoGxLorls9qlCt\n" +
            "ZWiMvsr5TN9M/RDSPiYXVJhjhc5bXCr5YDmpJi6Be207KGkZLwggDIwWKKt/WL5w\n" +
            "0cHJhiABYY43YKpwiRlhl0BSgHSB2A9BWC6F9PnStj9o/w8NHCdp79qA2K6XeYTu\n" +
            "GsayseXULhj3xT0IlCoDkSzhC/6zuI/zJ5QyeJKW5TmMtfmSl6alw8GQzM1vX5US\n" +
            "r1dMrYipnTZ28kmiEaJ7pkCVa5IJ0I357ikjDCWJStICR9cG+X18lthOTwx7TsDE\n" +
            "ZWd/8pm6M5faxEMq6qKxzh7WO/o0rVVknbDMJJxzZcuJQ1fFZYY6Gfp1xxAupRl6\n" +
            "zwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}

