package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6041j0 extends com.google.android.gms.internal.measurement.AbstractC6110r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f40983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.EnumC6126t0 f40985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.EnumC6118s0 f40986f;

    private C6041j0(java.lang.String str, boolean z6, com.google.android.gms.internal.measurement.EnumC6126t0 enumC6126t0, com.google.android.gms.internal.measurement.InterfaceC6023h0 interfaceC6023h0, com.google.android.gms.internal.measurement.InterfaceC6014g0 interfaceC6014g0, com.google.android.gms.internal.measurement.EnumC6118s0 enumC6118s0) {
        this.f40983c = str;
        this.f40984d = z6;
        this.f40985e = enumC6126t0;
        this.f40986f = enumC6118s0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final com.google.android.gms.internal.measurement.InterfaceC6023h0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final com.google.android.gms.internal.measurement.InterfaceC6014g0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final com.google.android.gms.internal.measurement.EnumC6126t0 c() {
        return this.f40985e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final com.google.android.gms.internal.measurement.EnumC6118s0 d() {
        return this.f40986f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final java.lang.String e() {
        return this.f40983c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.AbstractC6110r0) {
            com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0 = (com.google.android.gms.internal.measurement.AbstractC6110r0) obj;
            if (this.f40983c.equals(abstractC6110r0.e()) && this.f40984d == abstractC6110r0.f() && this.f40985e.equals(abstractC6110r0.c())) {
                abstractC6110r0.a();
                abstractC6110r0.b();
                if (this.f40986f.equals(abstractC6110r0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6110r0
    public final boolean f() {
        return this.f40984d;
    }

    public final int hashCode() {
        return ((((((this.f40983c.hashCode() ^ 1000003) * 1000003) ^ (this.f40984d ? 1231 : 1237)) * 1000003) ^ this.f40985e.hashCode()) * 583896283) ^ this.f40986f.hashCode();
    }

    public final java.lang.String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f40983c + ", hasDifferentDmaOwner=" + this.f40984d + ", fileChecks=" + java.lang.String.valueOf(this.f40985e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + java.lang.String.valueOf(this.f40986f) + "}";
    }
}
