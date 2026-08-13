package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30137a;

    public static java.lang.String a(int i6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((char) ((i6 >> 24) & 255));
        sb.append((char) ((i6 >> 16) & 255));
        sb.append((char) ((i6 >> 8) & 255));
        sb.append((char) (i6 & 255));
        return sb.toString();
    }

    public java.lang.String toString() {
        return a(this.f30137a);
    }
}
