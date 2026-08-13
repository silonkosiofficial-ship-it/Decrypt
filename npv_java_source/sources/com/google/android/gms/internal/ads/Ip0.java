package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Cp0 f28499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f28500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f28501c;

    /* synthetic */ Ip0(com.google.android.gms.internal.ads.Cp0 cp0, java.util.List list, java.lang.Integer num, com.google.android.gms.internal.ads.Hp0 hp0) {
        this.f28499a = cp0;
        this.f28500b = list;
        this.f28501c = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Ip0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Ip0 ip0 = (com.google.android.gms.internal.ads.Ip0) obj;
        return this.f28499a.equals(ip0.f28499a) && this.f28500b.equals(ip0.f28500b) && j$.util.Objects.equals(this.f28501c, ip0.f28501c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f28499a, this.f28500b);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f28499a, this.f28500b, this.f28501c);
    }
}
