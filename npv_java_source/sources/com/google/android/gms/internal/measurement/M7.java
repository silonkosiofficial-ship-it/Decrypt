package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class M7 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Callable f40581E;

    public M7(java.lang.String str, java.util.concurrent.Callable callable) {
        super(str);
        this.f40581E = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        try {
            return com.google.android.gms.internal.measurement.AbstractC5973b4.b(this.f40581E.call());
        } catch (java.lang.Exception unused) {
            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        }
    }
}
