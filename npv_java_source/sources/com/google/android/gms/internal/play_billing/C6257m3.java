package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6257m3 implements com.google.android.gms.internal.play_billing.InterfaceC6298t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6233i3 f41591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.AbstractC6333z3 f41592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41593c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.B2 f41594d;

    private C6257m3(com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3, com.google.android.gms.internal.play_billing.B2 b6, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3) {
        this.f41592b = abstractC6333z3;
        this.f41594d = b6;
        this.f41591a = interfaceC6233i3;
    }

    static com.google.android.gms.internal.play_billing.C6257m3 j(com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3, com.google.android.gms.internal.play_billing.B2 b6, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3) {
        return new com.google.android.gms.internal.play_billing.C6257m3(abstractC6333z3, b6, interfaceC6233i3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void a(java.lang.Object obj) {
        this.f41592b.a(obj);
        this.f41594d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final int b(java.lang.Object obj) {
        int iB = ((com.google.android.gms.internal.play_billing.L2) obj).zzc.b();
        if (!this.f41593c) {
            return iB;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final int c(java.lang.Object obj) {
        int iHashCode = ((com.google.android.gms.internal.play_billing.L2) obj).zzc.hashCode();
        if (!this.f41593c) {
            return iHashCode;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final java.lang.Object d() {
        com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3 = this.f41591a;
        return interfaceC6233i3 instanceof com.google.android.gms.internal.play_billing.L2 ? ((com.google.android.gms.internal.play_billing.L2) interfaceC6233i3).p() : interfaceC6233i3.H().g();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.AbstractC6310v3.u(this.f41592b, obj, obj2);
        if (this.f41593c) {
            com.google.android.gms.internal.play_billing.AbstractC6310v3.t(this.f41594d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void f(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
        com.google.android.gms.internal.play_billing.L2 l6 = (com.google.android.gms.internal.play_billing.L2) obj;
        if (l6.zzc == com.google.android.gms.internal.play_billing.A3.c()) {
            l6.zzc = com.google.android.gms.internal.play_billing.A3.f();
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final boolean g(java.lang.Object obj) {
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void h(java.lang.Object obj, com.google.android.gms.internal.play_billing.K3 k6) {
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.play_billing.L2) obj).zzc.equals(((com.google.android.gms.internal.play_billing.L2) obj2).zzc)) {
            return false;
        }
        if (!this.f41593c) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }
}
