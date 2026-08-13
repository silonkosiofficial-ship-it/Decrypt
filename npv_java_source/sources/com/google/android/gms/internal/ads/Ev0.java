package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Ev0 implements com.google.android.gms.internal.ads.InterfaceC4303kw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Ev0 f27254a = new com.google.android.gms.internal.ads.Ev0();

    private Ev0() {
    }

    public static com.google.android.gms.internal.ads.Ev0 a() {
        return f27254a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4303kw0
    public final com.google.android.gms.internal.ads.InterfaceC4083iw0 b(java.lang.Class cls) {
        if (!com.google.android.gms.internal.ads.Jv0.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (com.google.android.gms.internal.ads.InterfaceC4083iw0) com.google.android.gms.internal.ads.Jv0.I(cls.asSubclass(com.google.android.gms.internal.ads.Jv0.class)).y();
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4303kw0
    public final boolean c(java.lang.Class cls) {
        return com.google.android.gms.internal.ads.Jv0.class.isAssignableFrom(cls);
    }
}
