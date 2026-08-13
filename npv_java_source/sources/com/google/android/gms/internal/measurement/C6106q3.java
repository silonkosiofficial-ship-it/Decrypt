package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6106q3 extends com.google.android.gms.internal.measurement.AbstractC6053k3 {
    C6106q3(com.google.android.gms.internal.measurement.C6121s3 c6121s3, java.lang.String str, java.lang.Double d6, boolean z6) {
        super(c6121s3, str, d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC6053k3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final java.lang.Double h(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String str = "Invalid double value for " + super.k() + ": " + java.lang.String.valueOf(obj);
        return null;
    }
}
