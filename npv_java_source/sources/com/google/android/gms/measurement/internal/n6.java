package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class n6 extends com.google.android.gms.measurement.internal.AbstractC6341b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.N1 f42557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.h6 f42558h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n6(com.google.android.gms.measurement.internal.h6 h6Var, java.lang.String str, int i6, com.google.android.gms.internal.measurement.N1 n6) {
        super(str, i6);
        this.f42558h = h6Var;
        this.f42557g = n6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6341b
    final int a() {
        return this.f42557g.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6341b
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6341b
    final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(java.lang.Long l6, java.lang.Long l10, com.google.android.gms.internal.measurement.C6136u2 c6136u2, boolean z6) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2L;
        java.lang.String strG;
        java.lang.String str;
        java.lang.Boolean boolG;
        java.lang.Object[] objArr = com.google.android.gms.internal.measurement.B6.a() && this.f42558h.d().H(this.f42265a, com.google.android.gms.measurement.internal.G.f41904o0);
        boolean zK = this.f42557g.K();
        boolean zL = this.f42557g.L();
        boolean zM = this.f42557g.M();
        java.lang.Object[] objArr2 = zK || zL || zM;
        java.lang.Boolean boolD = null;
        boolD = null;
        if (z6 && objArr2 != true) {
            this.f42558h.j().K().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", java.lang.Integer.valueOf(this.f42266b), this.f42557g.N() ? java.lang.Integer.valueOf(this.f42557g.k()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.L1 l1G = this.f42557g.G();
        boolean zL2 = l1G.L();
        if (c6136u2.X()) {
            if (l1G.N()) {
                boolG = com.google.android.gms.measurement.internal.AbstractC6341b.c(c6136u2.O(), l1G.I());
                boolD = com.google.android.gms.measurement.internal.AbstractC6341b.d(boolG, zL2);
            } else {
                c6442p2L = this.f42558h.j().L();
                strG = this.f42558h.g().g(c6136u2.T());
                str = "No number filter for long property. property";
                c6442p2L.b(str, strG);
            }
        } else if (!c6136u2.V()) {
            if (c6136u2.Z()) {
                if (l1G.P()) {
                    boolG = com.google.android.gms.measurement.internal.AbstractC6341b.g(c6136u2.U(), l1G.J(), this.f42558h.j());
                } else if (!l1G.N()) {
                    c6442p2L = this.f42558h.j().L();
                    strG = this.f42558h.g().g(c6136u2.T());
                    str = "No string or number filter defined. property";
                } else if (com.google.android.gms.measurement.internal.Z5.g0(c6136u2.U())) {
                    boolG = com.google.android.gms.measurement.internal.AbstractC6341b.e(c6136u2.U(), l1G.I());
                } else {
                    this.f42558h.j().L().c("Invalid user property value for Numeric number filter. property, value", this.f42558h.g().g(c6136u2.T()), c6136u2.U());
                }
                boolD = com.google.android.gms.measurement.internal.AbstractC6341b.d(boolG, zL2);
            } else {
                c6442p2L = this.f42558h.j().L();
                strG = this.f42558h.g().g(c6136u2.T());
                str = "User property has no value, property";
            }
            c6442p2L.b(str, strG);
        } else if (l1G.N()) {
            boolG = com.google.android.gms.measurement.internal.AbstractC6341b.b(c6136u2.F(), l1G.I());
            boolD = com.google.android.gms.measurement.internal.AbstractC6341b.d(boolG, zL2);
        } else {
            c6442p2L = this.f42558h.j().L();
            strG = this.f42558h.g().g(c6136u2.T());
            str = "No number filter for double property. property";
            c6442p2L.b(str, strG);
        }
        this.f42558h.j().K().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f42267c = java.lang.Boolean.TRUE;
        if (zM && !boolD.booleanValue()) {
            return true;
        }
        if (!z6 || this.f42557g.K()) {
            this.f42268d = boolD;
        }
        if (boolD.booleanValue() && objArr2 != false && c6136u2.Y()) {
            long jQ = c6136u2.Q();
            if (l6 != null) {
                jQ = l6.longValue();
            }
            if (objArr != false && this.f42557g.K() && !this.f42557g.L() && l10 != null) {
                jQ = l10.longValue();
            }
            if (this.f42557g.L()) {
                this.f42270f = java.lang.Long.valueOf(jQ);
            } else {
                this.f42269e = java.lang.Long.valueOf(jQ);
            }
        }
        return true;
    }
}
