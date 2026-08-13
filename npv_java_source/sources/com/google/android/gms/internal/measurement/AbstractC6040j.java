package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6040j {
    public static /* synthetic */ java.math.BigDecimal a(java.math.BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
