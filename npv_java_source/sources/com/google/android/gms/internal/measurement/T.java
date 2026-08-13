package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class T implements com.google.android.gms.internal.measurement.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5963a3 f40661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f40662b;

    public T(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.lang.String str) {
        this.f40661a = c5963a3;
        this.f40662b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final com.google.android.gms.internal.measurement.C5963a3 a(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        this.f40661a.e(this.f40662b, interfaceC6117s);
        return this.f40661a;
    }
}
