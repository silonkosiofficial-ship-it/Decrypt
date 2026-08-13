package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f34635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1[] f34636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4595nd0 f34637c = new com.google.android.gms.internal.ads.C4595nd0(new com.google.android.gms.internal.ads.InterfaceC4483mc0() { // from class: com.google.android.gms.internal.ads.c6
        @Override // com.google.android.gms.internal.ads.InterfaceC4483mc0
        public final void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
            this.f34446a.d(j6, c5128sR);
        }
    });

    public C3446d6(java.util.List list) {
        this.f34635a = list;
        this.f34636b = new com.google.android.gms.internal.ads.InterfaceC3107a1[list.size()];
    }

    public final void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        this.f34637c.b(j6, c5128sR);
    }

    public final void b(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        for (int i6 = 0; i6 < this.f34636b.length; i6++) {
            c4543n6.c();
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 3);
            com.google.android.gms.internal.ads.D d6 = (com.google.android.gms.internal.ads.D) this.f34635a.get(i6);
            java.lang.String str = d6.f26574o;
            boolean z6 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z6 = false;
            }
            com.google.android.gms.internal.ads.LC.e(z6, "Invalid closed caption MIME type provided: ".concat(java.lang.String.valueOf(str)));
            java.lang.String strB = d6.f26560a;
            if (strB == null) {
                strB = c4543n6.b();
            }
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.m(strB);
            c4682oK0.B(str);
            c4682oK0.D(d6.f26564e);
            c4682oK0.q(d6.f26563d);
            c4682oK0.p0(d6.f26556I);
            c4682oK0.n(d6.f26577r);
            interfaceC3107a1S.c(c4682oK0.H());
            this.f34636b[i6] = interfaceC3107a1S;
        }
    }

    public final void c() {
        this.f34637c.c();
    }

    final /* synthetic */ void d(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.AbstractC3543e0.a(j6, c5128sR, this.f34636b);
    }

    public final void e(int i6) {
        this.f34637c.d(i6);
    }
}
