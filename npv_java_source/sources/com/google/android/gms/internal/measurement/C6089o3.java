package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6089o3 extends com.google.android.gms.internal.measurement.AbstractC6053k3 {
    C6089o3(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Long l6, boolean z6) {
        super(c6121s3, str, l6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC6053k3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long h(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String str = "Invalid long value for " + super.k() + ": " + java.lang.String.valueOf(obj);
        return null;
    }
}
