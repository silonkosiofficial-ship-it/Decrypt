package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.android.gms.internal.play_billing.A2 f41317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.A2 f41318c = new com.google.android.gms.internal.play_billing.A2(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f41319a = java.util.Collections.emptyMap();

    A2(boolean z6) {
    }

    public static com.google.android.gms.internal.play_billing.A2 a() {
        com.google.android.gms.internal.play_billing.A2 a6 = f41317b;
        if (a6 != null) {
            return a6;
        }
        synchronized (com.google.android.gms.internal.play_billing.A2.class) {
            try {
                com.google.android.gms.internal.play_billing.A2 a10 = f41317b;
                if (a10 != null) {
                    return a10;
                }
                int i6 = com.google.android.gms.internal.play_billing.C6281q3.f41638d;
                com.google.android.gms.internal.play_billing.A2 a2A = com.google.android.gms.internal.play_billing.H2.a(com.google.android.gms.internal.play_billing.A2.class);
                f41317b = a2A;
                return a2A;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.play_billing.K2 b(com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, int i6) {
        androidx.appcompat.app.D.a(this.f41319a.get(new com.google.android.gms.internal.play_billing.C6332z2(interfaceC6233i3, i6)));
        return null;
    }
}
