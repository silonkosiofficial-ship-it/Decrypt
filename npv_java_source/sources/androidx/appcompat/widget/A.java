package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class A extends android.widget.Spinner {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final int[] f17957K = {android.R.attr.spinnerMode};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f17958C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f17959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.appcompat.widget.N f17960E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.SpinnerAdapter f17961F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f17962G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.appcompat.widget.A.j f17963H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f17964I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final android.graphics.Rect f17965J;

    class a extends androidx.appcompat.widget.N {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.widget.A.h f17966L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.view.View view, androidx.appcompat.widget.A.h hVar) {
            super(view);
            this.f17966L = hVar;
        }

        @Override // androidx.appcompat.widget.N
        public androidx.appcompat.view.menu.p b() {
            return this.f17966L;
        }

        @Override // androidx.appcompat.widget.N
        public boolean c() {
            if (androidx.appcompat.widget.A.this.getInternalPopup().a()) {
                return true;
            }
            androidx.appcompat.widget.A.this.b();
            return true;
        }
    }

    class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!androidx.appcompat.widget.A.this.getInternalPopup().a()) {
                androidx.appcompat.widget.A.this.b();
            }
            android.view.ViewTreeObserver viewTreeObserver = androidx.appcompat.widget.A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                androidx.appcompat.widget.A.c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(android.view.View view) {
            return view.getTextAlignment();
        }

        static int b(android.view.View view) {
            return view.getTextDirection();
        }

        static void c(android.view.View view, int i6) {
            view.setTextAlignment(i6);
        }

        static void d(android.view.View view, int i6) {
            view.setTextDirection(i6);
        }
    }

    private static final class e {
        static void a(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, android.content.res.Resources.Theme theme) {
            if (B1.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements androidx.appcompat.widget.A.j, android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        androidx.appcompat.app.DialogInterfaceC1891b f17969C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private android.widget.ListAdapter f17970D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.lang.CharSequence f17971E;

        f() {
        }

        @Override // androidx.appcompat.widget.A.j
        public boolean a() {
            androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891b = this.f17969C;
            if (dialogInterfaceC1891b != null) {
                return dialogInterfaceC1891b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.j
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.j
        public void dismiss() {
            androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891b = this.f17969C;
            if (dialogInterfaceC1891b != null) {
                dialogInterfaceC1891b.dismiss();
                this.f17969C = null;
            }
        }

        @Override // androidx.appcompat.widget.A.j
        public void e(int i6) {
        }

        @Override // androidx.appcompat.widget.A.j
        public java.lang.CharSequence f() {
            return this.f17971E;
        }

        @Override // androidx.appcompat.widget.A.j
        public android.graphics.drawable.Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.j
        public void i(java.lang.CharSequence charSequence) {
            this.f17971E = charSequence;
        }

        @Override // androidx.appcompat.widget.A.j
        public void k(android.graphics.drawable.Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.A.j
        public void l(int i6) {
        }

        @Override // androidx.appcompat.widget.A.j
        public void m(int i6) {
        }

        @Override // androidx.appcompat.widget.A.j
        public void n(int i6, int i10) {
            if (this.f17970D == null) {
                return;
            }
            androidx.appcompat.app.DialogInterfaceC1891b.a aVar = new androidx.appcompat.app.DialogInterfaceC1891b.a(androidx.appcompat.widget.A.this.getPopupContext());
            java.lang.CharSequence charSequence = this.f17971E;
            if (charSequence != null) {
                aVar.m(charSequence);
            }
            androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891bA = aVar.k(this.f17970D, androidx.appcompat.widget.A.this.getSelectedItemPosition(), this).a();
            this.f17969C = dialogInterfaceC1891bA;
            android.widget.ListView listViewL = dialogInterfaceC1891bA.l();
            androidx.appcompat.widget.A.d.d(listViewL, i6);
            androidx.appcompat.widget.A.d.c(listViewL, i10);
            this.f17969C.show();
        }

        @Override // androidx.appcompat.widget.A.j
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i6) {
            androidx.appcompat.widget.A.this.setSelection(i6);
            if (androidx.appcompat.widget.A.this.getOnItemClickListener() != null) {
                androidx.appcompat.widget.A.this.performItemClick(null, i6, this.f17970D.getItemId(i6));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.j
        public void p(android.widget.ListAdapter listAdapter) {
            this.f17970D = listAdapter;
        }
    }

    private static class g implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private android.widget.SpinnerAdapter f17973C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private android.widget.ListAdapter f17974D;

        public g(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
            this.f17973C = spinnerAdapter;
            if (spinnerAdapter instanceof android.widget.ListAdapter) {
                this.f17974D = (android.widget.ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                return;
            }
            androidx.appcompat.widget.A.e.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            android.widget.ListAdapter listAdapter = this.f17974D;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i6) {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i6);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i6) {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i6);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i6) {
            return 0;
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
            return getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i6) {
            android.widget.ListAdapter listAdapter = this.f17974D;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i6);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.f17973C;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends androidx.appcompat.widget.P implements androidx.appcompat.widget.A.j {

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        private java.lang.CharSequence f17975l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        android.widget.ListAdapter f17976m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private final android.graphics.Rect f17977n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private int f17978o0;

        class a implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.widget.A f17980C;

            a(androidx.appcompat.widget.A a6) {
                this.f17980C = a6;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
                androidx.appcompat.widget.A.this.setSelection(i6);
                if (androidx.appcompat.widget.A.this.getOnItemClickListener() != null) {
                    androidx.appcompat.widget.A.h hVar = androidx.appcompat.widget.A.h.this;
                    androidx.appcompat.widget.A.this.performItemClick(view, i6, hVar.f17976m0.getItemId(i6));
                }
                androidx.appcompat.widget.A.h.this.dismiss();
            }
        }

        class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                androidx.appcompat.widget.A.h hVar = androidx.appcompat.widget.A.h.this;
                if (!hVar.V(androidx.appcompat.widget.A.this)) {
                    androidx.appcompat.widget.A.h.this.dismiss();
                } else {
                    androidx.appcompat.widget.A.h.this.T();
                    androidx.appcompat.widget.A.h.super.b();
                }
            }
        }

        class c implements android.widget.PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f17983C;

            c(android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f17983C = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                android.view.ViewTreeObserver viewTreeObserver = androidx.appcompat.widget.A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f17983C);
                }
            }
        }

        public h(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6);
            this.f17977n0 = new android.graphics.Rect();
            D(androidx.appcompat.widget.A.this);
            J(true);
            P(0);
            L(new androidx.appcompat.widget.A.h.a(androidx.appcompat.widget.A.this));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008d  */
        /* JADX WARN: Code duplicated, block: B:23:0x009a  */
        void T() {
            int i6;
            int iMax;
            int iU;
            android.graphics.drawable.Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(androidx.appcompat.widget.A.this.f17965J);
                i6 = androidx.appcompat.widget.n0.b(androidx.appcompat.widget.A.this) ? androidx.appcompat.widget.A.this.f17965J.right : -androidx.appcompat.widget.A.this.f17965J.left;
            } else {
                android.graphics.Rect rect = androidx.appcompat.widget.A.this.f17965J;
                rect.right = 0;
                rect.left = 0;
                i6 = 0;
            }
            int paddingLeft = androidx.appcompat.widget.A.this.getPaddingLeft();
            int paddingRight = androidx.appcompat.widget.A.this.getPaddingRight();
            int width = androidx.appcompat.widget.A.this.getWidth();
            androidx.appcompat.widget.A a6 = androidx.appcompat.widget.A.this;
            int i10 = a6.f17964I;
            if (i10 != -2) {
                if (i10 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    F(i10);
                }
                if (androidx.appcompat.widget.n0.b(androidx.appcompat.widget.A.this)) {
                    iU = i6 + (((width - paddingRight) - z()) - U());
                } else {
                    iU = i6 + paddingLeft + U();
                }
                e(iU);
            }
            int iA = a6.a((android.widget.SpinnerAdapter) this.f17976m0, h());
            int i11 = androidx.appcompat.widget.A.this.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect2 = androidx.appcompat.widget.A.this.f17965J;
            int i12 = (i11 - rect2.left) - rect2.right;
            if (iA > i12) {
                iA = i12;
            }
            iMax = java.lang.Math.max(iA, (width - paddingLeft) - paddingRight);
            F(iMax);
            if (androidx.appcompat.widget.n0.b(androidx.appcompat.widget.A.this)) {
                iU = i6 + (((width - paddingRight) - z()) - U());
            } else {
                iU = i6 + paddingLeft + U();
            }
            e(iU);
        }

        public int U() {
            return this.f17978o0;
        }

        boolean V(android.view.View view) {
            return androidx.core.view.X.Q(view) && view.getGlobalVisibleRect(this.f17977n0);
        }

        @Override // androidx.appcompat.widget.A.j
        public java.lang.CharSequence f() {
            return this.f17975l0;
        }

        @Override // androidx.appcompat.widget.A.j
        public void i(java.lang.CharSequence charSequence) {
            this.f17975l0 = charSequence;
        }

        @Override // androidx.appcompat.widget.A.j
        public void m(int i6) {
            this.f17978o0 = i6;
        }

        @Override // androidx.appcompat.widget.A.j
        public void n(int i6, int i10) {
            android.view.ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            T();
            I(2);
            super.b();
            android.widget.ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            androidx.appcompat.widget.A.d.d(listViewJ, i6);
            androidx.appcompat.widget.A.d.c(listViewJ, i10);
            Q(androidx.appcompat.widget.A.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = androidx.appcompat.widget.A.this.getViewTreeObserver()) == null) {
                return;
            }
            androidx.appcompat.widget.A.h.b bVar = new androidx.appcompat.widget.A.h.b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new androidx.appcompat.widget.A.h.c(bVar));
        }

        @Override // androidx.appcompat.widget.P, androidx.appcompat.widget.A.j
        public void p(android.widget.ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f17976m0 = listAdapter;
        }
    }

    static class i extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.A.i> CREATOR = new androidx.appcompat.widget.A.i.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f17985C;

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.A.i createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.A.i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.appcompat.widget.A.i[] newArray(int i6) {
                return new androidx.appcompat.widget.A.i[i6];
            }
        }

        i(android.os.Parcel parcel) {
            super(parcel);
            this.f17985C = parcel.readByte() != 0;
        }

        i(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f17985C ? (byte) 1 : (byte) 0);
        }
    }

    interface j {
        boolean a();

        int c();

        void dismiss();

        void e(int i6);

        java.lang.CharSequence f();

        android.graphics.drawable.Drawable h();

        void i(java.lang.CharSequence charSequence);

        void k(android.graphics.drawable.Drawable drawable);

        void l(int i6);

        void m(int i6);

        void n(int i6, int i10);

        int o();

        void p(android.widget.ListAdapter listAdapter);
    }

    public A(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48620H);
    }

    public A(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, -1);
    }

    public A(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        this(context, attributeSet, i6, i10, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[Catch: all -> 0x004e, Exception -> 0x0051, TRY_LEAVE, TryCatch #3 {Exception -> 0x0051, all -> 0x004e, blocks: (B:13:0x0043, B:15:0x0049), top: B:48:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public A(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, android.content.res.Resources.Theme theme) throws java.lang.Throwable {
        androidx.appcompat.view.d dVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        java.lang.CharSequence[] charSequenceArrQ;
        android.widget.SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i6);
        this.f17965J = new android.graphics.Rect();
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f49019x2, i6, 0);
        this.f17958C = new androidx.appcompat.widget.C1899e(this);
        if (theme == null) {
            int iN = c0VarV.n(p090j.j.f48807C2, 0);
            if (iN != 0) {
                dVar = new androidx.appcompat.view.d(context, iN);
            } else {
                this.f17959D = context;
            }
            android.content.res.TypedArray typedArray = null;
            if (i10 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17957K, i6, 0);
                    try {
                        if (typedArrayObtainStyledAttributes.hasValue(0)) {
                            i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                        }
                    } catch (java.lang.Exception e6) {
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i10 == 0) {
                            androidx.appcompat.widget.A.f fVar = new androidx.appcompat.widget.A.f();
                            this.f17963H = fVar;
                            fVar.i(c0VarV.o(p090j.j.f48797A2));
                        } else if (i10 == 1) {
                            androidx.appcompat.widget.A.h hVar = new androidx.appcompat.widget.A.h(this.f17959D, attributeSet, i6);
                            androidx.appcompat.widget.c0 c0VarV2 = androidx.appcompat.widget.c0.v(this.f17959D, attributeSet, p090j.j.f49019x2, i6, 0);
                            this.f17964I = c0VarV2.m(p090j.j.f48802B2, -2);
                            hVar.k(c0VarV2.g(p090j.j.f49029z2));
                            hVar.i(c0VarV.o(p090j.j.f48797A2));
                            c0VarV2.w();
                            this.f17963H = hVar;
                            this.f17960E = new androidx.appcompat.widget.A.a(this, hVar);
                        }
                        charSequenceArrQ = c0VarV.q(p090j.j.f49024y2);
                        if (charSequenceArrQ != null) {
                            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(p090j.g.f48778t);
                            setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
                        }
                        c0VarV.w();
                        this.f17962G = true;
                        spinnerAdapter = this.f17961F;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f17961F = null;
                        }
                        this.f17958C.e(attributeSet, i6);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        typedArray = typedArrayObtainStyledAttributes;
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                } catch (java.lang.Exception e10) {
                    typedArrayObtainStyledAttributes = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            if (i10 == 0) {
                androidx.appcompat.widget.A.f fVar2 = new androidx.appcompat.widget.A.f();
                this.f17963H = fVar2;
                fVar2.i(c0VarV.o(p090j.j.f48797A2));
            } else if (i10 == 1) {
                androidx.appcompat.widget.A.h hVar2 = new androidx.appcompat.widget.A.h(this.f17959D, attributeSet, i6);
                androidx.appcompat.widget.c0 c0VarV3 = androidx.appcompat.widget.c0.v(this.f17959D, attributeSet, p090j.j.f49019x2, i6, 0);
                this.f17964I = c0VarV3.m(p090j.j.f48802B2, -2);
                hVar2.k(c0VarV3.g(p090j.j.f49029z2));
                hVar2.i(c0VarV.o(p090j.j.f48797A2));
                c0VarV3.w();
                this.f17963H = hVar2;
                this.f17960E = new androidx.appcompat.widget.A.a(this, hVar2);
            }
            charSequenceArrQ = c0VarV.q(p090j.j.f49024y2);
            if (charSequenceArrQ != null) {
                android.widget.ArrayAdapter arrayAdapter2 = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(p090j.g.f48778t);
                setAdapter((android.widget.SpinnerAdapter) arrayAdapter2);
            }
            c0VarV.w();
            this.f17962G = true;
            spinnerAdapter = this.f17961F;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f17961F = null;
            }
            this.f17958C.e(attributeSet, i6);
        }
        dVar = new androidx.appcompat.view.d(context, theme);
        this.f17959D = dVar;
        android.content.res.TypedArray typedArray2 = null;
        if (i10 == -1) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17957K, i6, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i10 == 0) {
            androidx.appcompat.widget.A.f fVar3 = new androidx.appcompat.widget.A.f();
            this.f17963H = fVar3;
            fVar3.i(c0VarV.o(p090j.j.f48797A2));
        } else if (i10 == 1) {
            androidx.appcompat.widget.A.h hVar3 = new androidx.appcompat.widget.A.h(this.f17959D, attributeSet, i6);
            androidx.appcompat.widget.c0 c0VarV4 = androidx.appcompat.widget.c0.v(this.f17959D, attributeSet, p090j.j.f49019x2, i6, 0);
            this.f17964I = c0VarV4.m(p090j.j.f48802B2, -2);
            hVar3.k(c0VarV4.g(p090j.j.f49029z2));
            hVar3.i(c0VarV.o(p090j.j.f48797A2));
            c0VarV4.w();
            this.f17963H = hVar3;
            this.f17960E = new androidx.appcompat.widget.A.a(this, hVar3);
        }
        charSequenceArrQ = c0VarV.q(p090j.j.f49024y2);
        if (charSequenceArrQ != null) {
            android.widget.ArrayAdapter arrayAdapter3 = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, charSequenceArrQ);
            arrayAdapter3.setDropDownViewResource(p090j.g.f48778t);
            setAdapter((android.widget.SpinnerAdapter) arrayAdapter3);
        }
        c0VarV.w();
        this.f17962G = true;
        spinnerAdapter = this.f17961F;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f17961F = null;
        }
        this.f17958C.e(attributeSet, i6);
    }

    int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = java.lang.Math.max(0, getSelectedItemPosition());
        int iMin = java.lang.Math.min(spinnerAdapter.getCount(), iMax + 15);
        android.view.View view = null;
        int iMax2 = 0;
        for (int iMax3 = java.lang.Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = java.lang.Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f17965J);
        android.graphics.Rect rect = this.f17965J;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f17963H.n(androidx.appcompat.widget.A.d.b(this), androidx.appcompat.widget.A.d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            c1899e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        return jVar != null ? jVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        return jVar != null ? jVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f17963H != null ? this.f17964I : super.getDropDownWidth();
    }

    final androidx.appcompat.widget.A.j getInternalPopup() {
        return this.f17963H;
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        return jVar != null ? jVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.f17959D;
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        return jVar != null ? jVar.f() : super.getPrompt();
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f17963H.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.f17963H == null || android.view.View.MeasureSpec.getMode(i6) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i6)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        androidx.appcompat.widget.A.i iVar = (androidx.appcompat.widget.A.i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f17985C || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new androidx.appcompat.widget.A.b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.A.i iVar = new androidx.appcompat.widget.A.i(super.onSaveInstanceState());
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        iVar.f17985C = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.N n6 = this.f17960E;
        if (n6 == null || !n6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.f17962G) {
            this.f17961F = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f17963H != null) {
            android.content.Context context = this.f17959D;
            if (context == null) {
                context = getContext();
            }
            this.f17963H.p(new androidx.appcompat.widget.A.g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i6);
        } else {
            jVar.m(i6);
            this.f17963H.e(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar != null) {
            jVar.l(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f17963H != null) {
            this.f17964I = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar != null) {
            jVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(p100k.a.b(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.A.j jVar = this.f17963H;
        if (jVar != null) {
            jVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f17958C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }
}
