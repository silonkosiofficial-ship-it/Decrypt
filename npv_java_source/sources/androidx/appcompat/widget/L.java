package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class L extends android.widget.ListView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.graphics.Rect f18130C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f18132E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f18133F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f18134G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18135H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private androidx.appcompat.widget.L.d f18136I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18137J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f18138K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18139L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private androidx.core.view.C2003g0 f18140M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private androidx.core.widget.f f18141N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.appcompat.widget.L.f f18142O;

    static class a {
        static void a(android.view.View view, float f6, float f10) {
            view.drawableHotspotChanged(f6, f10);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static java.lang.reflect.Method f18143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static java.lang.reflect.Method f18144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static java.lang.reflect.Method f18145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f18146d;

        static {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.Class cls2 = java.lang.Float.TYPE;
                java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", cls, android.view.View.class, java.lang.Boolean.TYPE, cls2, cls2);
                f18143a = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f18144b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f18145c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f18146d = true;
            } catch (java.lang.NoSuchMethodException e6) {
                e6.printStackTrace();
            }
        }

        static boolean a() {
            return f18146d;
        }

        static void b(androidx.appcompat.widget.L l6, int i6, android.view.View view) {
            try {
                f18143a.invoke(l6, java.lang.Integer.valueOf(i6), view, java.lang.Boolean.FALSE, -1, -1);
                f18144b.invoke(l6, java.lang.Integer.valueOf(i6));
                f18145c.invoke(l6, java.lang.Integer.valueOf(i6));
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(android.widget.AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(android.widget.AbsListView absListView, boolean z6) {
            absListView.setSelectedChildViewEnabled(z6);
        }
    }

    private static class d extends p110l.c {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f18147D;

        d(android.graphics.drawable.Drawable drawable) {
            super(drawable);
            this.f18147D = true;
        }

        void b(boolean z6) {
            this.f18147D = z6;
        }

        @Override // p110l.c, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            if (this.f18147D) {
                super.draw(canvas);
            }
        }

        @Override // p110l.c, android.graphics.drawable.Drawable
        public void setHotspot(float f6, float f10) {
            if (this.f18147D) {
                super.setHotspot(f6, f10);
            }
        }

        @Override // p110l.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i6, int i10, int i11, int i12) {
            if (this.f18147D) {
                super.setHotspotBounds(i6, i10, i11, i12);
            }
        }

        @Override // p110l.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f18147D) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p110l.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z6, boolean z10) {
            if (this.f18147D) {
                return super.setVisible(z6, z10);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.reflect.Field f18148a;

        static {
            java.lang.reflect.Field declaredField = null;
            try {
                declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e6) {
                e6.printStackTrace();
            }
            f18148a = declaredField;
        }

        static boolean a(android.widget.AbsListView absListView) {
            java.lang.reflect.Field field = f18148a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (java.lang.IllegalAccessException e6) {
                e6.printStackTrace();
                return false;
            }
        }

        static void b(android.widget.AbsListView absListView, boolean z6) {
            java.lang.reflect.Field field = f18148a;
            if (field != null) {
                try {
                    field.set(absListView, java.lang.Boolean.valueOf(z6));
                } catch (java.lang.IllegalAccessException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    private class f implements java.lang.Runnable {
        f() {
        }

        public void a() {
            androidx.appcompat.widget.L l6 = androidx.appcompat.widget.L.this;
            l6.f18142O = null;
            l6.removeCallbacks(this);
        }

        public void b() {
            androidx.appcompat.widget.L.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.L l6 = androidx.appcompat.widget.L.this;
            l6.f18142O = null;
            l6.drawableStateChanged();
        }
    }

    L(android.content.Context context, boolean z6) {
        super(context, null, p090j.a.f48647x);
        this.f18130C = new android.graphics.Rect();
        this.f18131D = 0;
        this.f18132E = 0;
        this.f18133F = 0;
        this.f18134G = 0;
        this.f18138K = z6;
        setCacheColorHint(0);
    }

    private void a() {
        this.f18139L = false;
        setPressed(false);
        drawableStateChanged();
        android.view.View childAt = getChildAt(this.f18135H - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.C2003g0 c2003g0 = this.f18140M;
        if (c2003g0 != null) {
            c2003g0.c();
            this.f18140M = null;
        }
    }

    private void b(android.view.View view, int i6) {
        performItemClick(view, i6, getItemIdAtPosition(i6));
    }

    private void c(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        if (this.f18130C.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f18130C);
        selector.draw(canvas);
    }

    private void f(int i6, android.view.View view) {
        android.graphics.Rect rect = this.f18130C;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f18131D;
        rect.top -= this.f18132E;
        rect.right += this.f18133F;
        rect.bottom += this.f18134G;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i6 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i6, android.view.View view) {
        android.graphics.drawable.Drawable selector = getSelector();
        boolean z6 = (selector == null || i6 == -1) ? false : true;
        if (z6) {
            selector.setVisible(false, false);
        }
        f(i6, view);
        if (z6) {
            android.graphics.Rect rect = this.f18130C;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i6, android.view.View view, float f6, float f10) {
        g(i6, view);
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector == null || i6 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f6, f10);
    }

    private void i(android.view.View view, int i6, float f6, float f10) {
        android.view.View childAt;
        this.f18139L = true;
        androidx.appcompat.widget.L.a.a(this, f6, f10);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i10 = this.f18135H;
        if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f18135H = i6;
        androidx.appcompat.widget.L.a.a(view, f6 - view.getLeft(), f10 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i6, view, f6, f10);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z6) {
        androidx.appcompat.widget.L.d dVar = this.f18136I;
        if (dVar != null) {
            dVar.b(z6);
        }
    }

    private boolean k() {
        return androidx.core.os.a.c() ? androidx.appcompat.widget.L.c.a(this) : androidx.appcompat.widget.L.e.a(this);
    }

    private void l(boolean z6) {
        if (androidx.core.os.a.c()) {
            androidx.appcompat.widget.L.c.b(this, z6);
        } else {
            androidx.appcompat.widget.L.e.b(this, z6);
        }
    }

    private boolean m() {
        return this.f18139L;
    }

    private void n() {
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i6, int i10, int i11, int i12, int i13) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        android.view.View view = null;
        while (i14 < count) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i17 = layoutParams.height;
            view.measure(i6, i17 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i12) {
                return (i13 < 0 || i14 <= i13 || i16 <= 0 || measuredHeight == i12) ? i12 : i16;
            }
            if (i13 >= 0 && i14 >= i13) {
                i16 = measuredHeight;
            }
            i14++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f18142O != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(android.view.MotionEvent motionEvent, int i6) {
        boolean z6;
        boolean z10;
        androidx.core.widget.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z6 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z6 = true;
                    z10 = false;
                } else {
                    z10 = false;
                    z6 = false;
                }
                if (z6 || z10) {
                    a();
                }
                if (z6) {
                    if (this.f18141N == null) {
                        this.f18141N = new androidx.core.widget.f(this);
                    }
                    this.f18141N.w(true);
                    this.f18141N.onTouch(this, motionEvent);
                } else {
                    fVar = this.f18141N;
                    if (fVar != null) {
                        fVar.w(false);
                    }
                }
                return z6;
            }
            z6 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i6);
        if (iFindPointerIndex < 0) {
            z10 = false;
            z6 = false;
        } else {
            int x6 = (int) motionEvent.getX(iFindPointerIndex);
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x6, y6);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x6, y6);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z6 = true;
                z10 = false;
            }
        }
        if (z6) {
            a();
        } else {
            a();
        }
        if (z6) {
            if (this.f18141N == null) {
                this.f18141N = new androidx.core.widget.f(this);
            }
            this.f18141N.w(true);
            this.f18141N.onTouch(this, motionEvent);
        } else {
            fVar = this.f18141N;
            if (fVar != null) {
                fVar.w(false);
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f18138K || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f18138K || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f18138K || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f18138K && this.f18137J) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f18142O = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f18142O == null) {
            androidx.appcompat.widget.L.f fVar = new androidx.appcompat.widget.L.f();
            this.f18142O = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i6 < 30 || !androidx.appcompat.widget.L.b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        androidx.appcompat.widget.L.b.b(this, iPointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f18135H = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.appcompat.widget.L.f fVar = this.f18142O;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z6) {
        this.f18137J = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.L.d dVar = drawable != null ? new androidx.appcompat.widget.L.d(drawable) : null;
        this.f18136I = dVar;
        super.setSelector(dVar);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f18131D = rect.left;
        this.f18132E = rect.top;
        this.f18133F = rect.right;
        this.f18134G = rect.bottom;
    }
}
