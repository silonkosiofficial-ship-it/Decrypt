package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private android.content.res.ColorStateList f43783A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private android.graphics.Typeface f43784B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.animation.TimeInterpolator f43790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Context f43791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.material.textfield.TextInputLayout f43792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.widget.LinearLayout f43793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.widget.FrameLayout f43795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.animation.Animator f43796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f43797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f43799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.CharSequence f43800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private android.widget.TextView f43802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private java.lang.CharSequence f43803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f43805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private android.content.res.ColorStateList f43806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private java.lang.CharSequence f43807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f43808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private android.widget.TextView f43809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43810z;

    class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f43811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f43812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f43813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f43814d;

        a(int i6, android.widget.TextView textView, int i10, android.widget.TextView textView2) {
            this.f43811a = i6;
            this.f43812b = textView;
            this.f43813c = i10;
            this.f43814d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            com.google.android.material.textfield.u.this.f43798n = this.f43811a;
            com.google.android.material.textfield.u.this.f43796l = null;
            android.widget.TextView textView = this.f43812b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f43813c == 1 && com.google.android.material.textfield.u.this.f43802r != null) {
                    com.google.android.material.textfield.u.this.f43802r.setText((java.lang.CharSequence) null);
                }
            }
            android.widget.TextView textView2 = this.f43814d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f43814d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            android.widget.TextView textView = this.f43814d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f43814d.setAlpha(0.0f);
            }
        }
    }

    class b extends android.view.View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            android.widget.EditText editText = com.google.android.material.textfield.u.this.f43792h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.content.Context context = textInputLayout.getContext();
        this.f43791g = context;
        this.f43792h = textInputLayout;
        this.f43797m = context.getResources().getDimensionPixelSize(p125m4.c.f50575f);
        this.f43785a = p245y4.d.f(context, p125m4.a.f50488F, 217);
        this.f43786b = p245y4.d.f(context, p125m4.a.f50485C, 167);
        this.f43787c = p245y4.d.f(context, p125m4.a.f50488F, 167);
        this.f43788d = p245y4.d.g(context, p125m4.a.f50489G, p135n4.a.f51493d);
        int i6 = p125m4.a.f50489G;
        android.animation.TimeInterpolator timeInterpolator = p135n4.a.f51490a;
        this.f43789e = p245y4.d.g(context, i6, timeInterpolator);
        this.f43790f = p245y4.d.g(context, p125m4.a.f50491I, timeInterpolator);
    }

    private void D(int i6, int i10) {
        android.widget.TextView textViewM;
        android.widget.TextView textViewM2;
        if (i6 == i10) {
            return;
        }
        if (i10 != 0 && (textViewM2 = m(i10)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i6 != 0 && (textViewM = m(i6)) != null) {
            textViewM.setVisibility(4);
            if (i6 == 1) {
                textViewM.setText((java.lang.CharSequence) null);
            }
        }
        this.f43798n = i10;
    }

    private void M(android.widget.TextView textView, android.graphics.Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(android.view.ViewGroup viewGroup, int i6) {
        if (i6 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        return androidx.core.view.X.R(this.f43792h) && this.f43792h.isEnabled() && !(this.f43799o == this.f43798n && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i6, int i10, boolean z6) {
        if (i6 == i10) {
            return;
        }
        if (z6) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f43796l = animatorSet;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            i(arrayList, this.f43808x, this.f43809y, 2, i6, i10);
            i(arrayList, this.f43801q, this.f43802r, 1, i6, i10);
            p135n4.b.a(animatorSet, arrayList);
            animatorSet.addListener(new com.google.android.material.textfield.u.a(i10, m(i6), i6, m(i10)));
            animatorSet.start();
        } else {
            D(i6, i10);
        }
        this.f43792h.p0();
        this.f43792h.u0(z6);
        this.f43792h.A0();
    }

    private boolean g() {
        return (this.f43793i == null || this.f43792h.getEditText() == null) ? false : true;
    }

    private void i(java.util.List list, boolean z6, android.widget.TextView textView, int i6, int i10, int i11) {
        if (textView == null || !z6) {
            return;
        }
        if (i6 == i11 || i6 == i10) {
            android.animation.ObjectAnimator objectAnimatorJ = j(textView, i11 == i6);
            if (i6 == i11 && i10 != 0) {
                objectAnimatorJ.setStartDelay(this.f43787c);
            }
            list.add(objectAnimatorJ);
            if (i11 != i6 || i10 == 0) {
                return;
            }
            android.animation.ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f43787c);
            list.add(objectAnimatorK);
        }
    }

    private android.animation.ObjectAnimator j(android.widget.TextView textView, boolean z6) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, z6 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z6 ? this.f43786b : this.f43787c);
        objectAnimatorOfFloat.setInterpolator(z6 ? this.f43789e : this.f43790f);
        return objectAnimatorOfFloat;
    }

    private android.animation.ObjectAnimator k(android.widget.TextView textView) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.f43797m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f43785a);
        objectAnimatorOfFloat.setInterpolator(this.f43788d);
        return objectAnimatorOfFloat;
    }

    private android.widget.TextView m(int i6) {
        if (i6 == 1) {
            return this.f43802r;
        }
        if (i6 != 2) {
            return null;
        }
        return this.f43809y;
    }

    private int v(boolean z6, int i6, int i10) {
        return z6 ? this.f43791g.getResources().getDimensionPixelSize(i6) : i10;
    }

    private boolean y(int i6) {
        return (i6 != 1 || this.f43802r == null || android.text.TextUtils.isEmpty(this.f43800p)) ? false : true;
    }

    boolean A() {
        return this.f43801q;
    }

    boolean B() {
        return this.f43808x;
    }

    void C(android.widget.TextView textView, int i6) {
        android.view.ViewGroup viewGroup;
        if (this.f43793i == null) {
            return;
        }
        if (!z(i6) || (viewGroup = this.f43795k) == null) {
            viewGroup = this.f43793i;
        }
        viewGroup.removeView(textView);
        int i10 = this.f43794j - 1;
        this.f43794j = i10;
        O(this.f43793i, i10);
    }

    void E(int i6) {
        this.f43804t = i6;
        android.widget.TextView textView = this.f43802r;
        if (textView != null) {
            androidx.core.view.X.p0(textView, i6);
        }
    }

    void F(java.lang.CharSequence charSequence) {
        this.f43803s = charSequence;
        android.widget.TextView textView = this.f43802r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z6) {
        if (this.f43801q == z6) {
            return;
        }
        h();
        if (z6) {
            androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(this.f43791g);
            this.f43802r = d6;
            d6.setId(p125m4.e.f50619K);
            this.f43802r.setTextAlignment(5);
            android.graphics.Typeface typeface = this.f43784B;
            if (typeface != null) {
                this.f43802r.setTypeface(typeface);
            }
            H(this.f43805u);
            I(this.f43806v);
            F(this.f43803s);
            E(this.f43804t);
            this.f43802r.setVisibility(4);
            e(this.f43802r, 0);
        } else {
            w();
            C(this.f43802r, 0);
            this.f43802r = null;
            this.f43792h.p0();
            this.f43792h.A0();
        }
        this.f43801q = z6;
    }

    void H(int i6) {
        this.f43805u = i6;
        android.widget.TextView textView = this.f43802r;
        if (textView != null) {
            this.f43792h.c0(textView, i6);
        }
    }

    void I(android.content.res.ColorStateList colorStateList) {
        this.f43806v = colorStateList;
        android.widget.TextView textView = this.f43802r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i6) {
        this.f43810z = i6;
        android.widget.TextView textView = this.f43809y;
        if (textView != null) {
            androidx.core.widget.h.n(textView, i6);
        }
    }

    void K(boolean z6) {
        if (this.f43808x == z6) {
            return;
        }
        h();
        if (z6) {
            androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(this.f43791g);
            this.f43809y = d6;
            d6.setId(p125m4.e.f50620L);
            this.f43809y.setTextAlignment(5);
            android.graphics.Typeface typeface = this.f43784B;
            if (typeface != null) {
                this.f43809y.setTypeface(typeface);
            }
            this.f43809y.setVisibility(4);
            androidx.core.view.X.p0(this.f43809y, 1);
            J(this.f43810z);
            L(this.f43783A);
            e(this.f43809y, 1);
            this.f43809y.setAccessibilityDelegate(new com.google.android.material.textfield.u.b());
        } else {
            x();
            C(this.f43809y, 1);
            this.f43809y = null;
            this.f43792h.p0();
            this.f43792h.A0();
        }
        this.f43808x = z6;
    }

    void L(android.content.res.ColorStateList colorStateList) {
        this.f43783A = colorStateList;
        android.widget.TextView textView = this.f43809y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(android.graphics.Typeface typeface) {
        if (typeface != this.f43784B) {
            this.f43784B = typeface;
            M(this.f43802r, typeface);
            M(this.f43809y, typeface);
        }
    }

    void Q(java.lang.CharSequence charSequence) {
        h();
        this.f43800p = charSequence;
        this.f43802r.setText(charSequence);
        int i6 = this.f43798n;
        if (i6 != 1) {
            this.f43799o = 1;
        }
        S(i6, this.f43799o, P(this.f43802r, charSequence));
    }

    void R(java.lang.CharSequence charSequence) {
        h();
        this.f43807w = charSequence;
        this.f43809y.setText(charSequence);
        int i6 = this.f43798n;
        if (i6 != 2) {
            this.f43799o = 2;
        }
        S(i6, this.f43799o, P(this.f43809y, charSequence));
    }

    void e(android.widget.TextView textView, int i6) {
        if (this.f43793i == null && this.f43795k == null) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f43791g);
            this.f43793i = linearLayout;
            linearLayout.setOrientation(0);
            this.f43792h.addView(this.f43793i, -1, -2);
            this.f43795k = new android.widget.FrameLayout(this.f43791g);
            this.f43793i.addView(this.f43795k, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f43792h.getEditText() != null) {
                f();
            }
        }
        if (z(i6)) {
            this.f43795k.setVisibility(0);
            this.f43795k.addView(textView);
        } else {
            this.f43793i.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        this.f43793i.setVisibility(0);
        this.f43794j++;
    }

    void f() {
        if (g()) {
            android.widget.EditText editText = this.f43792h.getEditText();
            boolean zG = B4.c.g(this.f43791g);
            androidx.core.view.X.B0(this.f43793i, v(zG, p125m4.c.f50540B, androidx.core.view.X.E(editText)), v(zG, p125m4.c.f50541C, this.f43791g.getResources().getDimensionPixelSize(p125m4.c.f50539A)), v(zG, p125m4.c.f50540B, androidx.core.view.X.D(editText)), 0);
        }
    }

    void h() {
        android.animation.Animator animator = this.f43796l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f43799o);
    }

    int n() {
        return this.f43804t;
    }

    java.lang.CharSequence o() {
        return this.f43803s;
    }

    java.lang.CharSequence p() {
        return this.f43800p;
    }

    int q() {
        android.widget.TextView textView = this.f43802r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    android.content.res.ColorStateList r() {
        android.widget.TextView textView = this.f43802r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    java.lang.CharSequence s() {
        return this.f43807w;
    }

    android.view.View t() {
        return this.f43809y;
    }

    int u() {
        android.widget.TextView textView = this.f43809y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f43800p = null;
        h();
        if (this.f43798n == 1) {
            this.f43799o = (!this.f43808x || android.text.TextUtils.isEmpty(this.f43807w)) ? 0 : 2;
        }
        S(this.f43798n, this.f43799o, P(this.f43802r, ""));
    }

    void x() {
        h();
        int i6 = this.f43798n;
        if (i6 == 2) {
            this.f43799o = 0;
        }
        S(i6, this.f43799o, P(this.f43809y, ""));
    }

    boolean z(int i6) {
        return i6 == 0 || i6 == 1;
    }
}
