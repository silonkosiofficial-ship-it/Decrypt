package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Hz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D f28357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D f28358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28360e;

    public Hz0(java.lang.String str, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D d10, int i6, int i10) {
        boolean z6 = true;
        if (i6 != 0) {
            if (i10 == 0) {
                i10 = 0;
            } else {
                z6 = false;
            }
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        com.google.android.gms.internal.ads.LC.c(str);
        this.f28356a = str;
        this.f28357b = d6;
        d10.getClass();
        this.f28358c = d10;
        this.f28359d = i6;
        this.f28360e = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.Hz0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.Hz0 hz0 = (com.google.android.gms.internal.ads.Hz0) obj;
            if (this.f28359d == hz0.f28359d && this.f28360e == hz0.f28360e && this.f28356a.equals(hz0.f28356a) && this.f28357b.equals(hz0.f28357b) && this.f28358c.equals(hz0.f28358c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f28359d + 527) * 31) + this.f28360e) * 31) + this.f28356a.hashCode()) * 31) + this.f28357b.hashCode()) * 31) + this.f28358c.hashCode();
    }
}
