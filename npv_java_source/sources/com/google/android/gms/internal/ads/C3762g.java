package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3762g implements com.google.android.gms.internal.ads.InterfaceC4292kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35496a = 0;

    static {
        com.google.android.gms.internal.ads.AbstractC3009Xg0.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.f
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                int i6 = com.google.android.gms.internal.ads.C3762g.f35496a;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    java.lang.Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (objInvoke != null) {
                        return (com.google.android.gms.internal.ads.InterfaceC4292kr) objInvoke;
                    }
                    throw null;
                } catch (java.lang.Exception e6) {
                    throw new java.lang.IllegalStateException(e6);
                }
            }
        });
    }

    /* synthetic */ C3762g(com.google.android.gms.internal.ads.AbstractC3982i abstractC3982i) {
    }
}
