package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f17918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f17919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.view.View f17923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.k f17927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.widget.PopupWindow.OnDismissListener f17928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final android.widget.PopupWindow.OnDismissListener f17929l;

    class a implements android.widget.PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            androidx.appcompat.view.menu.l.this.e();
        }
    }

    static class b {
        static void a(android.view.Display display, android.graphics.Point point) {
            display.getRealSize(point);
        }
    }

    public l(android.content.Context context, androidx.appcompat.view.menu.g gVar, android.view.View view, boolean z6, int i6) {
        this(context, gVar, view, z6, i6, 0);
    }

    public l(android.content.Context context, androidx.appcompat.view.menu.g gVar, android.view.View view, boolean z6, int i6, int i10) {
        this.f17924g = 8388611;
        this.f17929l = new androidx.appcompat.view.menu.l.a();
        this.f17918a = context;
        this.f17919b = gVar;
        this.f17923f = view;
        this.f17920c = z6;
        this.f17921d = i6;
        this.f17922e = i10;
    }

    private androidx.appcompat.view.menu.k a() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.f17918a.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        androidx.appcompat.view.menu.l.b.a(defaultDisplay, point);
        androidx.appcompat.view.menu.k dVar = java.lang.Math.min(point.x, point.y) >= this.f17918a.getResources().getDimensionPixelSize(p090j.d.f48659a) ? new androidx.appcompat.view.menu.d(this.f17918a, this.f17923f, this.f17921d, this.f17922e, this.f17920c) : new androidx.appcompat.view.menu.q(this.f17918a, this.f17919b, this.f17923f, this.f17921d, this.f17922e, this.f17920c);
        dVar.l(this.f17919b);
        dVar.u(this.f17929l);
        dVar.p(this.f17923f);
        dVar.h(this.f17926i);
        dVar.r(this.f17925h);
        dVar.s(this.f17924g);
        return dVar;
    }

    private void l(int i6, int i10, boolean z6, boolean z10) {
        androidx.appcompat.view.menu.k kVarC = c();
        kVarC.v(z10);
        if (z6) {
            if ((androidx.core.view.AbstractC2025s.b(this.f17924g, androidx.core.view.X.z(this.f17923f)) & 7) == 5) {
                i6 -= this.f17923f.getWidth();
            }
            kVarC.t(i6);
            kVarC.w(i10);
            int i11 = (int) ((this.f17918a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.q(new android.graphics.Rect(i6 - i11, i10 - i11, i6 + i11, i10 + i11));
        }
        kVarC.b();
    }

    public void b() {
        if (d()) {
            this.f17927j.dismiss();
        }
    }

    public androidx.appcompat.view.menu.k c() {
        if (this.f17927j == null) {
            this.f17927j = a();
        }
        return this.f17927j;
    }

    public boolean d() {
        androidx.appcompat.view.menu.k kVar = this.f17927j;
        return kVar != null && kVar.a();
    }

    protected void e() {
        this.f17927j = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f17928k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(android.view.View view) {
        this.f17923f = view;
    }

    public void g(boolean z6) {
        this.f17925h = z6;
        androidx.appcompat.view.menu.k kVar = this.f17927j;
        if (kVar != null) {
            kVar.r(z6);
        }
    }

    public void h(int i6) {
        this.f17924g = i6;
    }

    public void i(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f17928k = onDismissListener;
    }

    public void j(androidx.appcompat.view.menu.m.a aVar) {
        this.f17926i = aVar;
        androidx.appcompat.view.menu.k kVar = this.f17927j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f17923f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i6, int i10) {
        if (d()) {
            return true;
        }
        if (this.f17923f == null) {
            return false;
        }
        l(i6, i10, true, true);
        return true;
    }
}
