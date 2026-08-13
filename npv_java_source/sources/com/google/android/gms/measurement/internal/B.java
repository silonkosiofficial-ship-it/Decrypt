package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f41722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f41723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.lang.String f41724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f41725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f41726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.android.gms.measurement.internal.D f41727f;

    B(com.google.android.gms.measurement.internal.S2 s6, java.lang.String str, java.lang.String str2, java.lang.String str3, long j6, long j10, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.D d6;
        Q3.AbstractC1477p.f(str2);
        Q3.AbstractC1477p.f(str3);
        this.f41722a = str2;
        this.f41723b = str3;
        this.f41724c = android.text.TextUtils.isEmpty(str) ? null : str;
        this.f41725d = j6;
        this.f41726e = j10;
        if (j10 != 0 && j10 > j6) {
            s6.j().L().b("Event created with reverse previous/current timestamps. appId", com.google.android.gms.measurement.internal.C6428n2.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            d6 = new com.google.android.gms.measurement.internal.D(new android.os.Bundle());
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    s6.j().G().a("Param name can't be null");
                } else {
                    java.lang.Object objS0 = s6.L().s0(next, bundle2.get(next));
                    if (objS0 == null) {
                        s6.j().L().b("Param value can't be null", s6.D().f(next));
                    } else {
                        s6.L().O(bundle2, next, objS0);
                    }
                }
                it.remove();
            }
            d6 = new com.google.android.gms.measurement.internal.D(bundle2);
        }
        this.f41727f = d6;
    }

    private B(com.google.android.gms.measurement.internal.S2 s6, java.lang.String str, java.lang.String str2, java.lang.String str3, long j6, long j10, com.google.android.gms.measurement.internal.D d6) {
        Q3.AbstractC1477p.f(str2);
        Q3.AbstractC1477p.f(str3);
        Q3.AbstractC1477p.l(d6);
        this.f41722a = str2;
        this.f41723b = str3;
        this.f41724c = android.text.TextUtils.isEmpty(str) ? null : str;
        this.f41725d = j6;
        this.f41726e = j10;
        if (j10 != 0 && j10 > j6) {
            s6.j().L().c("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.measurement.internal.C6428n2.v(str2), com.google.android.gms.measurement.internal.C6428n2.v(str3));
        }
        this.f41727f = d6;
    }

    final com.google.android.gms.measurement.internal.B a(com.google.android.gms.measurement.internal.S2 s6, long j6) {
        return new com.google.android.gms.measurement.internal.B(s6, this.f41724c, this.f41722a, this.f41723b, this.f41725d, j6, this.f41727f);
    }

    public final java.lang.String toString() {
        return "Event{appId='" + this.f41722a + "', name='" + this.f41723b + "', params=" + java.lang.String.valueOf(this.f41727f) + "}";
    }
}
