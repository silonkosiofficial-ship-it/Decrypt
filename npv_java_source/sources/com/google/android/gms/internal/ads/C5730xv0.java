package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5730xv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.android.gms.internal.ads.C5730xv0 f39939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.C5730xv0 f39940c = new com.google.android.gms.internal.ads.C5730xv0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39941a = java.util.Collections.emptyMap();

    C5730xv0(boolean z6) {
    }

    public static com.google.android.gms.internal.ads.C5730xv0 a() {
        int i6 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        return f39940c;
    }

    public static com.google.android.gms.internal.ads.C5730xv0 b() {
        com.google.android.gms.internal.ads.C5730xv0 c5730xv0 = f39939b;
        if (c5730xv0 != null) {
            return c5730xv0;
        }
        synchronized (com.google.android.gms.internal.ads.C5730xv0.class) {
            try {
                com.google.android.gms.internal.ads.C5730xv0 c5730xv1 = f39939b;
                if (c5730xv1 != null) {
                    return c5730xv1;
                }
                int i6 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
                com.google.android.gms.internal.ads.C5730xv0 c5730xv0A = com.google.android.gms.internal.ads.Dv0.a(com.google.android.gms.internal.ads.C5730xv0.class);
                f39939b = c5730xv0A;
                return c5730xv0A;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.ads.Hv0 c(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, int i6) {
        androidx.appcompat.app.D.a(this.f39941a.get(new com.google.android.gms.internal.ads.C5620wv0(interfaceC4523mw0, i6)));
        return null;
    }
}
