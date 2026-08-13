package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class W implements androidx.compose.ui.platform.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f20040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.ActionMode f20041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H0.c f20042c = new H0.c(new androidx.compose.ui.platform.W.a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.compose.ui.platform.v1 f20043d = androidx.compose.ui.platform.v1.Hidden;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.platform.W.this.f20041b = null;
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public W(android.view.View view) {
        this.f20040a = view;
    }

    @Override // androidx.compose.ui.platform.t1
    public void a() {
        this.f20043d = androidx.compose.ui.platform.v1.Hidden;
        android.view.ActionMode actionMode = this.f20041b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f20041b = null;
    }

    @Override // androidx.compose.ui.platform.t1
    public void b(p131n0.i iVar, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3, p237x7.a aVar4) {
        this.f20042c.l(iVar);
        this.f20042c.h(aVar);
        this.f20042c.i(aVar3);
        this.f20042c.j(aVar2);
        this.f20042c.k(aVar4);
        android.view.ActionMode actionMode = this.f20041b;
        if (actionMode == null) {
            this.f20043d = androidx.compose.ui.platform.v1.Shown;
            this.f20041b = androidx.compose.ui.platform.u1.f20334a.b(this.f20040a, new H0.a(this.f20042c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.t1
    public androidx.compose.ui.platform.v1 d() {
        return this.f20043d;
    }
}
