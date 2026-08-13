package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2973Wg0 implements com.google.android.gms.internal.ads.InterfaceC2865Tg0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f32779F = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.Vg0
        @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
        public final java.lang.Object a() {
            throw new java.lang.IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3081Zg0 f32780C = new com.google.android.gms.internal.ads.C3081Zg0();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.InterfaceC2865Tg0 f32781D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Object f32782E;

    C2973Wg0(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
        this.f32781D = interfaceC2865Tg0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
    public final java.lang.Object a() {
        com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0 = this.f32781D;
        com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg1 = f32779F;
        if (interfaceC2865Tg0 != interfaceC2865Tg1) {
            synchronized (this.f32780C) {
                try {
                    if (this.f32781D != interfaceC2865Tg1) {
                        java.lang.Object objA = this.f32781D.a();
                        this.f32782E = objA;
                        this.f32781D = interfaceC2865Tg1;
                        return objA;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32782E;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f32781D;
        if (obj == f32779F) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.f32782E) + ">";
        }
        return "Suppliers.memoize(" + java.lang.String.valueOf(obj) + ")";
    }
}
