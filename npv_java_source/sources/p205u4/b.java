package p205u4;

/* JADX INFO: loaded from: classes3.dex */
public class b extends androidx.appcompat.app.DialogInterfaceC1891b.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f55540e = p125m4.a.f50507a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55541f = p125m4.i.f50694a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55542g = p125m4.a.f50527u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.drawable.Drawable f55543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.graphics.Rect f55544d;

    public b(android.content.Context context) {
        this(context, 0);
    }

    public b(android.content.Context context, int i6) {
        super(o(context), q(context, i6));
        android.content.Context contextB = b();
        android.content.res.Resources.Theme theme = contextB.getTheme();
        int i10 = f55540e;
        int i11 = f55541f;
        this.f55544d = p205u4.c.a(contextB, i10, i11);
        int iC = p195t4.a.c(contextB, p125m4.a.f50520n, getClass().getCanonicalName());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = contextB.obtainStyledAttributes(null, p125m4.j.f51034o2, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(p125m4.j.f51074t2, iC);
        typedArrayObtainStyledAttributes.recycle();
        E4.g gVar = new E4.g(contextB, null, i10, i11);
        gVar.K(contextB);
        gVar.V(android.content.res.ColorStateList.valueOf(color));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gVar.S(dimension);
            }
        }
        this.f55543c = gVar;
    }

    private static android.content.Context o(android.content.Context context) {
        int iP = p(context);
        android.content.Context contextC = H4.a.c(context, null, f55540e, f55541f);
        return iP == 0 ? contextC : new androidx.appcompat.view.d(contextC, iP);
    }

    private static int p(android.content.Context context) {
        android.util.TypedValue typedValueA = B4.b.a(context, f55542g);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int q(android.content.Context context, int i6) {
        return i6 == 0 ? p(context) : i6;
    }

    public p205u4.b A(int i6) {
        return (p205u4.b) super.l(i6);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p205u4.b m(java.lang.CharSequence charSequence) {
        return (p205u4.b) super.m(charSequence);
    }

    public p205u4.b C(android.view.View view) {
        return (p205u4.b) super.n(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    public androidx.appcompat.app.DialogInterfaceC1891b a() {
        androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891bA = super.a();
        android.view.Window window = dialogInterfaceC1891bA.getWindow();
        android.view.View decorView = window.getDecorView();
        android.graphics.drawable.Drawable drawable = this.f55543c;
        if (drawable instanceof E4.g) {
            ((E4.g) drawable).U(androidx.core.view.X.u(decorView));
        }
        window.setBackgroundDrawable(p205u4.c.b(this.f55543c, this.f55544d));
        decorView.setOnTouchListener(new p205u4.a(dialogInterfaceC1891bA, this.f55544d));
        return dialogInterfaceC1891bA;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p205u4.b c(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
        return (p205u4.b) super.c(listAdapter, onClickListener);
    }

    public p205u4.b s(boolean z6) {
        return (p205u4.b) super.d(z6);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public p205u4.b e(android.view.View view) {
        return (p205u4.b) super.e(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public p205u4.b f(android.graphics.drawable.Drawable drawable) {
        return (p205u4.b) super.f(drawable);
    }

    public p205u4.b v(int i6) {
        return (p205u4.b) super.g(i6);
    }

    public p205u4.b w(android.content.DialogInterface.OnCancelListener onCancelListener) {
        return (p205u4.b) super.h(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public p205u4.b i(android.content.DialogInterface.OnKeyListener onKeyListener) {
        return (p205u4.b) super.i(onKeyListener);
    }

    public p205u4.b y(int i6, android.content.DialogInterface.OnClickListener onClickListener) {
        return (p205u4.b) super.j(i6, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC1891b.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public p205u4.b k(android.widget.ListAdapter listAdapter, int i6, android.content.DialogInterface.OnClickListener onClickListener) {
        return (p205u4.b) super.k(listAdapter, i6, onClickListener);
    }
}
