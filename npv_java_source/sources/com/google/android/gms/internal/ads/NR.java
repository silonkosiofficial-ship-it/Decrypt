package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4909qR f30296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f30297c;

    public NR(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4909qR c4909qR, com.google.android.gms.internal.ads.Uy0 uy0) {
        this.f30295a = yk0;
        this.f30296b = c4909qR;
        this.f30297c = uy0;
    }

    private final P4.d g(final com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.MR mr, final com.google.android.gms.internal.ads.MR mr2, final com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0) {
        java.lang.String str = c2730Po.f30796F;
        p174r3.v.t();
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.f((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(p214v3.E0.d(str) ? com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AR(1)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.f(mr.a(c2730Po), java.util.concurrent.ExecutionException.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.KR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                java.lang.Throwable cause = (java.util.concurrent.ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(cause);
            }
        }, this.f30295a)), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.IR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(((com.google.android.gms.internal.ads.BR) obj).b());
            }
        }, this.f30295a), interfaceC5268tk0, this.f30295a), com.google.android.gms.internal.ads.AR.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.JR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f28685a.b(mr2, c2730Po, interfaceC5268tk0, (com.google.android.gms.internal.ads.AR) obj);
            }
        }, this.f30295a);
    }

    public final P4.d a(final com.google.android.gms.internal.ads.C2730Po c2730Po) {
        com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0 = new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.FR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                java.lang.String str = new java.lang.String(com.google.android.gms.internal.ads.AbstractC5486vj0.b((java.io.InputStream) obj), java.nio.charset.StandardCharsets.UTF_8);
                com.google.android.gms.internal.ads.C2730Po c2730Po2 = c2730Po;
                c2730Po2.f30802L = str;
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c2730Po2);
            }
        };
        final com.google.android.gms.internal.ads.C4909qR c4909qR = this.f30296b;
        j$.util.Objects.requireNonNull(c4909qR);
        return g(c2730Po, new com.google.android.gms.internal.ads.MR() { // from class: com.google.android.gms.internal.ads.GR
            @Override // com.google.android.gms.internal.ads.MR
            public final P4.d a(com.google.android.gms.internal.ads.C2730Po c2730Po2) {
                return c4909qR.c(c2730Po2);
            }
        }, new com.google.android.gms.internal.ads.MR() { // from class: com.google.android.gms.internal.ads.HR
            @Override // com.google.android.gms.internal.ads.MR
            public final P4.d a(com.google.android.gms.internal.ads.C2730Po c2730Po2) {
                return this.f28052a.c(c2730Po2);
            }
        }, interfaceC5268tk0);
    }

    final /* synthetic */ P4.d b(com.google.android.gms.internal.ads.MR mr, com.google.android.gms.internal.ads.C2730Po c2730Po, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0, com.google.android.gms.internal.ads.AR ar) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(mr.a(c2730Po), interfaceC5268tk0, this.f30295a);
    }

    final /* synthetic */ P4.d c(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return ((com.google.android.gms.internal.ads.BinderC3812gS) this.f30297c.b()).o6(c2730Po, android.os.Binder.getCallingUid());
    }

    final /* synthetic */ P4.d d(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return this.f30296b.d(c2730Po.f30800J);
    }

    final /* synthetic */ P4.d e(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return ((com.google.android.gms.internal.ads.BinderC3812gS) this.f30297c.b()).r6(c2730Po.f30800J);
    }

    public final P4.d f(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return g(c2730Po, new com.google.android.gms.internal.ads.MR() { // from class: com.google.android.gms.internal.ads.DR
            @Override // com.google.android.gms.internal.ads.MR
            public final P4.d a(com.google.android.gms.internal.ads.C2730Po c2730Po2) {
                return this.f26693a.d(c2730Po2);
            }
        }, new com.google.android.gms.internal.ads.MR() { // from class: com.google.android.gms.internal.ads.ER
            @Override // com.google.android.gms.internal.ads.MR
            public final P4.d a(com.google.android.gms.internal.ads.C2730Po c2730Po2) {
                return this.f27044a.e(c2730Po2);
            }
        }, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.CR
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
            }
        });
    }
}
