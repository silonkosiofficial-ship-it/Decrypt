package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f18545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f18546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.widget.TextView f18547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.view.WindowManager.LayoutParams f18548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.graphics.Rect f18549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f18550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f18551g;

    l0(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.f18548d = layoutParams;
        this.f18549e = new android.graphics.Rect();
        this.f18550f = new int[2];
        this.f18551g = new int[2];
        this.f18545a = context;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(p090j.g.f48777s, (android.view.ViewGroup) null);
        this.f18546b = viewInflate;
        this.f18547c = (android.widget.TextView) viewInflate.findViewById(p090j.f.f48751s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = p090j.i.f48791a;
        layoutParams.flags = 24;
    }

    private void a(android.view.View view, int i6, int i10, boolean z6, android.view.WindowManager.LayoutParams layoutParams) {
        int height;
        int i11;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f18545a.getResources().getDimensionPixelOffset(p090j.d.f48669k);
        if (view.getWidth() < dimensionPixelOffset) {
            i6 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f18545a.getResources().getDimensionPixelOffset(p090j.d.f48668j);
            height = i10 + dimensionPixelOffset2;
            i11 = i10 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i11 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f18545a.getResources().getDimensionPixelOffset(z6 ? p090j.d.f48671m : p090j.d.f48670l);
        android.view.View viewB = b(view);
        if (viewB == null) {
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f18549e);
        android.graphics.Rect rect = this.f18549e;
        if (rect.left < 0 && rect.top < 0) {
            android.content.res.Resources resources = this.f18545a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f18549e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f18551g);
        view.getLocationOnScreen(this.f18550f);
        int[] iArr = this.f18550f;
        int i12 = iArr[0];
        int[] iArr2 = this.f18551g;
        int i13 = i12 - iArr2[0];
        iArr[0] = i13;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i13 + i6) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f18546b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f18546b.getMeasuredHeight();
        int i14 = this.f18550f[1];
        int i15 = ((i11 + i14) - dimensionPixelOffset3) - measuredHeight;
        int i16 = i14 + height + dimensionPixelOffset3;
        if (!z6 ? measuredHeight + i16 <= this.f18549e.height() : i15 < 0) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i16;
        }
    }

    private static android.view.View b(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof android.view.WindowManager.LayoutParams) && ((android.view.WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return ((android.app.Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((android.view.WindowManager) this.f18545a.getSystemService("window")).removeView(this.f18546b);
        }
    }

    boolean d() {
        return this.f18546b.getParent() != null;
    }

    void e(android.view.View view, int i6, int i10, boolean z6, java.lang.CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f18547c.setText(charSequence);
        a(view, i6, i10, z6, this.f18548d);
        ((android.view.WindowManager) this.f18545a.getSystemService("window")).addView(this.f18546b, this.f18548d);
    }
}
