package com.google.android.gms.ads.nativead;

/* JADX INFO: loaded from: classes.dex */
public final class d extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.widget.FrameLayout f24780C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5261th f24781D;

    public d(android.content.Context context) {
        super(context);
        this.f24780C = d(context);
        this.f24781D = e();
    }

    private final android.widget.FrameLayout d(android.content.Context context) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final com.google.android.gms.internal.ads.InterfaceC5261th e() {
        if (isInEditMode()) {
            return null;
        }
        android.widget.FrameLayout frameLayout = this.f24780C;
        return p184s3.C7147y.a().h(frameLayout.getContext(), this, frameLayout);
    }

    private final void f(java.lang.String str, android.view.View view) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null) {
            return;
        }
        try {
            interfaceC5261th.Q1(str, X3.b.c2(view));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call setAssetView on delegate", e6);
        }
    }

    protected final android.view.View a(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th != null) {
            try {
                X3.a aVarY = interfaceC5261th.y(str);
                if (aVarY != null) {
                    return (android.view.View) X3.b.L0(aVarY);
                }
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Unable to call getAssetView on delegate", e6);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        super.bringChildToFront(this.f24780C);
    }

    final /* synthetic */ void b(p104k3.n nVar) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null) {
            return;
        }
        try {
            if (nVar == null) {
                interfaceC5261th.h1(null);
            } else {
                p224w3.p.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call setMediaContent on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(android.view.View view) {
        super.bringChildToFront(view);
        android.widget.FrameLayout frameLayout = this.f24780C;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(android.widget.ImageView.ScaleType scaleType) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null || scaleType == null) {
            return;
        }
        try {
            interfaceC5261th.v4(X3.b.c2(scaleType));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call setMediaViewImageScaleType on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f24781D != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.tb)).booleanValue()) {
                try {
                    this.f24781D.s0(X3.b.c2(motionEvent));
                } catch (android.os.RemoteException e6) {
                    p224w3.p.e("Unable to call handleTouchEvent on delegate", e6);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.google.android.gms.ads.nativead.a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final android.view.View getAdvertiserView() {
        return a("3005");
    }

    public final android.view.View getBodyView() {
        return a("3004");
    }

    public final android.view.View getCallToActionView() {
        return a("3002");
    }

    public final android.view.View getHeadlineView() {
        return a("3001");
    }

    public final android.view.View getIconView() {
        return a("3003");
    }

    public final android.view.View getImageView() {
        return a("3008");
    }

    public final com.google.android.gms.ads.nativead.b getMediaView() {
        android.view.View viewA = a("3010");
        if (viewA instanceof com.google.android.gms.ads.nativead.b) {
            return (com.google.android.gms.ads.nativead.b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        p224w3.p.b("View is not an instance of MediaView");
        return null;
    }

    public final android.view.View getPriceView() {
        return a("3007");
    }

    public final android.view.View getStarRatingView() {
        return a("3009");
    }

    public final android.view.View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i6) {
        super.onVisibilityChanged(view, i6);
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null) {
            return;
        }
        try {
            interfaceC5261th.B1(X3.b.c2(view), i6);
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call onVisibilityChanged on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f24780C);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.f24780C == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(com.google.android.gms.ads.nativead.a aVar) {
        f("3011", aVar);
    }

    public final void setAdvertiserView(android.view.View view) {
        f("3005", view);
    }

    public final void setBodyView(android.view.View view) {
        f("3004", view);
    }

    public final void setCallToActionView(android.view.View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(android.view.View view) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null) {
            return;
        }
        try {
            interfaceC5261th.e4(X3.b.c2(view));
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call setClickConfirmingView on delegate", e6);
        }
    }

    public final void setHeadlineView(android.view.View view) {
        f("3001", view);
    }

    public final void setIconView(android.view.View view) {
        f("3003", view);
    }

    public final void setImageView(android.view.View view) {
        f("3008", view);
    }

    public final void setMediaView(com.google.android.gms.ads.nativead.b bVar) {
        f("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new com.google.android.gms.ads.nativead.f(this));
        bVar.b(new com.google.android.gms.ads.nativead.g(this));
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261th = this.f24781D;
        if (interfaceC5261th == null) {
            return;
        }
        try {
            interfaceC5261th.h5((X3.a) nativeAd.d());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to call setNativeAd on delegate", e6);
        }
    }

    public final void setPriceView(android.view.View view) {
        f("3007", view);
    }

    public final void setStarRatingView(android.view.View view) {
        f("3009", view);
    }

    public final void setStoreView(android.view.View view) {
        f("3006", view);
    }
}
