package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2358Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3952hl f27452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P4.d f27453b;

    C2358Fl(com.google.android.gms.internal.ads.C3952hl c3952hl) {
        this.f27452a = c3952hl;
    }

    private final void d() {
        if (this.f27453b == null) {
            final com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
            this.f27453b = c4512mr;
            this.f27452a.b(null).f(new com.google.android.gms.internal.ads.InterfaceC4952qr() { // from class: com.google.android.gms.internal.ads.Cl
                @Override // com.google.android.gms.internal.ads.InterfaceC4952qr
                public final void b(java.lang.Object obj) {
                    c4512mr.c((com.google.android.gms.internal.ads.InterfaceC4061il) obj);
                }
            }, new com.google.android.gms.internal.ads.InterfaceC4732or() { // from class: com.google.android.gms.internal.ads.Dl
                @Override // com.google.android.gms.internal.ads.InterfaceC4732or
                public final void a() {
                    c4512mr.d(new com.google.android.gms.internal.ads.C4280kl("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final com.google.android.gms.internal.ads.C2469Il a(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC4720ol interfaceC4720ol, com.google.android.gms.internal.ads.InterfaceC4610nl interfaceC4610nl) {
        d();
        return new com.google.android.gms.internal.ads.C2469Il(this.f27453b, "google.afma.activeView.handleUpdate", interfaceC4720ol, interfaceC4610nl);
    }

    public final void b(final java.lang.String str, final com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        d();
        this.f27453b = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f27453b, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.El
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC4061il interfaceC4061il = (com.google.android.gms.internal.ads.InterfaceC4061il) obj;
                interfaceC4061il.W(str, interfaceC3838gj);
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(interfaceC4061il);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    public final void c(final java.lang.String str, final com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        this.f27453b = com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f27453b, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Bl
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.InterfaceC4061il interfaceC4061il = (com.google.android.gms.internal.ads.InterfaceC4061il) obj;
                interfaceC4061il.q0(str, interfaceC3838gj);
                return interfaceC4061il;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }
}
