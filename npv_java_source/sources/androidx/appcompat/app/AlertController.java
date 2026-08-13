package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    androidx.core.widget.NestedScrollView f17366A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17368C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.ImageView f17369D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.widget.TextView f17370E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.TextView f17371F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.view.View f17372G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    android.widget.ListAdapter f17373H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f17375J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f17376K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f17377L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f17378M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f17379N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f17380O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f17381P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    android.os.Handler f17383R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f17385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.appcompat.app.t f17386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.Window f17387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.CharSequence f17389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.CharSequence f17390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    android.widget.ListView f17391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.view.View f17392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17397m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    android.widget.Button f17399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.CharSequence f17400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    android.os.Message f17401q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    android.widget.Button f17403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private java.lang.CharSequence f17404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    android.os.Message f17405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    android.widget.Button f17407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private java.lang.CharSequence f17408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    android.os.Message f17409y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17410z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17398n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f17367B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f17374I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f17382Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.view.View.OnClickListener f17384S = new androidx.appcompat.app.AlertController.a();

    public static class RecycleListView extends android.widget.ListView {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f17411C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f17412D;

        public RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48914c2);
            this.f17412D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p090j.j.f48919d2, -1);
            this.f17411C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p090j.j.f48924e2, -1);
        }

        public void a(boolean z6, boolean z10) {
            if (z10 && z6) {
                return;
            }
            setPadding(getPaddingLeft(), z6 ? getPaddingTop() : this.f17411C, getPaddingRight(), z10 ? getPaddingBottom() : this.f17412D);
        }
    }

    class a implements android.view.View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.os.Message messageObtain;
            android.os.Message message;
            android.os.Message message2;
            androidx.appcompat.app.AlertController alertController = androidx.appcompat.app.AlertController.this;
            if ((view != alertController.f17399o || (message2 = alertController.f17401q) == null) && (view != alertController.f17403s || (message2 = alertController.f17405u) == null)) {
                messageObtain = (view != alertController.f17407w || (message = alertController.f17409y) == null) ? null : android.os.Message.obtain(message);
            } else {
                messageObtain = android.os.Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            androidx.appcompat.app.AlertController alertController2 = androidx.appcompat.app.AlertController.this;
            alertController2.f17383R.obtainMessage(1, alertController2.f17386b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f17414A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f17415B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f17416C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f17417D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f17419F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f17420G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f17421H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public android.content.DialogInterface.OnMultiChoiceClickListener f17423J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public android.database.Cursor f17424K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public java.lang.String f17425L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public java.lang.String f17426M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public android.widget.AdapterView.OnItemSelectedListener f17427N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.Context f17429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.view.LayoutInflater f17430b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public android.graphics.drawable.Drawable f17432d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public java.lang.CharSequence f17434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public android.view.View f17435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public java.lang.CharSequence f17436h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public java.lang.CharSequence f17437i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public android.graphics.drawable.Drawable f17438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public android.content.DialogInterface.OnClickListener f17439k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public java.lang.CharSequence f17440l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public android.graphics.drawable.Drawable f17441m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public android.content.DialogInterface.OnClickListener f17442n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public java.lang.CharSequence f17443o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public android.graphics.drawable.Drawable f17444p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public android.content.DialogInterface.OnClickListener f17445q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public android.content.DialogInterface.OnCancelListener f17447s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public android.content.DialogInterface.OnDismissListener f17448t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public android.content.DialogInterface.OnKeyListener f17449u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public java.lang.CharSequence[] f17450v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public android.widget.ListAdapter f17451w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public android.content.DialogInterface.OnClickListener f17452x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f17453y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public android.view.View f17454z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17431c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17433e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f17418E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f17422I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f17428O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f17446r = true;

        class a extends android.widget.ArrayAdapter {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f17455C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(android.content.Context context, int i6, int i10, java.lang.CharSequence[] charSequenceArr, androidx.appcompat.app.AlertController.RecycleListView recycleListView) {
                super(context, i6, i10, charSequenceArr);
                this.f17455C = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
                android.view.View view2 = super.getView(i6, view, viewGroup);
                boolean[] zArr = androidx.appcompat.app.AlertController.b.this.f17419F;
                if (zArr != null && zArr[i6]) {
                    this.f17455C.setItemChecked(i6, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0337b extends android.widget.CursorAdapter {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final int f17457C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final int f17458D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f17459E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController f17460F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0337b(android.content.Context context, android.database.Cursor cursor, boolean z6, androidx.appcompat.app.AlertController.RecycleListView recycleListView, androidx.appcompat.app.AlertController alertController) {
                super(context, cursor, z6);
                this.f17459E = recycleListView;
                this.f17460F = alertController;
                android.database.Cursor cursor2 = getCursor();
                this.f17457C = cursor2.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.b.this.f17425L);
                this.f17458D = cursor2.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.b.this.f17426M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
                ((android.widget.CheckedTextView) view.findViewById(android.R.id.text1)).setText(cursor.getString(this.f17457C));
                this.f17459E.setItemChecked(cursor.getPosition(), cursor.getInt(this.f17458D) == 1);
            }

            @Override // android.widget.CursorAdapter
            public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
                return androidx.appcompat.app.AlertController.b.this.f17430b.inflate(this.f17460F.f17378M, viewGroup, false);
            }
        }

        class c implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController f17462C;

            c(androidx.appcompat.app.AlertController alertController) {
                this.f17462C = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
                androidx.appcompat.app.AlertController.b.this.f17452x.onClick(this.f17462C.f17386b, i6);
                if (androidx.appcompat.app.AlertController.b.this.f17421H) {
                    return;
                }
                this.f17462C.f17386b.dismiss();
            }
        }

        class d implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController.RecycleListView f17464C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.AlertController f17465D;

            d(androidx.appcompat.app.AlertController.RecycleListView recycleListView, androidx.appcompat.app.AlertController alertController) {
                this.f17464C = recycleListView;
                this.f17465D = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
                boolean[] zArr = androidx.appcompat.app.AlertController.b.this.f17419F;
                if (zArr != null) {
                    zArr[i6] = this.f17464C.isItemChecked(i6);
                }
                androidx.appcompat.app.AlertController.b.this.f17423J.onClick(this.f17465D.f17386b, i6, this.f17464C.isItemChecked(i6));
            }
        }

        public b(android.content.Context context) {
            this.f17429a = context;
            this.f17430b = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        /* JADX WARN: Code duplicated, block: B:36:0x009a  */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x0091, please report this as an issue */
        private void b(androidx.appcompat.app.AlertController alertController) {
            android.widget.ListAdapter dVar;
            android.widget.AdapterView.OnItemClickListener dVar2;
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener;
            int i6;
            androidx.appcompat.app.AlertController.RecycleListView recycleListView = (androidx.appcompat.app.AlertController.RecycleListView) this.f17430b.inflate(alertController.f17377L, (android.view.ViewGroup) null);
            if (this.f17420G) {
                dVar = this.f17424K == null ? new androidx.appcompat.app.AlertController.b.a(this.f17429a, alertController.f17378M, android.R.id.text1, this.f17450v, recycleListView) : new androidx.appcompat.app.AlertController.b.C0337b(this.f17429a, this.f17424K, false, recycleListView, alertController);
            } else {
                int i10 = this.f17421H ? alertController.f17379N : alertController.f17380O;
                if (this.f17424K != null) {
                    dVar = new android.widget.SimpleCursorAdapter(this.f17429a, i10, this.f17424K, new java.lang.String[]{this.f17425L}, new int[]{android.R.id.text1});
                } else {
                    dVar = this.f17451w;
                    if (dVar == null) {
                        dVar = new androidx.appcompat.app.AlertController.d(this.f17429a, i10, android.R.id.text1, this.f17450v);
                    }
                }
            }
            alertController.f17373H = dVar;
            alertController.f17374I = this.f17422I;
            if (this.f17452x == null) {
                if (this.f17423J != null) {
                    dVar2 = new androidx.appcompat.app.AlertController.b.d(recycleListView, alertController);
                }
                onItemSelectedListener = this.f17427N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.f17421H) {
                    i6 = this.f17420G ? 2 : 1;
                    alertController.f17391g = recycleListView;
                }
                recycleListView.setChoiceMode(i6);
                alertController.f17391g = recycleListView;
            }
            dVar2 = new androidx.appcompat.app.AlertController.b.c(alertController);
            recycleListView.setOnItemClickListener(dVar2);
            onItemSelectedListener = this.f17427N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f17421H) {
                if (this.f17420G) {
                }
                alertController.f17391g = recycleListView;
            }
            recycleListView.setChoiceMode(i6);
            alertController.f17391g = recycleListView;
        }

        public void a(androidx.appcompat.app.AlertController alertController) {
            android.view.View view = this.f17435g;
            if (view != null) {
                alertController.k(view);
            } else {
                java.lang.CharSequence charSequence = this.f17434f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                android.graphics.drawable.Drawable drawable = this.f17432d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i6 = this.f17431c;
                if (i6 != 0) {
                    alertController.l(i6);
                }
                int i10 = this.f17433e;
                if (i10 != 0) {
                    alertController.l(alertController.c(i10));
                }
            }
            java.lang.CharSequence charSequence2 = this.f17436h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            java.lang.CharSequence charSequence3 = this.f17437i;
            if (charSequence3 != null || this.f17438j != null) {
                alertController.j(-1, charSequence3, this.f17439k, null, this.f17438j);
            }
            java.lang.CharSequence charSequence4 = this.f17440l;
            if (charSequence4 != null || this.f17441m != null) {
                alertController.j(-2, charSequence4, this.f17442n, null, this.f17441m);
            }
            java.lang.CharSequence charSequence5 = this.f17443o;
            if (charSequence5 != null || this.f17444p != null) {
                alertController.j(-3, charSequence5, this.f17445q, null, this.f17444p);
            }
            if (this.f17450v != null || this.f17424K != null || this.f17451w != null) {
                b(alertController);
            }
            android.view.View view2 = this.f17454z;
            if (view2 != null) {
                if (this.f17418E) {
                    alertController.s(view2, this.f17414A, this.f17415B, this.f17416C, this.f17417D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i11 = this.f17453y;
            if (i11 != 0) {
                alertController.q(i11);
            }
        }
    }

    private static final class c extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.ref.WeakReference f17467a;

        public c(android.content.DialogInterface dialogInterface) {
            this.f17467a = new java.lang.ref.WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i6 = message.what;
            if (i6 == -3 || i6 == -2 || i6 == -1) {
                ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.f17467a.get(), message.what);
            } else {
                if (i6 != 1) {
                    return;
                }
                ((android.content.DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends android.widget.ArrayAdapter {
        public d(android.content.Context context, int i6, int i10, java.lang.CharSequence[] charSequenceArr) {
            super(context, i6, i10, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(android.content.Context context, androidx.appcompat.app.t tVar, android.view.Window window) {
        this.f17385a = context;
        this.f17386b = tVar;
        this.f17387c = window;
        this.f17383R = new androidx.appcompat.app.AlertController.c(tVar);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p090j.j.f48817F, p090j.a.f48634k, 0);
        this.f17375J = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48821G, 0);
        this.f17376K = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48829I, 0);
        this.f17377L = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48837K, 0);
        this.f17378M = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48841L, 0);
        this.f17379N = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48849N, 0);
        this.f17380O = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48833J, 0);
        this.f17381P = typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48845M, true);
        this.f17388d = typedArrayObtainStyledAttributes.getDimensionPixelSize(p090j.j.f48825H, 0);
        typedArrayObtainStyledAttributes.recycle();
        tVar.k(1);
    }

    static boolean a(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private android.view.ViewGroup h(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    private int i() {
        int i6 = this.f17376K;
        return (i6 != 0 && this.f17382Q == 1) ? i6 : this.f17375J;
    }

    private void o(android.view.ViewGroup viewGroup, android.view.View view, int i6, int i10) {
        android.view.View viewFindViewById = this.f17387c.findViewById(p090j.f.f48754v);
        android.view.View viewFindViewById2 = this.f17387c.findViewById(p090j.f.f48753u);
        androidx.core.view.X.D0(view, i6, i10);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(android.view.ViewGroup viewGroup) {
        int i6;
        android.widget.Button button;
        android.widget.Button button2 = (android.widget.Button) viewGroup.findViewById(android.R.id.button1);
        this.f17399o = button2;
        button2.setOnClickListener(this.f17384S);
        if (android.text.TextUtils.isEmpty(this.f17400p) && this.f17402r == null) {
            this.f17399o.setVisibility(8);
            i6 = 0;
        } else {
            this.f17399o.setText(this.f17400p);
            android.graphics.drawable.Drawable drawable = this.f17402r;
            if (drawable != null) {
                int i10 = this.f17388d;
                drawable.setBounds(0, 0, i10, i10);
                this.f17399o.setCompoundDrawables(this.f17402r, null, null, null);
            }
            this.f17399o.setVisibility(0);
            i6 = 1;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroup.findViewById(android.R.id.button2);
        this.f17403s = button3;
        button3.setOnClickListener(this.f17384S);
        if (android.text.TextUtils.isEmpty(this.f17404t) && this.f17406v == null) {
            this.f17403s.setVisibility(8);
        } else {
            this.f17403s.setText(this.f17404t);
            android.graphics.drawable.Drawable drawable2 = this.f17406v;
            if (drawable2 != null) {
                int i11 = this.f17388d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f17403s.setCompoundDrawables(this.f17406v, null, null, null);
            }
            this.f17403s.setVisibility(0);
            i6 |= 2;
        }
        android.widget.Button button4 = (android.widget.Button) viewGroup.findViewById(android.R.id.button3);
        this.f17407w = button4;
        button4.setOnClickListener(this.f17384S);
        if (android.text.TextUtils.isEmpty(this.f17408x) && this.f17410z == null) {
            this.f17407w.setVisibility(8);
        } else {
            this.f17407w.setText(this.f17408x);
            android.graphics.drawable.Drawable drawable3 = this.f17410z;
            if (drawable3 != null) {
                int i12 = this.f17388d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f17407w.setCompoundDrawables(this.f17410z, null, null, null);
            }
            this.f17407w.setVisibility(0);
            i6 |= 4;
        }
        if (y(this.f17385a)) {
            if (i6 == 1) {
                button = this.f17399o;
            } else if (i6 == 2) {
                button = this.f17403s;
            } else if (i6 == 4) {
                button = this.f17407w;
            }
            b(button);
        }
        if (i6 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(android.view.ViewGroup viewGroup) {
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) this.f17387c.findViewById(p090j.f.f48755w);
        this.f17366A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f17366A.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.message);
        this.f17371F = textView;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.f17390f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f17366A.removeView(this.f17371F);
        if (this.f17391g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f17366A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f17366A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f17391g, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    private void v(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = this.f17392h;
        if (viewInflate == null) {
            viewInflate = this.f17393i != 0 ? android.view.LayoutInflater.from(this.f17385a).inflate(this.f17393i, viewGroup, false) : null;
        }
        boolean z6 = viewInflate != null;
        if (!z6 || !a(viewInflate)) {
            this.f17387c.setFlags(131072, 131072);
        }
        if (!z6) {
            viewGroup.setVisibility(8);
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f17387c.findViewById(p090j.f.f48746n);
        frameLayout.addView(viewInflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        if (this.f17398n) {
            frameLayout.setPadding(this.f17394j, this.f17395k, this.f17396l, this.f17397m);
        }
        if (this.f17391g != null) {
            ((android.widget.LinearLayout.LayoutParams) ((androidx.appcompat.widget.O.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(android.view.ViewGroup viewGroup) {
        android.view.View viewFindViewById;
        if (this.f17372G != null) {
            viewGroup.addView(this.f17372G, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f17387c.findViewById(p090j.f.f48731O);
        } else {
            this.f17369D = (android.widget.ImageView) this.f17387c.findViewById(android.R.id.icon);
            if ((!android.text.TextUtils.isEmpty(this.f17389e)) && this.f17381P) {
                android.widget.TextView textView = (android.widget.TextView) this.f17387c.findViewById(p090j.f.f48742j);
                this.f17370E = textView;
                textView.setText(this.f17389e);
                int i6 = this.f17367B;
                if (i6 != 0) {
                    this.f17369D.setImageResource(i6);
                    return;
                }
                android.graphics.drawable.Drawable drawable = this.f17368C;
                if (drawable != null) {
                    this.f17369D.setImageDrawable(drawable);
                    return;
                } else {
                    this.f17370E.setPadding(this.f17369D.getPaddingLeft(), this.f17369D.getPaddingTop(), this.f17369D.getPaddingRight(), this.f17369D.getPaddingBottom());
                    this.f17369D.setVisibility(8);
                    return;
                }
            }
            this.f17387c.findViewById(p090j.f.f48731O).setVisibility(8);
            this.f17369D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[PHI: r1
  0x00a5: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v13 android.view.View) binds: [B:36:0x00a3, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        android.view.View viewFindViewById;
        android.widget.ListAdapter listAdapter;
        android.view.View viewFindViewById2;
        android.view.View viewFindViewById3 = this.f17387c.findViewById(p090j.f.f48752t);
        android.view.View viewFindViewById4 = viewFindViewById3.findViewById(p090j.f.f48732P);
        android.view.View viewFindViewById5 = viewFindViewById3.findViewById(p090j.f.f48745m);
        android.view.View viewFindViewById6 = viewFindViewById3.findViewById(p090j.f.f48743k);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.findViewById(p090j.f.f48747o);
        v(viewGroup);
        android.view.View viewFindViewById7 = viewGroup.findViewById(p090j.f.f48732P);
        android.view.View viewFindViewById8 = viewGroup.findViewById(p090j.f.f48745m);
        android.view.View viewFindViewById9 = viewGroup.findViewById(p090j.f.f48743k);
        android.view.ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        android.view.ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z6 = viewGroup.getVisibility() != 8;
        boolean z10 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z11 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z11 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(p090j.f.f48727K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z10 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView = this.f17366A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            viewFindViewById = (this.f17390f == null && this.f17391g == null) ? null : viewGroupH.findViewById(p090j.f.f48730N);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(p090j.f.f48728L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        android.widget.ListView listView = this.f17391g;
        if (listView instanceof androidx.appcompat.app.AlertController.RecycleListView) {
            ((androidx.appcompat.app.AlertController.RecycleListView) listView).a(z10, z11);
        }
        if (!z6) {
            android.view.View view = this.f17391g;
            if (view == null) {
                view = this.f17366A;
            }
            if (view != null) {
                o(viewGroupH2, view, z10 | (z11 ? 2 : 0), 3);
            }
        }
        android.widget.ListView listView2 = this.f17391g;
        if (listView2 == null || (listAdapter = this.f17373H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i6 = this.f17374I;
        if (i6 > -1) {
            listView2.setItemChecked(i6, true);
            listView2.setSelection(i6);
        }
    }

    private static boolean y(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(p090j.a.f48633j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i6) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.f17385a.getTheme().resolveAttribute(i6, typedValue, true);
        return typedValue.resourceId;
    }

    public android.widget.ListView d() {
        return this.f17391g;
    }

    public void e() {
        this.f17386b.setContentView(i());
        x();
    }

    public boolean f(int i6, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f17366A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i6, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f17366A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i6, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener, android.os.Message message, android.graphics.drawable.Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f17383R.obtainMessage(i6, onClickListener);
        }
        if (i6 == -3) {
            this.f17408x = charSequence;
            this.f17409y = message;
            this.f17410z = drawable;
        } else if (i6 == -2) {
            this.f17404t = charSequence;
            this.f17405u = message;
            this.f17406v = drawable;
        } else {
            if (i6 != -1) {
                throw new java.lang.IllegalArgumentException("Button does not exist");
            }
            this.f17400p = charSequence;
            this.f17401q = message;
            this.f17402r = drawable;
        }
    }

    public void k(android.view.View view) {
        this.f17372G = view;
    }

    public void l(int i6) {
        this.f17368C = null;
        this.f17367B = i6;
        android.widget.ImageView imageView = this.f17369D;
        if (imageView != null) {
            if (i6 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f17369D.setImageResource(this.f17367B);
            }
        }
    }

    public void m(android.graphics.drawable.Drawable drawable) {
        this.f17368C = drawable;
        this.f17367B = 0;
        android.widget.ImageView imageView = this.f17369D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f17369D.setImageDrawable(drawable);
            }
        }
    }

    public void n(java.lang.CharSequence charSequence) {
        this.f17390f = charSequence;
        android.widget.TextView textView = this.f17371F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(java.lang.CharSequence charSequence) {
        this.f17389e = charSequence;
        android.widget.TextView textView = this.f17370E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i6) {
        this.f17392h = null;
        this.f17393i = i6;
        this.f17398n = false;
    }

    public void r(android.view.View view) {
        this.f17392h = view;
        this.f17393i = 0;
        this.f17398n = false;
    }

    public void s(android.view.View view, int i6, int i10, int i11, int i12) {
        this.f17392h = view;
        this.f17393i = 0;
        this.f17398n = true;
        this.f17394j = i6;
        this.f17395k = i10;
        this.f17396l = i11;
        this.f17397m = i12;
    }
}
