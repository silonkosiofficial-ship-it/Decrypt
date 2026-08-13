package com.google.android.gms.ads.nativead;

/* JADX INFO: loaded from: classes.dex */
public class b extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.ImageView.ScaleType f24758D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f24759E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.ads.nativead.f f24760F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.ads.nativead.g f24761G;

    public b(android.content.Context context) {
        super(context);
    }

    protected final synchronized void a(com.google.android.gms.ads.nativead.f fVar) {
        this.f24760F = fVar;
        if (this.f24757C) {
            fVar.f24782a.b(null);
        }
    }

    protected final synchronized void b(com.google.android.gms.ads.nativead.g gVar) {
        this.f24761G = gVar;
        if (this.f24759E) {
            gVar.f24783a.c(this.f24758D);
        }
    }

    public p104k3.n getMediaContent() {
        return null;
    }

    public void setImageScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.f24759E = true;
        this.f24758D = scaleType;
        com.google.android.gms.ads.nativead.g gVar = this.f24761G;
        if (gVar != null) {
            gVar.f24783a.c(scaleType);
        }
    }

    public void setMediaContent(p104k3.n nVar) {
        boolean zG0;
        this.f24757C = true;
        com.google.android.gms.ads.nativead.f fVar = this.f24760F;
        if (fVar != null) {
            fVar.f24782a.b(nVar);
        }
        if (nVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.InterfaceC2424Hh interfaceC2424HhA = nVar.a();
            if (interfaceC2424HhA != null) {
                if (!nVar.c()) {
                    if (nVar.b()) {
                        zG0 = interfaceC2424HhA.g0(X3.b.c2(this));
                    }
                    removeAllViews();
                }
                zG0 = interfaceC2424HhA.C0(X3.b.c2(this));
                if (zG0) {
                    return;
                }
                removeAllViews();
            }
        } catch (android.os.RemoteException e6) {
            removeAllViews();
            p224w3.p.e("", e6);
        }
    }
}
