package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2607Mg0 implements java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.CharSequence f29816C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2755Qg0 f29817D;

    C2607Mg0(com.google.android.gms.internal.ads.C2755Qg0 c2755Qg0, java.lang.CharSequence charSequence) {
        this.f29816C = charSequence;
        this.f29817D = c2755Qg0;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f29817D.g(this.f29816C);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        com.google.android.gms.internal.ads.AbstractC5150sg0.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
