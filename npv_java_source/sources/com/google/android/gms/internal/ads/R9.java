package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class R9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.S9 f31212C;

    R9(com.google.android.gms.internal.ads.S9 s10) {
        this.f31212C = s10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f31212C.f31588b != null) {
            return;
        }
        synchronized (com.google.android.gms.internal.ads.S9.f31584c) {
            if (this.f31212C.f31588b != null) {
                return;
            }
            boolean z6 = false;
            try {
                zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2161Af.f25264F2.e()).booleanValue();
            } catch (java.lang.IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    com.google.android.gms.internal.ads.S9.f31585d = com.google.android.gms.internal.ads.C3075Zd0.b(this.f31212C.f31587a.f26724a, "ADSHIELD", null);
                } catch (java.lang.Throwable unused2) {
                }
            }
            z6 = zBooleanValue;
            this.f31212C.f31588b = java.lang.Boolean.valueOf(z6);
            com.google.android.gms.internal.ads.S9.f31584c.open();
        }
    }
}
