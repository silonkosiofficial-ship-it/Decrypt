package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class S extends com.google.android.gms.internal.play_billing.U {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.S f41459D = new com.google.android.gms.internal.play_billing.S();

    private S() {
        super("");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return e((com.google.android.gms.internal.play_billing.U) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final int e(com.google.android.gms.internal.play_billing.U u6) {
        return u6 == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.U
    final void g(java.lang.StringBuilder sb) {
        throw new java.lang.AssertionError();
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    @Override // com.google.android.gms.internal.play_billing.U
    final void i(java.lang.StringBuilder sb) {
        sb.append("+∞)");
    }

    public final java.lang.String toString() {
        return "+∞";
    }
}
