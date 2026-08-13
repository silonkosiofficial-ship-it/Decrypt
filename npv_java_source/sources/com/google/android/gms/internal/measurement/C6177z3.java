package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6177z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41313a;

    public C6177z3(com.google.android.gms.internal.measurement.InterfaceC6169y3 interfaceC6169y3) {
        M4.h.j(interfaceC6169y3, "BuildInfo must be non-null");
        this.f41313a = !interfaceC6169y3.a();
    }

    public final boolean a(java.lang.String str) {
        M4.h.j(str, "flagName must not be null");
        if (this.f41313a) {
            return ((N4.AbstractC1417q) com.google.android.gms.internal.measurement.C3.f40462a.get()).b(str);
        }
        return true;
    }
}
