package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6113r3 extends com.google.android.gms.internal.measurement.AbstractC6053k3 {
    C6113r3(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Boolean bool, boolean z6) {
        super(c6121s3, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6053k3
    final /* synthetic */ java.lang.Object h(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.google.android.gms.internal.measurement.I2.f40543c.matcher(str).matches()) {
                return java.lang.Boolean.TRUE;
            }
            if (com.google.android.gms.internal.measurement.I2.f40544d.matcher(str).matches()) {
                return java.lang.Boolean.FALSE;
            }
        }
        java.lang.String str2 = "Invalid boolean value for " + super.k() + ": " + java.lang.String.valueOf(obj);
        return null;
    }
}
