package androidx.compose.ui.viewinterop;

/* JADX INFO: loaded from: classes.dex */
final class g extends androidx.compose.ui.d.c implements p121m0.j, android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.view.View f20554P;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, androidx.compose.ui.viewinterop.g.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return s(((androidx.compose.ui.focus.d) obj).o());
        }

        public final androidx.compose.ui.focus.n s(int i6) {
            return ((androidx.compose.ui.viewinterop.g) this.f57287D).U1(i6);
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj, androidx.compose.ui.viewinterop.g.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return s(((androidx.compose.ui.focus.d) obj).o());
        }

        public final androidx.compose.ui.focus.n s(int i6) {
            return ((androidx.compose.ui.viewinterop.g) this.f57287D).V1(i6);
        }
    }

    private final androidx.compose.ui.focus.FocusTargetNode T1() {
        int iA = F0.AbstractC0918f0.a(1024);
        if (!E0().A1()) {
            C0.a.b("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.d.c cVarE0 = E0();
        if ((cVarE0.q1() & iA) != 0) {
            boolean z6 = false;
            for (androidx.compose.ui.d.c cVarR1 = cVarE0.r1(); cVarR1 != null; cVarR1 = cVarR1.r1()) {
                if ((cVarR1.v1() & iA) != 0) {
                    androidx.compose.ui.d.c cVarG = cVarR1;
                    X.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof androidx.compose.ui.focus.FocusTargetNode) {
                            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) cVarG;
                            if (z6) {
                                return focusTargetNode;
                            }
                            z6 = true;
                        } else if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                            int i6 = 0;
                            for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                if ((cVarU1.v1() & iA) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        cVarG = cVarU1;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.d(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.d(cVarU1);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                        cVarG = F0.AbstractC0925k.g(bVar);
                    }
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        super.D1();
        androidx.compose.ui.viewinterop.f.g(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        androidx.compose.ui.viewinterop.f.g(this).removeOnAttachStateChangeListener(this);
        this.f20554P = null;
        super.E1();
    }

    public final androidx.compose.ui.focus.n U1(int i6) {
        android.view.View viewG = androidx.compose.ui.viewinterop.f.g(this);
        if (viewG.isFocused() || viewG.hasFocus()) {
            return androidx.compose.ui.focus.n.f19698b.b();
        }
        p121m0.i focusOwner = F0.AbstractC0925k.n(this).getFocusOwner();
        java.lang.Object objN = F0.AbstractC0925k.n(this);
        p247y7.AbstractC7350t.d(objN, "null cannot be cast to non-null type android.view.View");
        return androidx.compose.ui.focus.f.b(viewG, androidx.compose.ui.focus.f.c(i6), androidx.compose.ui.viewinterop.f.f(focusOwner, (android.view.View) objN, viewG)) ? androidx.compose.ui.focus.n.f19698b.b() : androidx.compose.ui.focus.n.f19698b.a();
    }

    public final androidx.compose.ui.focus.n V1(int i6) {
        android.view.View viewG = androidx.compose.ui.viewinterop.f.g(this);
        if (!viewG.hasFocus()) {
            return androidx.compose.ui.focus.n.f19698b.b();
        }
        p121m0.i focusOwner = F0.AbstractC0925k.n(this).getFocusOwner();
        java.lang.Object objN = F0.AbstractC0925k.n(this);
        p247y7.AbstractC7350t.d(objN, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) objN;
        if (!(viewG instanceof android.view.ViewGroup)) {
            if (view.requestFocus()) {
                return androidx.compose.ui.focus.n.f19698b.b();
            }
            throw new java.lang.IllegalStateException("host view did not take focus".toString());
        }
        android.graphics.Rect rectF = androidx.compose.ui.viewinterop.f.f(focusOwner, view, viewG);
        java.lang.Integer numC = androidx.compose.ui.focus.f.c(i6);
        int iIntValue = numC != null ? numC.intValue() : 130;
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        android.view.View view2 = this.f20554P;
        android.view.View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((android.view.ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((android.view.ViewGroup) view, rectF, iIntValue);
        if (viewFindNextFocus != null && androidx.compose.ui.viewinterop.f.d(viewG, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, rectF);
            return androidx.compose.ui.focus.n.f19698b.a();
        }
        if (view.requestFocus()) {
            return androidx.compose.ui.focus.n.f19698b.b();
        }
        throw new java.lang.IllegalStateException("host view did not take focus".toString());
    }

    @Override // p121m0.j
    public void Y(androidx.compose.ui.focus.j jVar) {
        jVar.y(false);
        jVar.r(new androidx.compose.ui.viewinterop.g.a(this));
        jVar.v(new androidx.compose.ui.viewinterop.g.b(this));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
        if (F0.AbstractC0925k.m(this).n0() == null) {
            return;
        }
        android.view.View viewG = androidx.compose.ui.viewinterop.f.g(this);
        p121m0.i focusOwner = F0.AbstractC0925k.n(this).getFocusOwner();
        F0.o0 o0VarN = F0.AbstractC0925k.n(this);
        boolean z6 = (view == null || p247y7.AbstractC7350t.b(view, o0VarN) || !androidx.compose.ui.viewinterop.f.d(viewG, view)) ? false : true;
        boolean z10 = (view2 == null || p247y7.AbstractC7350t.b(view2, o0VarN) || !androidx.compose.ui.viewinterop.f.d(viewG, view2)) ? false : true;
        if (!z6 || !z10) {
            if (z10) {
                this.f20554P = view2;
                androidx.compose.ui.focus.FocusTargetNode focusTargetNodeT1 = T1();
                if (focusTargetNodeT1.a2().e()) {
                    return;
                }
                p121m0.s sVarG = focusOwner.g();
                try {
                    if (sVarG.f50224c) {
                        sVarG.g();
                    }
                    sVarG.f();
                    androidx.compose.ui.focus.r.i(focusTargetNodeT1);
                    return;
                } finally {
                    sVarG.h();
                }
            }
            view2 = null;
            if (z6) {
                this.f20554P = null;
                if (T1().a2().g()) {
                    focusOwner.e(false, true, false, androidx.compose.ui.focus.d.f19669b.c());
                    return;
                }
                return;
            }
        }
        this.f20554P = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
