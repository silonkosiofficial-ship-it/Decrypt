package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.m f22665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.fragment.app.t f22666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.fragment.app.f f22667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22668d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22669e = -1;

    class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.view.View f22670C;

        a(android.view.View view) {
            this.f22670C = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            this.f22670C.removeOnAttachStateChangeListener(this);
            androidx.core.view.X.k0(this.f22670C);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22672a;

        static {
            int[] iArr = new int[androidx.lifecycle.AbstractC2079k.b.values().length];
            f22672a = iArr;
            try {
                iArr[androidx.lifecycle.AbstractC2079k.b.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22672a[androidx.lifecycle.AbstractC2079k.b.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22672a[androidx.lifecycle.AbstractC2079k.b.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f22672a[androidx.lifecycle.AbstractC2079k.b.INITIALIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    s(androidx.fragment.app.m mVar, androidx.fragment.app.t tVar, androidx.fragment.app.f fVar) {
        this.f22665a = mVar;
        this.f22666b = tVar;
        this.f22667c = fVar;
    }

    s(androidx.fragment.app.m mVar, androidx.fragment.app.t tVar, androidx.fragment.app.f fVar, androidx.fragment.app.r rVar) {
        this.f22665a = mVar;
        this.f22666b = tVar;
        this.f22667c = fVar;
        fVar.f22475E = null;
        fVar.f22476F = null;
        fVar.f22491U = 0;
        fVar.f22488R = false;
        fVar.f22484N = false;
        androidx.fragment.app.f fVar2 = fVar.f22480J;
        fVar.f22481K = fVar2 != null ? fVar2.f22478H : null;
        fVar.f22480J = null;
        android.os.Bundle bundle = rVar.f22664O;
        fVar.f22473D = bundle == null ? new android.os.Bundle() : bundle;
    }

    s(androidx.fragment.app.m mVar, androidx.fragment.app.t tVar, java.lang.ClassLoader classLoader, androidx.fragment.app.j jVar, androidx.fragment.app.r rVar) {
        this.f22665a = mVar;
        this.f22666b = tVar;
        androidx.fragment.app.f fVarA = rVar.a(jVar, classLoader);
        this.f22667c = fVarA;
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Instantiated fragment " + fVarA;
        }
    }

    private boolean l(android.view.View view) {
        if (view == this.f22667c.f22507k0) {
            return true;
        }
        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f22667c.f22507k0) {
                return true;
            }
        }
        return false;
    }

    private android.os.Bundle q() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.f22667c.j1(bundle);
        this.f22665a.j(this.f22667c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f22667c.f22507k0 != null) {
            s();
        }
        if (this.f22667c.f22475E != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f22667c.f22475E);
        }
        if (this.f22667c.f22476F != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f22667c.f22476F);
        }
        if (!this.f22667c.f22509m0) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f22667c.f22509m0);
        }
        return bundle;
    }

    void a() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto ACTIVITY_CREATED: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        fVar.P0(fVar.f22473D);
        androidx.fragment.app.m mVar = this.f22665a;
        androidx.fragment.app.f fVar2 = this.f22667c;
        mVar.a(fVar2, fVar2.f22473D, false);
    }

    void b() {
        int iJ = this.f22666b.j(this.f22667c);
        androidx.fragment.app.f fVar = this.f22667c;
        fVar.f22506j0.addView(fVar.f22507k0, iJ);
    }

    void c() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto ATTACHED: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        androidx.fragment.app.f fVar2 = fVar.f22480J;
        androidx.fragment.app.s sVarN = null;
        if (fVar2 != null) {
            androidx.fragment.app.s sVarN2 = this.f22666b.n(fVar2.f22478H);
            if (sVarN2 == null) {
                throw new java.lang.IllegalStateException("Fragment " + this.f22667c + " declared target fragment " + this.f22667c.f22480J + " that does not belong to this FragmentManager!");
            }
            androidx.fragment.app.f fVar3 = this.f22667c;
            fVar3.f22481K = fVar3.f22480J.f22478H;
            fVar3.f22480J = null;
            sVarN = sVarN2;
        } else {
            java.lang.String str2 = fVar.f22481K;
            if (str2 != null && (sVarN = this.f22666b.n(str2)) == null) {
                throw new java.lang.IllegalStateException("Fragment " + this.f22667c + " declared target fragment " + this.f22667c.f22481K + " that does not belong to this FragmentManager!");
            }
        }
        if (sVarN != null) {
            sVarN.m();
        }
        androidx.fragment.app.f fVar4 = this.f22667c;
        fVar4.f22493W = fVar4.f22492V.r0();
        androidx.fragment.app.f fVar5 = this.f22667c;
        fVar5.f22495Y = fVar5.f22492V.u0();
        this.f22665a.g(this.f22667c, false);
        this.f22667c.Q0();
        this.f22665a.b(this.f22667c, false);
    }

    int d() {
        androidx.fragment.app.f fVar = this.f22667c;
        if (fVar.f22492V == null) {
            return fVar.f22471C;
        }
        int iMin = this.f22669e;
        int i6 = androidx.fragment.app.s.b.f22672a[fVar.f22517u0.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                iMin = java.lang.Math.min(iMin, 5);
            } else if (i6 != 3) {
                iMin = i6 != 4 ? java.lang.Math.min(iMin, -1) : java.lang.Math.min(iMin, 0);
            } else {
                iMin = java.lang.Math.min(iMin, 1);
            }
        }
        androidx.fragment.app.f fVar2 = this.f22667c;
        if (fVar2.f22487Q) {
            if (fVar2.f22488R) {
                iMin = java.lang.Math.max(this.f22669e, 2);
                android.view.View view = this.f22667c.f22507k0;
                if (view != null && view.getParent() == null) {
                    iMin = java.lang.Math.min(iMin, 2);
                }
            } else {
                iMin = this.f22669e < 4 ? java.lang.Math.min(iMin, fVar2.f22471C) : java.lang.Math.min(iMin, 1);
            }
        }
        if (!this.f22667c.f22484N) {
            iMin = java.lang.Math.min(iMin, 1);
        }
        androidx.fragment.app.f fVar3 = this.f22667c;
        android.view.ViewGroup viewGroup = fVar3.f22506j0;
        androidx.fragment.app.A.e.b bVarL = viewGroup != null ? androidx.fragment.app.A.n(viewGroup, fVar3.H()).l(this) : null;
        if (bVarL == androidx.fragment.app.A.e.b.ADDING) {
            iMin = java.lang.Math.min(iMin, 6);
        } else if (bVarL == androidx.fragment.app.A.e.b.REMOVING) {
            iMin = java.lang.Math.max(iMin, 3);
        } else {
            androidx.fragment.app.f fVar4 = this.f22667c;
            if (fVar4.f22485O) {
                iMin = fVar4.c0() ? java.lang.Math.min(iMin, 1) : java.lang.Math.min(iMin, -1);
            }
        }
        androidx.fragment.app.f fVar5 = this.f22667c;
        if (fVar5.f22508l0 && fVar5.f22471C < 5) {
            iMin = java.lang.Math.min(iMin, 4);
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "computeExpectedState() of " + iMin + " for " + this.f22667c;
        }
        return iMin;
    }

    void e() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto CREATED: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        if (fVar.f22515s0) {
            fVar.r1(fVar.f22473D);
            this.f22667c.f22471C = 1;
            return;
        }
        this.f22665a.h(fVar, fVar.f22473D, false);
        androidx.fragment.app.f fVar2 = this.f22667c;
        fVar2.T0(fVar2.f22473D);
        androidx.fragment.app.m mVar = this.f22665a;
        androidx.fragment.app.f fVar3 = this.f22667c;
        mVar.c(fVar3, fVar3.f22473D, false);
    }

    void f() {
        java.lang.String resourceName;
        if (this.f22667c.f22487Q) {
            return;
        }
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto CREATE_VIEW: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        android.view.LayoutInflater layoutInflaterZ0 = fVar.Z0(fVar.f22473D);
        androidx.fragment.app.f fVar2 = this.f22667c;
        android.view.ViewGroup viewGroup = fVar2.f22506j0;
        if (viewGroup == null) {
            int i6 = fVar2.f22497a0;
            if (i6 == 0) {
                viewGroup = null;
            } else {
                if (i6 == -1) {
                    throw new java.lang.IllegalArgumentException("Cannot create fragment " + this.f22667c + " for a container view with no id");
                }
                viewGroup = (android.view.ViewGroup) fVar2.f22492V.n0().h(this.f22667c.f22497a0);
                if (viewGroup == null) {
                    androidx.fragment.app.f fVar3 = this.f22667c;
                    if (!fVar3.f22489S) {
                        try {
                            resourceName = fVar3.N().getResourceName(this.f22667c.f22497a0);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(this.f22667c.f22497a0) + " (" + resourceName + ") for fragment " + this.f22667c);
                    }
                } else if (!(viewGroup instanceof androidx.fragment.app.FragmentContainerView)) {
                    W1.c.i(this.f22667c, viewGroup);
                }
            }
        }
        androidx.fragment.app.f fVar4 = this.f22667c;
        fVar4.f22506j0 = viewGroup;
        fVar4.V0(layoutInflaterZ0, viewGroup, fVar4.f22473D);
        android.view.View view = this.f22667c.f22507k0;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            androidx.fragment.app.f fVar5 = this.f22667c;
            fVar5.f22507k0.setTag(U1.b.f14457a, fVar5);
            if (viewGroup != null) {
                b();
            }
            androidx.fragment.app.f fVar6 = this.f22667c;
            if (fVar6.f22499c0) {
                fVar6.f22507k0.setVisibility(8);
            }
            if (androidx.core.view.X.Q(this.f22667c.f22507k0)) {
                androidx.core.view.X.k0(this.f22667c.f22507k0);
            } else {
                android.view.View view2 = this.f22667c.f22507k0;
                view2.addOnAttachStateChangeListener(new androidx.fragment.app.s.a(view2));
            }
            this.f22667c.m1();
            androidx.fragment.app.m mVar = this.f22665a;
            androidx.fragment.app.f fVar7 = this.f22667c;
            mVar.m(fVar7, fVar7.f22507k0, fVar7.f22473D, false);
            int visibility = this.f22667c.f22507k0.getVisibility();
            this.f22667c.z1(this.f22667c.f22507k0.getAlpha());
            androidx.fragment.app.f fVar8 = this.f22667c;
            if (fVar8.f22506j0 != null && visibility == 0) {
                android.view.View viewFindFocus = fVar8.f22507k0.findFocus();
                if (viewFindFocus != null) {
                    this.f22667c.w1(viewFindFocus);
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str2 = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f22667c;
                    }
                }
                this.f22667c.f22507k0.setAlpha(0.0f);
            }
        }
        this.f22667c.f22471C = 2;
    }

    void g() {
        androidx.fragment.app.f fVarF;
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "movefrom CREATED: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        boolean zIsChangingConfigurations = true;
        boolean z6 = fVar.f22485O && !fVar.c0();
        if (z6) {
            androidx.fragment.app.f fVar2 = this.f22667c;
            if (!fVar2.f22486P) {
                this.f22666b.B(fVar2.f22478H, null);
            }
        }
        if (!z6 && !this.f22666b.p().t(this.f22667c)) {
            java.lang.String str2 = this.f22667c.f22481K;
            if (str2 != null && (fVarF = this.f22666b.f(str2)) != null && fVarF.f22501e0) {
                this.f22667c.f22480J = fVarF;
            }
            this.f22667c.f22471C = 0;
            return;
        }
        androidx.fragment.app.k kVar = this.f22667c.f22493W;
        if (kVar instanceof androidx.lifecycle.Y) {
            zIsChangingConfigurations = this.f22666b.p().q();
        } else if (kVar.o() instanceof android.app.Activity) {
            zIsChangingConfigurations = true ^ ((android.app.Activity) kVar.o()).isChangingConfigurations();
        }
        if ((z6 && !this.f22667c.f22486P) || zIsChangingConfigurations) {
            this.f22666b.p().i(this.f22667c);
        }
        this.f22667c.W0();
        this.f22665a.d(this.f22667c, false);
        for (androidx.fragment.app.s sVar : this.f22666b.k()) {
            if (sVar != null) {
                androidx.fragment.app.f fVarK = sVar.k();
                if (this.f22667c.f22478H.equals(fVarK.f22481K)) {
                    fVarK.f22480J = this.f22667c;
                    fVarK.f22481K = null;
                }
            }
        }
        androidx.fragment.app.f fVar3 = this.f22667c;
        java.lang.String str3 = fVar3.f22481K;
        if (str3 != null) {
            fVar3.f22480J = this.f22666b.f(str3);
        }
        this.f22666b.s(this);
    }

    void h() {
        android.view.View view;
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "movefrom CREATE_VIEW: " + this.f22667c;
        }
        androidx.fragment.app.f fVar = this.f22667c;
        android.view.ViewGroup viewGroup = fVar.f22506j0;
        if (viewGroup != null && (view = fVar.f22507k0) != null) {
            viewGroup.removeView(view);
        }
        this.f22667c.X0();
        this.f22665a.n(this.f22667c, false);
        androidx.fragment.app.f fVar2 = this.f22667c;
        fVar2.f22506j0 = null;
        fVar2.f22507k0 = null;
        fVar2.f22519w0 = null;
        fVar2.f22520x0.n(null);
        this.f22667c.f22488R = false;
    }

    void i() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "movefrom ATTACHED: " + this.f22667c;
        }
        this.f22667c.Y0();
        this.f22665a.e(this.f22667c, false);
        androidx.fragment.app.f fVar = this.f22667c;
        fVar.f22471C = -1;
        fVar.f22493W = null;
        fVar.f22495Y = null;
        fVar.f22492V = null;
        if ((!fVar.f22485O || fVar.c0()) && !this.f22666b.p().t(this.f22667c)) {
            return;
        }
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str2 = "initState called for fragment: " + this.f22667c;
        }
        this.f22667c.Y();
    }

    void j() {
        androidx.fragment.app.f fVar = this.f22667c;
        if (fVar.f22487Q && fVar.f22488R && !fVar.f22490T) {
            if (androidx.fragment.app.n.E0(3)) {
                java.lang.String str = "moveto CREATE_VIEW: " + this.f22667c;
            }
            androidx.fragment.app.f fVar2 = this.f22667c;
            fVar2.V0(fVar2.Z0(fVar2.f22473D), null, this.f22667c.f22473D);
            android.view.View view = this.f22667c.f22507k0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                androidx.fragment.app.f fVar3 = this.f22667c;
                fVar3.f22507k0.setTag(U1.b.f14457a, fVar3);
                androidx.fragment.app.f fVar4 = this.f22667c;
                if (fVar4.f22499c0) {
                    fVar4.f22507k0.setVisibility(8);
                }
                this.f22667c.m1();
                androidx.fragment.app.m mVar = this.f22665a;
                androidx.fragment.app.f fVar5 = this.f22667c;
                mVar.m(fVar5, fVar5.f22507k0, fVar5.f22473D, false);
                this.f22667c.f22471C = 2;
            }
        }
    }

    androidx.fragment.app.f k() {
        return this.f22667c;
    }

    void m() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        if (this.f22668d) {
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Ignoring re-entrant call to moveToExpectedState() for " + k();
                return;
            }
            return;
        }
        try {
            this.f22668d = true;
            boolean z6 = false;
            while (true) {
                int iD = d();
                androidx.fragment.app.f fVar = this.f22667c;
                int i6 = fVar.f22471C;
                if (iD == i6) {
                    if (!z6 && i6 == -1 && fVar.f22485O && !fVar.c0() && !this.f22667c.f22486P) {
                        if (androidx.fragment.app.n.E0(3)) {
                            java.lang.String str2 = "Cleaning up state of never attached fragment: " + this.f22667c;
                        }
                        this.f22666b.p().i(this.f22667c);
                        this.f22666b.s(this);
                        if (androidx.fragment.app.n.E0(3)) {
                            java.lang.String str3 = "initState called for fragment: " + this.f22667c;
                        }
                        this.f22667c.Y();
                    }
                    androidx.fragment.app.f fVar2 = this.f22667c;
                    if (fVar2.f22513q0) {
                        if (fVar2.f22507k0 != null && (viewGroup = fVar2.f22506j0) != null) {
                            androidx.fragment.app.A aN = androidx.fragment.app.A.n(viewGroup, fVar2.H());
                            if (this.f22667c.f22499c0) {
                                aN.c(this);
                            } else {
                                aN.e(this);
                            }
                        }
                        androidx.fragment.app.f fVar3 = this.f22667c;
                        androidx.fragment.app.n nVar = fVar3.f22492V;
                        if (nVar != null) {
                            nVar.C0(fVar3);
                        }
                        androidx.fragment.app.f fVar4 = this.f22667c;
                        fVar4.f22513q0 = false;
                        fVar4.y0(fVar4.f22499c0);
                        this.f22667c.f22494X.G();
                    }
                    return;
                }
                if (iD <= i6) {
                    switch (i6 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fVar.f22486P && this.f22666b.q(fVar.f22478H) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f22667c.f22471C = 1;
                            break;
                        case 2:
                            fVar.f22488R = false;
                            fVar.f22471C = 2;
                            break;
                        case 3:
                            if (androidx.fragment.app.n.E0(3)) {
                                java.lang.String str4 = "movefrom ACTIVITY_CREATED: " + this.f22667c;
                            }
                            androidx.fragment.app.f fVar5 = this.f22667c;
                            if (fVar5.f22486P) {
                                r();
                            } else if (fVar5.f22507k0 != null && fVar5.f22475E == null) {
                                s();
                            }
                            androidx.fragment.app.f fVar6 = this.f22667c;
                            if (fVar6.f22507k0 != null && (viewGroup2 = fVar6.f22506j0) != null) {
                                androidx.fragment.app.A.n(viewGroup2, fVar6.H()).d(this);
                            }
                            this.f22667c.f22471C = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fVar.f22471C = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i6 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fVar.f22507k0 != null && (viewGroup3 = fVar.f22506j0) != null) {
                                androidx.fragment.app.A.n(viewGroup3, fVar.H()).b(androidx.fragment.app.A.e.c.g(this.f22667c.f22507k0.getVisibility()), this);
                            }
                            this.f22667c.f22471C = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fVar.f22471C = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z6 = true;
            }
        } finally {
            this.f22668d = false;
        }
    }

    void n() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "movefrom RESUMED: " + this.f22667c;
        }
        this.f22667c.e1();
        this.f22665a.f(this.f22667c, false);
    }

    void o(java.lang.ClassLoader classLoader) {
        android.os.Bundle bundle = this.f22667c.f22473D;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        androidx.fragment.app.f fVar = this.f22667c;
        fVar.f22475E = fVar.f22473D.getSparseParcelableArray("android:view_state");
        androidx.fragment.app.f fVar2 = this.f22667c;
        fVar2.f22476F = fVar2.f22473D.getBundle("android:view_registry_state");
        androidx.fragment.app.f fVar3 = this.f22667c;
        fVar3.f22481K = fVar3.f22473D.getString("android:target_state");
        androidx.fragment.app.f fVar4 = this.f22667c;
        if (fVar4.f22481K != null) {
            fVar4.f22482L = fVar4.f22473D.getInt("android:target_req_state", 0);
        }
        androidx.fragment.app.f fVar5 = this.f22667c;
        java.lang.Boolean bool = fVar5.f22477G;
        if (bool != null) {
            fVar5.f22509m0 = bool.booleanValue();
            this.f22667c.f22477G = null;
        } else {
            fVar5.f22509m0 = fVar5.f22473D.getBoolean("android:user_visible_hint", true);
        }
        androidx.fragment.app.f fVar6 = this.f22667c;
        if (fVar6.f22509m0) {
            return;
        }
        fVar6.f22508l0 = true;
    }

    void p() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto RESUMED: " + this.f22667c;
        }
        android.view.View viewB = this.f22667c.B();
        if (viewB != null && l(viewB)) {
            boolean zRequestFocus = viewB.requestFocus();
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewB);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f22667c);
                sb.append(" resulting in focused view ");
                sb.append(this.f22667c.f22507k0.findFocus());
                sb.toString();
            }
        }
        this.f22667c.w1(null);
        this.f22667c.i1();
        this.f22665a.i(this.f22667c, false);
        androidx.fragment.app.f fVar = this.f22667c;
        fVar.f22473D = null;
        fVar.f22475E = null;
        fVar.f22476F = null;
    }

    void r() {
        androidx.fragment.app.r rVar = new androidx.fragment.app.r(this.f22667c);
        androidx.fragment.app.f fVar = this.f22667c;
        if (fVar.f22471C <= -1 || rVar.f22664O != null) {
            rVar.f22664O = fVar.f22473D;
        } else {
            android.os.Bundle bundleQ = q();
            rVar.f22664O = bundleQ;
            if (this.f22667c.f22481K != null) {
                if (bundleQ == null) {
                    rVar.f22664O = new android.os.Bundle();
                }
                rVar.f22664O.putString("android:target_state", this.f22667c.f22481K);
                int i6 = this.f22667c.f22482L;
                if (i6 != 0) {
                    rVar.f22664O.putInt("android:target_req_state", i6);
                }
            }
        }
        this.f22666b.B(this.f22667c.f22478H, rVar);
    }

    void s() {
        if (this.f22667c.f22507k0 == null) {
            return;
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Saving view state for fragment " + this.f22667c + " with view " + this.f22667c.f22507k0;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        this.f22667c.f22507k0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f22667c.f22475E = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        this.f22667c.f22519w0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f22667c.f22476F = bundle;
    }

    void t(int i6) {
        this.f22669e = i6;
    }

    void u() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "moveto STARTED: " + this.f22667c;
        }
        this.f22667c.k1();
        this.f22665a.k(this.f22667c, false);
    }

    void v() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "movefrom STARTED: " + this.f22667c;
        }
        this.f22667c.l1();
        this.f22665a.l(this.f22667c, false);
    }
}
