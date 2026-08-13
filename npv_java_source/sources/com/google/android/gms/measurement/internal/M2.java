package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class M2 implements com.google.android.gms.internal.measurement.InterfaceC6156w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.I2 f42027b;

    M2(com.google.android.gms.measurement.internal.I2 i6, java.lang.String str) {
        this.f42026a = str;
        this.f42027b = i6;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6156w6
    public final java.lang.String o(java.lang.String str) {
        java.util.Map map = (java.util.Map) this.f42027b.f41976d.get(this.f42026a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (java.lang.String) map.get(str);
    }
}
