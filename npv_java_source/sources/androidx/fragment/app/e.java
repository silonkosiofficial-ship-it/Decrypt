package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.fragment.app.f implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private android.os.Handler f22446F0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f22455O0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private android.app.Dialog f22457Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f22458R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f22459S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private boolean f22460T0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private java.lang.Runnable f22447G0 = new androidx.fragment.app.e.a();

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f22448H0 = new androidx.fragment.app.e.b();

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private android.content.DialogInterface.OnDismissListener f22449I0 = new androidx.fragment.app.e.c();

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f22450J0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f22451K0 = 0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f22452L0 = true;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private boolean f22453M0 = true;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f22454N0 = -1;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private androidx.lifecycle.A f22456P0 = new androidx.fragment.app.e.d();

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private boolean f22461U0 = false;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.e.this.f22449I0.onDismiss(androidx.fragment.app.e.this.f22457Q0);
        }
    }

    class b implements android.content.DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface dialogInterface) {
            if (androidx.fragment.app.e.this.f22457Q0 != null) {
                androidx.fragment.app.e eVar = androidx.fragment.app.e.this;
                eVar.onCancel(eVar.f22457Q0);
            }
        }
    }

    class c implements android.content.DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            if (androidx.fragment.app.e.this.f22457Q0 != null) {
                androidx.fragment.app.e eVar = androidx.fragment.app.e.this;
                eVar.onDismiss(eVar.f22457Q0);
            }
        }
    }

    class d implements androidx.lifecycle.A {
        d() {
        }

        @Override // androidx.lifecycle.A
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.r rVar) {
            if (rVar == null || !androidx.fragment.app.e.this.f22453M0) {
                return;
            }
            android.view.View viewQ1 = androidx.fragment.app.e.this.q1();
            if (viewQ1.getParent() != null) {
                throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (androidx.fragment.app.e.this.f22457Q0 != null) {
                if (androidx.fragment.app.n.E0(3)) {
                    java.lang.String str = "DialogFragment " + this + " setting the content view on " + androidx.fragment.app.e.this.f22457Q0;
                }
                androidx.fragment.app.e.this.f22457Q0.setContentView(viewQ1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0425e extends V1.e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ V1.e f22466C;

        C0425e(V1.e eVar) {
            this.f22466C = eVar;
        }

        @Override // V1.e
        public android.view.View h(int i6) {
            return this.f22466C.j() ? this.f22466C.h(i6) : androidx.fragment.app.e.this.K1(i6);
        }

        @Override // V1.e
        public boolean j() {
            return this.f22466C.j() || androidx.fragment.app.e.this.L1();
        }
    }

    private void G1(boolean z6, boolean z10, boolean z11) {
        if (this.f22459S0) {
            return;
        }
        this.f22459S0 = true;
        this.f22460T0 = false;
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f22457Q0.dismiss();
            if (!z10) {
                if (android.os.Looper.myLooper() == this.f22446F0.getLooper()) {
                    onDismiss(this.f22457Q0);
                } else {
                    this.f22446F0.post(this.f22447G0);
                }
            }
        }
        this.f22458R0 = true;
        if (this.f22454N0 >= 0) {
            if (z11) {
                H().Y0(this.f22454N0, 1);
            } else {
                H().W0(this.f22454N0, 1, z6);
            }
            this.f22454N0 = -1;
            return;
        }
        androidx.fragment.app.u uVarM = H().m();
        uVarM.o(true);
        uVarM.l(this);
        if (z11) {
            uVarM.h();
        } else if (z6) {
            uVarM.g();
        } else {
            uVarM.f();
        }
    }

    private void M1(android.os.Bundle bundle) {
        if (this.f22453M0 && !this.f22461U0) {
            try {
                this.f22455O0 = true;
                android.app.Dialog dialogJ1 = J1(bundle);
                this.f22457Q0 = dialogJ1;
                if (this.f22453M0) {
                    P1(dialogJ1, this.f22450J0);
                    android.content.Context contextT = t();
                    if (contextT instanceof android.app.Activity) {
                        this.f22457Q0.setOwnerActivity((android.app.Activity) contextT);
                    }
                    this.f22457Q0.setCancelable(this.f22452L0);
                    this.f22457Q0.setOnCancelListener(this.f22448H0);
                    this.f22457Q0.setOnDismissListener(this.f22449I0);
                    this.f22461U0 = true;
                } else {
                    this.f22457Q0 = null;
                }
            } finally {
                this.f22455O0 = false;
            }
        }
    }

    public android.app.Dialog H1() {
        return this.f22457Q0;
    }

    public int I1() {
        return this.f22451K0;
    }

    public android.app.Dialog J1(android.os.Bundle bundle) {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "onCreateDialog called for DialogFragment " + this;
        }
        return new p040e.r(p1(), I1());
    }

    @Override // androidx.fragment.app.f
    public void K0(android.os.Bundle bundle) {
        super.K0(bundle);
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            android.os.Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i6 = this.f22450J0;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i10 = this.f22451K0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z6 = this.f22452L0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z10 = this.f22453M0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f22454N0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    android.view.View K1(int i6) {
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            return dialog.findViewById(i6);
        }
        return null;
    }

    @Override // androidx.fragment.app.f
    public void L0() {
        super.L0();
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            this.f22458R0 = false;
            dialog.show();
            android.view.View decorView = this.f22457Q0.getWindow().getDecorView();
            androidx.lifecycle.Z.b(decorView, this);
            androidx.lifecycle.a0.b(decorView, this);
            p233x2.g.b(decorView, this);
        }
    }

    boolean L1() {
        return this.f22461U0;
    }

    @Override // androidx.fragment.app.f
    public void M0() {
        super.M0();
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final android.app.Dialog N1() {
        android.app.Dialog dialogH1 = H1();
        if (dialogH1 != null) {
            return dialogH1;
        }
        throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.f
    public void O0(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.O0(bundle);
        if (this.f22457Q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f22457Q0.onRestoreInstanceState(bundle2);
    }

    public void O1(boolean z6) {
        this.f22453M0 = z6;
    }

    public void P1(android.app.Dialog dialog, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void Q1(androidx.fragment.app.n nVar, java.lang.String str) {
        this.f22459S0 = false;
        this.f22460T0 = true;
        androidx.fragment.app.u uVarM = nVar.m();
        uVarM.o(true);
        uVarM.d(this, str);
        uVarM.f();
    }

    @Override // androidx.fragment.app.f
    void V0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.V0(layoutInflater, viewGroup, bundle);
        if (this.f22507k0 != null || this.f22457Q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f22457Q0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.f
    V1.e f() {
        return new androidx.fragment.app.e.C0425e(super.f());
    }

    @Override // androidx.fragment.app.f
    public void i0(android.os.Bundle bundle) {
        super.i0(bundle);
    }

    @Override // androidx.fragment.app.f
    public void l0(android.content.Context context) {
        super.l0(context);
        W().i(this.f22456P0);
        if (this.f22460T0) {
            return;
        }
        this.f22459S0 = false;
    }

    @Override // androidx.fragment.app.f
    public void o0(android.os.Bundle bundle) {
        super.o0(bundle);
        this.f22446F0 = new android.os.Handler();
        this.f22453M0 = this.f22497a0 == 0;
        if (bundle != null) {
            this.f22450J0 = bundle.getInt("android:style", 0);
            this.f22451K0 = bundle.getInt("android:theme", 0);
            this.f22452L0 = bundle.getBoolean("android:cancelable", true);
            this.f22453M0 = bundle.getBoolean("android:showsDialog", this.f22453M0);
            this.f22454N0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f22458R0) {
            return;
        }
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "onDismiss called for DialogFragment " + this;
        }
        G1(true, true, false);
    }

    @Override // androidx.fragment.app.f
    public void v0() {
        super.v0();
        android.app.Dialog dialog = this.f22457Q0;
        if (dialog != null) {
            this.f22458R0 = true;
            dialog.setOnDismissListener(null);
            this.f22457Q0.dismiss();
            if (!this.f22459S0) {
                onDismiss(this.f22457Q0);
            }
            this.f22457Q0 = null;
            this.f22461U0 = false;
        }
    }

    @Override // androidx.fragment.app.f
    public void w0() {
        super.w0();
        if (!this.f22460T0 && !this.f22459S0) {
            this.f22459S0 = true;
        }
        W().m(this.f22456P0);
    }

    @Override // androidx.fragment.app.f
    public android.view.LayoutInflater x0(android.os.Bundle bundle) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        android.view.LayoutInflater layoutInflaterX0 = super.x0(bundle);
        if (this.f22453M0 && !this.f22455O0) {
            M1(bundle);
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str2 = "get layout inflater for DialogFragment " + this + " from dialog context";
            }
            android.app.Dialog dialog = this.f22457Q0;
            return dialog != null ? layoutInflaterX0.cloneInContext(dialog.getContext()) : layoutInflaterX0;
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str3 = "getting layout inflater for DialogFragment " + this;
            if (this.f22453M0) {
                sb = new java.lang.StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new java.lang.StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str3);
            sb.toString();
        }
        return layoutInflaterX0;
    }
}
