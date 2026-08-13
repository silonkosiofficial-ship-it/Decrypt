package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class TI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31919b;

    public TI0(long j6, long j10) {
        this.f31918a = j6;
        this.f31919b = j10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.TI0)) {
            return false;
        }
        com.google.android.gms.internal.ads.TI0 ti0 = (com.google.android.gms.internal.ads.TI0) obj;
        return this.f31918a == ti0.f31918a && this.f31919b == ti0.f31919b;
    }

    public final int hashCode() {
        return (((int) this.f31918a) * 31) + ((int) this.f31919b);
    }
}
