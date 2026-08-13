package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3872h implements com.google.android.gms.internal.ads.InterfaceC2612Mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4292kr f35964a;

    public C3872h(com.google.android.gms.internal.ads.InterfaceC4292kr interfaceC4292kr) {
        this.f35964a = interfaceC4292kr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2612Mj
    public final com.google.android.gms.internal.ads.InterfaceC4608nk a(android.content.Context context, com.google.android.gms.internal.ads.PA0 pa0, com.google.android.gms.internal.ads.InterfaceC5105sC0 interfaceC5105sC0, com.google.android.gms.internal.ads.InterfaceC4624ns interfaceC4624ns, java.util.concurrent.Executor executor, java.util.List list, long j6) throws com.google.android.gms.internal.ads.C2437Hq {
        try {
            try {
                ((com.google.android.gms.internal.ads.InterfaceC2612Mj) java.lang.Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(com.google.android.gms.internal.ads.InterfaceC4292kr.class).newInstance(this.f35964a)).a(context, pa0, interfaceC5105sC0, interfaceC4624ns, executor, list, 0L);
                return null;
            } catch (java.lang.Exception e6) {
                e = e6;
                if (e instanceof com.google.android.gms.internal.ads.C2437Hq) {
                    throw ((com.google.android.gms.internal.ads.C2437Hq) e);
                }
                throw new com.google.android.gms.internal.ads.C2437Hq(e, -9223372036854775807L);
            }
        } catch (java.lang.Exception e10) {
            e = e10;
        }
    }
}
