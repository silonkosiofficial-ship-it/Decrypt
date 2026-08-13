package H5;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f4382c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f4383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4384b;

    public b(Q4.f fVar) {
        this.f4383a = fVar.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f4384b = b(fVar);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static java.lang.String b(Q4.f fVar) {
        java.lang.String strD = fVar.n().d();
        if (strD != null) {
            return strD;
        }
        java.lang.String strC = fVar.n().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        java.lang.String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        java.lang.String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static java.lang.String c(java.security.PublicKey publicKey) {
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return android.util.Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private java.lang.String d(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).getString("token");
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private java.security.PublicKey e(java.lang.String str) {
        try {
            return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 8)));
        } catch (java.lang.IllegalArgumentException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e6) {
            java.lang.String str2 = "Invalid key stored " + e6;
            return null;
        }
    }

    private java.lang.String g() {
        java.lang.String string;
        synchronized (this.f4383a) {
            string = this.f4383a.getString("|S|id", null);
        }
        return string;
    }

    private java.lang.String h() {
        synchronized (this.f4383a) {
            try {
                java.lang.String string = this.f4383a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                java.security.PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public java.lang.String f() {
        synchronized (this.f4383a) {
            try {
                java.lang.String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public java.lang.String i() {
        synchronized (this.f4383a) {
            try {
                for (java.lang.String str : f4382c) {
                    java.lang.String string = this.f4383a.getString(a(this.f4384b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
