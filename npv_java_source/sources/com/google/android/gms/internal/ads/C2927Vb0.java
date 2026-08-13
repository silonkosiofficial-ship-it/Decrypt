package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2927Vb0 extends com.google.android.gms.internal.ads.C3035Yb0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C2927Vb0 f32523F = new com.google.android.gms.internal.ads.C2927Vb0();

    private C2927Vb0() {
    }

    public static com.google.android.gms.internal.ads.C2927Vb0 i() {
        return f32523F;
    }

    @Override // com.google.android.gms.internal.ads.C3035Yb0
    public final void b(boolean z6) {
        java.util.Iterator it = com.google.android.gms.internal.ads.C2963Wb0.a().c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).g().k(z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.C3035Yb0
    public final boolean c() {
        java.util.Iterator it = com.google.android.gms.internal.ads.C2963Wb0.a().b().iterator();
        while (it.hasNext()) {
            android.view.View viewF = ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).f();
            if (viewF != null && viewF.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
