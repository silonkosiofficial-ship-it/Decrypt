package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Rp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Rp0 f31366b = new com.google.android.gms.internal.ads.Rp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f31367a = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.Rp0 a() {
        return f31366b;
    }

    public final synchronized void b(com.google.android.gms.internal.ads.Qp0 qp0, java.lang.Class cls) {
        try {
            com.google.android.gms.internal.ads.Qp0 qp1 = (com.google.android.gms.internal.ads.Qp0) this.f31367a.get(cls);
            if (qp1 != null && !qp1.equals(qp0)) {
                throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f31367a.put(cls, qp0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
