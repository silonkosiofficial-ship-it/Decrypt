package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ac0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3167ac0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f34115b = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f34116a = new java.util.ArrayList();

    public final java.util.List a() {
        return this.f34116a;
    }

    public final void b(android.view.View view, com.google.android.gms.internal.ads.EnumC2450Ib0 enumC2450Ib0, java.lang.String str) {
        com.google.android.gms.internal.ads.C3071Zb0 c3071Zb0;
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f34115b.matcher("Ad overlay").matches()) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        java.util.Iterator it = this.f34116a.iterator();
        do {
            if (!it.hasNext()) {
                c3071Zb0 = null;
                break;
            }
            c3071Zb0 = (com.google.android.gms.internal.ads.C3071Zb0) it.next();
        } while (c3071Zb0.b().get() != view);
        if (c3071Zb0 == null) {
            this.f34116a.add(new com.google.android.gms.internal.ads.C3071Zb0(view, enumC2450Ib0, "Ad overlay"));
        }
    }

    public final void c() {
        this.f34116a.clear();
    }
}
