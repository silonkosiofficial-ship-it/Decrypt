package com.google.android.gms.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class b extends com.google.android.gms.measurement.AppMeasurement.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.S2 f41687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.F3 f41688b;

    public b(com.google.android.gms.measurement.internal.S2 s6) {
        super();
        Q3.AbstractC1477p.l(s6);
        this.f41687a = s6;
        this.f41688b = s6.H();
    }

    @Override // p085i4.z
    public final void E(java.lang.String str) {
        this.f41687a.y().D(str, this.f41687a.b().c());
    }

    @Override // p085i4.z
    public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f41687a.H().h0(str, str2, bundle);
    }

    @Override // p085i4.z
    public final java.util.Map b(java.lang.String str, java.lang.String str2, boolean z6) {
        return this.f41688b.H(str, str2, z6);
    }

    @Override // p085i4.z
    public final java.util.List c(java.lang.String str, java.lang.String str2) {
        return this.f41688b.G(str, str2);
    }

    @Override // p085i4.z
    public final void d(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f41688b.U0(str, str2, bundle);
    }

    @Override // p085i4.z
    public final long e() {
        return this.f41687a.L().R0();
    }

    @Override // p085i4.z
    public final void e0(android.os.Bundle bundle) {
        this.f41688b.N0(bundle);
    }

    @Override // p085i4.z
    public final java.lang.String g() {
        return this.f41688b.w0();
    }

    @Override // p085i4.z
    public final java.lang.String h() {
        return this.f41688b.x0();
    }

    @Override // p085i4.z
    public final java.lang.String i() {
        return this.f41688b.v0();
    }

    @Override // p085i4.z
    public final java.lang.String j() {
        return this.f41688b.v0();
    }

    @Override // p085i4.z
    public final int o(java.lang.String str) {
        return com.google.android.gms.measurement.internal.F3.E(str);
    }

    @Override // p085i4.z
    public final void y(java.lang.String str) {
        this.f41687a.y().z(str, this.f41687a.b().c());
    }
}
