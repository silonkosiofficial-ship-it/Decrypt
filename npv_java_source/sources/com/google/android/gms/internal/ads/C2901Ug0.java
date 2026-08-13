package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2901Ug0 implements java.io.Serializable, com.google.android.gms.internal.ads.InterfaceC2865Tg0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final transient com.google.android.gms.internal.ads.C3081Zg0 f32251C = new com.google.android.gms.internal.ads.C3081Zg0();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f32252D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    volatile transient boolean f32253E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    transient java.lang.Object f32254F;

    C2901Ug0(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
        this.f32252D = interfaceC2865Tg0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
    public final java.lang.Object a() {
        if (!this.f32253E) {
            synchronized (this.f32251C) {
                try {
                    if (!this.f32253E) {
                        java.lang.Object objA = this.f32252D.a();
                        this.f32254F = objA;
                        this.f32253E = true;
                        return objA;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32254F;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.f32253E) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.f32254F) + ">";
        } else {
            obj = this.f32252D;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
