package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class l<S> extends androidx.fragment.app.e {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    static final java.lang.Object f43258x1 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    static final java.lang.Object f43259y1 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    static final java.lang.Object f43260z1 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private final java.util.LinkedHashSet f43261V0 = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private final java.util.LinkedHashSet f43262W0 = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private final java.util.LinkedHashSet f43263X0 = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private final java.util.LinkedHashSet f43264Y0 = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f43265Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private com.google.android.material.datepicker.r f43266a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private com.google.android.material.datepicker.C6515a f43267b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private com.google.android.material.datepicker.j f43268c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f43269d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private java.lang.CharSequence f43270e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f43271f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f43272g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f43273h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private java.lang.CharSequence f43274i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f43275j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private java.lang.CharSequence f43276k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f43277l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private java.lang.CharSequence f43278m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f43279n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private java.lang.CharSequence f43280o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private android.widget.TextView f43281p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private android.widget.TextView f43282q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private com.google.android.material.internal.CheckableImageButton f43283r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private E4.g f43284s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private android.widget.Button f43285t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private boolean f43286u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private java.lang.CharSequence f43287v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private java.lang.CharSequence f43288w1;

    class a implements androidx.core.view.G {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f43289C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.view.View f43290D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f43291E;

        a(int i6, android.view.View view, int i10) {
            this.f43289C = i6;
            this.f43290D = view;
            this.f43291E = i10;
        }

        @Override // androidx.core.view.G
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            int i6 = c2038y0.f(androidx.core.view.C2038y0.m.h()).f21551b;
            if (this.f43289C >= 0) {
                this.f43290D.getLayoutParams().height = this.f43289C + i6;
                android.view.View view2 = this.f43290D;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            android.view.View view3 = this.f43290D;
            view3.setPadding(view3.getPaddingLeft(), this.f43291E + i6, this.f43290D.getPaddingRight(), this.f43290D.getPaddingBottom());
            return c2038y0;
        }
    }

    class b extends com.google.android.material.datepicker.q {
        b() {
        }
    }

    private static android.graphics.drawable.Drawable S1(android.content.Context context) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, p100k.a.b(context, p125m4.d.f50600c));
        stateListDrawable.addState(new int[0], p100k.a.b(context, p125m4.d.f50601d));
        return stateListDrawable;
    }

    private void T1(android.view.Window window) {
        if (this.f43286u1) {
            return;
        }
        android.view.View viewFindViewById = q1().findViewById(p125m4.e.f50631g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.n.d(viewFindViewById), null);
        androidx.core.view.X.A0(viewFindViewById, new com.google.android.material.datepicker.l.a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f43286u1 = true;
    }

    private com.google.android.material.datepicker.d U1() {
        androidx.appcompat.app.D.a(r().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static java.lang.CharSequence V1(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        java.lang.String[] strArrSplit = android.text.TextUtils.split(java.lang.String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private java.lang.String W1() {
        U1();
        p1();
        throw null;
    }

    private static int Y1(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p125m4.c.f50550L);
        int i6 = com.google.android.material.datepicker.n.q().f43300F;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(p125m4.c.f50552N) * i6) + ((i6 - 1) * resources.getDimensionPixelOffset(p125m4.c.f50555Q));
    }

    private int Z1(android.content.Context context) {
        int i6 = this.f43265Z0;
        if (i6 != 0) {
            return i6;
        }
        U1();
        throw null;
    }

    private void a2(android.content.Context context) {
        this.f43283r1.setTag(f43260z1);
        this.f43283r1.setImageDrawable(S1(context));
        this.f43283r1.setChecked(this.f43272g1 != 0);
        androidx.core.view.X.n0(this.f43283r1, null);
        j2(this.f43283r1);
        this.f43283r1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f43257C.e2(view);
            }
        });
    }

    static boolean b2(android.content.Context context) {
        return f2(context, android.R.attr.windowFullscreen);
    }

    private boolean c2() {
        return N().getConfiguration().orientation == 2;
    }

    static boolean d2(android.content.Context context) {
        return f2(context, p125m4.a.f50494L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(android.view.View view) {
        U1();
        throw null;
    }

    static boolean f2(android.content.Context context, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(B4.b.d(context, p125m4.a.f50530x, com.google.android.material.datepicker.j.class.getCanonicalName()), new int[]{i6});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    private void g2() {
        int iZ1 = Z1(p1());
        U1();
        com.google.android.material.datepicker.j jVarT1 = com.google.android.material.datepicker.j.T1(null, iZ1, this.f43267b1, null);
        this.f43268c1 = jVarT1;
        com.google.android.material.datepicker.r rVarF1 = jVarT1;
        if (this.f43272g1 == 1) {
            U1();
            rVarF1 = com.google.android.material.datepicker.m.F1(null, iZ1, this.f43267b1);
        }
        this.f43266a1 = rVarF1;
        i2();
        h2(X1());
        androidx.fragment.app.u uVarM = s().m();
        uVarM.m(p125m4.e.f50648x, this.f43266a1);
        uVarM.h();
        this.f43266a1.D1(new com.google.android.material.datepicker.l.b());
    }

    private void i2() {
        this.f43281p1.setText((this.f43272g1 == 1 && c2()) ? this.f43288w1 : this.f43287v1);
    }

    private void j2(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        this.f43283r1.setContentDescription(checkableImageButton.getContext().getString(this.f43272g1 == 1 ? p125m4.h.f50688r : p125m4.h.f50690t));
    }

    @Override // androidx.fragment.app.e
    public final android.app.Dialog J1(android.os.Bundle bundle) {
        android.app.Dialog dialog = new android.app.Dialog(p1(), Z1(p1()));
        android.content.Context context = dialog.getContext();
        this.f43271f1 = b2(context);
        this.f43284s1 = new E4.g(context, null, p125m4.a.f50530x, p125m4.i.f50710q);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p125m4.j.f50947d3, p125m4.a.f50530x, p125m4.i.f50710q);
        int color = typedArrayObtainStyledAttributes.getColor(p125m4.j.f50955e3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f43284s1.K(context);
        this.f43284s1.V(android.content.res.ColorStateList.valueOf(color));
        this.f43284s1.U(androidx.core.view.X.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void K0(android.os.Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f43265Z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        com.google.android.material.datepicker.C6515a.b bVar = new com.google.android.material.datepicker.C6515a.b(this.f43267b1);
        com.google.android.material.datepicker.j jVar = this.f43268c1;
        com.google.android.material.datepicker.n nVarO1 = jVar == null ? null : jVar.O1();
        if (nVarO1 != null) {
            bVar.b(nVarO1.f43302H);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f43269d1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f43270e1);
        bundle.putInt("INPUT_MODE_KEY", this.f43272g1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f43273h1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f43274i1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f43275j1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f43276k1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f43277l1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f43278m1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f43279n1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f43280o1);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public void L0() {
        super.L0();
        android.view.Window window = N1().getWindow();
        if (this.f43271f1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f43284s1);
            T1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = N().getDimensionPixelOffset(p125m4.c.f50554P);
            android.graphics.Rect rect = new android.graphics.Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.f43284s1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p205u4.a(N1(), rect));
        }
        g2();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public void M0() {
        this.f43266a1.E1();
        super.M0();
    }

    public java.lang.String X1() {
        U1();
        t();
        throw null;
    }

    void h2(java.lang.String str) {
        this.f43282q1.setContentDescription(W1());
        this.f43282q1.setText(str);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void o0(android.os.Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f43265Z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        androidx.appcompat.app.D.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f43267b1 = (com.google.android.material.datepicker.C6515a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.appcompat.app.D.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f43269d1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f43270e1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f43272g1 = bundle.getInt("INPUT_MODE_KEY");
        this.f43273h1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f43274i1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f43275j1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f43276k1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f43277l1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f43278m1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f43279n1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f43280o1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        java.lang.CharSequence text = this.f43270e1;
        if (text == null) {
            text = p1().getResources().getText(this.f43269d1);
        }
        this.f43287v1 = text;
        this.f43288w1 = V1(text);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = this.f43263X0.iterator();
        while (it.hasNext()) {
            ((android.content.DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = this.f43264Y0.iterator();
        while (it.hasNext()) {
            ((android.content.DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.f
    public final android.view.View s0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewFindViewById;
        android.widget.LinearLayout.LayoutParams layoutParams;
        android.view.View viewInflate = layoutInflater.inflate(this.f43271f1 ? p125m4.g.f50670r : p125m4.g.f50669q, viewGroup);
        android.content.Context context = viewInflate.getContext();
        if (this.f43271f1) {
            viewFindViewById = viewInflate.findViewById(p125m4.e.f50648x);
            layoutParams = new android.widget.LinearLayout.LayoutParams(Y1(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(p125m4.e.f50649y);
            layoutParams = new android.widget.LinearLayout.LayoutParams(Y1(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(p125m4.e.f50610B);
        this.f43282q1 = textView;
        androidx.core.view.X.p0(textView, 1);
        this.f43283r1 = (com.google.android.material.internal.CheckableImageButton) viewInflate.findViewById(p125m4.e.f50611C);
        this.f43281p1 = (android.widget.TextView) viewInflate.findViewById(p125m4.e.f50612D);
        a2(context);
        this.f43285t1 = (android.widget.Button) viewInflate.findViewById(p125m4.e.f50628d);
        U1();
        throw null;
    }
}
