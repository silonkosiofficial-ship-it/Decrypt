package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends androidx.databinding.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f21886m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f21895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.databinding.h[] f21898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.view.View f21899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.view.Choreographer f21901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.view.Choreographer.FrameCallback f21902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.os.Handler f21903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.databinding.g f21904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.lifecycle.r f21905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static int f21885l = android.os.Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f21887n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final androidx.databinding.c f21888o = new androidx.databinding.g.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final androidx.databinding.c f21889p = new androidx.databinding.g.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final androidx.databinding.c f21890q = new androidx.databinding.g.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final androidx.databinding.c f21891r = new androidx.databinding.g.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final androidx.databinding.b f21892s = new androidx.databinding.g.e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final java.lang.ref.ReferenceQueue f21893t = new java.lang.ref.ReferenceQueue();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final android.view.View.OnAttachStateChangeListener f21894u = new androidx.databinding.g.f();

    class a implements androidx.databinding.c {
        a() {
        }
    }

    class b implements androidx.databinding.c {
        b() {
        }
    }

    class c implements androidx.databinding.c {
        c() {
        }
    }

    class d implements androidx.databinding.c {
        d() {
        }
    }

    class e extends androidx.databinding.b {
        e() {
        }
    }

    class f implements android.view.View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            androidx.databinding.g.j(view).f21895a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$g, reason: collision with other inner class name */
    class RunnableC0417g implements java.lang.Runnable {
        RunnableC0417g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                androidx.databinding.g.this.f21896b = false;
            }
            androidx.databinding.g.q();
            if (androidx.databinding.g.this.f21899e.isAttachedToWindow()) {
                androidx.databinding.g.this.i();
            } else {
                androidx.databinding.g.this.f21899e.removeOnAttachStateChangeListener(androidx.databinding.g.f21894u);
                androidx.databinding.g.this.f21899e.addOnAttachStateChangeListener(androidx.databinding.g.f21894u);
            }
        }
    }

    class h implements android.view.Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j6) {
            androidx.databinding.g.this.f21895a.run();
        }
    }

    protected static class i {
    }

    protected g(androidx.databinding.e eVar, android.view.View view, int i6) {
        this.f21895a = new androidx.databinding.g.RunnableC0417g();
        this.f21896b = false;
        this.f21897c = false;
        this.f21898d = new androidx.databinding.h[i6];
        this.f21899e = view;
        if (android.os.Looper.myLooper() == null) {
            throw new java.lang.IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f21887n) {
            this.f21901g = android.view.Choreographer.getInstance();
            this.f21902h = new androidx.databinding.g.h();
        } else {
            this.f21902h = null;
            this.f21903i = new android.os.Handler(android.os.Looper.myLooper());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected g(java.lang.Object obj, android.view.View view, int i6) {
        this((androidx.databinding.e) null, view, i6);
        f(obj);
    }

    private static androidx.databinding.e f(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        throw new java.lang.IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void h() {
        if (this.f21900f) {
            r();
        } else if (l()) {
            this.f21900f = true;
            this.f21897c = false;
            g();
            this.f21900f = false;
        }
    }

    static androidx.databinding.g j(android.view.View view) {
        if (view != null) {
            return (androidx.databinding.g) view.getTag(K1.a.f6078a);
        }
        return null;
    }

    private static boolean m(java.lang.String str, int i6) {
        int length = str.length();
        if (length == i6) {
            return false;
        }
        while (i6 < length) {
            if (!java.lang.Character.isDigit(str.charAt(i6))) {
                return false;
            }
            i6++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    private static void n(androidx.databinding.e eVar, android.view.View view, java.lang.Object[] objArr, androidx.databinding.g.i iVar, android.util.SparseIntArray sparseIntArray, boolean z6) {
        int id;
        int i6;
        if (j(view) != null) {
            return;
        }
        java.lang.Object tag = view.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        boolean z10 = true;
        if (z6 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i10 = iLastIndexOf + 1;
                if (m(str, i10)) {
                    int iP = p(str, i10);
                    if (objArr[iP] == null) {
                        objArr[iP] = view;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else if (str == null || !str.startsWith("binding_")) {
            z10 = false;
        } else {
            int iP2 = p(str, f21886m);
            if (objArr[iP2] == null) {
                objArr[iP2] = view;
            }
        }
        if (!z10 && (id = view.getId()) > 0 && sparseIntArray != null && (i6 = sparseIntArray.get(id, -1)) >= 0 && objArr[i6] == null) {
            objArr[i6] = view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                n(eVar, viewGroup.getChildAt(i11), objArr, iVar, sparseIntArray, false);
            }
        }
    }

    protected static java.lang.Object[] o(androidx.databinding.e eVar, android.view.View view, int i6, androidx.databinding.g.i iVar, android.util.SparseIntArray sparseIntArray) {
        java.lang.Object[] objArr = new java.lang.Object[i6];
        n(eVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    private static int p(java.lang.String str, int i6) {
        int length = str.length();
        int iCharAt = 0;
        while (i6 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i6) - '0');
            i6++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
        while (f21893t.poll() != null) {
        }
    }

    protected abstract void g();

    public void i() {
        androidx.databinding.g gVar = this.f21904j;
        if (gVar == null) {
            h();
        } else {
            gVar.i();
        }
    }

    public android.view.View k() {
        return this.f21899e;
    }

    public abstract boolean l();

    protected void r() {
        androidx.databinding.g gVar = this.f21904j;
        if (gVar != null) {
            gVar.r();
            return;
        }
        androidx.lifecycle.r rVar = this.f21905k;
        if (rVar == null || rVar.u().b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f21896b) {
                        return;
                    }
                    this.f21896b = true;
                    if (f21887n) {
                        this.f21901g.postFrameCallback(this.f21902h);
                    } else {
                        this.f21903i.post(this.f21895a);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void s(android.view.View view) {
        view.setTag(K1.a.f6078a, this);
    }
}
