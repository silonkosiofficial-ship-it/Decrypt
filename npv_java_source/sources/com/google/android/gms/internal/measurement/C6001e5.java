package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6001e5 implements com.google.android.gms.internal.measurement.InterfaceC6100p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC5965a5 f40874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.F5 f40875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.AbstractC6036i4 f40877d;

    private C6001e5(com.google.android.gms.internal.measurement.F5 f6, com.google.android.gms.internal.measurement.AbstractC6036i4 abstractC6036i4, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
        this.f40875b = f6;
        this.f40876c = abstractC6036i4.d(interfaceC5965a5);
        this.f40877d = abstractC6036i4;
        this.f40874a = interfaceC5965a5;
    }

    static com.google.android.gms.internal.measurement.C6001e5 j(com.google.android.gms.internal.measurement.F5 f6, com.google.android.gms.internal.measurement.AbstractC6036i4 abstractC6036i4, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
        return new com.google.android.gms.internal.measurement.C6001e5(f6, abstractC6036i4, interfaceC5965a5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final java.lang.Object a() {
        com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5 = this.f40874a;
        return interfaceC5965a5 instanceof com.google.android.gms.internal.measurement.AbstractC6130t4 ? ((com.google.android.gms.internal.measurement.AbstractC6130t4) interfaceC5965a5).y() : interfaceC5965a5.c().o();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final int b(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.F5 f6 = this.f40875b;
        int iE = f6.e(f6.k(obj));
        return this.f40876c ? iE + this.f40877d.b(obj).a() : iE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final int c(java.lang.Object obj) {
        int iHashCode = this.f40875b.k(obj).hashCode();
        return this.f40876c ? (iHashCode * 53) + this.f40877d.b(obj).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final boolean d(java.lang.Object obj) {
        return this.f40877d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void e(java.lang.Object obj) {
        this.f40875b.l(obj);
        this.f40877d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void f(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.AbstractC6115r5.n(this.f40875b, obj, obj2);
        if (this.f40876c) {
            com.google.android.gms.internal.measurement.AbstractC6115r5.l(this.f40877d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void g(java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        java.util.Iterator itL = this.f40877d.b(obj).l();
        if (itL.hasNext()) {
            androidx.appcompat.app.D.a(((java.util.Map.Entry) itL.next()).getKey());
            throw null;
        }
        com.google.android.gms.internal.measurement.F5 f6 = this.f40875b;
        f6.d(f6.k(obj), x6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void h(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.K3 k6) {
        com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4 = (com.google.android.gms.internal.measurement.AbstractC6130t4) obj;
        if (abstractC6130t4.zzb == com.google.android.gms.internal.measurement.E5.k()) {
            abstractC6130t4.zzb = com.google.android.gms.internal.measurement.E5.l();
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.f40875b.k(obj).equals(this.f40875b.k(obj2))) {
            return false;
        }
        if (this.f40876c) {
            return this.f40877d.b(obj).equals(this.f40877d.b(obj2));
        }
        return true;
    }
}
