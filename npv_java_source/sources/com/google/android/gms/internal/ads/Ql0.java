package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.CopyOnWriteArrayList f31053a = new java.util.concurrent.CopyOnWriteArrayList();

    public static com.google.android.gms.internal.ads.Pl0 a(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = f31053a.iterator();
        if (!it.hasNext()) {
            throw new java.security.GeneralSecurityException("No KMS client does support: ".concat(java.lang.String.valueOf(str)));
        }
        androidx.appcompat.app.D.a(it.next());
        throw null;
    }
}
