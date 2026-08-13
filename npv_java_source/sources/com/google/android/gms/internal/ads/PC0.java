package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class PC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4830pl f30670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3398ci0 f30671b = com.google.android.gms.internal.ads.AbstractC3398ci0.O();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3727fi0 f30672c = com.google.android.gms.internal.ads.AbstractC3727fi0.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.LH0 f30673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.LH0 f30674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.LH0 f30675f;

    public PC0(com.google.android.gms.internal.ads.C4830pl c4830pl) {
        this.f30670a = c4830pl;
    }

    private static com.google.android.gms.internal.ads.LH0 j(com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.C4830pl c4830pl) {
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qmN = interfaceC5045rj.n();
        int iD = interfaceC5045rj.d();
        java.lang.Object objF = abstractC4942qmN.o() ? null : abstractC4942qmN.f(iD);
        int iC = (interfaceC5045rj.z() || abstractC4942qmN.o()) ? -1 : abstractC4942qmN.d(iD, c4830pl, false).c(com.google.android.gms.internal.ads.EW.K(interfaceC5045rj.k()));
        for (int i6 = 0; i6 < abstractC3398ci0.size(); i6++) {
            com.google.android.gms.internal.ads.LH0 lh1 = (com.google.android.gms.internal.ads.LH0) abstractC3398ci0.get(i6);
            if (m(lh1, objF, interfaceC5045rj.z(), interfaceC5045rj.b(), interfaceC5045rj.c(), iC)) {
                return lh1;
            }
        }
        if (abstractC3398ci0.isEmpty() && lh0 != null) {
            if (m(lh0, objF, interfaceC5045rj.z(), interfaceC5045rj.b(), interfaceC5045rj.c(), iC)) {
                return lh0;
            }
        }
        return null;
    }

    private final void k(com.google.android.gms.internal.ads.C3617ei0 c3617ei0, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        if (lh0 == null) {
            return;
        }
        if (abstractC4942qm.a(lh0.f29454a) != -1) {
            c3617ei0.a(lh0, abstractC4942qm);
            return;
        }
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm2 = (com.google.android.gms.internal.ads.AbstractC4942qm) this.f30672c.get(lh0);
        if (abstractC4942qm2 != null) {
            c3617ei0.a(lh0, abstractC4942qm2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    private final void l(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        com.google.android.gms.internal.ads.C3617ei0 c3617ei0 = new com.google.android.gms.internal.ads.C3617ei0();
        if (this.f30671b.isEmpty()) {
            k(c3617ei0, this.f30674e, abstractC4942qm);
            if (!com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f30675f, this.f30674e)) {
                k(c3617ei0, this.f30675f, abstractC4942qm);
            }
            if (!com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f30673d, this.f30674e) && !com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f30673d, this.f30675f)) {
                k(c3617ei0, this.f30673d, abstractC4942qm);
            }
        } else {
            for (int i6 = 0; i6 < this.f30671b.size(); i6++) {
                k(c3617ei0, (com.google.android.gms.internal.ads.LH0) this.f30671b.get(i6), abstractC4942qm);
            }
            if (!this.f30671b.contains(this.f30673d)) {
                k(c3617ei0, this.f30673d, abstractC4942qm);
            }
        }
        this.f30672c = c3617ei0.c();
    }

    private static boolean m(com.google.android.gms.internal.ads.LH0 lh0, java.lang.Object obj, boolean z6, int i6, int i10, int i11) {
        if (!lh0.f29454a.equals(obj)) {
            return false;
        }
        if (z6) {
            if (lh0.f29455b != i6 || lh0.f29456c != i10) {
                return false;
            }
        } else if (lh0.f29455b != -1 || lh0.f29458e != i11) {
            return false;
        }
        return true;
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm a(com.google.android.gms.internal.ads.LH0 lh0) {
        return (com.google.android.gms.internal.ads.AbstractC4942qm) this.f30672c.get(lh0);
    }

    public final com.google.android.gms.internal.ads.LH0 b() {
        return this.f30673d;
    }

    public final com.google.android.gms.internal.ads.LH0 c() {
        java.lang.Object next;
        java.lang.Object obj;
        if (this.f30671b.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = this.f30671b;
        if (!(abstractC3398ci0 instanceof java.util.List)) {
            java.util.Iterator<E> it = abstractC3398ci0.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (abstractC3398ci0.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            obj = abstractC3398ci0.get(abstractC3398ci0.size() - 1);
        }
        return (com.google.android.gms.internal.ads.LH0) obj;
    }

    public final com.google.android.gms.internal.ads.LH0 d() {
        return this.f30674e;
    }

    public final com.google.android.gms.internal.ads.LH0 e() {
        return this.f30675f;
    }

    public final void g(com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj) {
        this.f30673d = j(interfaceC5045rj, this.f30671b, this.f30674e, this.f30670a);
    }

    public final void h(java.util.List list, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj) {
        this.f30671b = com.google.android.gms.internal.ads.AbstractC3398ci0.M(list);
        if (!list.isEmpty()) {
            this.f30674e = (com.google.android.gms.internal.ads.LH0) list.get(0);
            lh0.getClass();
            this.f30675f = lh0;
        }
        if (this.f30673d == null) {
            this.f30673d = j(interfaceC5045rj, this.f30671b, this.f30674e, this.f30670a);
        }
        l(interfaceC5045rj.n());
    }

    public final void i(com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj) {
        this.f30673d = j(interfaceC5045rj, this.f30671b, this.f30674e, this.f30670a);
        l(interfaceC5045rj.n());
    }
}
