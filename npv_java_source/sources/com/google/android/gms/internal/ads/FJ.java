package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FJ {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final android.widget.ImageView.ScaleType f27334k = android.widget.ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f27335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f27336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4129jJ f27337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f27338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TJ f27339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3364cK f27340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.Executor f27341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.Executor f27342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3505dh f27343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3253bJ f27344j;

    public FJ(p214v3.InterfaceC7268s0 interfaceC7268s0, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C4129jJ c4129jJ, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.TJ tj, com.google.android.gms.internal.ads.C3364cK c3364cK, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.C3253bJ c3253bJ) {
        this.f27335a = interfaceC7268s0;
        this.f27336b = c4546n70;
        this.f27343i = c4546n70.f37516i;
        this.f27337c = c4129jJ;
        this.f27338d = c3581eJ;
        this.f27339e = tj;
        this.f27340f = c3364cK;
        this.f27341g = executor;
        this.f27342h = executor2;
        this.f27344j = c3253bJ;
    }

    private static void h(android.widget.RelativeLayout.LayoutParams layoutParams, int i6) {
        if (i6 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i6 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i6 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(android.view.ViewGroup viewGroup, boolean z6) {
        android.view.View viewS = z6 ? this.f27338d.S() : this.f27338d.T();
        if (viewS == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewS.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) viewS.getParent()).removeView(viewS);
        }
        viewGroup.addView(viewS, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25441V3)).booleanValue() ? new android.widget.FrameLayout.LayoutParams(-1, -1, 17) : new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(android.view.ViewGroup viewGroup) {
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f27338d;
        if (c3581eJ.S() != null) {
            boolean z6 = viewGroup != null;
            if (c3581eJ.P() == 2 || c3581eJ.P() == 1) {
                this.f27335a.B(this.f27336b.f37513f, java.lang.String.valueOf(c3581eJ.P()), z6);
            } else if (c3581eJ.P() == 6) {
                this.f27335a.B(this.f27336b.f37513f, "2", z6);
                this.f27335a.B(this.f27336b.f37513f, "1", z6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0197  */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        android.view.ViewGroup viewGroup;
        android.view.View viewR;
        final android.view.ViewGroup viewGroup2;
        com.google.android.gms.internal.ads.InterfaceC4382lh interfaceC4382lhA;
        android.graphics.drawable.Drawable drawable;
        android.widget.ImageView.ScaleType scaleType;
        if (!this.f27337c.f() && !this.f27337c.e()) {
            viewGroup = null;
            break;
        }
        java.lang.String[] strArr = {"1098", "3011"};
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                viewGroup = null;
                break;
            }
            android.view.View viewS = interfaceViewOnClickListenerC3583eK.S(strArr[i6]);
            if (viewS != null && (viewS instanceof android.view.ViewGroup)) {
                viewGroup = (android.view.ViewGroup) viewS;
                break;
            }
            i6++;
        }
        android.content.Context context = interfaceViewOnClickListenerC3583eK.e().getContext();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        com.google.android.gms.internal.ads.C3581eJ c3581eJ = this.f27338d;
        if (c3581eJ.R() != null) {
            com.google.android.gms.internal.ads.C3505dh c3505dh = this.f27343i;
            viewR = c3581eJ.R();
            if (c3505dh != null && viewGroup == null) {
                h(layoutParams, c3505dh.f34779G);
                viewR.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (c3581eJ.Y() instanceof com.google.android.gms.internal.ads.BinderC3044Yg) {
            com.google.android.gms.internal.ads.BinderC3044Yg binderC3044Yg = (com.google.android.gms.internal.ads.BinderC3044Yg) c3581eJ.Y();
            if (viewGroup == null) {
                h(layoutParams, binderC3044Yg.c());
                viewGroup = null;
            }
            android.view.View c3080Zg = new com.google.android.gms.internal.ads.C3080Zg(context, binderC3044Yg, layoutParams);
            c3080Zg.setContentDescription((java.lang.CharSequence) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25419T3));
            viewR = c3080Zg;
        } else {
            viewR = null;
        }
        if (viewR != null) {
            if (viewR.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) viewR.getParent()).removeView(viewR);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewR);
            } else {
                p134n3.h hVar = new p134n3.h(interfaceViewOnClickListenerC3583eK.e().getContext());
                hVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                hVar.addView(viewR);
                android.widget.FrameLayout frameLayoutG = interfaceViewOnClickListenerC3583eK.g();
                if (frameLayoutG != null) {
                    frameLayoutG.addView(hVar);
                }
            }
            interfaceViewOnClickListenerC3583eK.c2(interfaceViewOnClickListenerC3583eK.k(), viewR, true);
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = com.google.android.gms.internal.ads.BJ.f25923Q;
        int size = abstractC3398ci0.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                viewGroup2 = null;
                break;
            }
            android.view.View viewS2 = interfaceViewOnClickListenerC3583eK.S((java.lang.String) abstractC3398ci0.get(i10));
            i10++;
            if (viewS2 instanceof android.view.ViewGroup) {
                viewGroup2 = (android.view.ViewGroup) viewS2;
                break;
            }
        }
        this.f27342h.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.CJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f26191C.a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (i(viewGroup2, true)) {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ2 = this.f27338d;
            if (c3581eJ2.f0() != null) {
                c3581eJ2.f0().b1(new com.google.android.gms.internal.ads.EJ(interfaceViewOnClickListenerC3583eK, viewGroup2));
                return;
            }
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25425T9)).booleanValue() && i(viewGroup2, false)) {
            com.google.android.gms.internal.ads.C3581eJ c3581eJ3 = this.f27338d;
            if (c3581eJ3.d0() != null) {
                c3581eJ3.d0().b1(new com.google.android.gms.internal.ads.EJ(interfaceViewOnClickListenerC3583eK, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        android.view.View viewE = interfaceViewOnClickListenerC3583eK.e();
        android.content.Context context2 = viewE != null ? viewE.getContext() : null;
        if (context2 == null || (interfaceC4382lhA = this.f27344j.a()) == null) {
            return;
        }
        try {
            X3.a aVarH = interfaceC4382lhA.h();
            if (aVarH == null || (drawable = (android.graphics.drawable.Drawable) X3.b.L0(aVarH)) == null) {
                return;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context2);
            imageView.setImageDrawable(drawable);
            X3.a aVarJ = interfaceViewOnClickListenerC3583eK.j();
            if (aVarJ == null) {
                scaleType = f27334k;
            } else if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.a6)).booleanValue()) {
                scaleType = (android.widget.ImageView.ScaleType) X3.b.L0(aVarJ);
            } else {
                scaleType = f27334k;
            }
            imageView.setScaleType(scaleType);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (android.os.RemoteException unused) {
            p224w3.p.g("Could not get main image drawable");
        }
    }

    public final void c(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        if (interfaceViewOnClickListenerC3583eK == null || this.f27339e == null || interfaceViewOnClickListenerC3583eK.g() == null || !this.f27337c.g()) {
            return;
        }
        try {
            interfaceViewOnClickListenerC3583eK.g().addView(this.f27339e.a());
        } catch (com.google.android.gms.internal.ads.C3530du e6) {
            p214v3.AbstractC7265q0.l("web view can not be obtained", e6);
        }
    }

    public final void d(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        if (interfaceViewOnClickListenerC3583eK == null) {
            return;
        }
        android.content.Context context = interfaceViewOnClickListenerC3583eK.e().getContext();
        if (p214v3.Y.h(context, this.f27337c.f36630a)) {
            if (!(context instanceof android.app.Activity)) {
                p224w3.p.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f27340f == null || interfaceViewOnClickListenerC3583eK.g() == null) {
                return;
            }
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                windowManager.addView(this.f27340f.a(interfaceViewOnClickListenerC3583eK.g(), windowManager), p214v3.Y.b());
            } catch (com.google.android.gms.internal.ads.C3530du e6) {
                p214v3.AbstractC7265q0.l("web view can not be obtained", e6);
            }
        }
    }

    public final void e(final com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK) {
        this.f27341g.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.DJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f26667C.b(interfaceViewOnClickListenerC3583eK);
            }
        });
    }

    public final boolean f(android.view.ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(android.view.ViewGroup viewGroup) {
        return i(viewGroup, true);
    }
}
