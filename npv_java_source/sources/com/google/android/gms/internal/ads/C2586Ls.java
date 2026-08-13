package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2586Ls implements java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f29578C = new java.util.ArrayList();

    final com.google.android.gms.internal.ads.C2550Ks d(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs) {
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C2550Ks c2550Ks = (com.google.android.gms.internal.ads.C2550Ks) it.next();
            if (c2550Ks.f29016c == interfaceC3746fs) {
                return c2550Ks;
            }
        }
        return null;
    }

    public final void e(com.google.android.gms.internal.ads.C2550Ks c2550Ks) {
        this.f29578C.add(c2550Ks);
    }

    public final void f(com.google.android.gms.internal.ads.C2550Ks c2550Ks) {
        this.f29578C.remove(c2550Ks);
    }

    public final boolean g(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C2550Ks c2550Ks = (com.google.android.gms.internal.ads.C2550Ks) it.next();
            if (c2550Ks.f29016c == interfaceC3746fs) {
                arrayList.add(c2550Ks);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.internal.ads.C2550Ks) it2.next()).f29017d.c();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f29578C.iterator();
    }
}
