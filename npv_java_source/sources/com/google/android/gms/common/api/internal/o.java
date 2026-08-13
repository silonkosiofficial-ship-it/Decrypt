package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P3.C1446b f24939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N3.C1391d f24940b;

    /* synthetic */ o(P3.C1446b c1446b, N3.C1391d c1391d, P3.p pVar) {
        this.f24939a = c1446b;
        this.f24940b = c1391d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.common.api.internal.o)) {
            com.google.android.gms.common.api.internal.o oVar = (com.google.android.gms.common.api.internal.o) obj;
            if (Q3.AbstractC1475n.a(this.f24939a, oVar.f24939a) && Q3.AbstractC1475n.a(this.f24940b, oVar.f24940b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(this.f24939a, this.f24940b);
    }

    public final java.lang.String toString() {
        return Q3.AbstractC1475n.c(this).a("key", this.f24939a).a("feature", this.f24940b).toString();
    }
}
