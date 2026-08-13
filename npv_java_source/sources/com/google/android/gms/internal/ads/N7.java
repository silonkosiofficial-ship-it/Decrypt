package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class N7 extends com.google.android.gms.internal.ads.Ly0 implements java.io.Closeable {
    static {
        com.google.android.gms.internal.ads.Sy0.b(com.google.android.gms.internal.ads.N7.class);
    }

    public N7(com.google.android.gms.internal.ads.My0 my0, com.google.android.gms.internal.ads.M7 m10) {
        r(my0, my0.c(), m10);
    }

    @Override // com.google.android.gms.internal.ads.Ly0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    public final java.lang.String toString() {
        java.lang.String string = this.f29613D.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
