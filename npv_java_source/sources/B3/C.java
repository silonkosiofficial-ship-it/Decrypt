package B3;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B3.a0 f527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.pm.PackageInfo f530e;

    C(android.content.Context context, long j6, android.content.pm.PackageInfo packageInfo, B3.a0 a0Var, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f526a = context;
        this.f528c = j6;
        this.f530e = packageInfo;
        this.f527b = a0Var;
        this.f529d = scheduledExecutorService;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i6 = 0; i6 < charArray.length; i6++) {
            charArray[i6] = (char) (charArray[i6] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i6 % 555));
        }
        return new java.lang.String(charArray);
    }

    private final boolean e() {
        return this.f527b.f().size() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25718v7)).intValue();
    }

    private static final void f(android.os.Bundle bundle, com.google.android.gms.internal.ads.MN mn) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25728w7)).booleanValue()) {
            bundle.putLong(mn.e(), p174r3.v.c().a());
        }
    }

    private static final void g(android.os.Bundle bundle, int i6) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i6 - 1);
    }

    public final B3.N a(com.google.android.gms.internal.ads.C2363Fq c2363Fq, final B3.BinderC0816w binderC0816w, android.os.Bundle bundle) {
        f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_VALIDATION_START);
        if (p174r3.v.s().j().M()) {
            this.f527b.g();
            g(bundle, 7);
        } else {
            if (this.f530e != null) {
                B3.a0 a0Var = this.f527b;
                android.content.Context context = this.f526a;
                java.lang.String strE = a0Var.e();
                int iB = a0Var.b();
                java.lang.String strD = a0Var.d();
                int iA = a0Var.a();
                if (android.text.TextUtils.equals(context.getApplicationInfo().packageName, strE) && iB == this.f530e.versionCode && android.text.TextUtils.equals(android.os.Build.MODEL, strD) && iA == android.os.Build.VERSION.SDK_INT) {
                    for (java.util.Map.Entry entry : this.f527b.f().entrySet()) {
                        try {
                            long j6 = new org.json.JSONObject((java.lang.String) entry.getValue()).getLong("ts_ms");
                            if (p174r3.v.c().a() - j6 <= ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25708u7)).longValue()) {
                                com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0I = com.google.android.gms.internal.ads.C2677Oe0.k(this.f526a).i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), p174r3.v.s().j().M());
                                com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0I2 = com.google.android.gms.internal.ads.C2714Pe0.j(this.f526a).i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25665q3)).longValue(), p174r3.v.s().j().M());
                                if ((c2530Ke0I.a() == -1 || c2530Ke0I.a() <= j6) && (c2530Ke0I2.a() == -1 || c2530Ke0I2.a() <= j6)) {
                                }
                            }
                            this.f527b.c((java.lang.String) entry.getKey());
                        } catch (java.io.IOException | org.json.JSONException unused) {
                        }
                    }
                } else {
                    this.f527b.g();
                    this.f527b.i(this.f526a.getApplicationInfo().packageName, this.f530e.versionCode, android.os.Build.MODEL, android.os.Build.VERSION.SDK_INT);
                }
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_VALIDATION_END);
                if (p174r3.v.c().a() - this.f528c > ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25678r7)).longValue()) {
                    g(bundle, 2);
                    return null;
                }
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_CACHE_KEY_START);
                java.lang.String str = c2363Fq.f27458C;
                java.lang.String str2 = c2363Fq.f27459D;
                java.lang.String string = c2363Fq.f27461F.f54165P.toString();
                java.lang.String string2 = c2363Fq.f27461F.f54154E.toString();
                p184s3.X1 x6 = c2363Fq.f27461F;
                final java.lang.String strI = p224w3.g.i(str + str2 + string + string2 + x6.f54160K + x6.f54167R + java.lang.String.valueOf(x6.f54166Q));
                if (android.text.TextUtils.isEmpty(strI)) {
                    g(bundle, 3);
                    return null;
                }
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_CACHE_KEY_END);
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                java.lang.String strC = this.f527b.c(strI);
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!e()) {
                    final com.google.android.gms.internal.ads.C2363Fq c2363Fq2 = new com.google.android.gms.internal.ads.C2363Fq(c2363Fq.f27458C, c2363Fq.f27459D, c2363Fq.f27460E, c2363Fq.f27461F, 2, strI);
                    this.f529d.schedule(new java.lang.Runnable() { // from class: B3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f603C.c(strI, binderC0816w, c2363Fq2);
                        }
                    }, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25698t7)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                if (android.text.TextUtils.isEmpty(strC)) {
                    g(bundle, 4);
                    return null;
                }
                f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_DECODE_START);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strC);
                    java.lang.String string3 = jSONObject.getString("sr");
                    if (android.text.TextUtils.isEmpty(string3)) {
                        g(bundle, 8);
                        return null;
                    }
                    java.lang.String string4 = jSONObject.getString("rs");
                    if (android.text.TextUtils.isEmpty(string4)) {
                        g(bundle, 9);
                        return null;
                    }
                    java.lang.String strB = b(new java.lang.String(android.util.Base64.decode(string4, 10), java.nio.charset.StandardCharsets.UTF_8));
                    f(bundle, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        B3.N n6 = new B3.N(new android.util.JsonReader(new java.io.StringReader(string3)), null);
                        n6.f554c = strB;
                        n6.f556e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return n6;
                    } catch (java.io.IOException e6) {
                        g(bundle, 6);
                        p174r3.v.s().x(e6, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (org.json.JSONException e10) {
                    g(bundle, 5);
                    p174r3.v.s().x(e10, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.f527b.g();
            g(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void c(java.lang.String str, B3.BinderC0816w binderC0816w, com.google.android.gms.internal.ads.C2363Fq c2363Fq) {
        if (this.f527b.j(str) || e()) {
            return;
        }
        binderC0816w.F3(X3.b.c2(this.f526a), c2363Fq, null);
    }

    public final void d(java.lang.String str, B3.N n6) {
        java.lang.String string;
        if (android.text.TextUtils.isEmpty(str) || e()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("params", n6.f552a);
            jSONObject2.put("signal_dictionary", p184s3.C7147y.b().k(n6.f557f));
            jSONObject.put("sr", jSONObject2);
            java.lang.String str2 = n6.f554c;
            if (android.text.TextUtils.isEmpty(str2)) {
                string = "";
            } else {
                jSONObject.put("rs", android.util.Base64.encodeToString(b(str2).getBytes(java.nio.charset.StandardCharsets.UTF_8), 10));
                jSONObject.put("ts_ms", p174r3.v.c().a());
                string = jSONObject.toString();
            }
        } catch (org.json.JSONException e6) {
            p174r3.v.s().x(e6, "DiskCachingManager.createStringToWrite");
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        this.f527b.h(str, string);
    }
}
