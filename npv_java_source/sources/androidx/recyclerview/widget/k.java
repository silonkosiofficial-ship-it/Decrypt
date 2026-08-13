package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class k extends androidx.core.view.C1990a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.recyclerview.widget.RecyclerView f23431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.recyclerview.widget.k.a f23432e;

    public static class a extends androidx.core.view.C1990a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final androidx.recyclerview.widget.k f23433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.util.Map f23434e = new java.util.WeakHashMap();

        public a(androidx.recyclerview.widget.k kVar) {
            this.f23433d = kVar;
        }

        @Override // androidx.core.view.C1990a
        public boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            return c1990a != null ? c1990a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1990a
        public C1.E b(android.view.View view) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            return c1990a != null ? c1990a.b(view) : super.b(view);
        }

        @Override // androidx.core.view.C1990a
        public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            if (c1990a != null) {
                c1990a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            if (!this.f23433d.o() && this.f23433d.f23431d.getLayoutManager() != null) {
                this.f23433d.f23431d.getLayoutManager().S0(view, b6);
                androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
                if (c1990a != null) {
                    c1990a.g(view, b6);
                    return;
                }
            }
            super.g(view, b6);
        }

        @Override // androidx.core.view.C1990a
        public void h(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            if (c1990a != null) {
                c1990a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1990a
        public boolean i(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(viewGroup);
            return c1990a != null ? c1990a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1990a
        public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
            if (this.f23433d.o() || this.f23433d.f23431d.getLayoutManager() == null) {
                return super.j(view, i6, bundle);
            }
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            if (c1990a != null) {
                if (c1990a.j(view, i6, bundle)) {
                    return true;
                }
            } else if (super.j(view, i6, bundle)) {
                return true;
            }
            return this.f23433d.f23431d.getLayoutManager().m1(view, i6, bundle);
        }

        @Override // androidx.core.view.C1990a
        public void l(android.view.View view, int i6) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            if (c1990a != null) {
                c1990a.l(view, i6);
            } else {
                super.l(view, i6);
            }
        }

        @Override // androidx.core.view.C1990a
        public void m(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            androidx.core.view.C1990a c1990a = (androidx.core.view.C1990a) this.f23434e.get(view);
            if (c1990a != null) {
                c1990a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.C1990a n(android.view.View view) {
            return (androidx.core.view.C1990a) this.f23434e.remove(view);
        }

        void o(android.view.View view) {
            androidx.core.view.C1990a c1990aL = androidx.core.view.X.l(view);
            if (c1990aL == null || c1990aL == this) {
                return;
            }
            this.f23434e.put(view, c1990aL);
        }
    }

    public k(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f23431d = recyclerView;
        androidx.core.view.C1990a c1990aN = n();
        this.f23432e = (c1990aN == null || !(c1990aN instanceof androidx.recyclerview.widget.k.a)) ? new androidx.recyclerview.widget.k.a(this) : (androidx.recyclerview.widget.k.a) c1990aN;
    }

    @Override // androidx.core.view.C1990a
    public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || o()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1990a
    public void g(android.view.View view, C1.B b6) {
        super.g(view, b6);
        if (o() || this.f23431d.getLayoutManager() == null) {
            return;
        }
        this.f23431d.getLayoutManager().Q0(b6);
    }

    @Override // androidx.core.view.C1990a
    public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
        if (super.j(view, i6, bundle)) {
            return true;
        }
        if (o() || this.f23431d.getLayoutManager() == null) {
            return false;
        }
        return this.f23431d.getLayoutManager().k1(i6, bundle);
    }

    public androidx.core.view.C1990a n() {
        return this.f23432e;
    }

    boolean o() {
        return this.f23431d.l0();
    }
}
