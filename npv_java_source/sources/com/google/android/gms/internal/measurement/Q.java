package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class Q implements com.google.android.gms.internal.measurement.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5963a3 f40642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f40643b;

    public Q(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.lang.String str) {
        this.f40642a = c5963a3;
        this.f40643b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final com.google.android.gms.internal.measurement.C5963a3 a(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        com.google.android.gms.internal.measurement.C5963a3 c5963a3D = this.f40642a.d();
        c5963a3D.e(this.f40643b, interfaceC6117s);
        return c5963a3D;
    }
}
