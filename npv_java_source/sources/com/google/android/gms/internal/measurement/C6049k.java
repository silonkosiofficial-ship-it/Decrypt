package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6049k implements com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Double f40999C;

    public C6049k(java.lang.Double d6) {
        if (d6 == null) {
            this.f40999C = java.lang.Double.valueOf(Double.NaN);
        } else {
            this.f40999C = d6;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return new com.google.android.gms.internal.measurement.C6049k(this.f40999C);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        return this.f40999C;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        if (java.lang.Double.isNaN(this.f40999C.doubleValue())) {
            return "NaN";
        }
        if (java.lang.Double.isInfinite(this.f40999C.doubleValue())) {
            return this.f40999C.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(this.f40999C.doubleValue());
        java.math.BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : com.google.android.gms.internal.measurement.AbstractC6040j.a(bigDecimalValueOf);
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0E0");
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        java.lang.String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i6 = java.lang.Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i6 >= 0 || i6 <= -7) && (i6 < 0 || i6 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.C6049k) {
            return this.f40999C.equals(((com.google.android.gms.internal.measurement.C6049k) obj).f40999C);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.valueOf((java.lang.Double.isNaN(this.f40999C.doubleValue()) || this.f40999C.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return null;
    }

    public final int hashCode() {
        return this.f40999C.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        if ("toString".equals(str)) {
            return new com.google.android.gms.internal.measurement.C6133u(e());
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s.%s is not a function.", e(), str));
    }

    public final java.lang.String toString() {
        return e();
    }
}
