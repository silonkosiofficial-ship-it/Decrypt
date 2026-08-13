package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.Q0 f19840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f19841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f19842c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private X.b f19843d = new X.b(new java.lang.ref.WeakReference[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19844e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(S0.InterfaceInputConnectionC1617z interfaceInputConnectionC1617z) {
            int i6;
            interfaceInputConnectionC1617z.a();
            X.b bVar = androidx.compose.ui.platform.C0.this.f19843d;
            int iT = bVar.t();
            if (iT <= 0) {
                i6 = -1;
                break;
            }
            java.lang.Object[] objArrS = bVar.s();
            i6 = 0;
            while (!p247y7.AbstractC7350t.b((java.lang.ref.WeakReference) objArrS[i6], interfaceInputConnectionC1617z)) {
                i6++;
                if (i6 >= iT) {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                androidx.compose.ui.platform.C0.this.f19843d.D(i6);
            }
            if (androidx.compose.ui.platform.C0.this.f19843d.w()) {
                androidx.compose.ui.platform.C0.this.f19841b.b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.InterfaceInputConnectionC1617z) obj);
            return p087i7.M.f46721a;
        }
    }

    public C0(androidx.compose.ui.platform.Q0 q6, p237x7.a aVar) {
        this.f19840a = q6;
        this.f19841b = aVar;
    }

    public final android.view.inputmethod.InputConnection c(android.view.inputmethod.EditorInfo editorInfo) {
        synchronized (this.f19842c) {
            if (this.f19844e) {
                return null;
            }
            S0.InterfaceInputConnectionC1617z interfaceInputConnectionC1617zA = S0.K.a(this.f19840a.a(editorInfo), new androidx.compose.ui.platform.C0.a());
            this.f19843d.d(new java.lang.ref.WeakReference(interfaceInputConnectionC1617zA));
            return interfaceInputConnectionC1617zA;
        }
    }

    public final void d() {
        synchronized (this.f19842c) {
            try {
                this.f19844e = true;
                X.b bVar = this.f19843d;
                int iT = bVar.t();
                if (iT > 0) {
                    java.lang.Object[] objArrS = bVar.s();
                    int i6 = 0;
                    do {
                        S0.InterfaceInputConnectionC1617z interfaceInputConnectionC1617z = (S0.InterfaceInputConnectionC1617z) ((java.lang.ref.WeakReference) objArrS[i6]).get();
                        if (interfaceInputConnectionC1617z != null) {
                            interfaceInputConnectionC1617z.a();
                        }
                        i6++;
                    } while (i6 < iT);
                }
                this.f19843d.j();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return !this.f19844e;
    }
}
