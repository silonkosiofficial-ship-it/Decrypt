package H0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p131n0.i f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p237x7.a f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.a f4275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p237x7.a f4276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p237x7.a f4277f;

    public c(p237x7.a aVar, p131n0.i iVar, p237x7.a aVar2, p237x7.a aVar3, p237x7.a aVar4, p237x7.a aVar5) {
        this.f4272a = aVar;
        this.f4273b = iVar;
        this.f4274c = aVar2;
        this.f4275d = aVar3;
        this.f4276e = aVar4;
        this.f4277f = aVar5;
    }

    public /* synthetic */ c(p237x7.a aVar, p131n0.i iVar, p237x7.a aVar2, p237x7.a aVar3, p237x7.a aVar4, p237x7.a aVar5, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : aVar, (i6 & 2) != 0 ? p131n0.i.f51317e.a() : iVar, (i6 & 4) != 0 ? null : aVar2, (i6 & 8) != 0 ? null : aVar3, (i6 & 16) != 0 ? null : aVar4, (i6 & 32) != 0 ? null : aVar5);
    }

    private final void b(android.view.Menu menu, H0.b bVar, p237x7.a aVar) {
        if (aVar != null && menu.findItem(bVar.g()) == null) {
            a(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(bVar.g()) == null) {
                return;
            }
            menu.removeItem(bVar.g());
        }
    }

    public final void a(android.view.Menu menu, H0.b bVar) {
        menu.add(0, bVar.g(), bVar.i(), bVar.m()).setShowAsAction(1);
    }

    public final p131n0.i c() {
        return this.f4273b;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013 A[PHI: r3
  0x0013: PHI (r3v5 x7.a) = (r3v2 x7.a), (r3v3 x7.a), (r3v4 x7.a), (r3v6 x7.a) binds: [B:20:0x003b, B:15:0x002e, B:10:0x0021, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean d(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        p237x7.a aVar;
        p247y7.AbstractC7350t.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == H0.b.Copy.g()) {
            aVar = this.f4274c;
            if (aVar != null) {
                aVar.b();
            }
        } else if (itemId == H0.b.Paste.g()) {
            aVar = this.f4275d;
            if (aVar != null) {
                aVar.b();
            }
        } else if (itemId == H0.b.Cut.g()) {
            aVar = this.f4276e;
            if (aVar != null) {
                aVar.b();
            }
        } else {
            if (itemId != H0.b.SelectAll.g()) {
                return false;
            }
            aVar = this.f4277f;
            if (aVar != null) {
                aVar.b();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (menu == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.f4274c != null) {
            a(menu, H0.b.Copy);
        }
        if (this.f4275d != null) {
            a(menu, H0.b.Paste);
        }
        if (this.f4276e != null) {
            a(menu, H0.b.Cut);
        }
        if (this.f4277f == null) {
            return true;
        }
        a(menu, H0.b.SelectAll);
        return true;
    }

    public final void f() {
        p237x7.a aVar = this.f4272a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean g(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(p237x7.a aVar) {
        this.f4274c = aVar;
    }

    public final void i(p237x7.a aVar) {
        this.f4276e = aVar;
    }

    public final void j(p237x7.a aVar) {
        this.f4275d = aVar;
    }

    public final void k(p237x7.a aVar) {
        this.f4277f = aVar;
    }

    public final void l(p131n0.i iVar) {
        this.f4273b = iVar;
    }

    public final void m(android.view.Menu menu) {
        b(menu, H0.b.Copy, this.f4274c);
        b(menu, H0.b.Paste, this.f4275d);
        b(menu, H0.b.Cut, this.f4276e);
        b(menu, H0.b.SelectAll, this.f4277f);
    }
}
