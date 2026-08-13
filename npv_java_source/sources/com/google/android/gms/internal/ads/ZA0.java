package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f33513c;

    /* synthetic */ ZA0(com.google.android.gms.internal.ads.XA0 xa0, com.google.android.gms.internal.ads.YA0 ya0) {
        this.f33511a = xa0.f33069a;
        this.f33512b = xa0.f33070b;
        this.f33513c = xa0.f33071c;
    }

    public final com.google.android.gms.internal.ads.XA0 a() {
        return new com.google.android.gms.internal.ads.XA0(this, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.ZA0)) {
            return false;
        }
        com.google.android.gms.internal.ads.ZA0 za0 = (com.google.android.gms.internal.ads.ZA0) obj;
        return this.f33511a == za0.f33511a && this.f33512b == za0.f33512b && this.f33513c == za0.f33513c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f33511a), java.lang.Float.valueOf(this.f33512b), java.lang.Long.valueOf(this.f33513c)});
    }
}
