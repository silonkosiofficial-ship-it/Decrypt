package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2640Ne0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final java.lang.String f30344h = new java.util.UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f30345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f30346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f30347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f30348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f30349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2603Me0 f30350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2567Le0 f30351g;

    AbstractC2640Ne0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f30350f = com.google.android.gms.internal.ads.C2603Me0.b(context);
        this.f30351g = com.google.android.gms.internal.ads.C2567Le0.a(context);
        this.f30345a = str;
        this.f30346b = str.concat("_3p");
        this.f30347c = str2;
        this.f30348d = str2.concat("_3p");
        this.f30349e = str3;
    }

    private final java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 != null && str3 != null) {
            return java.util.UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(java.nio.charset.StandardCharsets.UTF_8)).toString();
        }
        java.lang.String str4 = this.f30349e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final long a(boolean z6) {
        return this.f30350f.a(z6 ? this.f30348d : this.f30347c, -1L);
    }

    final com.google.android.gms.internal.ads.C2530Ke0 b(java.lang.String str, java.lang.String str2, long j6, boolean z6) throws java.io.IOException {
        if (str != null) {
            try {
                java.util.UUID.fromString(str);
                if (!str.equals(f30344h)) {
                    java.lang.String strE = e(true);
                    java.lang.String strC = this.f30350f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
            return new com.google.android.gms.internal.ads.C2530Ke0();
        }
        boolean z10 = str != null;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.f30349e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z10);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f30350f.d(z10 ? this.f30348d : this.f30347c, java.lang.Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j6) {
                return c(str, str2);
            }
        }
        java.lang.String strE2 = e(z10);
        return (strE2 != null || z6) ? new com.google.android.gms.internal.ads.C2530Ke0(strE2, a(z10)) : c(str, str2);
    }

    final com.google.android.gms.internal.ads.C2530Ke0 c(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.lang.String strH;
        boolean z6;
        if (str == null) {
            strH = java.util.UUID.randomUUID().toString();
            z6 = false;
        } else {
            java.lang.String string = java.util.UUID.randomUUID().toString();
            this.f30350f.d("paid_3p_hash_key", string);
            strH = h(str, str2, string);
            z6 = true;
        }
        return d(strH, z6);
    }

    final com.google.android.gms.internal.ads.C2530Ke0 d(java.lang.String str, boolean z6) throws java.io.IOException {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.f30349e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f30350f.d(z6 ? this.f30348d : this.f30347c, java.lang.Long.valueOf(jCurrentTimeMillis));
        this.f30350f.d(z6 ? this.f30346b : this.f30345a, str);
        return new com.google.android.gms.internal.ads.C2530Ke0(str, jCurrentTimeMillis);
    }

    final java.lang.String e(boolean z6) {
        return this.f30350f.c(z6 ? this.f30346b : this.f30345a, null);
    }

    final void f(boolean z6) throws java.io.IOException {
        this.f30350f.e(z6 ? this.f30348d : this.f30347c);
        this.f30350f.e(z6 ? this.f30346b : this.f30345a);
    }

    final boolean g(boolean z6) {
        return this.f30350f.g(this.f30345a);
    }
}
