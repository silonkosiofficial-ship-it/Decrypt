package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class S extends androidx.appcompat.widget.P implements androidx.appcompat.widget.Q {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static java.lang.reflect.Method f18218m0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private androidx.appcompat.widget.Q f18219l0;

    static class a {
        static void a(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(android.widget.PopupWindow popupWindow, android.transition.Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(android.widget.PopupWindow popupWindow, boolean z6) {
            popupWindow.setTouchModal(z6);
        }
    }

    public static class c extends androidx.appcompat.widget.L {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final int f18220P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final int f18221Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private androidx.appcompat.widget.Q f18222R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private android.view.MenuItem f18223S;

        static class a {
            static int a(android.content.res.Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(android.content.Context context, boolean z6) {
            super(context, z6);
            if (1 == androidx.appcompat.widget.S.c.a.a(context.getResources().getConfiguration())) {
                this.f18220P = 21;
                this.f18221Q = 22;
            } else {
                this.f18220P = 22;
                this.f18221Q = 21;
            }
        }

        @Override // androidx.appcompat.widget.L
        public /* bridge */ /* synthetic */ int d(int i6, int i10, int i11, int i12, int i13) {
            return super.d(i6, i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.L
        public /* bridge */ /* synthetic */ boolean e(android.view.MotionEvent motionEvent, int i6) {
            return super.e(motionEvent, i6);
        }

        @Override // androidx.appcompat.widget.L, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.L, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.L, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.L, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.L, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int headersCount;
            int iPointToPosition;
            int i6;
            if (this.f18222R != null) {
                android.widget.ListAdapter adapter = getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = iPointToPosition - headersCount) < 0 || i6 >= fVar.getCount()) ? null : fVar.getItem(i6);
                android.view.MenuItem menuItem = this.f18223S;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.f18222R.g(gVarB, menuItem);
                    }
                    this.f18223S = item;
                    if (item != null) {
                        this.f18222R.d(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i6, android.view.KeyEvent keyEvent) {
            androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.f18220P) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i6 != this.f18221Q) {
                return super.onKeyDown(i6, keyEvent);
            }
            setSelection(-1);
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.f) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.L, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(androidx.appcompat.widget.Q q6) {
            this.f18222R = q6;
        }

        @Override // androidx.appcompat.widget.L, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                f18218m0 = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public S(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
    }

    public void S(java.lang.Object obj) {
        androidx.appcompat.widget.S.a.a(this.f18210h0, (android.transition.Transition) obj);
    }

    public void T(java.lang.Object obj) {
        androidx.appcompat.widget.S.a.b(this.f18210h0, (android.transition.Transition) obj);
    }

    public void U(androidx.appcompat.widget.Q q6) {
        this.f18219l0 = q6;
    }

    public void V(boolean z6) {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            androidx.appcompat.widget.S.b.a(this.f18210h0, z6);
            return;
        }
        java.lang.reflect.Method method = f18218m0;
        if (method != null) {
            try {
                method.invoke(this.f18210h0, java.lang.Boolean.valueOf(z6));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.Q
    public void d(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.Q q6 = this.f18219l0;
        if (q6 != null) {
            q6.d(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.Q
    public void g(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.Q q6 = this.f18219l0;
        if (q6 != null) {
            q6.g(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.P
    androidx.appcompat.widget.L s(android.content.Context context, boolean z6) {
        androidx.appcompat.widget.S.c cVar = new androidx.appcompat.widget.S.c(context, z6);
        cVar.setHoverListener(this);
        return cVar;
    }
}
