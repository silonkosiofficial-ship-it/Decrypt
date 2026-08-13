package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f17786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p170r.Y f17787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p170r.Y f17788c;

    c(android.content.Context context) {
        this.f17786a = context;
    }

    final android.view.MenuItem c(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof p212v1.b)) {
            return menuItem;
        }
        p212v1.b bVar = (p212v1.b) menuItem;
        if (this.f17787b == null) {
            this.f17787b = new p170r.Y();
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) this.f17787b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.j jVar = new androidx.appcompat.view.menu.j(this.f17786a, bVar);
        this.f17787b.put(bVar, jVar);
        return jVar;
    }

    final android.view.SubMenu d(android.view.SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        p170r.Y y6 = this.f17787b;
        if (y6 != null) {
            y6.clear();
        }
        p170r.Y y10 = this.f17788c;
        if (y10 != null) {
            y10.clear();
        }
    }

    final void f(int i6) {
        if (this.f17787b == null) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f17787b.size()) {
            if (((p212v1.b) this.f17787b.f(i10)).getGroupId() == i6) {
                this.f17787b.h(i10);
                i10--;
            }
            i10++;
        }
    }

    final void g(int i6) {
        if (this.f17787b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f17787b.size(); i10++) {
            if (((p212v1.b) this.f17787b.f(i10)).getItemId() == i6) {
                this.f17787b.h(i10);
                return;
            }
        }
    }
}
