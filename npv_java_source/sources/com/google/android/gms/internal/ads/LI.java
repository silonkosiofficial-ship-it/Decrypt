package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LI extends com.google.android.gms.internal.ads.AbstractBinderC4272kh {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f29459C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private X3.a f29460D;

    public LI(com.google.android.gms.internal.ads.C3581eJ c3581eJ) {
        this.f29459C = c3581eJ;
    }

    private static float o6(X3.a aVar) {
        android.graphics.drawable.Drawable drawable;
        if (aVar == null || (drawable = (android.graphics.drawable.Drawable) X3.b.L0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final void c0(X3.a aVar) {
        this.f29460D = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final float d() {
        if (this.f29459C.O() != 0.0f) {
            return this.f29459C.O();
        }
        if (this.f29459C.W() != null) {
            try {
                return this.f29459C.W().d();
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Remote exception getting video controller aspect ratio.", e6);
                return 0.0f;
            }
        }
        X3.a aVar = this.f29460D;
        if (aVar != null) {
            return o6(aVar);
        }
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohZ = this.f29459C.Z();
        if (interfaceC4712ohZ == null) {
            return 0.0f;
        }
        float f6 = (interfaceC4712ohZ.f() == -1 || interfaceC4712ohZ.c() == -1) ? 0.0f : interfaceC4712ohZ.f() / interfaceC4712ohZ.c();
        return f6 == 0.0f ? o6(interfaceC4712ohZ.e()) : f6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final float e() {
        if (this.f29459C.W() != null) {
            return this.f29459C.W().e();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final p184s3.Y0 g() {
        return this.f29459C.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final X3.a h() {
        X3.a aVar = this.f29460D;
        if (aVar != null) {
            return aVar;
        }
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohZ = this.f29459C.Z();
        if (interfaceC4712ohZ == null) {
            return null;
        }
        return interfaceC4712ohZ.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final float i() {
        if (this.f29459C.W() != null) {
            return this.f29459C.W().i();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final boolean k() {
        return this.f29459C.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final boolean l() {
        return this.f29459C.W() != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4382lh
    public final void q3(com.google.android.gms.internal.ads.C2974Wh c2974Wh) {
        if (this.f29459C.W() instanceof com.google.android.gms.internal.ads.BinderC5287tu) {
            ((com.google.android.gms.internal.ads.BinderC5287tu) this.f29459C.W()).u6(c2974Wh);
        }
    }
}
