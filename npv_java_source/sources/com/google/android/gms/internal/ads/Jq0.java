package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Jq0 extends java.lang.RuntimeException {
    public Jq0(java.lang.String str) {
        super(str);
    }

    public Jq0(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public Jq0(java.lang.Throwable th) {
        super(th);
    }

    public static java.lang.Object a(com.google.android.gms.internal.ads.Iq0 iq0) {
        try {
            return iq0.a();
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.Jq0(e6);
        }
    }
}
