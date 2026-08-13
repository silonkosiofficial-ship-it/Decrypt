package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.S2 f42438a;

    public i6(com.google.android.gms.measurement.internal.S2 s6) {
        this.f42438a = s6;
    }

    private final boolean d() {
        return this.f42438a.F().f42747z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f42438a.b().a() - this.f42438a.F().f42747z.a() > this.f42438a.z().A(null, com.google.android.gms.measurement.internal.G.f41854W);
    }

    final void a() {
        this.f42438a.l().n();
        if (d()) {
            if (e()) {
                this.f42438a.F().f42746y.b(null);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f42438a.H().b1("auto", "_cmpx", bundle);
            } else {
                java.lang.String strA = this.f42438a.F().f42746y.a();
                if (android.text.TextUtils.isEmpty(strA)) {
                    this.f42438a.j().I().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f42438a.F().f42747z.a() / 3600000) - 1) * 3600000;
                    android.net.Uri uri = android.net.Uri.parse(strA);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    android.util.Pair pair = new android.util.Pair(uri.getPath(), bundle2);
                    for (java.lang.String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((android.os.Bundle) pair.second).putLong("_cc", jA);
                    java.lang.Object obj = pair.first;
                    this.f42438a.H().b1(obj == null ? "app" : (java.lang.String) obj, "_cmp", (android.os.Bundle) pair.second);
                }
                this.f42438a.F().f42746y.b(null);
            }
            this.f42438a.F().f42747z.b(0L);
        }
    }

    final void b(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string;
        this.f42438a.l().n();
        if (this.f42438a.p()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.path(str);
            for (java.lang.String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        this.f42438a.F().f42746y.b(string);
        this.f42438a.F().f42747z.b(this.f42438a.b().a());
    }

    final void c() {
        if (d() && e()) {
            this.f42438a.F().f42746y.b(null);
        }
    }
}
