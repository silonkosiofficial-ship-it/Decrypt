package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements L4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.Z f45020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p055f4.C6575q f45021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p055f4.S f45022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p055f4.W0 f45023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.app.Dialog f45024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p055f4.X f45025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f45026h = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f45027i = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f45028j = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f45029k = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f45030l = false;

    public D(android.app.Application application, p055f4.C6547c c6547c, p055f4.Z z6, p055f4.C6575q c6575q, p055f4.S s6, p055f4.W0 w6) {
        this.f45019a = application;
        this.f45020b = z6;
        this.f45021c = c6575q;
        this.f45022d = s6;
        this.f45023e = w6;
    }

    private final void l() {
        android.app.Dialog dialog = this.f45024f;
        if (dialog != null) {
            dialog.dismiss();
            this.f45024f = null;
        }
        this.f45020b.a(null);
        p055f4.C6592z c6592z = (p055f4.C6592z) this.f45029k.getAndSet(null);
        if (c6592z != null) {
            c6592z.b();
        }
    }

    @Override // L4.b
    public final void a(android.app.Activity activity, L4.b.a aVar) {
        p055f4.AbstractC6585v0.a();
        if (!this.f45026h.compareAndSet(false, true)) {
            aVar.a(new p055f4.Z0(3, true != this.f45030l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        this.f45025g.c();
        p055f4.C6592z c6592z = new p055f4.C6592z(this, activity);
        this.f45019a.registerActivityLifecycleCallbacks(c6592z);
        this.f45029k.set(c6592z);
        this.f45020b.a(activity);
        android.app.Dialog dialog = new android.app.Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f45025g);
        dialog.setCancelable(false);
        android.view.Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new p055f4.Z0(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        androidx.core.view.AbstractC2011k0.b(window, false);
        this.f45028j.set(aVar);
        dialog.show();
        this.f45024f = dialog;
        this.f45025g.d("UMP_messagePresented", "");
    }

    final p055f4.X d() {
        return this.f45025g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void g(L4.f.b bVar, L4.f.a aVar) {
        p055f4.X xB = ((p055f4.Y) this.f45023e).a();
        this.f45025g = xB;
        xB.setBackgroundColor(0);
        xB.getSettings().setJavaScriptEnabled(true);
        xB.setWebViewClient(new p055f4.W(xB, null));
        this.f45027i.set(new p055f4.C(bVar, aVar, 0 == true ? 1 : 0));
        p055f4.X x6 = this.f45025g;
        p055f4.S s6 = this.f45022d;
        x6.loadDataWithBaseURL(s6.a(), s6.b(), "text/html", "UTF-8", null);
        p055f4.AbstractC6585v0.f45260a.postDelayed(new java.lang.Runnable() { // from class: f4.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f45263C.k(new p055f4.Z0(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void h(int i6) {
        l();
        L4.b.a aVar = (L4.b.a) this.f45028j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.f45021c.f(3);
        aVar.a(null);
    }

    final void i(p055f4.Z0 z6) {
        l();
        L4.b.a aVar = (L4.b.a) this.f45028j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(z6.a());
    }

    final void j() {
        p055f4.C c6 = (p055f4.C) this.f45027i.getAndSet(null);
        if (c6 == null) {
            return;
        }
        c6.a(this);
    }

    final void k(p055f4.Z0 z6) {
        p055f4.C c6 = (p055f4.C) this.f45027i.getAndSet(null);
        if (c6 == null) {
            return;
        }
        c6.b(z6.a());
    }
}
