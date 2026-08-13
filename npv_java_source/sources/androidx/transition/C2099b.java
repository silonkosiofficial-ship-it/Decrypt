package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2099b extends androidx.transition.AbstractC2108k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final java.lang.String[] f23550p0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final android.util.Property f23551q0 = new androidx.transition.C2099b.a(android.graphics.PointF.class, "topLeft");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final android.util.Property f23552r0 = new androidx.transition.C2099b.C0447b(android.graphics.PointF.class, "bottomRight");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final android.util.Property f23553s0 = new androidx.transition.C2099b.c(android.graphics.PointF.class, "bottomRight");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final android.util.Property f23554t0 = new androidx.transition.C2099b.d(android.graphics.PointF.class, "topLeft");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final android.util.Property f23555u0 = new androidx.transition.C2099b.e(android.graphics.PointF.class, "position");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final androidx.transition.C2106i f23556v0 = new androidx.transition.C2106i();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f23557o0 = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    class a extends android.util.Property {
        a(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.PointF get(androidx.transition.C2099b.i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(androidx.transition.C2099b.i iVar, android.graphics.PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0447b extends android.util.Property {
        C0447b(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.PointF get(androidx.transition.C2099b.i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(androidx.transition.C2099b.i iVar, android.graphics.PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    class c extends android.util.Property {
        c(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.PointF get(android.view.View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, android.graphics.PointF pointF) {
            androidx.transition.A.d(view, view.getLeft(), view.getTop(), java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    class d extends android.util.Property {
        d(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.PointF get(android.view.View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, android.graphics.PointF pointF) {
            androidx.transition.A.d(view, java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    class e extends android.util.Property {
        e(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.PointF get(android.view.View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, android.graphics.PointF pointF) {
            int iRound = java.lang.Math.round(pointF.x);
            int iRound2 = java.lang.Math.round(pointF.y);
            androidx.transition.A.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    class f extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.transition.C2099b.i f23558a;
        private final androidx.transition.C2099b.i mViewBounds;

        f(androidx.transition.C2099b.i iVar) {
            this.f23558a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    private static class g extends android.animation.AnimatorListenerAdapter implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f23560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Rect f23561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f23562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final android.graphics.Rect f23563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f23564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f23566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f23567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f23568i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f23569j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f23570k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f23571l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f23572m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f23573n;

        g(android.view.View view, android.graphics.Rect rect, boolean z6, android.graphics.Rect rect2, boolean z10, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f23560a = view;
            this.f23561b = rect;
            this.f23562c = z6;
            this.f23563d = rect2;
            this.f23564e = z10;
            this.f23565f = i6;
            this.f23566g = i10;
            this.f23567h = i11;
            this.f23568i = i12;
            this.f23569j = i13;
            this.f23570k = i14;
            this.f23571l = i15;
            this.f23572m = i16;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23560a.setTag(androidx.transition.AbstractC2105h.f23605b, this.f23560a.getClipBounds());
            this.f23560a.setClipBounds(this.f23564e ? null : this.f23563d);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23573n = true;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.b(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
            android.graphics.Rect rect = (android.graphics.Rect) this.f23560a.getTag(androidx.transition.AbstractC2105h.f23605b);
            this.f23560a.setTag(androidx.transition.AbstractC2105h.f23605b, null);
            this.f23560a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z6) {
            int i6;
            int i10;
            int i11;
            int i12;
            if (this.f23573n) {
                return;
            }
            android.graphics.Rect rect = null;
            if (z6) {
                if (!this.f23562c) {
                    rect = this.f23561b;
                }
            } else if (!this.f23564e) {
                rect = this.f23563d;
            }
            this.f23560a.setClipBounds(rect);
            android.view.View view = this.f23560a;
            if (z6) {
                i6 = this.f23565f;
                i10 = this.f23566g;
                i11 = this.f23567h;
                i12 = this.f23568i;
            } else {
                i6 = this.f23569j;
                i10 = this.f23570k;
                i11 = this.f23571l;
                i12 = this.f23572m;
            }
            androidx.transition.A.d(view, i6, i10, i11, i12);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z6) {
            int iMax = java.lang.Math.max(this.f23567h - this.f23565f, this.f23571l - this.f23569j);
            int iMax2 = java.lang.Math.max(this.f23568i - this.f23566g, this.f23572m - this.f23570k);
            int i6 = z6 ? this.f23569j : this.f23565f;
            int i10 = z6 ? this.f23570k : this.f23566g;
            androidx.transition.A.d(this.f23560a, i6, i10, iMax + i6, iMax2 + i10);
            this.f23560a.setClipBounds(z6 ? this.f23563d : this.f23561b);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    private static class h extends androidx.transition.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f23574a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.view.ViewGroup f23575b;

        h(android.view.ViewGroup viewGroup) {
            this.f23575b = viewGroup;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
            androidx.transition.z.b(this.f23575b, false);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            if (!this.f23574a) {
                androidx.transition.z.b(this.f23575b, false);
            }
            abstractC2108k.Z(this);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
            androidx.transition.z.b(this.f23575b, false);
            this.f23574a = true;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
            androidx.transition.z.b(this.f23575b, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final android.view.View f23580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f23581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23582g;

        i(android.view.View view) {
            this.f23580e = view;
        }

        private void b() {
            androidx.transition.A.d(this.f23580e, this.f23576a, this.f23577b, this.f23578c, this.f23579d);
            this.f23581f = 0;
            this.f23582g = 0;
        }

        void a(android.graphics.PointF pointF) {
            this.f23578c = java.lang.Math.round(pointF.x);
            this.f23579d = java.lang.Math.round(pointF.y);
            int i6 = this.f23582g + 1;
            this.f23582g = i6;
            if (this.f23581f == i6) {
                b();
            }
        }

        void c(android.graphics.PointF pointF) {
            this.f23576a = java.lang.Math.round(pointF.x);
            this.f23577b = java.lang.Math.round(pointF.y);
            int i6 = this.f23581f + 1;
            this.f23581f = i6;
            if (i6 == this.f23582g) {
                b();
            }
        }
    }

    private void o0(androidx.transition.x xVar) {
        android.view.View view = xVar.f23678b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f23677a.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f23677a.put("android:changeBounds:parent", xVar.f23678b.getParent());
        if (this.f23557o0) {
            xVar.f23677a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public java.lang.String[] J() {
        return f23550p0;
    }

    @Override // androidx.transition.AbstractC2108k
    public void h(androidx.transition.x xVar) {
        o0(xVar);
    }

    @Override // androidx.transition.AbstractC2108k
    public void l(androidx.transition.x xVar) {
        android.graphics.Rect rect;
        o0(xVar);
        if (!this.f23557o0 || (rect = (android.graphics.Rect) xVar.f23678b.getTag(androidx.transition.AbstractC2105h.f23605b)) == null) {
            return;
        }
        xVar.f23677a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC2108k
    public android.animation.Animator q(android.view.ViewGroup viewGroup, androidx.transition.x xVar, androidx.transition.x xVar2) {
        int i6;
        android.view.View view;
        int i10;
        android.animation.ObjectAnimator objectAnimatorOfObject;
        android.animation.Animator animatorC;
        android.graphics.Path pathA;
        android.util.Property property;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        java.util.Map map = xVar.f23677a;
        java.util.Map map2 = xVar2.f23677a;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) map.get("android:changeBounds:parent");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        android.view.View view2 = xVar2.f23678b;
        android.graphics.Rect rect = (android.graphics.Rect) xVar.f23677a.get("android:changeBounds:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) xVar2.f23677a.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        android.graphics.Rect rect3 = (android.graphics.Rect) xVar.f23677a.get("android:changeBounds:clip");
        android.graphics.Rect rect4 = (android.graphics.Rect) xVar2.f23677a.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i6 = 0;
        } else {
            i6 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i6++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i6++;
        }
        if (i6 <= 0) {
            return null;
        }
        if (this.f23557o0) {
            view = view2;
            androidx.transition.A.d(view, i11, i13, java.lang.Math.max(i19, i21) + i11, i13 + java.lang.Math.max(i20, i22));
            android.animation.ObjectAnimator objectAnimatorA = (i11 == i12 && i13 == i14) ? null : androidx.transition.AbstractC2103f.a(view, f23555u0, z().a(i11, i13, i12, i14));
            boolean z6 = rect3 == null;
            if (z6) {
                i10 = 0;
                rect3 = new android.graphics.Rect(0, 0, i19, i20);
            } else {
                i10 = 0;
            }
            android.graphics.Rect rect5 = rect3;
            int i23 = rect4 == null ? 1 : i10;
            android.graphics.Rect rect6 = i23 != 0 ? new android.graphics.Rect(i10, i10, i21, i22) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                androidx.transition.C2106i c2106i = f23556v0;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[i10] = rect5;
                objArr[1] = rect6;
                objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(view, "clipBounds", c2106i, objArr);
                androidx.transition.C2099b.g gVar = new androidx.transition.C2099b.g(view, rect5, z6, rect6, i23, i11, i13, i15, i17, i12, i14, i16, i18);
                objectAnimatorOfObject.addListener(gVar);
                a(gVar);
            }
            animatorC = androidx.transition.w.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            view = view2;
            androidx.transition.A.d(view, i11, i13, i15, i17);
            if (i6 == 2) {
                if (i19 == i21 && i20 == i22) {
                    pathA = z().a(i11, i13, i12, i14);
                    property = f23555u0;
                } else {
                    androidx.transition.C2099b.i iVar = new androidx.transition.C2099b.i(view);
                    android.animation.ObjectAnimator objectAnimatorA2 = androidx.transition.AbstractC2103f.a(iVar, f23551q0, z().a(i11, i13, i12, i14));
                    android.animation.ObjectAnimator objectAnimatorA3 = androidx.transition.AbstractC2103f.a(iVar, f23552r0, z().a(i15, i17, i16, i18));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new androidx.transition.C2099b.f(iVar));
                    animatorC = animatorSet;
                }
            } else if (i11 == i12 && i13 == i14) {
                pathA = z().a(i15, i17, i16, i18);
                property = f23553s0;
            } else {
                pathA = z().a(i11, i13, i12, i14);
                property = f23554t0;
            }
            animatorC = androidx.transition.AbstractC2103f.a(view, property, pathA);
        }
        if (view.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.getParent();
            androidx.transition.z.b(viewGroup4, true);
            B().a(new androidx.transition.C2099b.h(viewGroup4));
        }
        return animatorC;
    }
}
