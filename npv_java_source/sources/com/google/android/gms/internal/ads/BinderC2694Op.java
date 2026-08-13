package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2694Op extends com.google.android.gms.internal.ads.AbstractBinderC2214Bp {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F3.b f30561C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2731Pp f30562D;

    public BinderC2694Op(F3.b bVar, com.google.android.gms.internal.ads.C2731Pp c2731Pp) {
        this.f30561C = bVar;
        this.f30562D = c2731Pp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void F(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void i() {
        com.google.android.gms.internal.ads.C2731Pp c2731Pp;
        F3.b bVar = this.f30561C;
        if (bVar == null || (c2731Pp = this.f30562D) == null) {
            return;
        }
        bVar.b(c2731Pp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void x(p184s3.W0 w6) {
        F3.b bVar = this.f30561C;
        if (bVar != null) {
            bVar.a(w6.f());
        }
    }
}
