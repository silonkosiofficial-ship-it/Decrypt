package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f17667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.appcompat.view.b f17668b;

    public static class a implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.view.ActionMode.Callback f17669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.Context f17670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.util.ArrayList f17671c = new java.util.ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final p170r.Y f17672d = new p170r.Y();

        public a(android.content.Context context, android.view.ActionMode.Callback callback) {
            this.f17670b = context;
            this.f17669a = callback;
        }

        private android.view.Menu f(android.view.Menu menu) {
            android.view.Menu menu2 = (android.view.Menu) this.f17672d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            androidx.appcompat.view.menu.o oVar = new androidx.appcompat.view.menu.o(this.f17670b, (p212v1.a) menu);
            this.f17672d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f17669a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, android.view.Menu menu) {
            return this.f17669a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, android.view.Menu menu) {
            return this.f17669a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, android.view.MenuItem menuItem) {
            return this.f17669a.onActionItemClicked(e(bVar), new androidx.appcompat.view.menu.j(this.f17670b, (p212v1.b) menuItem));
        }

        public android.view.ActionMode e(androidx.appcompat.view.b bVar) {
            int size = this.f17671c.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.appcompat.view.f fVar = (androidx.appcompat.view.f) this.f17671c.get(i6);
                if (fVar != null && fVar.f17668b == bVar) {
                    return fVar;
                }
            }
            androidx.appcompat.view.f fVar2 = new androidx.appcompat.view.f(this.f17670b, bVar);
            this.f17671c.add(fVar2);
            return fVar2;
        }
    }

    public f(android.content.Context context, androidx.appcompat.view.b bVar) {
        this.f17667a = context;
        this.f17668b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f17668b.c();
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
        return this.f17668b.d();
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
        return new androidx.appcompat.view.menu.o(this.f17667a, (p212v1.a) this.f17668b.e());
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return this.f17668b.f();
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.f17668b.g();
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
        return this.f17668b.h();
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.f17668b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f17668b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f17668b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f17668b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.f17668b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i6) {
        this.f17668b.n(i6);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f17668b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object obj) {
        this.f17668b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i6) {
        this.f17668b.q(i6);
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.f17668b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z6) {
        this.f17668b.s(z6);
    }
}
