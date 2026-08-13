package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f43621e1 = p125m4.i.f50700g;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int[][] f43622f1 = {new int[]{android.R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final android.graphics.Rect f43623A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final android.graphics.Rect f43624B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.widget.FrameLayout f43625C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final android.graphics.RectF f43626C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.material.textfield.z f43627D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private android.graphics.Typeface f43628D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.material.textfield.r f43629E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43630E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    android.widget.EditText f43631F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f43632F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.CharSequence f43633G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final java.util.LinkedHashSet f43634G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f43635H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43636H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f43637I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f43638I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f43639J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43640J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f43641K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private android.content.res.ColorStateList f43642K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final com.google.android.material.textfield.u f43643L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private android.content.res.ColorStateList f43644L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f43645M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f43646M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f43647N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f43648N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f43649O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f43650O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.google.android.material.textfield.TextInputLayout.e f43651P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private android.content.res.ColorStateList f43652P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private android.widget.TextView f43653Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f43654Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f43655R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private int f43656R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f43657S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private int f43658S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.lang.CharSequence f43659T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private int f43660T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f43661U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private int f43662U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private android.widget.TextView f43663V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    int f43664V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private android.content.res.ColorStateList f43665W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private boolean f43666W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    final com.google.android.material.internal.a f43667X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private boolean f43668Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private boolean f43669Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f43670a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private android.animation.ValueAnimator f43671a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private androidx.transition.C2100c f43672b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private boolean f43673b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private androidx.transition.C2100c f43674c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f43675c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private android.content.res.ColorStateList f43676d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f43677d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private android.content.res.ColorStateList f43678e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.content.res.ColorStateList f43679f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private android.content.res.ColorStateList f43680g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f43681h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private java.lang.CharSequence f43682i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f43683j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private E4.g f43684k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private E4.g f43685l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private android.graphics.drawable.StateListDrawable f43686m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f43687n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private E4.g f43688o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private E4.g f43689p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private E4.k f43690q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f43691r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final int f43692s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f43693t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f43694u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f43695v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f43696w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f43697x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f43698y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f43699z0;

    class a implements android.text.TextWatcher {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f43700C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f43701D;

        a(android.widget.EditText editText) {
            this.f43701D = editText;
            this.f43700C = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = com.google.android.material.textfield.TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.f43675c1);
            com.google.android.material.textfield.TextInputLayout textInputLayout2 = com.google.android.material.textfield.TextInputLayout.this;
            if (textInputLayout2.f43645M) {
                textInputLayout2.k0(editable);
            }
            if (com.google.android.material.textfield.TextInputLayout.this.f43661U) {
                com.google.android.material.textfield.TextInputLayout.this.y0(editable);
            }
            int lineCount = this.f43701D.getLineCount();
            int i6 = this.f43700C;
            if (lineCount != i6) {
                if (lineCount < i6) {
                    int iA = androidx.core.view.X.A(this.f43701D);
                    int i10 = com.google.android.material.textfield.TextInputLayout.this.f43664V0;
                    if (iA != i10) {
                        this.f43701D.setMinimumHeight(i10);
                    }
                }
                this.f43700C = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.material.textfield.TextInputLayout.this.f43629E.h();
        }
    }

    class c implements android.animation.ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            com.google.android.material.textfield.TextInputLayout.this.f43667X0.c0(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.C1990a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.android.material.textfield.TextInputLayout f43705d;

        public d(com.google.android.material.textfield.TextInputLayout textInputLayout) {
            this.f43705d = textInputLayout;
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            android.widget.EditText editText = this.f43705d.getEditText();
            java.lang.CharSequence text = editText != null ? editText.getText() : null;
            java.lang.CharSequence hint = this.f43705d.getHint();
            java.lang.CharSequence error = this.f43705d.getError();
            java.lang.CharSequence placeholderText = this.f43705d.getPlaceholderText();
            int counterMaxLength = this.f43705d.getCounterMaxLength();
            java.lang.CharSequence counterOverflowDescription = this.f43705d.getCounterOverflowDescription();
            boolean zIsEmpty = android.text.TextUtils.isEmpty(text);
            boolean z6 = !zIsEmpty;
            boolean z10 = true;
            boolean z11 = !android.text.TextUtils.isEmpty(hint);
            boolean z12 = !this.f43705d.P();
            boolean z13 = !android.text.TextUtils.isEmpty(error);
            if (!z13 && android.text.TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            }
            java.lang.String string = z11 ? hint.toString() : "";
            this.f43705d.f43627D.A(b6);
            if (z6) {
                b6.S0(text);
            } else if (!android.text.TextUtils.isEmpty(string)) {
                b6.S0(string);
                if (z12 && placeholderText != null) {
                    placeholderText = string + ", " + ((java.lang.Object) placeholderText);
                    b6.S0(placeholderText);
                }
            } else if (placeholderText != null) {
                b6.S0(placeholderText);
            }
            if (!android.text.TextUtils.isEmpty(string)) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    b6.y0(string);
                } else {
                    if (z6) {
                        string = ((java.lang.Object) text) + ", " + string;
                    }
                    b6.S0(string);
                }
                b6.P0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            b6.D0(counterMaxLength);
            if (z10) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                b6.u0(error);
            }
            android.view.View viewT = this.f43705d.f43643L.t();
            if (viewT != null) {
                b6.A0(viewT);
            }
            this.f43705d.f43629E.m().o(view, b6);
        }

        @Override // androidx.core.view.C1990a
        public void h(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f43705d.f43629E.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(android.text.Editable editable);
    }

    public interface f {
        void a(com.google.android.material.textfield.TextInputLayout textInputLayout);
    }

    static class g extends I1.a {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.g> CREATOR = new com.google.android.material.textfield.TextInputLayout.g.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.CharSequence f43706E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        boolean f43707F;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.textfield.TextInputLayout.g createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.textfield.TextInputLayout.g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.textfield.TextInputLayout.g createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.textfield.TextInputLayout.g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.textfield.TextInputLayout.g[] newArray(int i6) {
                return new com.google.android.material.textfield.TextInputLayout.g[i6];
            }
        }

        g(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f43706E = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f43707F = parcel.readInt() == 1;
        }

        g(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public java.lang.String toString() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.f43706E) + "}";
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            android.text.TextUtils.writeToParcel(this.f43706E, parcel, i6);
            parcel.writeInt(this.f43707F ? 1 : 0);
        }
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50504V);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int colorForState;
        int i10 = f43621e1;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f43635H = -1;
        this.f43637I = -1;
        this.f43639J = -1;
        this.f43641K = -1;
        this.f43643L = new com.google.android.material.textfield.u(this);
        this.f43651P = new com.google.android.material.textfield.TextInputLayout.e() { // from class: com.google.android.material.textfield.H
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(android.text.Editable editable) {
                return com.google.android.material.textfield.TextInputLayout.T(editable);
            }
        };
        this.f43623A0 = new android.graphics.Rect();
        this.f43624B0 = new android.graphics.Rect();
        this.f43626C0 = new android.graphics.RectF();
        this.f43634G0 = new java.util.LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f43667X0 = aVar;
        this.f43677d1 = false;
        android.content.Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context2);
        this.f43625C = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        android.animation.TimeInterpolator timeInterpolator = p135n4.a.f51490a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        androidx.appcompat.widget.c0 c0VarJ = com.google.android.material.internal.k.j(context2, attributeSet, p125m4.j.f50838P5, i6, i10, p125m4.j.m6, p125m4.j.k6, p125m4.j.f50751E6, p125m4.j.f50791J6, p125m4.j.f50823N6);
        com.google.android.material.textfield.z zVar = new com.google.android.material.textfield.z(this, c0VarJ);
        this.f43627D = zVar;
        this.f43681h0 = c0VarJ.a(p125m4.j.f50815M6, true);
        setHint(c0VarJ.p(p125m4.j.f50878U5));
        this.f43669Z0 = c0VarJ.a(p125m4.j.f50807L6, true);
        this.f43668Y0 = c0VarJ.a(p125m4.j.f50767G6, true);
        if (c0VarJ.s(p125m4.j.f50894W5)) {
            setMinEms(c0VarJ.k(p125m4.j.f50894W5, -1));
        } else if (c0VarJ.s(p125m4.j.f50870T5)) {
            setMinWidth(c0VarJ.f(p125m4.j.f50870T5, -1));
        }
        if (c0VarJ.s(p125m4.j.f50886V5)) {
            setMaxEms(c0VarJ.k(p125m4.j.f50886V5, -1));
        } else if (c0VarJ.s(p125m4.j.f50862S5)) {
            setMaxWidth(c0VarJ.f(p125m4.j.f50862S5, -1));
        }
        this.f43690q0 = E4.k.e(context2, attributeSet, i6, i10).m();
        this.f43692s0 = context2.getResources().getDimensionPixelOffset(p125m4.c.f50572d0);
        this.f43694u0 = c0VarJ.e(p125m4.j.Z5, 0);
        this.f43696w0 = c0VarJ.f(p125m4.j.g6, context2.getResources().getDimensionPixelSize(p125m4.c.f50574e0));
        this.f43697x0 = c0VarJ.f(p125m4.j.h6, context2.getResources().getDimensionPixelSize(p125m4.c.f50576f0));
        this.f43695v0 = this.f43696w0;
        float fD = c0VarJ.d(p125m4.j.d6, -1.0f);
        float fD2 = c0VarJ.d(p125m4.j.c6, -1.0f);
        float fD3 = c0VarJ.d(p125m4.j.a6, -1.0f);
        float fD4 = c0VarJ.d(p125m4.j.b6, -1.0f);
        E4.k.b bVarV = this.f43690q0.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f43690q0 = bVarV.m();
        android.content.res.ColorStateList colorStateListB = B4.c.b(context2, c0VarJ, p125m4.j.f50902X5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f43654Q0 = defaultColor;
            this.f43699z0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f43656R0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f43658S0 = colorStateListB.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.f43658S0 = this.f43654Q0;
                android.content.res.ColorStateList colorStateListA = p100k.a.a(context2, p125m4.b.f50535c);
                this.f43656R0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            this.f43660T0 = colorForState;
        } else {
            this.f43699z0 = 0;
            this.f43654Q0 = 0;
            this.f43656R0 = 0;
            this.f43658S0 = 0;
            this.f43660T0 = 0;
        }
        if (c0VarJ.s(p125m4.j.f50854R5)) {
            android.content.res.ColorStateList colorStateListC = c0VarJ.c(p125m4.j.f50854R5);
            this.f43644L0 = colorStateListC;
            this.f43642K0 = colorStateListC;
        }
        android.content.res.ColorStateList colorStateListB2 = B4.c.b(context2, c0VarJ, p125m4.j.e6);
        this.f43650O0 = c0VarJ.b(p125m4.j.e6, 0);
        this.f43646M0 = androidx.core.content.a.c(context2, p125m4.b.f50536d);
        this.f43662U0 = androidx.core.content.a.c(context2, p125m4.b.f50537e);
        this.f43648N0 = androidx.core.content.a.c(context2, p125m4.b.f50538f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (c0VarJ.s(p125m4.j.f6)) {
            setBoxStrokeErrorColor(B4.c.b(context2, c0VarJ, p125m4.j.f6));
        }
        if (c0VarJ.n(p125m4.j.f50823N6, -1) != -1) {
            setHintTextAppearance(c0VarJ.n(p125m4.j.f50823N6, 0));
        }
        this.f43679f0 = c0VarJ.c(p125m4.j.o6);
        this.f43680g0 = c0VarJ.c(p125m4.j.p6);
        int iN = c0VarJ.n(p125m4.j.f50751E6, 0);
        java.lang.CharSequence charSequenceP = c0VarJ.p(p125m4.j.z6);
        int iK = c0VarJ.k(p125m4.j.y6, 1);
        boolean zA = c0VarJ.a(p125m4.j.A6, false);
        int iN2 = c0VarJ.n(p125m4.j.f50791J6, 0);
        boolean zA2 = c0VarJ.a(p125m4.j.f50783I6, false);
        java.lang.CharSequence charSequenceP2 = c0VarJ.p(p125m4.j.f50775H6);
        int iN3 = c0VarJ.n(p125m4.j.f50887V6, 0);
        java.lang.CharSequence charSequenceP3 = c0VarJ.p(p125m4.j.f50879U6);
        boolean zA3 = c0VarJ.a(p125m4.j.i6, false);
        setCounterMaxLength(c0VarJ.k(p125m4.j.j6, -1));
        this.f43657S = c0VarJ.n(p125m4.j.m6, 0);
        this.f43655R = c0VarJ.n(p125m4.j.k6, 0);
        setBoxBackgroundMode(c0VarJ.k(p125m4.j.f50910Y5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f43655R);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f43657S);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (c0VarJ.s(p125m4.j.f50759F6)) {
            setErrorTextColor(c0VarJ.c(p125m4.j.f50759F6));
        }
        if (c0VarJ.s(p125m4.j.f50799K6)) {
            setHelperTextColor(c0VarJ.c(p125m4.j.f50799K6));
        }
        if (c0VarJ.s(p125m4.j.f50831O6)) {
            setHintTextColor(c0VarJ.c(p125m4.j.f50831O6));
        }
        if (c0VarJ.s(p125m4.j.n6)) {
            setCounterTextColor(c0VarJ.c(p125m4.j.n6));
        }
        if (c0VarJ.s(p125m4.j.l6)) {
            setCounterOverflowTextColor(c0VarJ.c(p125m4.j.l6));
        }
        if (c0VarJ.s(p125m4.j.f50895W6)) {
            setPlaceholderTextColor(c0VarJ.c(p125m4.j.f50895W6));
        }
        com.google.android.material.textfield.r rVar = new com.google.android.material.textfield.r(this, c0VarJ);
        this.f43629E = rVar;
        boolean zA4 = c0VarJ.a(p125m4.j.f50846Q5, true);
        c0VarJ.w();
        androidx.core.view.X.w0(this, 2);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.X.y0(this, 1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    private androidx.transition.C2100c A() {
        androidx.transition.C2100c c2100c = new androidx.transition.C2100c();
        c2100c.f0(p245y4.d.f(getContext(), p125m4.a.f50486D, 87));
        c2100c.i0(p245y4.d.g(getContext(), p125m4.a.f50491I, p135n4.a.f51490a));
        return c2100c;
    }

    private boolean B() {
        return this.f43681h0 && !android.text.TextUtils.isEmpty(this.f43682i0) && (this.f43684k0 instanceof com.google.android.material.textfield.AbstractC6523h);
    }

    private void C() {
        java.util.Iterator it = this.f43634G0.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.textfield.TextInputLayout.f) it.next()).a(this);
        }
    }

    private void D(android.graphics.Canvas canvas) {
        E4.g gVar;
        if (this.f43689p0 == null || (gVar = this.f43688o0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f43631F.isFocused()) {
            android.graphics.Rect bounds = this.f43689p0.getBounds();
            android.graphics.Rect bounds2 = this.f43688o0.getBounds();
            float fX = this.f43667X0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = p135n4.a.c(iCenterX, bounds2.left, fX);
            bounds.right = p135n4.a.c(iCenterX, bounds2.right, fX);
            this.f43689p0.draw(canvas);
        }
    }

    private void E(android.graphics.Canvas canvas) {
        if (this.f43681h0) {
            this.f43667X0.l(canvas);
        }
    }

    private void F(boolean z6) {
        android.animation.ValueAnimator valueAnimator = this.f43671a1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f43671a1.cancel();
        }
        if (z6 && this.f43669Z0) {
            l(0.0f);
        } else {
            this.f43667X0.c0(0.0f);
        }
        if (B() && ((com.google.android.material.textfield.AbstractC6523h) this.f43684k0).j0()) {
            y();
        }
        this.f43666W0 = true;
        L();
        this.f43627D.l(true);
        this.f43629E.H(true);
    }

    private E4.g G(boolean z6) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(p125m4.c.f50568b0);
        float f6 = z6 ? dimensionPixelOffset : 0.0f;
        android.widget.EditText editText = this.f43631F;
        float popupElevation = editText instanceof com.google.android.material.textfield.v ? ((com.google.android.material.textfield.v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(p125m4.c.f50587p);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(p125m4.c.f50561W);
        E4.k kVarM = E4.k.a().A(f6).E(f6).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        android.widget.EditText editText2 = this.f43631F;
        E4.g gVarM = E4.g.m(getContext(), popupElevation, editText2 instanceof com.google.android.material.textfield.v ? ((com.google.android.material.textfield.v) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.X(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    private static android.graphics.drawable.Drawable H(E4.g gVar, int i6, int i10, int[][] iArr) {
        return new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(iArr, new int[]{p195t4.a.j(i10, i6, 0.1f), i6}), gVar, gVar);
    }

    private int I(int i6, boolean z6) {
        int compoundPaddingLeft;
        if (z6 || getPrefixText() == null) {
            compoundPaddingLeft = (!z6 || getSuffixText() == null) ? this.f43631F.getCompoundPaddingLeft() : this.f43629E.y();
        } else {
            compoundPaddingLeft = this.f43627D.c();
        }
        return i6 + compoundPaddingLeft;
    }

    private int J(int i6, boolean z6) {
        int compoundPaddingRight;
        if (z6 || getSuffixText() == null) {
            compoundPaddingRight = (!z6 || getPrefixText() == null) ? this.f43631F.getCompoundPaddingRight() : this.f43627D.c();
        } else {
            compoundPaddingRight = this.f43629E.y();
        }
        return i6 - compoundPaddingRight;
    }

    private static android.graphics.drawable.Drawable K(android.content.Context context, E4.g gVar, int i6, int[][] iArr) {
        int iC = p195t4.a.c(context, p125m4.a.f50520n, "TextInputLayout");
        E4.g gVar2 = new E4.g(gVar.B());
        int iJ = p195t4.a.j(i6, iC, 0.1f);
        gVar2.V(new android.content.res.ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr, new int[]{iJ, iC});
        E4.g gVar3 = new E4.g(gVar.B());
        gVar3.setTint(-1);
        return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        android.widget.TextView textView = this.f43663V;
        if (textView == null || !this.f43661U) {
            return;
        }
        textView.setText((java.lang.CharSequence) null);
        androidx.transition.t.a(this.f43625C, this.f43674c0);
        this.f43663V.setVisibility(4);
    }

    private boolean Q() {
        return d0() || (this.f43653Q != null && this.f43649O);
    }

    private boolean S() {
        return this.f43693t0 == 1 && this.f43631F.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(android.text.Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f43631F.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.f43693t0 != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            android.graphics.RectF rectF = this.f43626C0;
            this.f43667X0.o(rectF, this.f43631F.getWidth(), this.f43631F.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f43695v0);
            ((com.google.android.material.textfield.AbstractC6523h) this.f43684k0).m0(rectF);
        }
    }

    private void X() {
        if (!B() || this.f43666W0) {
            return;
        }
        y();
        W();
    }

    private static void Y(android.view.ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z6);
            if (childAt instanceof android.view.ViewGroup) {
                Y((android.view.ViewGroup) childAt, z6);
            }
        }
    }

    private void a0() {
        android.widget.TextView textView = this.f43663V;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        android.graphics.drawable.Drawable orCreateFilledDropDownMenuBackground;
        android.widget.EditText editText = this.f43631F;
        if (editText instanceof android.widget.AutoCompleteTextView) {
            android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.f43693t0;
                if (i6 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i6 != 1) {
                    return;
                } else {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private boolean e0() {
        return (this.f43629E.G() || ((this.f43629E.A() && M()) || this.f43629E.w() != null)) && this.f43629E.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f43627D.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f43663V == null || !this.f43661U || android.text.TextUtils.isEmpty(this.f43659T)) {
            return;
        }
        this.f43663V.setText(this.f43659T);
        androidx.transition.t.a(this.f43625C, this.f43672b0);
        this.f43663V.setVisibility(0);
        this.f43663V.bringToFront();
        announceForAccessibility(this.f43659T);
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
        android.widget.EditText editText = this.f43631F;
        if (!(editText instanceof android.widget.AutoCompleteTextView) || com.google.android.material.textfield.q.a(editText)) {
            return this.f43684k0;
        }
        int iD = p195t4.a.d(this.f43631F, p125m4.a.f50515i);
        int i6 = this.f43693t0;
        if (i6 == 2) {
            return K(getContext(), this.f43684k0, iD, f43622f1);
        }
        if (i6 == 1) {
            return H(this.f43684k0, this.f43699z0, iD, f43622f1);
        }
        return null;
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f43686m0 == null) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            this.f43686m0 = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f43686m0.addState(new int[0], G(false));
        }
        return this.f43686m0;
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f43685l0 == null) {
            this.f43685l0 = G(true);
        }
        return this.f43685l0;
    }

    private void h0() {
        android.content.res.Resources resources;
        int i6;
        if (this.f43693t0 == 1) {
            if (B4.c.h(getContext())) {
                resources = getResources();
                i6 = p125m4.c.f50597z;
            } else {
                if (!B4.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i6 = p125m4.c.f50596y;
            }
            this.f43694u0 = resources.getDimensionPixelSize(i6);
        }
    }

    private void i0(android.graphics.Rect rect) {
        E4.g gVar = this.f43688o0;
        if (gVar != null) {
            int i6 = rect.bottom;
            gVar.setBounds(rect.left, i6 - this.f43696w0, rect.right, i6);
        }
        E4.g gVar2 = this.f43689p0;
        if (gVar2 != null) {
            int i10 = rect.bottom;
            gVar2.setBounds(rect.left, i10 - this.f43697x0, rect.right, i10);
        }
    }

    private void j() {
        android.widget.TextView textView = this.f43663V;
        if (textView != null) {
            this.f43625C.addView(textView);
            this.f43663V.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f43653Q != null) {
            android.widget.EditText editText = this.f43631F;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        android.widget.EditText editText;
        int iE;
        int dimensionPixelSize;
        int iD;
        android.content.res.Resources resources;
        int i6;
        if (this.f43631F == null || this.f43693t0 != 1) {
            return;
        }
        if (B4.c.h(getContext())) {
            editText = this.f43631F;
            iE = androidx.core.view.X.E(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(p125m4.c.f50595x);
            iD = androidx.core.view.X.D(this.f43631F);
            resources = getResources();
            i6 = p125m4.c.f50594w;
        } else {
            if (!B4.c.g(getContext())) {
                return;
            }
            editText = this.f43631F;
            iE = androidx.core.view.X.E(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(p125m4.c.f50593v);
            iD = androidx.core.view.X.D(this.f43631F);
            resources = getResources();
            i6 = p125m4.c.f50592u;
        }
        androidx.core.view.X.B0(editText, iE, dimensionPixelSize, iD, resources.getDimensionPixelSize(i6));
    }

    private static void l0(android.content.Context context, android.widget.TextView textView, int i6, int i10, boolean z6) {
        textView.setContentDescription(context.getString(z6 ? p125m4.h.f50673c : p125m4.h.f50672b, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
    }

    private void m() {
        E4.g gVar = this.f43684k0;
        if (gVar == null) {
            return;
        }
        E4.k kVarB = gVar.B();
        E4.k kVar = this.f43690q0;
        if (kVarB != kVar) {
            this.f43684k0.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.f43684k0.Z(this.f43695v0, this.f43698y0);
        }
        int iQ = q();
        this.f43699z0 = iQ;
        this.f43684k0.V(android.content.res.ColorStateList.valueOf(iQ));
        n();
        r0();
    }

    private void m0() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.widget.TextView textView = this.f43653Q;
        if (textView != null) {
            c0(textView, this.f43649O ? this.f43655R : this.f43657S);
            if (!this.f43649O && (colorStateList2 = this.f43676d0) != null) {
                this.f43653Q.setTextColor(colorStateList2);
            }
            if (!this.f43649O || (colorStateList = this.f43678e0) == null) {
                return;
            }
            this.f43653Q.setTextColor(colorStateList);
        }
    }

    private void n() {
        if (this.f43688o0 == null || this.f43689p0 == null) {
            return;
        }
        if (x()) {
            this.f43688o0.V(android.content.res.ColorStateList.valueOf(this.f43631F.isFocused() ? this.f43646M0 : this.f43698y0));
            this.f43689p0.V(android.content.res.ColorStateList.valueOf(this.f43698y0));
        }
        invalidate();
    }

    private void n0() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateListG = this.f43679f0;
        if (colorStateListG == null) {
            colorStateListG = p195t4.a.g(getContext(), p125m4.a.f50514h);
        }
        android.widget.EditText editText = this.f43631F;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.a.r(this.f43631F.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f43680g0) != null) {
            colorStateListG = colorStateList;
        }
        androidx.core.graphics.drawable.a.o(drawableMutate, colorStateListG);
    }

    private void o(android.graphics.RectF rectF) {
        float f6 = rectF.left;
        int i6 = this.f43692s0;
        rectF.left = f6 - i6;
        rectF.right += i6;
    }

    private void p() {
        int i6 = this.f43693t0;
        if (i6 == 0) {
            this.f43684k0 = null;
        } else if (i6 == 1) {
            this.f43684k0 = new E4.g(this.f43690q0);
            this.f43688o0 = new E4.g();
            this.f43689p0 = new E4.g();
            return;
        } else {
            if (i6 != 2) {
                throw new java.lang.IllegalArgumentException(this.f43693t0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f43684k0 = (!this.f43681h0 || (this.f43684k0 instanceof com.google.android.material.textfield.AbstractC6523h)) ? new E4.g(this.f43690q0) : com.google.android.material.textfield.AbstractC6523h.h0(this.f43690q0);
        }
        this.f43688o0 = null;
        this.f43689p0 = null;
    }

    private int q() {
        return this.f43693t0 == 1 ? p195t4.a.i(p195t4.a.e(this, p125m4.a.f50520n, 0), this.f43699z0) : this.f43699z0;
    }

    private void q0() {
        androidx.core.view.X.r0(this.f43631F, getEditTextBoxBackground());
    }

    private android.graphics.Rect r(android.graphics.Rect rect) {
        int paddingTop;
        int iJ;
        if (this.f43631F == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.f43624B0;
        boolean zG = com.google.android.material.internal.n.g(this);
        rect2.bottom = rect.bottom;
        int i6 = this.f43693t0;
        if (i6 != 1) {
            if (i6 != 2) {
                rect2.left = I(rect.left, zG);
                paddingTop = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f43631F.getPaddingLeft();
                rect2.top = rect.top - v();
                iJ = rect.right - this.f43631F.getPaddingRight();
            }
            rect2.right = iJ;
            return rect2;
        }
        rect2.left = I(rect.left, zG);
        paddingTop = rect.top + this.f43694u0;
        rect2.top = paddingTop;
        iJ = J(rect.right, zG);
        rect2.right = iJ;
        return rect2;
    }

    private int s(android.graphics.Rect rect, android.graphics.Rect rect2, float f6) {
        return S() ? (int) (rect2.top + f6) : rect.bottom - this.f43631F.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int iMax;
        if (this.f43631F == null || this.f43631F.getMeasuredHeight() >= (iMax = java.lang.Math.max(this.f43629E.getMeasuredHeight(), this.f43627D.getMeasuredHeight()))) {
            return false;
        }
        this.f43631F.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(android.widget.EditText editText) {
        if (this.f43631F != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() == 3 || !(editText instanceof com.google.android.material.textfield.TextInputEditText)) {
        }
        this.f43631F = editText;
        int i6 = this.f43635H;
        if (i6 != -1) {
            setMinEms(i6);
        } else {
            setMinWidth(this.f43639J);
        }
        int i10 = this.f43637I;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f43641K);
        }
        this.f43687n0 = false;
        V();
        setTextInputAccessibilityDelegate(new com.google.android.material.textfield.TextInputLayout.d(this));
        this.f43667X0.i0(this.f43631F.getTypeface());
        this.f43667X0.a0(this.f43631F.getTextSize());
        int i11 = android.os.Build.VERSION.SDK_INT;
        this.f43667X0.X(this.f43631F.getLetterSpacing());
        int gravity = this.f43631F.getGravity();
        this.f43667X0.S((gravity & (-113)) | 48);
        this.f43667X0.Z(gravity);
        this.f43664V0 = androidx.core.view.X.A(editText);
        this.f43631F.addTextChangedListener(new com.google.android.material.textfield.TextInputLayout.a(editText));
        if (this.f43642K0 == null) {
            this.f43642K0 = this.f43631F.getHintTextColors();
        }
        if (this.f43681h0) {
            if (android.text.TextUtils.isEmpty(this.f43682i0)) {
                java.lang.CharSequence hint = this.f43631F.getHint();
                this.f43633G = hint;
                setHint(hint);
                this.f43631F.setHint((java.lang.CharSequence) null);
            }
            this.f43683j0 = true;
        }
        if (i11 >= 29) {
            n0();
        }
        if (this.f43653Q != null) {
            k0(this.f43631F.getText());
        }
        p0();
        this.f43643L.f();
        this.f43627D.bringToFront();
        this.f43629E.bringToFront();
        C();
        this.f43629E.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.f43682i0)) {
            return;
        }
        this.f43682i0 = charSequence;
        this.f43667X0.g0(charSequence);
        if (this.f43666W0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f43661U == z6) {
            return;
        }
        if (z6) {
            j();
        } else {
            a0();
            this.f43663V = null;
        }
        this.f43661U = z6;
    }

    private int t(android.graphics.Rect rect, float f6) {
        return S() ? (int) (rect.centerY() - (f6 / 2.0f)) : rect.top + this.f43631F.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.f43693t0 != 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f43625C.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f43625C.requestLayout();
            }
        }
    }

    private android.graphics.Rect u(android.graphics.Rect rect) {
        if (this.f43631F == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.f43624B0;
        float fW = this.f43667X0.w();
        rect2.left = rect.left + this.f43631F.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f43631F.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    private int v() {
        float fQ;
        if (!this.f43681h0) {
            return 0;
        }
        int i6 = this.f43693t0;
        if (i6 == 0) {
            fQ = this.f43667X0.q();
        } else {
            if (i6 != 2) {
                return 0;
            }
            fQ = this.f43667X0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void v0(boolean z6, boolean z10) {
        android.content.res.ColorStateList colorStateList;
        android.widget.TextView textView;
        com.google.android.material.internal.a aVar;
        android.content.res.ColorStateList textColors;
        boolean zIsEnabled = isEnabled();
        android.widget.EditText editText = this.f43631F;
        boolean z11 = false;
        boolean z12 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.f43631F;
        if (editText2 != null && editText2.hasFocus()) {
            z11 = true;
        }
        android.content.res.ColorStateList colorStateList2 = this.f43642K0;
        if (colorStateList2 != null) {
            this.f43667X0.M(colorStateList2);
        }
        if (zIsEnabled) {
            if (d0()) {
                this.f43667X0.M(this.f43643L.r());
            } else if (this.f43649O && (textView = this.f43653Q) != null) {
                aVar = this.f43667X0;
                textColors = textView.getTextColors();
            } else if (z11 && (colorStateList = this.f43644L0) != null) {
                this.f43667X0.R(colorStateList);
            }
            if (z12 && this.f43668Y0 && (!isEnabled() || !z11)) {
                if (z10 || !this.f43666W0) {
                    F(z6);
                    return;
                }
                return;
            }
            if (!z10 || this.f43666W0) {
                z(z6);
            }
            return;
        }
        android.content.res.ColorStateList colorStateList3 = this.f43642K0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f43662U0) : this.f43662U0;
        aVar = this.f43667X0;
        textColors = android.content.res.ColorStateList.valueOf(colorForState);
        aVar.M(textColors);
        if (z12) {
        }
        if (z10) {
        }
        z(z6);
    }

    private boolean w() {
        return this.f43693t0 == 2 && x();
    }

    private void w0() {
        android.widget.EditText editText;
        if (this.f43663V == null || (editText = this.f43631F) == null) {
            return;
        }
        this.f43663V.setGravity(editText.getGravity());
        this.f43663V.setPadding(this.f43631F.getCompoundPaddingLeft(), this.f43631F.getCompoundPaddingTop(), this.f43631F.getCompoundPaddingRight(), this.f43631F.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.f43695v0 > -1 && this.f43698y0 != 0;
    }

    private void x0() {
        android.widget.EditText editText = this.f43631F;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((com.google.android.material.textfield.AbstractC6523h) this.f43684k0).k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(android.text.Editable editable) {
        if (this.f43651P.a(editable) != 0 || this.f43666W0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z6) {
        android.animation.ValueAnimator valueAnimator = this.f43671a1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f43671a1.cancel();
        }
        if (z6 && this.f43669Z0) {
            l(1.0f);
        } else {
            this.f43667X0.c0(1.0f);
        }
        this.f43666W0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f43627D.l(false);
        this.f43629E.H(false);
    }

    private void z0(boolean z6, boolean z10) {
        int defaultColor = this.f43652P0.getDefaultColor();
        int colorForState = this.f43652P0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f43652P0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f43698y0 = colorForState2;
        } else if (z10) {
            this.f43698y0 = colorForState;
        } else {
            this.f43698y0 = defaultColor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:48:0x0074  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    void A0() {
        int currentTextColor;
        android.widget.TextView textView;
        int i6;
        int i10;
        int i11;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        if (this.f43684k0 == null || this.f43693t0 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z10 = isFocused() || ((editText2 = this.f43631F) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f43631F) != null && editText.isHovered())) {
            z6 = true;
        }
        if (isEnabled()) {
            if (d0()) {
                if (this.f43652P0 != null) {
                    z0(z10, z6);
                } else {
                    currentTextColor = getErrorCurrentTextColors();
                }
            } else if (!this.f43649O || (textView = this.f43653Q) == null) {
                if (z10) {
                    currentTextColor = this.f43650O0;
                } else {
                    currentTextColor = z6 ? this.f43648N0 : this.f43646M0;
                }
            } else if (this.f43652P0 != null) {
                z0(z10, z6);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                n0();
            }
            this.f43629E.I();
            Z();
            if (this.f43693t0 == 2) {
                i10 = this.f43695v0;
                if (z10 || !isEnabled()) {
                    i11 = this.f43696w0;
                } else {
                    i11 = this.f43697x0;
                }
                this.f43695v0 = i11;
                if (this.f43695v0 != i10) {
                    X();
                }
            }
            if (this.f43693t0 == 1) {
                if (!isEnabled()) {
                    i6 = this.f43656R0;
                } else if (!z6 && !z10) {
                    i6 = this.f43660T0;
                } else if (z10) {
                    i6 = this.f43658S0;
                } else {
                    i6 = this.f43654Q0;
                }
                this.f43699z0 = i6;
            }
            m();
        }
        currentTextColor = this.f43662U0;
        this.f43698y0 = currentTextColor;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f43629E.I();
        Z();
        if (this.f43693t0 == 2) {
            i10 = this.f43695v0;
            if (z10) {
                i11 = this.f43696w0;
            } else {
                i11 = this.f43696w0;
            }
            this.f43695v0 = i11;
            if (this.f43695v0 != i10) {
                X();
            }
        }
        if (this.f43693t0 == 1) {
            if (!isEnabled()) {
                i6 = this.f43656R0;
            } else if (!z6) {
                if (z10) {
                    i6 = this.f43658S0;
                } else {
                    i6 = this.f43654Q0;
                }
            } else if (z10) {
                i6 = this.f43658S0;
            } else {
                i6 = this.f43654Q0;
            }
            this.f43699z0 = i6;
        }
        m();
    }

    public boolean M() {
        return this.f43629E.F();
    }

    public boolean N() {
        return this.f43643L.A();
    }

    public boolean O() {
        return this.f43643L.B();
    }

    final boolean P() {
        return this.f43666W0;
    }

    public boolean R() {
        return this.f43683j0;
    }

    public void Z() {
        this.f43627D.m();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof android.widget.EditText)) {
            super.addView(view, i6, layoutParams);
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f43625C.addView(view, layoutParams2);
        this.f43625C.setLayoutParams(layoutParams);
        t0();
        setEditText((android.widget.EditText) view);
    }

    void c0(android.widget.TextView textView, int i6) {
        try {
            androidx.core.widget.h.n(textView, i6);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (java.lang.Exception unused) {
        }
        androidx.core.widget.h.n(textView, p125m4.i.f50695b);
        textView.setTextColor(androidx.core.content.a.c(getContext(), p125m4.b.f50533a));
    }

    boolean d0() {
        return this.f43643L.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i6) {
        android.widget.EditText editText = this.f43631F;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f43633G != null) {
            boolean z6 = this.f43683j0;
            this.f43683j0 = false;
            java.lang.CharSequence hint = editText.getHint();
            this.f43631F.setHint(this.f43633G);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f43631F.setHint(hint);
                this.f43683j0 = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        viewStructure.setChildCount(this.f43625C.getChildCount());
        for (int i10 = 0; i10 < this.f43625C.getChildCount(); i10++) {
            android.view.View childAt = this.f43625C.getChildAt(i10);
            android.view.ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i6);
            if (childAt == this.f43631F) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        this.f43675c1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f43675c1 = false;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f43673b1) {
            return;
        }
        this.f43673b1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f43667X0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f43631F != null) {
            u0(androidx.core.view.X.R(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f43673b1 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        android.widget.EditText editText = this.f43631F;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    E4.g getBoxBackground() {
        int i6 = this.f43693t0;
        if (i6 == 1 || i6 == 2) {
            return this.f43684k0;
        }
        throw new java.lang.IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f43699z0;
    }

    public int getBoxBackgroundMode() {
        return this.f43693t0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f43694u0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (com.google.android.material.internal.n.g(this) ? this.f43690q0.j() : this.f43690q0.l()).a(this.f43626C0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (com.google.android.material.internal.n.g(this) ? this.f43690q0.l() : this.f43690q0.j()).a(this.f43626C0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (com.google.android.material.internal.n.g(this) ? this.f43690q0.r() : this.f43690q0.t()).a(this.f43626C0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (com.google.android.material.internal.n.g(this) ? this.f43690q0.t() : this.f43690q0.r()).a(this.f43626C0);
    }

    public int getBoxStrokeColor() {
        return this.f43650O0;
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
        return this.f43652P0;
    }

    public int getBoxStrokeWidth() {
        return this.f43696w0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f43697x0;
    }

    public int getCounterMaxLength() {
        return this.f43647N;
    }

    java.lang.CharSequence getCounterOverflowDescription() {
        android.widget.TextView textView;
        if (this.f43645M && this.f43649O && (textView = this.f43653Q) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
        return this.f43678e0;
    }

    public android.content.res.ColorStateList getCounterTextColor() {
        return this.f43676d0;
    }

    public android.content.res.ColorStateList getCursorColor() {
        return this.f43679f0;
    }

    public android.content.res.ColorStateList getCursorErrorColor() {
        return this.f43680g0;
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
        return this.f43642K0;
    }

    public android.widget.EditText getEditText() {
        return this.f43631F;
    }

    public java.lang.CharSequence getEndIconContentDescription() {
        return this.f43629E.l();
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
        return this.f43629E.n();
    }

    public int getEndIconMinSize() {
        return this.f43629E.o();
    }

    public int getEndIconMode() {
        return this.f43629E.p();
    }

    public android.widget.ImageView.ScaleType getEndIconScaleType() {
        return this.f43629E.q();
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
        return this.f43629E.r();
    }

    public java.lang.CharSequence getError() {
        if (this.f43643L.A()) {
            return this.f43643L.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f43643L.n();
    }

    public java.lang.CharSequence getErrorContentDescription() {
        return this.f43643L.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f43643L.q();
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
        return this.f43629E.s();
    }

    public java.lang.CharSequence getHelperText() {
        if (this.f43643L.B()) {
            return this.f43643L.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f43643L.u();
    }

    public java.lang.CharSequence getHint() {
        if (this.f43681h0) {
            return this.f43682i0;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f43667X0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f43667X0.t();
    }

    public android.content.res.ColorStateList getHintTextColor() {
        return this.f43644L0;
    }

    public com.google.android.material.textfield.TextInputLayout.e getLengthCounter() {
        return this.f43651P;
    }

    public int getMaxEms() {
        return this.f43637I;
    }

    public int getMaxWidth() {
        return this.f43641K;
    }

    public int getMinEms() {
        return this.f43635H;
    }

    public int getMinWidth() {
        return this.f43639J;
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f43629E.u();
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
        return this.f43629E.v();
    }

    public java.lang.CharSequence getPlaceholderText() {
        if (this.f43661U) {
            return this.f43659T;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f43670a0;
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
        return this.f43665W;
    }

    public java.lang.CharSequence getPrefixText() {
        return this.f43627D.a();
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
        return this.f43627D.b();
    }

    public android.widget.TextView getPrefixTextView() {
        return this.f43627D.d();
    }

    public E4.k getShapeAppearanceModel() {
        return this.f43690q0;
    }

    public java.lang.CharSequence getStartIconContentDescription() {
        return this.f43627D.e();
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
        return this.f43627D.f();
    }

    public int getStartIconMinSize() {
        return this.f43627D.g();
    }

    public android.widget.ImageView.ScaleType getStartIconScaleType() {
        return this.f43627D.h();
    }

    public java.lang.CharSequence getSuffixText() {
        return this.f43629E.w();
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
        return this.f43629E.x();
    }

    public android.widget.TextView getSuffixTextView() {
        return this.f43629E.z();
    }

    public android.graphics.Typeface getTypeface() {
        return this.f43628D0;
    }

    public void i(com.google.android.material.textfield.TextInputLayout.f fVar) {
        this.f43634G0.add(fVar);
        if (this.f43631F != null) {
            fVar.a(this);
        }
    }

    void k0(android.text.Editable editable) {
        int iA = this.f43651P.a(editable);
        boolean z6 = this.f43649O;
        int i6 = this.f43647N;
        if (i6 == -1) {
            this.f43653Q.setText(java.lang.String.valueOf(iA));
            this.f43653Q.setContentDescription(null);
            this.f43649O = false;
        } else {
            this.f43649O = iA > i6;
            l0(getContext(), this.f43653Q, iA, this.f43647N, this.f43649O);
            if (z6 != this.f43649O) {
                m0();
            }
            this.f43653Q.setText(androidx.core.text.a.c().j(getContext().getString(p125m4.h.f50674d, java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(this.f43647N))));
        }
        if (this.f43631F == null || z6 == this.f43649O) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    void l(float f6) {
        if (this.f43667X0.x() == f6) {
            return;
        }
        if (this.f43671a1 == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.f43671a1 = valueAnimator;
            valueAnimator.setInterpolator(p245y4.d.g(getContext(), p125m4.a.f50490H, p135n4.a.f51491b));
            this.f43671a1.setDuration(p245y4.d.f(getContext(), p125m4.a.f50485C, 167));
            this.f43671a1.addUpdateListener(new com.google.android.material.textfield.TextInputLayout.c());
        }
        this.f43671a1.setFloatValues(this.f43667X0.x(), f6);
        this.f43671a1.start();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean o0() {
        boolean z6;
        android.graphics.drawable.Drawable drawable;
        android.widget.EditText editText;
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3;
        android.graphics.drawable.Drawable drawable4;
        if (this.f43631F == null) {
            return false;
        }
        boolean z10 = true;
        if (f0()) {
            int measuredWidth = this.f43627D.getMeasuredWidth() - this.f43631F.getPaddingLeft();
            if (this.f43630E0 == null || this.f43632F0 != measuredWidth) {
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                this.f43630E0 = colorDrawable;
                this.f43632F0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            android.graphics.drawable.Drawable[] drawableArrA = androidx.core.widget.h.a(this.f43631F);
            android.graphics.drawable.Drawable drawable5 = drawableArrA[0];
            android.graphics.drawable.Drawable drawable6 = this.f43630E0;
            if (drawable5 != drawable6) {
                androidx.core.widget.h.i(this.f43631F, drawable6, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z6 = true;
            } else {
                z6 = false;
            }
        } else if (this.f43630E0 != null) {
            android.graphics.drawable.Drawable[] drawableArrA2 = androidx.core.widget.h.a(this.f43631F);
            androidx.core.widget.h.i(this.f43631F, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.f43630E0 = null;
            z6 = true;
        } else {
            z6 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f43629E.z().getMeasuredWidth() - this.f43631F.getPaddingRight();
            com.google.android.material.internal.CheckableImageButton checkableImageButtonK = this.f43629E.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + androidx.core.view.AbstractC2031v.b((android.view.ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            android.graphics.drawable.Drawable[] drawableArrA3 = androidx.core.widget.h.a(this.f43631F);
            android.graphics.drawable.Drawable drawable7 = this.f43636H0;
            if (drawable7 == null || this.f43638I0 == measuredWidth2) {
                if (drawable7 == null) {
                    android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable();
                    this.f43636H0 = colorDrawable2;
                    this.f43638I0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                android.graphics.drawable.Drawable drawable8 = drawableArrA3[2];
                drawable = this.f43636H0;
                if (drawable8 != drawable) {
                    this.f43640J0 = drawable8;
                    editText = this.f43631F;
                    drawable2 = drawableArrA3[0];
                    drawable3 = drawableArrA3[1];
                    drawable4 = drawableArrA3[3];
                } else {
                    z10 = z6;
                }
            } else {
                this.f43638I0 = measuredWidth2;
                drawable7.setBounds(0, 0, measuredWidth2, 1);
                editText = this.f43631F;
                drawable2 = drawableArrA3[0];
                drawable3 = drawableArrA3[1];
                drawable = this.f43636H0;
                drawable4 = drawableArrA3[3];
            }
            androidx.core.widget.h.i(editText, drawable2, drawable3, drawable, drawable4);
        } else {
            if (this.f43636H0 == null) {
                return z6;
            }
            android.graphics.drawable.Drawable[] drawableArrA4 = androidx.core.widget.h.a(this.f43631F);
            if (drawableArrA4[2] == this.f43636H0) {
                androidx.core.widget.h.i(this.f43631F, drawableArrA4[0], drawableArrA4[1], this.f43640J0, drawableArrA4[3]);
            } else {
                z10 = z6;
            }
            this.f43636H0 = null;
        }
        return z10;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f43667X0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f43629E.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f43677d1 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f43631F.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43618C.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        android.widget.EditText editText = this.f43631F;
        if (editText != null) {
            android.graphics.Rect rect = this.f43623A0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.f43681h0) {
                this.f43667X0.a0(this.f43631F.getTextSize());
                int gravity = this.f43631F.getGravity();
                this.f43667X0.S((gravity & (-113)) | 48);
                this.f43667X0.Z(gravity);
                this.f43667X0.O(r(rect));
                this.f43667X0.W(u(rect));
                this.f43667X0.J();
                if (!B() || this.f43666W0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (!this.f43677d1) {
            this.f43629E.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f43677d1 = true;
        }
        w0();
        this.f43629E.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.textfield.TextInputLayout.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.textfield.TextInputLayout.g gVar = (com.google.android.material.textfield.TextInputLayout.g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        setError(gVar.f43706E);
        if (gVar.f43707F) {
            post(new com.google.android.material.textfield.TextInputLayout.b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z6 = i6 == 1;
        if (z6 != this.f43691r0) {
            float fA = this.f43690q0.r().a(this.f43626C0);
            float fA2 = this.f43690q0.t().a(this.f43626C0);
            E4.k kVarM = E4.k.a().z(this.f43690q0.s()).D(this.f43690q0.q()).r(this.f43690q0.k()).v(this.f43690q0.i()).A(fA2).E(fA).s(this.f43690q0.l().a(this.f43626C0)).w(this.f43690q0.j().a(this.f43626C0)).m();
            this.f43691r0 = z6;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.textfield.TextInputLayout.g gVar = new com.google.android.material.textfield.TextInputLayout.g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f43706E = getError();
        }
        gVar.f43707F = this.f43629E.E();
        return gVar;
    }

    void p0() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        int currentTextColor;
        android.widget.EditText editText = this.f43631F;
        if (editText == null || this.f43693t0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.K.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            currentTextColor = getErrorCurrentTextColors();
        } else {
            if (!this.f43649O || (textView = this.f43653Q) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f43631F.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.C1905k.e(currentTextColor, android.graphics.PorterDuff.Mode.SRC_IN));
    }

    void r0() {
        android.widget.EditText editText = this.f43631F;
        if (editText == null || this.f43684k0 == null) {
            return;
        }
        if ((this.f43687n0 || editText.getBackground() == null) && this.f43693t0 != 0) {
            q0();
            this.f43687n0 = true;
        }
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.f43699z0 != i6) {
            this.f43699z0 = i6;
            this.f43654Q0 = i6;
            this.f43658S0 = i6;
            this.f43660T0 = i6;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i6));
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f43654Q0 = defaultColor;
        this.f43699z0 = defaultColor;
        this.f43656R0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f43658S0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f43660T0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.f43693t0) {
            return;
        }
        this.f43693t0 = i6;
        if (this.f43631F != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.f43694u0 = i6;
    }

    public void setBoxCornerFamily(int i6) {
        this.f43690q0 = this.f43690q0.v().y(i6, this.f43690q0.r()).C(i6, this.f43690q0.t()).q(i6, this.f43690q0.j()).u(i6, this.f43690q0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.f43650O0 != i6) {
            this.f43650O0 = i6;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f43650O0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0();
        } else {
            this.f43646M0 = colorStateList.getDefaultColor();
            this.f43662U0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f43648N0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        }
        this.f43650O0 = defaultColor;
        A0();
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43652P0 != colorStateList) {
            this.f43652P0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.f43696w0 = i6;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.f43697x0 = i6;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f43645M != z6) {
            if (z6) {
                androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(getContext());
                this.f43653Q = d6;
                d6.setId(p125m4.e.f50618J);
                android.graphics.Typeface typeface = this.f43628D0;
                if (typeface != null) {
                    this.f43653Q.setTypeface(typeface);
                }
                this.f43653Q.setMaxLines(1);
                this.f43643L.e(this.f43653Q, 2);
                androidx.core.view.AbstractC2031v.d((android.view.ViewGroup.MarginLayoutParams) this.f43653Q.getLayoutParams(), getResources().getDimensionPixelOffset(p125m4.c.f50578g0));
                m0();
                j0();
            } else {
                this.f43643L.C(this.f43653Q, 2);
                this.f43653Q = null;
            }
            this.f43645M = z6;
        }
    }

    public void setCounterMaxLength(int i6) {
        if (this.f43647N != i6) {
            if (i6 <= 0) {
                i6 = -1;
            }
            this.f43647N = i6;
            if (this.f43645M) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.f43655R != i6) {
            this.f43655R = i6;
            m0();
        }
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43678e0 != colorStateList) {
            this.f43678e0 = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.f43657S != i6) {
            this.f43657S = i6;
            m0();
        }
    }

    public void setCounterTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43676d0 != colorStateList) {
            this.f43676d0 = colorStateList;
            m0();
        }
    }

    public void setCursorColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43679f0 != colorStateList) {
            this.f43679f0 = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43680g0 != colorStateList) {
            this.f43680g0 = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43642K0 = colorStateList;
        this.f43644L0 = colorStateList;
        if (this.f43631F != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        Y(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f43629E.N(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f43629E.O(z6);
    }

    public void setEndIconContentDescription(int i6) {
        this.f43629E.P(i6);
    }

    public void setEndIconContentDescription(java.lang.CharSequence charSequence) {
        this.f43629E.Q(charSequence);
    }

    public void setEndIconDrawable(int i6) {
        this.f43629E.R(i6);
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.f43629E.S(drawable);
    }

    public void setEndIconMinSize(int i6) {
        this.f43629E.T(i6);
    }

    public void setEndIconMode(int i6) {
        this.f43629E.U(i6);
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f43629E.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43629E.W(onLongClickListener);
    }

    public void setEndIconScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.f43629E.X(scaleType);
    }

    public void setEndIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f43629E.Y(colorStateList);
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f43629E.Z(mode);
    }

    public void setEndIconVisible(boolean z6) {
        this.f43629E.a0(z6);
    }

    public void setError(java.lang.CharSequence charSequence) {
        if (!this.f43643L.A()) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            this.f43643L.w();
        } else {
            this.f43643L.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        this.f43643L.E(i6);
    }

    public void setErrorContentDescription(java.lang.CharSequence charSequence) {
        this.f43643L.F(charSequence);
    }

    public void setErrorEnabled(boolean z6) {
        this.f43643L.G(z6);
    }

    public void setErrorIconDrawable(int i6) {
        this.f43629E.b0(i6);
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.f43629E.c0(drawable);
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f43629E.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43629E.e0(onLongClickListener);
    }

    public void setErrorIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f43629E.f0(colorStateList);
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f43629E.g0(mode);
    }

    public void setErrorTextAppearance(int i6) {
        this.f43643L.H(i6);
    }

    public void setErrorTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43643L.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f43668Y0 != z6) {
            this.f43668Y0 = z6;
            u0(false);
        }
    }

    public void setHelperText(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f43643L.R(charSequence);
        }
    }

    public void setHelperTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43643L.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        this.f43643L.K(z6);
    }

    public void setHelperTextTextAppearance(int i6) {
        this.f43643L.J(i6);
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setHint(java.lang.CharSequence charSequence) {
        if (this.f43681h0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f43669Z0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f43681h0) {
            this.f43681h0 = z6;
            if (z6) {
                java.lang.CharSequence hint = this.f43631F.getHint();
                if (!android.text.TextUtils.isEmpty(hint)) {
                    if (android.text.TextUtils.isEmpty(this.f43682i0)) {
                        setHint(hint);
                    }
                    this.f43631F.setHint((java.lang.CharSequence) null);
                }
                this.f43683j0 = true;
            } else {
                this.f43683j0 = false;
                if (!android.text.TextUtils.isEmpty(this.f43682i0) && android.text.TextUtils.isEmpty(this.f43631F.getHint())) {
                    this.f43631F.setHint(this.f43682i0);
                }
                setHintInternal(null);
            }
            if (this.f43631F != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i6) {
        this.f43667X0.P(i6);
        this.f43644L0 = this.f43667X0.p();
        if (this.f43631F != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43644L0 != colorStateList) {
            if (this.f43642K0 == null) {
                this.f43667X0.R(colorStateList);
            }
            this.f43644L0 = colorStateList;
            if (this.f43631F != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(com.google.android.material.textfield.TextInputLayout.e eVar) {
        this.f43651P = eVar;
    }

    public void setMaxEms(int i6) {
        this.f43637I = i6;
        android.widget.EditText editText = this.f43631F;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxEms(i6);
    }

    public void setMaxWidth(int i6) {
        this.f43641K = i6;
        android.widget.EditText editText = this.f43631F;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxWidth(i6);
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f43635H = i6;
        android.widget.EditText editText = this.f43631F;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinEms(i6);
    }

    public void setMinWidth(int i6) {
        this.f43639J = i6;
        android.widget.EditText editText = this.f43631F;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinWidth(i6);
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        this.f43629E.i0(i6);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence charSequence) {
        this.f43629E.j0(charSequence);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        this.f43629E.k0(i6);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable drawable) {
        this.f43629E.l0(drawable);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        this.f43629E.m0(z6);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList colorStateList) {
        this.f43629E.n0(colorStateList);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f43629E.o0(mode);
    }

    public void setPlaceholderText(java.lang.CharSequence charSequence) {
        if (this.f43663V == null) {
            androidx.appcompat.widget.D d6 = new androidx.appcompat.widget.D(getContext());
            this.f43663V = d6;
            d6.setId(p125m4.e.f50621M);
            androidx.core.view.X.w0(this.f43663V, 2);
            androidx.transition.C2100c c2100cA = A();
            this.f43672b0 = c2100cA;
            c2100cA.l0(67L);
            this.f43674c0 = A();
            setPlaceholderTextAppearance(this.f43670a0);
            setPlaceholderTextColor(this.f43665W);
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f43661U) {
                setPlaceholderTextEnabled(true);
            }
            this.f43659T = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.f43670a0 = i6;
        android.widget.TextView textView = this.f43663V;
        if (textView != null) {
            androidx.core.widget.h.n(textView, i6);
        }
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.f43665W != colorStateList) {
            this.f43665W = colorStateList;
            android.widget.TextView textView = this.f43663V;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(java.lang.CharSequence charSequence) {
        this.f43627D.n(charSequence);
    }

    public void setPrefixTextAppearance(int i6) {
        this.f43627D.o(i6);
    }

    public void setPrefixTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43627D.p(colorStateList);
    }

    public void setShapeAppearanceModel(E4.k kVar) {
        E4.g gVar = this.f43684k0;
        if (gVar == null || gVar.B() == kVar) {
            return;
        }
        this.f43690q0 = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f43627D.q(z6);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconContentDescription(java.lang.CharSequence charSequence) {
        this.f43627D.r(charSequence);
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? p100k.a.b(getContext(), i6) : null);
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.f43627D.s(drawable);
    }

    public void setStartIconMinSize(int i6) {
        this.f43627D.t(i6);
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f43627D.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f43627D.v(onLongClickListener);
    }

    public void setStartIconScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.f43627D.w(scaleType);
    }

    public void setStartIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f43627D.x(colorStateList);
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f43627D.y(mode);
    }

    public void setStartIconVisible(boolean z6) {
        this.f43627D.z(z6);
    }

    public void setSuffixText(java.lang.CharSequence charSequence) {
        this.f43629E.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i6) {
        this.f43629E.q0(i6);
    }

    public void setSuffixTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43629E.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.TextInputLayout.d dVar) {
        android.widget.EditText editText = this.f43631F;
        if (editText != null) {
            androidx.core.view.X.n0(editText, dVar);
        }
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        if (typeface != this.f43628D0) {
            this.f43628D0 = typeface;
            this.f43667X0.i0(typeface);
            this.f43643L.N(typeface);
            android.widget.TextView textView = this.f43653Q;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z6) {
        v0(z6, false);
    }
}
