package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.O implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    static final androidx.appcompat.widget.SearchView.o f18224P0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private java.lang.CharSequence f18225A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private java.lang.CharSequence f18226B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private boolean f18227C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f18228D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    android.app.SearchableInfo f18229E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private android.os.Bundle f18230F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final java.lang.Runnable f18231G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private java.lang.Runnable f18232H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final java.util.WeakHashMap f18233I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private final android.view.View.OnClickListener f18234J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    android.view.View.OnKeyListener f18235K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final android.widget.TextView.OnEditorActionListener f18236L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final android.widget.AdapterView.OnItemClickListener f18237M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private final android.widget.AdapterView.OnItemSelectedListener f18238N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private android.text.TextWatcher f18239O0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final androidx.appcompat.widget.SearchView.SearchAutoComplete f18240R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.view.View f18241S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final android.view.View f18242T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final android.view.View f18243U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    final android.widget.ImageView f18244V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    final android.widget.ImageView f18245W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    final android.widget.ImageView f18246a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    final android.widget.ImageView f18247b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final android.view.View f18248c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private androidx.appcompat.widget.SearchView.q f18249d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private android.graphics.Rect f18250e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.graphics.Rect f18251f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int[] f18252g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int[] f18253h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final android.widget.ImageView f18254i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f18255j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int f18256k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final int f18257l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final android.content.Intent f18258m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final android.content.Intent f18259n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final java.lang.CharSequence f18260o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    android.view.View.OnFocusChangeListener f18261p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private android.view.View.OnClickListener f18262q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f18263r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f18264s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    G1.a f18265t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f18266u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private java.lang.CharSequence f18267v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f18268w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f18269x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f18270y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f18271z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.C1898d {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f18272G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private androidx.appcompat.widget.SearchView f18273H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private boolean f18274I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final java.lang.Runnable f18275J;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.SearchView.SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, p090j.a.f48636m);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6);
            this.f18275J = new androidx.appcompat.widget.SearchView.SearchAutoComplete.a();
            this.f18272G = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i6 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                return (i6 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                androidx.appcompat.widget.SearchView.f18224P0.c(this);
                return;
            }
            androidx.appcompat.widget.SearchView.k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return android.text.TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f18274I) {
                ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f18274I = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f18272G <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1898d, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f18274I) {
                removeCallbacks(this.f18275J);
                post(this.f18275J);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z6, int i6, android.graphics.Rect rect) {
            super.onFocusChanged(z6, i6, rect);
            this.f18273H.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i6, android.view.KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f18273H.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f18273H.hasFocus() && getVisibility() == 0) {
                this.f18274I = true;
                if (androidx.appcompat.widget.SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence charSequence) {
        }

        void setImeVisibility(boolean z6) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            if (!z6) {
                this.f18274I = false;
                removeCallbacks(this.f18275J);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f18274I = true;
                    return;
                }
                this.f18274I = false;
                removeCallbacks(this.f18275J);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(androidx.appcompat.widget.SearchView searchView) {
            this.f18273H = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f18272G = i6;
        }
    }

    class a implements android.text.TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
            androidx.appcompat.widget.SearchView.this.Y(charSequence);
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.SearchView.this.f0();
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G1.a aVar = androidx.appcompat.widget.SearchView.this.f18265t0;
            if (aVar instanceof androidx.appcompat.widget.X) {
                aVar.a(null);
            }
        }
    }

    class d implements android.view.View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z6) {
            androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
            android.view.View.OnFocusChangeListener onFocusChangeListener = searchView.f18261p0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    class e implements android.view.View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            androidx.appcompat.widget.SearchView.this.B();
        }
    }

    class f implements android.view.View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
            if (view == searchView.f18244V) {
                searchView.V();
                return;
            }
            if (view == searchView.f18246a0) {
                searchView.R();
                return;
            }
            if (view == searchView.f18245W) {
                searchView.W();
            } else if (view == searchView.f18247b0) {
                searchView.a0();
            } else if (view == searchView.f18240R) {
                searchView.H();
            }
        }
    }

    class g implements android.view.View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View view, int i6, android.view.KeyEvent keyEvent) {
            androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
            if (searchView.f18229E0 == null) {
                return false;
            }
            if (searchView.f18240R.isPopupShowing() && androidx.appcompat.widget.SearchView.this.f18240R.getListSelection() != -1) {
                return androidx.appcompat.widget.SearchView.this.X(view, i6, keyEvent);
            }
            if (androidx.appcompat.widget.SearchView.this.f18240R.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i6 != 66) {
                return false;
            }
            view.cancelLongPress();
            androidx.appcompat.widget.SearchView searchView2 = androidx.appcompat.widget.SearchView.this;
            searchView2.P(0, null, searchView2.f18240R.getText().toString());
            return true;
        }
    }

    class h implements android.widget.TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(android.widget.TextView textView, int i6, android.view.KeyEvent keyEvent) {
            androidx.appcompat.widget.SearchView.this.W();
            return true;
        }
    }

    class i implements android.widget.AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
            androidx.appcompat.widget.SearchView.this.S(i6, 0, null);
        }
    }

    class j implements android.widget.AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
            androidx.appcompat.widget.SearchView.this.T(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView adapterView) {
        }
    }

    static class k {
        static void a(android.widget.AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete, int i6) {
            searchAutoComplete.setInputMethodMode(i6);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.reflect.Method f18287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.reflect.Method f18288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.reflect.Method f18289c;

        o() {
            this.f18287a = null;
            this.f18288b = null;
            this.f18289c = null;
            d();
            try {
                java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f18287a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            try {
                java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f18288b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            try {
                java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
                this.f18289c = method;
                method.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(android.widget.AutoCompleteTextView autoCompleteTextView) {
            d();
            java.lang.reflect.Method method = this.f18288b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        void b(android.widget.AutoCompleteTextView autoCompleteTextView) {
            d();
            java.lang.reflect.Method method = this.f18287a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        void c(android.widget.AutoCompleteTextView autoCompleteTextView) {
            d();
            java.lang.reflect.Method method = this.f18289c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    static class p extends I1.a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.p> CREATOR = new androidx.appcompat.widget.SearchView.p.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f18290E;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.SearchView.p createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.SearchView.p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.SearchView.p createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.SearchView.p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.SearchView.p[] newArray(int i6) {
                return new androidx.appcompat.widget.SearchView.p[i6];
            }
        }

        public p(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18290E = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        p(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public java.lang.String toString() {
            return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.f18290E + "}";
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(java.lang.Boolean.valueOf(this.f18290E));
        }
    }

    private static class q extends android.view.TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f18291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Rect f18292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.graphics.Rect f18293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final android.graphics.Rect f18294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f18295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18296f;

        public q(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
            super(rect, view);
            this.f18295e = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f18292b = new android.graphics.Rect();
            this.f18294d = new android.graphics.Rect();
            this.f18293c = new android.graphics.Rect();
            a(rect, rect2);
            this.f18291a = view;
        }

        public void a(android.graphics.Rect rect, android.graphics.Rect rect2) {
            this.f18292b.set(rect);
            this.f18294d.set(rect);
            android.graphics.Rect rect3 = this.f18294d;
            int i6 = this.f18295e;
            rect3.inset(-i6, -i6);
            this.f18293c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            boolean z6;
            float width;
            int height;
            boolean z10;
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z11 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z10 = this.f18296f;
                    if (z10 && !this.f18294d.contains(x6, y6)) {
                        z11 = z10;
                        z6 = false;
                    }
                } else if (action != 3) {
                    z6 = true;
                    z11 = false;
                } else {
                    z10 = this.f18296f;
                    this.f18296f = false;
                }
                z11 = z10;
                z6 = true;
            } else if (this.f18292b.contains(x6, y6)) {
                this.f18296f = true;
                z6 = true;
            } else {
                z6 = true;
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            if (!z6 || this.f18293c.contains(x6, y6)) {
                android.graphics.Rect rect = this.f18293c;
                width = x6 - rect.left;
                height = y6 - rect.top;
            } else {
                width = this.f18291a.getWidth() / 2;
                height = this.f18291a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f18291a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f18224P0 = android.os.Build.VERSION.SDK_INT < 29 ? new androidx.appcompat.widget.SearchView.o() : null;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48618F);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18250e0 = new android.graphics.Rect();
        this.f18251f0 = new android.graphics.Rect();
        this.f18252g0 = new int[2];
        this.f18253h0 = new int[2];
        this.f18231G0 = new androidx.appcompat.widget.SearchView.b();
        this.f18232H0 = new androidx.appcompat.widget.SearchView.c();
        this.f18233I0 = new java.util.WeakHashMap();
        androidx.appcompat.widget.SearchView.f fVar = new androidx.appcompat.widget.SearchView.f();
        this.f18234J0 = fVar;
        this.f18235K0 = new androidx.appcompat.widget.SearchView.g();
        androidx.appcompat.widget.SearchView.h hVar = new androidx.appcompat.widget.SearchView.h();
        this.f18236L0 = hVar;
        androidx.appcompat.widget.SearchView.i iVar = new androidx.appcompat.widget.SearchView.i();
        this.f18237M0 = iVar;
        androidx.appcompat.widget.SearchView.j jVar = new androidx.appcompat.widget.SearchView.j();
        this.f18238N0 = jVar;
        this.f18239O0 = new androidx.appcompat.widget.SearchView.a();
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f48929f2, i6, 0);
        androidx.core.view.X.l0(this, context, p090j.j.f48929f2, attributeSet, c0VarV.r(), i6, 0);
        android.view.LayoutInflater.from(context).inflate(c0VarV.n(p090j.j.f48979p2, p090j.g.f48776r), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(p090j.f.f48720D);
        this.f18240R = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f18241S = findViewById(p090j.f.f48758z);
        android.view.View viewFindViewById = findViewById(p090j.f.f48719C);
        this.f18242T = viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(p090j.f.f48726J);
        this.f18243U = viewFindViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(p090j.f.f48756x);
        this.f18244V = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(p090j.f.f48717A);
        this.f18245W = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(p090j.f.f48757y);
        this.f18246a0 = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(p090j.f.f48721E);
        this.f18247b0 = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(p090j.f.f48718B);
        this.f18254i0 = imageView5;
        androidx.core.view.X.r0(viewFindViewById, c0VarV.g(p090j.j.f48984q2));
        androidx.core.view.X.r0(viewFindViewById2, c0VarV.g(p090j.j.f49004u2));
        imageView.setImageDrawable(c0VarV.g(p090j.j.f48999t2));
        imageView2.setImageDrawable(c0VarV.g(p090j.j.f48969n2));
        imageView3.setImageDrawable(c0VarV.g(p090j.j.f48954k2));
        imageView4.setImageDrawable(c0VarV.g(p090j.j.f49014w2));
        imageView5.setImageDrawable(c0VarV.g(p090j.j.f48999t2));
        this.f18255j0 = c0VarV.g(p090j.j.f48994s2);
        androidx.appcompat.widget.h0.a(imageView, getResources().getString(p090j.h.f48790l));
        this.f18256k0 = c0VarV.n(p090j.j.f49009v2, p090j.g.f48775q);
        this.f18257l0 = c0VarV.n(p090j.j.f48959l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f18239O0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f18235K0);
        searchAutoComplete.setOnFocusChangeListener(new androidx.appcompat.widget.SearchView.d());
        setIconifiedByDefault(c0VarV.a(p090j.j.f48974o2, true));
        int iF = c0VarV.f(p090j.j.f48939h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f18260o0 = c0VarV.p(p090j.j.f48964m2);
        this.f18267v0 = c0VarV.p(p090j.j.f48989r2);
        int iK = c0VarV.k(p090j.j.f48949j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = c0VarV.k(p090j.j.f48944i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(c0VarV.a(p090j.j.f48934g2, true));
        c0VarV.w();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.f18258m0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f18259n0 = intent2;
        intent2.addFlags(268435456);
        android.view.View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f18248c0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new androidx.appcompat.widget.SearchView.e());
        }
        k0(this.f18263r0);
        g0();
    }

    private android.content.Intent C(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, int i6, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f18226B0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.f18230F0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i6 != 0) {
            intent.putExtra("action_key", i6);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f18229E0.getSearchActivity());
        return intent;
    }

    private android.content.Intent D(android.database.Cursor cursor, int i6, java.lang.String str) {
        int position;
        java.lang.String strY;
        try {
            java.lang.String strY2 = androidx.appcompat.widget.X.y(cursor, "suggest_intent_action");
            if (strY2 == null) {
                strY2 = this.f18229E0.getSuggestIntentAction();
            }
            if (strY2 == null) {
                strY2 = "android.intent.action.SEARCH";
            }
            java.lang.String str2 = strY2;
            java.lang.String strY3 = androidx.appcompat.widget.X.y(cursor, "suggest_intent_data");
            if (strY3 == null) {
                strY3 = this.f18229E0.getSuggestIntentData();
            }
            if (strY3 != null && (strY = androidx.appcompat.widget.X.y(cursor, "suggest_intent_data_id")) != null) {
                strY3 = strY3 + "/" + android.net.Uri.encode(strY);
            }
            return C(str2, strY3 == null ? null : android.net.Uri.parse(strY3), androidx.appcompat.widget.X.y(cursor, "suggest_intent_extra_data"), androidx.appcompat.widget.X.y(cursor, "suggest_intent_query"), i6, str);
        } catch (java.lang.RuntimeException e6) {
            try {
                position = cursor.getPosition();
            } catch (java.lang.RuntimeException unused) {
                position = -1;
            }
            java.lang.String str3 = "Search suggestions cursor at row " + position + " returned exception.";
            return null;
        }
    }

    private android.content.Intent E(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.f18230F0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        android.content.Intent intent3 = new android.content.Intent(intent);
        android.content.res.Resources resources = getResources();
        java.lang.String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        java.lang.String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        java.lang.String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private android.content.Intent F(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f18240R.dismissDropDown();
    }

    private void I(android.view.View view, android.graphics.Rect rect) {
        view.getLocationInWindow(this.f18252g0);
        getLocationInWindow(this.f18253h0);
        int[] iArr = this.f18252g0;
        int i6 = iArr[1];
        int[] iArr2 = this.f18253h0;
        int i10 = i6 - iArr2[1];
        int i11 = iArr[0] - iArr2[0];
        rect.set(i11, i10, view.getWidth() + i11, view.getHeight() + i10);
    }

    private java.lang.CharSequence J(java.lang.CharSequence charSequence) {
        if (!this.f18263r0 || this.f18255j0 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f18240R.getTextSize()) * 1.25d);
        this.f18255j0.setBounds(0, 0, textSize, textSize);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(this.f18255j0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        android.content.Intent intent;
        android.app.SearchableInfo searchableInfo = this.f18229E0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f18229E0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f18258m0;
        } else {
            intent = this.f18229E0.getVoiceSearchLaunchRecognizer() ? this.f18259n0 : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f18266u0 || this.f18271z0) && !L();
    }

    private void O(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (java.lang.RuntimeException e6) {
            java.lang.String str = "Failed launch activity: " + intent;
        }
    }

    private boolean Q(int i6, int i10, java.lang.String str) {
        android.database.Cursor cursorB = this.f18265t0.b();
        if (cursorB == null || !cursorB.moveToPosition(i6)) {
            return false;
        }
        O(D(cursorB, i10, str));
        return true;
    }

    private void b0() {
        post(this.f18231G0);
    }

    private void c0(int i6) {
        java.lang.CharSequence charSequenceC;
        android.text.Editable text = this.f18240R.getText();
        android.database.Cursor cursorB = this.f18265t0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i6) || (charSequenceC = this.f18265t0.c(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceC);
        }
    }

    private void e0() {
        boolean z6 = true;
        boolean z10 = !android.text.TextUtils.isEmpty(this.f18240R.getText());
        if (!z10 && (!this.f18263r0 || this.f18227C0)) {
            z6 = false;
        }
        this.f18246a0.setVisibility(z6 ? 0 : 8);
        android.graphics.drawable.Drawable drawable = this.f18246a0.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? android.view.ViewGroup.ENABLED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        java.lang.CharSequence queryHint = getQueryHint();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f18240R;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p090j.d.f48663e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p090j.d.f48664f);
    }

    private void h0() {
        this.f18240R.setThreshold(this.f18229E0.getSuggestThreshold());
        this.f18240R.setImeOptions(this.f18229E0.getImeOptions());
        int inputType = this.f18229E0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f18229E0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f18240R.setInputType(inputType);
        G1.a aVar = this.f18265t0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f18229E0.getSuggestAuthority() != null) {
            androidx.appcompat.widget.X x6 = new androidx.appcompat.widget.X(getContext(), this, this.f18229E0, this.f18233I0);
            this.f18265t0 = x6;
            this.f18240R.setAdapter(x6);
            ((androidx.appcompat.widget.X) this.f18265t0).H(this.f18268w0 ? 2 : 1);
        }
    }

    private void i0() {
        this.f18243U.setVisibility((N() && (this.f18245W.getVisibility() == 0 || this.f18247b0.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z6) {
        this.f18245W.setVisibility((this.f18266u0 && N() && hasFocus() && (z6 || !this.f18271z0)) ? 0 : 8);
    }

    private void k0(boolean z6) {
        this.f18264s0 = z6;
        int i6 = 8;
        int i10 = z6 ? 0 : 8;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(this.f18240R.getText());
        this.f18244V.setVisibility(i10);
        j0(!zIsEmpty);
        this.f18241S.setVisibility(z6 ? 8 : 0);
        if (this.f18254i0.getDrawable() != null && !this.f18263r0) {
            i6 = 0;
        }
        this.f18254i0.setVisibility(i6);
        e0();
        l0(zIsEmpty);
        i0();
    }

    private void l0(boolean z6) {
        int i6 = 8;
        if (this.f18271z0 && !L() && z6) {
            this.f18245W.setVisibility(8);
            i6 = 0;
        }
        this.f18247b0.setVisibility(i6);
    }

    private void setQuery(java.lang.CharSequence charSequence) {
        this.f18240R.setText(charSequence);
        this.f18240R.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f18248c0.getWidth() > 1) {
            android.content.res.Resources resources = getContext().getResources();
            int paddingLeft = this.f18242T.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean zB = androidx.appcompat.widget.n0.b(this);
            int dimensionPixelSize = this.f18263r0 ? resources.getDimensionPixelSize(p090j.d.f48661c) + resources.getDimensionPixelSize(p090j.d.f48662d) : 0;
            this.f18240R.getDropDownBackground().getPadding(rect);
            int i6 = rect.left;
            this.f18240R.setDropDownHorizontalOffset(zB ? -i6 : paddingLeft - (i6 + dimensionPixelSize));
            this.f18240R.setDropDownWidth((((this.f18248c0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.appcompat.widget.SearchView.k.a(this.f18240R);
            return;
        }
        androidx.appcompat.widget.SearchView.o oVar = f18224P0;
        oVar.b(this.f18240R);
        oVar.a(this.f18240R);
    }

    public boolean L() {
        return this.f18264s0;
    }

    void P(int i6, java.lang.String str, java.lang.String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i6, str));
    }

    void R() {
        if (!android.text.TextUtils.isEmpty(this.f18240R.getText())) {
            this.f18240R.setText("");
            this.f18240R.requestFocus();
            this.f18240R.setImeVisibility(true);
        } else if (this.f18263r0) {
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i6, int i10, java.lang.String str) {
        Q(i6, 0, null);
        this.f18240R.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i6) {
        c0(i6);
        return true;
    }

    protected void U(java.lang.CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f18240R.requestFocus();
        this.f18240R.setImeVisibility(true);
        android.view.View.OnClickListener onClickListener = this.f18262q0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        android.text.Editable text = this.f18240R.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f18229E0 != null) {
            P(0, null, text.toString());
        }
        this.f18240R.setImeVisibility(false);
        G();
    }

    boolean X(android.view.View view, int i6, android.view.KeyEvent keyEvent) {
        if (this.f18229E0 != null && this.f18265t0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i6 == 66 || i6 == 84 || i6 == 61) {
                return S(this.f18240R.getListSelection(), 0, null);
            }
            if (i6 == 21 || i6 == 22) {
                this.f18240R.setSelection(i6 == 21 ? 0 : this.f18240R.length());
                this.f18240R.setListSelection(0);
                this.f18240R.clearListSelection();
                this.f18240R.b();
                return true;
            }
            if (i6 == 19) {
                this.f18240R.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(java.lang.CharSequence charSequence) {
        android.text.Editable text = this.f18240R.getText();
        this.f18226B0 = text;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(text);
        j0(!zIsEmpty);
        l0(zIsEmpty);
        e0();
        i0();
        this.f18225A0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f18240R.hasFocus()) {
            H();
        }
    }

    void a0() {
        android.content.Intent intentE;
        android.app.SearchableInfo searchableInfo = this.f18229E0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.f18258m0, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.f18259n0, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (android.content.ActivityNotFoundException unused) {
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f18227C0) {
            return;
        }
        this.f18227C0 = true;
        int imeOptions = this.f18240R.getImeOptions();
        this.f18228D0 = imeOptions;
        this.f18240R.setImeOptions(imeOptions | 33554432);
        this.f18240R.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f18269x0 = true;
        super.clearFocus();
        this.f18240R.clearFocus();
        this.f18240R.setImeVisibility(false);
        this.f18269x0 = false;
    }

    public void d0(java.lang.CharSequence charSequence, boolean z6) {
        this.f18240R.setText(charSequence);
        if (charSequence != null) {
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f18240R;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f18226B0 = charSequence;
        }
        if (!z6 || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void e() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f18240R.setImeOptions(this.f18228D0);
        this.f18227C0 = false;
    }

    void f0() {
        int[] iArr = this.f18240R.hasFocus() ? android.view.ViewGroup.FOCUSED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.f18242T.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.f18243U.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f18240R.getImeOptions();
    }

    public int getInputType() {
        return this.f18240R.getInputType();
    }

    public int getMaxWidth() {
        return this.f18270y0;
    }

    public java.lang.CharSequence getQuery() {
        return this.f18240R.getText();
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.f18267v0;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.f18229E0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f18260o0 : getContext().getText(this.f18229E0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f18257l0;
    }

    int getSuggestionRowLayout() {
        return this.f18256k0;
    }

    public G1.a getSuggestionsAdapter() {
        return this.f18265t0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f18231G0);
        post(this.f18232H0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        if (z6) {
            I(this.f18240R, this.f18250e0);
            android.graphics.Rect rect = this.f18251f0;
            android.graphics.Rect rect2 = this.f18250e0;
            rect.set(rect2.left, 0, rect2.right, i12 - i10);
            androidx.appcompat.widget.SearchView.q qVar = this.f18249d0;
            if (qVar != null) {
                qVar.a(this.f18251f0, this.f18250e0);
                return;
            }
            androidx.appcompat.widget.SearchView.q qVar2 = new androidx.appcompat.widget.SearchView.q(this.f18251f0, this.f18250e0, this.f18240R);
            this.f18249d0 = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    @Override // androidx.appcompat.widget.O, android.view.View
    protected void onMeasure(int i6, int i10) {
        int preferredWidth;
        int mode;
        int size;
        if (L()) {
            super.onMeasure(i6, i10);
            return;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i6);
        int size2 = android.view.View.MeasureSpec.getSize(i6);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.f18270y0;
                if (size2 <= 0) {
                    size2 = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.f18270y0) > 0) {
            }
            mode = android.view.View.MeasureSpec.getMode(i10);
            size = android.view.View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                size = java.lang.Math.min(getPreferredHeight(), size);
            } else if (mode == 0) {
                size = getPreferredHeight();
            }
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
        preferredWidth = this.f18270y0;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size2 = java.lang.Math.min(preferredWidth, size2);
        mode = android.view.View.MeasureSpec.getMode(i10);
        size = android.view.View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            size = java.lang.Math.min(getPreferredHeight(), size);
        } else if (mode == 0) {
            size = getPreferredHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.appcompat.widget.SearchView.p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.SearchView.p pVar = (androidx.appcompat.widget.SearchView.p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f18290E);
        requestLayout();
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.SearchView.p pVar = new androidx.appcompat.widget.SearchView.p(super.onSaveInstanceState());
        pVar.f18290E = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i6, android.graphics.Rect rect) {
        if (this.f18269x0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i6, rect);
        }
        boolean zRequestFocus = this.f18240R.requestFocus(i6, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.f18230F0 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f18263r0 == z6) {
            return;
        }
        this.f18263r0 = z6;
        k0(z6);
        g0();
    }

    public void setImeOptions(int i6) {
        this.f18240R.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.f18240R.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.f18270y0 = i6;
        requestLayout();
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f18261p0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.m mVar) {
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.f18262q0 = onClickListener;
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.n nVar) {
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.f18267v0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f18268w0 = z6;
        G1.a aVar = this.f18265t0;
        if (aVar instanceof androidx.appcompat.widget.X) {
            ((androidx.appcompat.widget.X) aVar).H(z6 ? 2 : 1);
        }
    }

    public void setSearchableInfo(android.app.SearchableInfo searchableInfo) {
        this.f18229E0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f18271z0 = zK;
        if (zK) {
            this.f18240R.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f18266u0 = z6;
        k0(L());
    }

    public void setSuggestionsAdapter(G1.a aVar) {
        this.f18265t0 = aVar;
        this.f18240R.setAdapter(aVar);
    }
}
