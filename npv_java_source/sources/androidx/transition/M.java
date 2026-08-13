package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends androidx.transition.AbstractC2108k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final java.lang.String[] f23531p0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f23532o0 = 3;

    private static class a extends android.animation.AnimatorListenerAdapter implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f23533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.view.ViewGroup f23535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f23536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f23538f = false;

        a(android.view.View view, int i6, boolean z6) {
            this.f23533a = view;
            this.f23534b = i6;
            this.f23535c = (android.view.ViewGroup) view.getParent();
            this.f23536d = z6;
            i(true);
        }

        private void h() {
            if (!this.f23538f) {
                androidx.transition.A.f(this.f23533a, this.f23534b);
                android.view.ViewGroup viewGroup = this.f23535c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z6) {
            android.view.ViewGroup viewGroup;
            if (!this.f23536d || this.f23537e == z6 || (viewGroup = this.f23535c) == null) {
                return;
            }
            this.f23537e = z6;
            androidx.transition.z.b(viewGroup, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
            i(false);
            if (this.f23538f) {
                return;
            }
            androidx.transition.A.f(this.f23533a, this.f23534b);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            abstractC2108k.Z(this);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.b(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
            i(true);
            if (this.f23538f) {
                return;
            }
            androidx.transition.A.f(this.f23533a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.f23538f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z6) {
            if (z6) {
                return;
            }
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z6) {
            if (z6) {
                androidx.transition.A.f(this.f23533a, 0);
                android.view.ViewGroup viewGroup = this.f23535c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends android.animation.AnimatorListenerAdapter implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ViewGroup f23539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.view.View f23540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.view.View f23541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23542d = true;

        b(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
            this.f23539a = viewGroup;
            this.f23540b = view;
            this.f23541c = view2;
        }

        private void h() {
            this.f23541c.setTag(androidx.transition.AbstractC2105h.f23604a, null);
            this.f23539a.getOverlay().remove(this.f23540b);
            this.f23542d = false;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            abstractC2108k.Z(this);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
            if (this.f23542d) {
                h();
            }
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.b(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z6) {
            if (z6) {
                return;
            }
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator animator) {
            this.f23539a.getOverlay().remove(this.f23540b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator animator) {
            if (this.f23540b.getParent() == null) {
                this.f23539a.getOverlay().add(this.f23540b);
            } else {
                androidx.transition.M.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z6) {
            if (z6) {
                this.f23541c.setTag(androidx.transition.AbstractC2105h.f23604a, this.f23540b);
                this.f23539a.getOverlay().add(this.f23540b);
                this.f23542d = true;
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f23544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f23545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.view.ViewGroup f23548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.view.ViewGroup f23549f;

        c() {
        }
    }

    private void o0(androidx.transition.x xVar) {
        xVar.f23677a.put("android:visibility:visibility", java.lang.Integer.valueOf(xVar.f23678b.getVisibility()));
        xVar.f23677a.put("android:visibility:parent", xVar.f23678b.getParent());
        int[] iArr = new int[2];
        xVar.f23678b.getLocationOnScreen(iArr);
        xVar.f23677a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r0.f23548e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0.f23546c == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.M.c p0(androidx.transition.x r8, androidx.transition.x r9) {
        /*
            r7 = this;
            androidx.transition.M$c r0 = new androidx.transition.M$c
            r0.<init>()
            r1 = 0
            r0.f23544a = r1
            r0.f23545b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map r6 = r8.f23677a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r8.f23677a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f23546c = r6
            java.util.Map r6 = r8.f23677a
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f23548e = r6
            goto L37
        L33:
            r0.f23546c = r3
            r0.f23548e = r2
        L37:
            if (r9 == 0) goto L5a
            java.util.Map r6 = r9.f23677a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r2 = r9.f23677a
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f23547d = r2
            java.util.Map r2 = r9.f23677a
            java.lang.Object r2 = r2.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L57:
            r0.f23549f = r2
            goto L5d
        L5a:
            r0.f23547d = r3
            goto L57
        L5d:
            r2 = 1
            if (r8 == 0) goto L87
            if (r9 == 0) goto L87
            int r8 = r0.f23546c
            int r9 = r0.f23547d
            if (r8 != r9) goto L6f
            android.view.ViewGroup r3 = r0.f23548e
            android.view.ViewGroup r4 = r0.f23549f
            if (r3 != r4) goto L6f
            return r0
        L6f:
            if (r8 == r9) goto L7d
            if (r8 != 0) goto L78
        L73:
            r0.f23545b = r1
        L75:
            r0.f23544a = r2
            goto L95
        L78:
            if (r9 != 0) goto L95
        L7a:
            r0.f23545b = r2
            goto L75
        L7d:
            android.view.ViewGroup r8 = r0.f23549f
            if (r8 != 0) goto L82
            goto L73
        L82:
            android.view.ViewGroup r8 = r0.f23548e
            if (r8 != 0) goto L95
            goto L7a
        L87:
            if (r8 != 0) goto L8e
            int r8 = r0.f23547d
            if (r8 != 0) goto L8e
            goto L7a
        L8e:
            if (r9 != 0) goto L95
            int r8 = r0.f23546c
            if (r8 != 0) goto L95
            goto L73
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.M.p0(androidx.transition.x, androidx.transition.x):androidx.transition.M$c");
    }

    @Override // androidx.transition.AbstractC2108k
    public java.lang.String[] J() {
        return f23531p0;
    }

    @Override // androidx.transition.AbstractC2108k
    public boolean L(androidx.transition.x xVar, androidx.transition.x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f23677a.containsKey("android:visibility:visibility") != xVar.f23677a.containsKey("android:visibility:visibility")) {
            return false;
        }
        androidx.transition.M.c cVarP0 = p0(xVar, xVar2);
        if (cVarP0.f23544a) {
            return cVarP0.f23546c == 0 || cVarP0.f23547d == 0;
        }
        return false;
    }

    @Override // androidx.transition.AbstractC2108k
    public void h(androidx.transition.x xVar) {
        o0(xVar);
    }

    @Override // androidx.transition.AbstractC2108k
    public void l(androidx.transition.x xVar) {
        o0(xVar);
    }

    @Override // androidx.transition.AbstractC2108k
    public android.animation.Animator q(android.view.ViewGroup viewGroup, androidx.transition.x xVar, androidx.transition.x xVar2) {
        androidx.transition.M.c cVarP0 = p0(xVar, xVar2);
        if (!cVarP0.f23544a) {
            return null;
        }
        if (cVarP0.f23548e == null && cVarP0.f23549f == null) {
            return null;
        }
        return cVarP0.f23545b ? r0(viewGroup, xVar, cVarP0.f23546c, xVar2, cVarP0.f23547d) : t0(viewGroup, xVar, cVarP0.f23546c, xVar2, cVarP0.f23547d);
    }

    public abstract android.animation.Animator q0(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.x xVar, androidx.transition.x xVar2);

    public android.animation.Animator r0(android.view.ViewGroup viewGroup, androidx.transition.x xVar, int i6, androidx.transition.x xVar2, int i10) {
        if ((this.f23532o0 & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            android.view.View view = (android.view.View) xVar2.f23678b.getParent();
            if (p0(x(view, false), K(view, false)).f23544a) {
                return null;
            }
        }
        return q0(viewGroup, xVar2.f23678b, xVar, xVar2);
    }

    public abstract android.animation.Animator s0(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.x xVar, androidx.transition.x xVar2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public android.animation.Animator t0(android.view.ViewGroup viewGroup, androidx.transition.x xVar, int i6, androidx.transition.x xVar2, int i10) {
        android.view.View view;
        boolean z6;
        boolean z10;
        android.view.View view2;
        if ((this.f23532o0 & 2) != 2 || xVar == null) {
            return null;
        }
        android.view.View view3 = xVar.f23678b;
        android.view.View viewA = xVar2 != null ? xVar2.f23678b : null;
        android.view.View view4 = (android.view.View) view3.getTag(androidx.transition.AbstractC2105h.f23604a);
        if (view4 != null) {
            view2 = null;
            z10 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z6 = false;
                } else {
                    viewA = null;
                    view = null;
                    z6 = true;
                }
            } else if (i10 == 4 || view3 == viewA) {
                view = viewA;
                z6 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z6 = true;
            }
            if (z6) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof android.view.View) {
                        android.view.View view5 = (android.view.View) view3.getParent();
                        if (p0(K(view5, true), x(view5, true)).f23544a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f23635Y) {
                            }
                        } else {
                            viewA = androidx.transition.w.a(viewGroup, view3, view5);
                        }
                    }
                    z10 = false;
                    android.view.View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                }
                view2 = view;
                z10 = false;
                view4 = view3;
            } else {
                z10 = false;
                android.view.View view7 = view;
                view4 = viewA;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            androidx.transition.A.f(view2, 0);
            android.animation.Animator animatorS0 = s0(viewGroup, view2, xVar, xVar2);
            if (animatorS0 != null) {
                androidx.transition.M.a aVar = new androidx.transition.M.a(view2, i10, true);
                animatorS0.addListener(aVar);
                B().a(aVar);
            } else {
                androidx.transition.A.f(view2, visibility);
            }
            return animatorS0;
        }
        if (!z10) {
            int[] iArr = (int[]) xVar.f23677a.get("android:visibility:screenLocation");
            int i11 = iArr[0];
            int i12 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i11 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i12 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        android.animation.Animator animatorS1 = s0(viewGroup, view4, xVar, xVar2);
        if (!z10) {
            if (animatorS1 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view3.setTag(androidx.transition.AbstractC2105h.f23604a, view4);
                androidx.transition.M.b bVar = new androidx.transition.M.b(viewGroup, view4, view3);
                animatorS1.addListener(bVar);
                animatorS1.addPauseListener(bVar);
                B().a(bVar);
            }
        }
        return animatorS1;
    }

    public void u0(int i6) {
        if ((i6 & (-4)) != 0) {
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f23532o0 = i6;
    }
}
