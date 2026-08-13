package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class O4 implements com.google.android.gms.internal.measurement.W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.W4[] f40632a;

    O4(com.google.android.gms.internal.measurement.W4... w4Arr) {
        this.f40632a = w4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final com.google.android.gms.internal.measurement.Y4 a(java.lang.Class cls) {
        for (com.google.android.gms.internal.measurement.W4 w6 : this.f40632a) {
            if (w6.b(cls)) {
                return w6.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final boolean b(java.lang.Class cls) {
        for (com.google.android.gms.internal.measurement.W4 w6 : this.f40632a) {
            if (w6.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
