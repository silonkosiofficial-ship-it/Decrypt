package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.WeakHashMap f21668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Field f21669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f21671d = {p202u1.c.f55392b, p202u1.c.f55393c, p202u1.c.f55404n, p202u1.c.f55415y, p202u1.c.f55373B, p202u1.c.f55374C, p202u1.c.f55375D, p202u1.c.f55376E, p202u1.c.f55377F, p202u1.c.f55378G, p202u1.c.f55394d, p202u1.c.f55395e, p202u1.c.f55396f, p202u1.c.f55397g, p202u1.c.f55398h, p202u1.c.f55399i, p202u1.c.f55400j, p202u1.c.f55401k, p202u1.c.f55402l, p202u1.c.f55403m, p202u1.c.f55405o, p202u1.c.f55406p, p202u1.c.f55407q, p202u1.c.f55408r, p202u1.c.f55409s, p202u1.c.f55410t, p202u1.c.f55411u, p202u1.c.f55412v, p202u1.c.f55413w, p202u1.c.f55414x, p202u1.c.f55416z, p202u1.c.f55372A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.core.view.I f21672e = new androidx.core.view.I() { // from class: androidx.core.view.W
        @Override // androidx.core.view.I
        public final androidx.core.view.C1996d a(androidx.core.view.C1996d c1996d) {
            return androidx.core.view.X.V(c1996d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.core.view.X.e f21673f = new androidx.core.view.X.e();

    class a extends androidx.core.view.X.f {
        a(int i6, java.lang.Class cls, int i10) {
            super(i6, cls, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean c(android.view.View view) {
            return java.lang.Boolean.valueOf(androidx.core.view.X.k.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(android.view.View view, java.lang.Boolean bool) {
            androidx.core.view.X.k.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends androidx.core.view.X.f {
        b(int i6, java.lang.Class cls, int i10, int i11) {
            super(i6, cls, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public java.lang.CharSequence c(android.view.View view) {
            return androidx.core.view.X.k.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(android.view.View view, java.lang.CharSequence charSequence) {
            androidx.core.view.X.k.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            return !android.text.TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends androidx.core.view.X.f {
        c(int i6, java.lang.Class cls, int i10, int i11) {
            super(i6, cls, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public java.lang.CharSequence c(android.view.View view) {
            return androidx.core.view.X.m.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(android.view.View view, java.lang.CharSequence charSequence) {
            androidx.core.view.X.m.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            return !android.text.TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends androidx.core.view.X.f {
        d(int i6, java.lang.Class cls, int i10) {
            super(i6, cls, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean c(android.view.View view) {
            return java.lang.Boolean.valueOf(androidx.core.view.X.k.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(android.view.View view, java.lang.Boolean bool) {
            androidx.core.view.X.k.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.X.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.WeakHashMap f21674C = new java.util.WeakHashMap();

        e() {
        }

        private void b(java.util.Map.Entry entry) {
            android.view.View view = (android.view.View) entry.getKey();
            boolean zBooleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z6) {
                androidx.core.view.X.W(view, z6 ? 16 : 32);
                entry.setValue(java.lang.Boolean.valueOf(z6));
            }
        }

        private void c(android.view.View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(android.view.View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(android.view.View view) {
            this.f21674C.put(view, java.lang.Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(android.view.View view) {
            this.f21674C.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                java.util.Iterator it = this.f21674C.entrySet().iterator();
                while (it.hasNext()) {
                    b((java.util.Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Class f21676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21678d;

        f(int i6, java.lang.Class cls, int i10) {
            this(i6, cls, 0, i10);
        }

        f(int i6, java.lang.Class cls, int i10, int i11) {
            this.f21675a = i6;
            this.f21676b = cls;
            this.f21678d = i10;
            this.f21677c = i11;
        }

        private boolean b() {
            return android.os.Build.VERSION.SDK_INT >= this.f21677c;
        }

        boolean a(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract java.lang.Object c(android.view.View view);

        abstract void d(android.view.View view, java.lang.Object obj);

        java.lang.Object e(android.view.View view) {
            if (b()) {
                return c(view);
            }
            java.lang.Object tag = view.getTag(this.f21675a);
            if (this.f21676b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(android.view.View view, java.lang.Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                androidx.core.view.X.j(view);
                view.setTag(this.f21675a, obj);
                androidx.core.view.X.W(view, this.f21678d);
            }
        }

        abstract boolean g(java.lang.Object obj, java.lang.Object obj2);
    }

    static class g {
        static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static android.view.WindowInsets b(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(android.view.View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements android.view.View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            androidx.core.view.C2038y0 f21679a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.view.View f21680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.core.view.G f21681c;

            a(android.view.View view, androidx.core.view.G g6) {
                this.f21680b = view;
                this.f21681c = g6;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                androidx.core.view.C2038y0 c2038y0X = androidx.core.view.C2038y0.x(windowInsets, view);
                int i6 = android.os.Build.VERSION.SDK_INT;
                if (i6 < 30) {
                    androidx.core.view.X.h.a(windowInsets, this.f21680b);
                    if (c2038y0X.equals(this.f21679a)) {
                        return this.f21681c.a(view, c2038y0X).v();
                    }
                }
                this.f21679a = c2038y0X;
                androidx.core.view.C2038y0 c2038y0A = this.f21681c.a(view, c2038y0X);
                if (i6 >= 30) {
                    return c2038y0A.v();
                }
                androidx.core.view.X.k0(view);
                return c2038y0A.v();
            }
        }

        static void a(android.view.WindowInsets windowInsets, android.view.View view) {
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(p202u1.c.f55390S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static androidx.core.view.C2038y0 b(android.view.View view, androidx.core.view.C2038y0 c2038y0, android.graphics.Rect rect) {
            android.view.WindowInsets windowInsetsV = c2038y0.v();
            if (windowInsetsV != null) {
                return androidx.core.view.C2038y0.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return c2038y0;
        }

        static boolean c(android.view.View view, float f6, float f10, boolean z6) {
            return view.dispatchNestedFling(f6, f10, z6);
        }

        static boolean d(android.view.View view, float f6, float f10) {
            return view.dispatchNestedPreFling(f6, f10);
        }

        static boolean e(android.view.View view, int i6, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i6, i10, iArr, iArr2);
        }

        static boolean f(android.view.View view, int i6, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i6, i10, i11, i12, iArr);
        }

        static android.content.res.ColorStateList g(android.view.View view) {
            return view.getBackgroundTintList();
        }

        static android.graphics.PorterDuff.Mode h(android.view.View view) {
            return view.getBackgroundTintMode();
        }

        static float i(android.view.View view) {
            return view.getElevation();
        }

        public static androidx.core.view.C2038y0 j(android.view.View view) {
            return androidx.core.view.C2038y0.a.a(view);
        }

        static java.lang.String k(android.view.View view) {
            return view.getTransitionName();
        }

        static float l(android.view.View view) {
            return view.getTranslationZ();
        }

        static float m(android.view.View view) {
            return view.getZ();
        }

        static boolean n(android.view.View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(android.view.View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(android.view.View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(android.view.View view, android.content.res.ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(android.view.View view, android.graphics.PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(android.view.View view, float f6) {
            view.setElevation(f6);
        }

        static void t(android.view.View view, boolean z6) {
            view.setNestedScrollingEnabled(z6);
        }

        static void u(android.view.View view, androidx.core.view.G g6) {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                view.setTag(p202u1.c.f55383L, g6);
            }
            if (g6 == null) {
                view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(p202u1.c.f55390S));
            } else {
                view.setOnApplyWindowInsetsListener(new androidx.core.view.X.h.a(view, g6));
            }
        }

        static void v(android.view.View view, java.lang.String str) {
            view.setTransitionName(str);
        }

        static void w(android.view.View view, float f6) {
            view.setTranslationZ(f6);
        }

        static void x(android.view.View view, float f6) {
            view.setZ(f6);
        }

        static boolean y(android.view.View view, int i6) {
            return view.startNestedScroll(i6);
        }

        static void z(android.view.View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static androidx.core.view.C2038y0 a(android.view.View view) {
            android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.C2038y0 c2038y0W = androidx.core.view.C2038y0.w(rootWindowInsets);
            c2038y0W.t(c2038y0W);
            c2038y0W.d(view.getRootView());
            return c2038y0W;
        }

        static int b(android.view.View view) {
            return view.getScrollIndicators();
        }

        static void c(android.view.View view, int i6) {
            view.setScrollIndicators(i6);
        }

        static void d(android.view.View view, int i6, int i10) {
            view.setScrollIndicators(i6, i10);
        }
    }

    static class j {
        static void a(android.view.View view, java.util.Collection<android.view.View> collection, int i6) {
            view.addKeyboardNavigationClusters(collection, i6);
        }

        public static android.view.autofill.AutofillId b(android.view.View view) {
            return view.getAutofillId();
        }

        static int c(android.view.View view) {
            return view.getImportantForAutofill();
        }

        static int d(android.view.View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(android.view.View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(android.view.View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(android.view.View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(android.view.View view) {
            return view.isKeyboardNavigationCluster();
        }

        static android.view.View i(android.view.View view, android.view.View view2, int i6) {
            return view.keyboardNavigationClusterSearch(view2, i6);
        }

        static boolean j(android.view.View view) {
            return view.restoreDefaultFocus();
        }

        static void k(android.view.View view, java.lang.String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(android.view.View view, boolean z6) {
            view.setFocusedByDefault(z6);
        }

        static void m(android.view.View view, int i6) {
            view.setImportantForAutofill(i6);
        }

        static void n(android.view.View view, boolean z6) {
            view.setKeyboardNavigationCluster(z6);
        }

        static void o(android.view.View view, int i6) {
            view.setNextClusterForwardId(i6);
        }

        static void p(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class k {
        static void a(android.view.View view, final androidx.core.view.X.p pVar) {
            p170r.Y y6 = (p170r.Y) view.getTag(p202u1.c.f55389R);
            if (y6 == null) {
                y6 = new p170r.Y();
                view.setTag(p202u1.c.f55389R, y6);
            }
            j$.util.Objects.requireNonNull(pVar);
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new android.view.View.OnUnhandledKeyEventListener(pVar) { // from class: androidx.core.view.Y
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(android.view.View view2, android.view.KeyEvent keyEvent) {
                    throw null;
                }
            };
            y6.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static java.lang.CharSequence b(android.view.View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(android.view.View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(android.view.View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(android.view.View view, androidx.core.view.X.p pVar) {
            android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p170r.Y y6 = (p170r.Y) view.getTag(p202u1.c.f55389R);
            if (y6 == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) y6.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(android.view.View view, int i6) {
            return (T) view.requireViewById(i6);
        }

        static void g(android.view.View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        static void h(android.view.View view, java.lang.CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(android.view.View view, D1.a aVar) {
            view.setAutofillId(null);
        }

        static void j(android.view.View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    private static class l {
        static android.view.View.AccessibilityDelegate a(android.view.View view) {
            return view.getAccessibilityDelegate();
        }

        static android.view.contentcapture.ContentCaptureSession b(android.view.View view) {
            return view.getContentCaptureSession();
        }

        static java.util.List<android.graphics.Rect> c(android.view.View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i6, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i10);
        }

        static void e(android.view.View view, E1.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(android.view.View view, java.util.List<android.graphics.Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class m {
        static int a(android.view.View view) {
            return view.getImportantForContentCapture();
        }

        static java.lang.CharSequence b(android.view.View view) {
            return view.getStateDescription();
        }

        public static androidx.core.view.X0 c(android.view.View view) {
            android.view.WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return androidx.core.view.X0.f(windowInsetsController);
            }
            return null;
        }

        static boolean d(android.view.View view) {
            return view.isImportantForContentCapture();
        }

        static void e(android.view.View view, int i6) {
            view.setImportantForContentCapture(i6);
        }

        static void f(android.view.View view, java.lang.CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class n {
        public static java.lang.String[] a(android.view.View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.C1996d b(android.view.View view, androidx.core.view.C1996d c1996d) {
            android.view.ContentInfo contentInfoF = c1996d.f();
            android.view.ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c1996d : androidx.core.view.C1996d.g(contentInfoPerformReceiveContent);
        }

        public static void c(android.view.View view, java.lang.String[] strArr, androidx.core.view.H h6) {
            if (h6 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new androidx.core.view.X.o(h6));
            }
        }
    }

    private static final class o implements android.view.OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.view.H f21682a;

        o(androidx.core.view.H h6) {
            this.f21682a = h6;
        }

        public android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
            androidx.core.view.C1996d c1996dG = androidx.core.view.C1996d.g(contentInfo);
            androidx.core.view.C1996d c1996dA = this.f21682a.a(view, c1996dG);
            if (c1996dA == null) {
                return null;
            }
            return c1996dA == c1996dG ? contentInfo : c1996dA.f();
        }
    }

    public interface p {
    }

    static class q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final java.util.ArrayList f21683d = new java.util.ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.WeakHashMap f21684a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.util.SparseArray f21685b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.ref.WeakReference f21686c = null;

        q() {
        }

        static androidx.core.view.X.q a(android.view.View view) {
            androidx.core.view.X.q qVar = (androidx.core.view.X.q) view.getTag(p202u1.c.f55388Q);
            if (qVar != null) {
                return qVar;
            }
            androidx.core.view.X.q qVar2 = new androidx.core.view.X.q();
            view.setTag(p202u1.c.f55388Q, qVar2);
            return qVar2;
        }

        private android.view.View c(android.view.View view, android.view.KeyEvent keyEvent) {
            java.util.WeakHashMap weakHashMap = this.f21684a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        android.view.View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private android.util.SparseArray d() {
            if (this.f21685b == null) {
                this.f21685b = new android.util.SparseArray();
            }
            return this.f21685b;
        }

        private boolean e(android.view.View view, android.view.KeyEvent keyEvent) {
            int size;
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(p202u1.c.f55389R);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            androidx.appcompat.app.D.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            java.util.WeakHashMap weakHashMap = this.f21684a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList arrayList = f21683d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f21684a == null) {
                        this.f21684a = new java.util.WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        java.util.ArrayList arrayList2 = f21683d;
                        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f21684a.put(view, java.lang.Boolean.TRUE);
                            for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                this.f21684a.put((android.view.View) parent, java.lang.Boolean.TRUE);
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(android.view.View view, android.view.KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            android.view.View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new java.lang.ref.WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(android.view.KeyEvent keyEvent) {
            java.lang.ref.WeakReference weakReference;
            int iIndexOfKey;
            java.lang.ref.WeakReference weakReference2 = this.f21686c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f21686c = new java.lang.ref.WeakReference(keyEvent);
            android.util.SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (java.lang.ref.WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (java.lang.ref.WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            android.view.View view = (android.view.View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(android.view.View view) {
        return view.getMinimumHeight();
    }

    public static void A0(android.view.View view, androidx.core.view.G g6) {
        androidx.core.view.X.h.u(view, g6);
    }

    public static int B(android.view.View view) {
        return view.getMinimumWidth();
    }

    public static void B0(android.view.View view, int i6, int i10, int i11, int i12) {
        view.setPaddingRelative(i6, i10, i11, i12);
    }

    public static java.lang.String[] C(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? androidx.core.view.X.n.a(view) : (java.lang.String[]) view.getTag(p202u1.c.f55385N);
    }

    public static void C0(android.view.View view, boolean z6) {
        m0().f(view, java.lang.Boolean.valueOf(z6));
    }

    public static int D(android.view.View view) {
        return view.getPaddingEnd();
    }

    public static void D0(android.view.View view, int i6, int i10) {
        androidx.core.view.X.i.d(view, i6, i10);
    }

    public static int E(android.view.View view) {
        return view.getPaddingStart();
    }

    public static void E0(android.view.View view, java.lang.String str) {
        androidx.core.view.X.h.v(view, str);
    }

    public static androidx.core.view.C2038y0 F(android.view.View view) {
        return androidx.core.view.X.i.a(view);
    }

    public static void F0(android.view.View view, float f6) {
        androidx.core.view.X.h.w(view, f6);
    }

    public static java.lang.CharSequence G(android.view.View view) {
        return (java.lang.CharSequence) I0().e(view);
    }

    public static void G0(android.view.View view, androidx.core.view.C2013l0.b bVar) {
        androidx.core.view.C2013l0.d(view, bVar);
    }

    public static java.lang.String H(android.view.View view) {
        return androidx.core.view.X.h.k(view);
    }

    public static void H0(android.view.View view, float f6) {
        androidx.core.view.X.h.x(view, f6);
    }

    public static float I(android.view.View view) {
        return androidx.core.view.X.h.l(view);
    }

    private static androidx.core.view.X.f I0() {
        return new androidx.core.view.X.c(p202u1.c.f55387P, java.lang.CharSequence.class, 64, 30);
    }

    public static androidx.core.view.X0 J(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.X.m.c(view);
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                android.view.Window window = ((android.app.Activity) context).getWindow();
                if (window != null) {
                    return androidx.core.view.AbstractC2011k0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(android.view.View view) {
        androidx.core.view.X.h.z(view);
    }

    public static int K(android.view.View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(android.view.View view) {
        return androidx.core.view.X.h.m(view);
    }

    public static boolean M(android.view.View view) {
        return m(view) != null;
    }

    public static boolean N(android.view.View view) {
        return view.hasOnClickListeners();
    }

    public static boolean O(android.view.View view) {
        return view.hasTransientState();
    }

    public static boolean P(android.view.View view) {
        java.lang.Boolean bool = (java.lang.Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean Q(android.view.View view) {
        return view.isAttachedToWindow();
    }

    public static boolean R(android.view.View view) {
        return view.isLaidOut();
    }

    public static boolean S(android.view.View view) {
        return androidx.core.view.X.h.p(view);
    }

    public static boolean T(android.view.View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(android.view.View view) {
        java.lang.Boolean bool = (java.lang.Boolean) m0().e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.C1996d V(androidx.core.view.C1996d c1996d) {
        return c1996d;
    }

    static void W(android.view.View view, int i6) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i6);
                if (z6) {
                    accessibilityEventObtain.getText().add(o(view));
                    x0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i6 == 32) {
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i6);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i6);
                } catch (java.lang.AbstractMethodError e6) {
                    java.lang.String str = view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent";
                }
            }
        }
    }

    public static void X(android.view.View view, int i6) {
        view.offsetLeftAndRight(i6);
    }

    public static void Y(android.view.View view, int i6) {
        view.offsetTopAndBottom(i6);
    }

    public static androidx.core.view.C2038y0 Z(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
        android.view.WindowInsets windowInsetsV = c2038y0.v();
        if (windowInsetsV != null) {
            android.view.WindowInsets windowInsetsB = androidx.core.view.X.g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return androidx.core.view.C2038y0.x(windowInsetsB, view);
            }
        }
        return c2038y0;
    }

    public static void a0(android.view.View view, C1.B b6) {
        view.onInitializeAccessibilityNodeInfo(b6.a1());
    }

    private static androidx.core.view.X.f b() {
        return new androidx.core.view.X.d(p202u1.c.f55381J, java.lang.Boolean.class, 28);
    }

    private static androidx.core.view.X.f b0() {
        return new androidx.core.view.X.b(p202u1.c.f55382K, java.lang.CharSequence.class, 8, 28);
    }

    public static int c(android.view.View view, java.lang.CharSequence charSequence, C1.G g6) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new C1.B.a(iQ, charSequence, g6));
        }
        return iQ;
    }

    public static boolean c0(android.view.View view, int i6, android.os.Bundle bundle) {
        return view.performAccessibilityAction(i6, bundle);
    }

    private static void d(android.view.View view, C1.B.a aVar) {
        j(view);
        i0(aVar.b(), view);
        p(view).add(aVar);
        W(view, 0);
    }

    public static androidx.core.view.C1996d d0(android.view.View view, androidx.core.view.C1996d c1996d) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            java.lang.String str = "performReceiveContent: " + c1996d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.X.n.b(view, c1996d);
        }
        androidx.core.view.H h6 = (androidx.core.view.H) view.getTag(p202u1.c.f55384M);
        if (h6 == null) {
            return v(view).a(c1996d);
        }
        androidx.core.view.C1996d c1996dA = h6.a(view, c1996d);
        if (c1996dA == null) {
            return null;
        }
        return v(view).a(c1996dA);
    }

    public static androidx.core.view.C2003g0 e(android.view.View view) {
        if (f21668a == null) {
            f21668a = new java.util.WeakHashMap();
        }
        androidx.core.view.C2003g0 c2003g0 = (androidx.core.view.C2003g0) f21668a.get(view);
        if (c2003g0 != null) {
            return c2003g0;
        }
        androidx.core.view.C2003g0 c2003g1 = new androidx.core.view.C2003g0(view);
        f21668a.put(view, c2003g1);
        return c2003g1;
    }

    public static void e0(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    public static androidx.core.view.C2038y0 f(android.view.View view, androidx.core.view.C2038y0 c2038y0, android.graphics.Rect rect) {
        return androidx.core.view.X.h.b(view, c2038y0, rect);
    }

    public static void f0(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static androidx.core.view.C2038y0 g(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
        android.view.WindowInsets windowInsetsV = c2038y0.v();
        if (windowInsetsV != null) {
            android.view.WindowInsets windowInsetsA = androidx.core.view.X.g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return androidx.core.view.C2038y0.x(windowInsetsA, view);
            }
        }
        return c2038y0;
    }

    public static void g0(android.view.View view, java.lang.Runnable runnable, long j6) {
        view.postOnAnimationDelayed(runnable, j6);
    }

    static boolean h(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.X.q.a(view).b(view, keyEvent);
    }

    public static void h0(android.view.View view, int i6) {
        i0(i6, view);
        W(view, 0);
    }

    static boolean i(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return androidx.core.view.X.q.a(view).f(keyEvent);
    }

    private static void i0(int i6, android.view.View view) {
        java.util.List listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (((C1.B.a) listP.get(i10)).b() == i6) {
                listP.remove(i10);
                return;
            }
        }
    }

    static void j(android.view.View view) {
        androidx.core.view.C1990a c1990aL = l(view);
        if (c1990aL == null) {
            c1990aL = new androidx.core.view.C1990a();
        }
        n0(view, c1990aL);
    }

    public static void j0(android.view.View view, C1.B.a aVar, java.lang.CharSequence charSequence, C1.G g6) {
        if (g6 == null && charSequence == null) {
            h0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, g6));
        }
    }

    public static int k() {
        return android.view.View.generateViewId();
    }

    public static void k0(android.view.View view) {
        androidx.core.view.X.g.c(view);
    }

    public static androidx.core.view.C1990a l(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof androidx.core.view.C1990a.C0410a ? ((androidx.core.view.C1990a.C0410a) accessibilityDelegateM).f21699a : new androidx.core.view.C1990a(accessibilityDelegateM);
    }

    public static void l0(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i6, int i10) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.X.l.d(view, context, iArr, attributeSet, typedArray, i6, i10);
        }
    }

    private static android.view.View.AccessibilityDelegate m(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? androidx.core.view.X.l.a(view) : n(view);
    }

    private static androidx.core.view.X.f m0() {
        return new androidx.core.view.X.a(p202u1.c.f55386O, java.lang.Boolean.class, 28);
    }

    private static android.view.View.AccessibilityDelegate n(android.view.View view) {
        if (f21670c) {
            return null;
        }
        if (f21669b == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                f21669b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                f21670c = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = f21669b.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            f21670c = true;
            return null;
        }
    }

    public static void n0(android.view.View view, androidx.core.view.C1990a c1990a) {
        if (c1990a == null && (m(view) instanceof androidx.core.view.C1990a.C0410a)) {
            c1990a = new androidx.core.view.C1990a();
        }
        x0(view);
        view.setAccessibilityDelegate(c1990a == null ? null : c1990a.d());
    }

    public static java.lang.CharSequence o(android.view.View view) {
        return (java.lang.CharSequence) b0().e(view);
    }

    public static void o0(android.view.View view, boolean z6) {
        b().f(view, java.lang.Boolean.valueOf(z6));
    }

    private static java.util.List p(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(p202u1.c.f55379H);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(p202u1.c.f55379H, arrayList2);
        return arrayList2;
    }

    public static void p0(android.view.View view, int i6) {
        view.setAccessibilityLiveRegion(i6);
    }

    private static int q(android.view.View view, java.lang.CharSequence charSequence) {
        java.util.List listP = p(view);
        for (int i6 = 0; i6 < listP.size(); i6++) {
            if (android.text.TextUtils.equals(charSequence, ((C1.B.a) listP.get(i6)).c())) {
                return ((C1.B.a) listP.get(i6)).b();
            }
        }
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = f21671d;
            if (i11 >= iArr.length || i10 != -1) {
                break;
            }
            int i12 = iArr[i11];
            boolean z6 = true;
            for (int i13 = 0; i13 < listP.size(); i13++) {
                z6 &= ((C1.B.a) listP.get(i13)).b() != i12;
            }
            if (z6) {
                i10 = i12;
            }
            i11++;
        }
        return i10;
    }

    public static void q0(android.view.View view, java.lang.CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f21673f.a(view);
        } else {
            f21673f.d(view);
        }
    }

    public static android.content.res.ColorStateList r(android.view.View view) {
        return androidx.core.view.X.h.g(view);
    }

    public static void r0(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    public static android.graphics.PorterDuff.Mode s(android.view.View view) {
        return androidx.core.view.X.h.h(view);
    }

    public static void s0(android.view.View view, android.content.res.ColorStateList colorStateList) {
        androidx.core.view.X.h.q(view, colorStateList);
    }

    public static android.view.Display t(android.view.View view) {
        return view.getDisplay();
    }

    public static void t0(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        androidx.core.view.X.h.r(view, mode);
    }

    public static float u(android.view.View view) {
        return androidx.core.view.X.h.i(view);
    }

    public static void u0(android.view.View view, android.graphics.Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.core.view.I v(android.view.View view) {
        return view instanceof androidx.core.view.I ? (androidx.core.view.I) view : f21672e;
    }

    public static void v0(android.view.View view, float f6) {
        androidx.core.view.X.h.s(view, f6);
    }

    public static boolean w(android.view.View view) {
        return view.getFitsSystemWindows();
    }

    public static void w0(android.view.View view, int i6) {
        view.setImportantForAccessibility(i6);
    }

    public static int x(android.view.View view) {
        return view.getImportantForAccessibility();
    }

    private static void x0(android.view.View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int y(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.view.X.j.c(view);
        }
        return 0;
    }

    public static void y0(android.view.View view, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.X.j.m(view, i6);
        }
    }

    public static int z(android.view.View view) {
        return view.getLayoutDirection();
    }

    public static void z0(android.view.View view, int i6) {
        view.setLabelFor(i6);
    }
}
