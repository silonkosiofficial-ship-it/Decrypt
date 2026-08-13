package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class E3 extends com.google.android.gms.internal.play_billing.F3 {
    E3(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final double a(java.lang.Object obj, long j6) {
        return java.lang.Double.longBitsToDouble(this.f41396a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final float b(java.lang.Object obj, long j6) {
        return java.lang.Float.intBitsToFloat(this.f41396a.getInt(obj, j6));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.G3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.G3.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z6' boolean)' in method call: com.google.android.gms.internal.play_billing.G3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z6' boolean)' in method call: com.google.android.gms.internal.play_billing.G3.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.F3
    public final void c(java.lang.Object obj, long j6, boolean z6) {
        if (com.google.android.gms.internal.play_billing.G3.f41409h) {
            com.google.android.gms.internal.play_billing.G3.n(obj, j6, z6);
        } else {
            com.google.android.gms.internal.play_billing.G3.o(obj, j6, z6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final void d(java.lang.Object obj, long j6, byte b6) {
        if (com.google.android.gms.internal.play_billing.G3.f41409h) {
            com.google.android.gms.internal.play_billing.G3.d(obj, j6, b6);
        } else {
            com.google.android.gms.internal.play_billing.G3.e(obj, j6, b6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final void e(java.lang.Object obj, long j6, double d6) {
        this.f41396a.putLong(obj, j6, java.lang.Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final void f(java.lang.Object obj, long j6, float f6) {
        this.f41396a.putInt(obj, j6, java.lang.Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final boolean g(java.lang.Object obj, long j6) {
        return com.google.android.gms.internal.play_billing.G3.f41409h ? com.google.android.gms.internal.play_billing.G3.y(obj, j6) : com.google.android.gms.internal.play_billing.G3.z(obj, j6);
    }
}
