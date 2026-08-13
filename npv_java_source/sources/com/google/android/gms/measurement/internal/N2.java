package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class N2 implements com.google.android.gms.internal.measurement.K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.I2 f42063a;

    N2(com.google.android.gms.measurement.internal.I2 i6) {
        this.f42063a = i6;
    }

    @Override // com.google.android.gms.internal.measurement.K7
    public final void a(com.google.android.gms.internal.measurement.H7 h10, java.lang.String str, java.util.List list, boolean z6, boolean z10) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2F;
        int i6 = com.google.android.gms.measurement.internal.O2.f42068a[h10.ordinal()];
        if (i6 == 1) {
            c6442p2F = this.f42063a.j().F();
        } else if (i6 == 2) {
            com.google.android.gms.measurement.internal.C6428n2 c6428n2J = this.f42063a.j();
            if (z6) {
                c6442p2F = c6428n2J.I();
            } else {
                c6442p2F = !z10 ? c6428n2J.H() : c6428n2J.G();
            }
        } else if (i6 != 3) {
            c6442p2F = i6 != 4 ? this.f42063a.j().J() : this.f42063a.j().K();
        } else {
            com.google.android.gms.measurement.internal.C6428n2 c6428n2J2 = this.f42063a.j();
            if (z6) {
                c6442p2F = c6428n2J2.N();
            } else {
                c6442p2F = !z10 ? c6428n2J2.M() : c6428n2J2.L();
            }
        }
        int size = list.size();
        if (size == 1) {
            c6442p2F.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c6442p2F.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c6442p2F.a(str);
        } else {
            c6442p2F.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
