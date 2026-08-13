package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5512vw0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C5512vw0 f39478c = new com.google.android.gms.internal.ads.C5512vw0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39479d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f39481b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Fw0 f39480a = new com.google.android.gms.internal.ads.C3645ew0();

    private C5512vw0() {
    }

    public static com.google.android.gms.internal.ads.C5512vw0 a() {
        return f39478c;
    }

    public final com.google.android.gms.internal.ads.Ew0 b(java.lang.Class cls) {
        com.google.android.gms.internal.ads.Tv0.c(cls, "messageType");
        com.google.android.gms.internal.ads.Ew0 ew0A = (com.google.android.gms.internal.ads.Ew0) this.f39481b.get(cls);
        if (ew0A == null) {
            ew0A = this.f39480a.a(cls);
            com.google.android.gms.internal.ads.Tv0.c(cls, "messageType");
            com.google.android.gms.internal.ads.Ew0 ew0 = (com.google.android.gms.internal.ads.Ew0) this.f39481b.putIfAbsent(cls, ew0A);
            if (ew0 != null) {
                return ew0;
            }
        }
        return ew0A;
    }
}
