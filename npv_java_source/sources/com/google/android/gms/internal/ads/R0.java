package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.U0 f31105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.U0 f31106b;

    public R0(com.google.android.gms.internal.ads.U0 u6, com.google.android.gms.internal.ads.U0 u10) {
        this.f31105a = u6;
        this.f31106b = u10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.R0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.R0 r6 = (com.google.android.gms.internal.ads.R0) obj;
            if (this.f31105a.equals(r6.f31105a) && this.f31106b.equals(r6.f31106b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31105a.hashCode() * 31) + this.f31106b.hashCode();
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.U0 u6 = this.f31105a;
        com.google.android.gms.internal.ads.U0 u10 = this.f31106b;
        return "[" + u6.toString() + (u6.equals(u10) ? "" : ", ".concat(this.f31106b.toString())) + "]";
    }
}
