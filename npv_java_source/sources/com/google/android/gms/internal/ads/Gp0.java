package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Gl0 f27900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f27902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f27903d;

    /* synthetic */ Gp0(com.google.android.gms.internal.ads.Gl0 gl0, int i6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.Hp0 hp0) {
        this.f27900a = gl0;
        this.f27901b = i6;
        this.f27902c = str;
        this.f27903d = str2;
    }

    public final int a() {
        return this.f27901b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Gp0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Gp0 gp0 = (com.google.android.gms.internal.ads.Gp0) obj;
        return this.f27900a == gp0.f27900a && this.f27901b == gp0.f27901b && this.f27902c.equals(gp0.f27902c) && this.f27903d.equals(gp0.f27903d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f27900a, java.lang.Integer.valueOf(this.f27901b), this.f27902c, this.f27903d);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f27900a, java.lang.Integer.valueOf(this.f27901b), this.f27902c, this.f27903d);
    }
}
