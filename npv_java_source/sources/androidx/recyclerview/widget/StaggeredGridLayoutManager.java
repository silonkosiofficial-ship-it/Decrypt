package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.p implements androidx.recyclerview.widget.RecyclerView.z.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private java.util.BitSet f23233B;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23238G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f23239H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.e f23240I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f23241J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f23246O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    androidx.recyclerview.widget.StaggeredGridLayoutManager.f[] f23249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.recyclerview.widget.i f23250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.recyclerview.widget.i f23251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f23254y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23248s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f23255z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f23232A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f23234C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f23235D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.recyclerview.widget.StaggeredGridLayoutManager.d f23236E = new androidx.recyclerview.widget.StaggeredGridLayoutManager.d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f23237F = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final android.graphics.Rect f23242K = new android.graphics.Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.b f23243L = new androidx.recyclerview.widget.StaggeredGridLayoutManager.b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f23244M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f23245N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final java.lang.Runnable f23247P = new androidx.recyclerview.widget.StaggeredGridLayoutManager.a();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.this.W1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f23260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f23261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f23262f;

        b() {
            c();
        }

        void a() {
            this.f23258b = this.f23259c ? androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.i() : androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.m();
        }

        void b(int i6) {
            this.f23258b = this.f23259c ? androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.i() - i6 : androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.m() + i6;
        }

        void c() {
            this.f23257a = -1;
            this.f23258b = Integer.MIN_VALUE;
            this.f23259c = false;
            this.f23260d = false;
            this.f23261e = false;
            int[] iArr = this.f23262f;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
        }

        void d(androidx.recyclerview.widget.StaggeredGridLayoutManager.f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f23262f;
            if (iArr == null || iArr.length < length) {
                this.f23262f = new int[androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23249t.length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                this.f23262f[i6] = fVarArr[i6].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends androidx.recyclerview.widget.RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.StaggeredGridLayoutManager.f f23264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f23265f;

        public c(int i6, int i10) {
            super(i6, i10);
        }

        public c(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public boolean e() {
            return this.f23265f;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f23266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.List f23267b;

        static class a implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a> CREATOR = new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a.C0435a();

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            int f23268C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            int f23269D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            int[] f23270E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            boolean f23271F;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0435a implements android.os.Parcelable.Creator {
                C0435a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a createFromParcel(android.os.Parcel parcel) {
                    return new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a[] newArray(int i6) {
                    return new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a[i6];
                }
            }

            a() {
            }

            a(android.os.Parcel parcel) {
                this.f23268C = parcel.readInt();
                this.f23269D = parcel.readInt();
                this.f23271F = parcel.readInt() == 1;
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    this.f23270E = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i6) {
                int[] iArr = this.f23270E;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i6];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public java.lang.String toString() {
                return "FullSpanItem{mPosition=" + this.f23268C + ", mGapDir=" + this.f23269D + ", mHasUnwantedGapAfter=" + this.f23271F + ", mGapPerSpan=" + java.util.Arrays.toString(this.f23270E) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i6) {
                parcel.writeInt(this.f23268C);
                parcel.writeInt(this.f23269D);
                parcel.writeInt(this.f23271F ? 1 : 0);
                int[] iArr = this.f23270E;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f23270E);
                }
            }
        }

        d() {
        }

        private int i(int i6) {
            if (this.f23267b == null) {
                return -1;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarF = f(i6);
            if (aVarF != null) {
                this.f23267b.remove(aVarF);
            }
            int size = this.f23267b.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(i10)).f23268C >= i6) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return -1;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(i10);
            this.f23267b.remove(i10);
            return aVar.f23268C;
        }

        private void l(int i6, int i10) {
            java.util.List list = this.f23267b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(size);
                int i11 = aVar.f23268C;
                if (i11 >= i6) {
                    aVar.f23268C = i11 + i10;
                }
            }
        }

        private void m(int i6, int i10) {
            java.util.List list = this.f23267b;
            if (list == null) {
                return;
            }
            int i11 = i6 + i10;
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(size);
                int i12 = aVar.f23268C;
                if (i12 >= i6) {
                    if (i12 < i11) {
                        this.f23267b.remove(size);
                    } else {
                        aVar.f23268C = i12 - i10;
                    }
                }
            }
        }

        public void a(androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar) {
            if (this.f23267b == null) {
                this.f23267b = new java.util.ArrayList();
            }
            int size = this.f23267b.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(i6);
                if (aVar2.f23268C == aVar.f23268C) {
                    this.f23267b.remove(i6);
                }
                if (aVar2.f23268C >= aVar.f23268C) {
                    this.f23267b.add(i6, aVar);
                    return;
                }
            }
            this.f23267b.add(aVar);
        }

        void b() {
            int[] iArr = this.f23266a;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            this.f23267b = null;
        }

        void c(int i6) {
            int[] iArr = this.f23266a;
            if (iArr == null) {
                int[] iArr2 = new int[java.lang.Math.max(i6, 10) + 1];
                this.f23266a = iArr2;
                java.util.Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[o(i6)];
                this.f23266a = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f23266a;
                java.util.Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i6) {
            java.util.List list = this.f23267b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(size)).f23268C >= i6) {
                        this.f23267b.remove(size);
                    }
                }
            }
            return h(i6);
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a e(int i6, int i10, int i11, boolean z6) {
            java.util.List list = this.f23267b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(i12);
                int i13 = aVar.f23268C;
                if (i13 >= i10) {
                    return null;
                }
                if (i13 >= i6 && (i11 == 0 || aVar.f23269D == i11 || (z6 && aVar.f23271F))) {
                    return aVar;
                }
            }
            return null;
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a f(int i6) {
            java.util.List list = this.f23267b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) this.f23267b.get(size);
                if (aVar.f23268C == i6) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i6) {
            int[] iArr = this.f23266a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            return iArr[i6];
        }

        int h(int i6) {
            int[] iArr = this.f23266a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            int i10 = i(i6);
            if (i10 == -1) {
                int[] iArr2 = this.f23266a;
                java.util.Arrays.fill(iArr2, i6, iArr2.length, -1);
                return this.f23266a.length;
            }
            int iMin = java.lang.Math.min(i10 + 1, this.f23266a.length);
            java.util.Arrays.fill(this.f23266a, i6, iMin, -1);
            return iMin;
        }

        void j(int i6, int i10) {
            int[] iArr = this.f23266a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i11 = i6 + i10;
            c(i11);
            int[] iArr2 = this.f23266a;
            java.lang.System.arraycopy(iArr2, i6, iArr2, i11, (iArr2.length - i6) - i10);
            java.util.Arrays.fill(this.f23266a, i6, i11, -1);
            l(i6, i10);
        }

        void k(int i6, int i10) {
            int[] iArr = this.f23266a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i11 = i6 + i10;
            c(i11);
            int[] iArr2 = this.f23266a;
            java.lang.System.arraycopy(iArr2, i11, iArr2, i6, (iArr2.length - i6) - i10);
            int[] iArr3 = this.f23266a;
            java.util.Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            m(i6, i10);
        }

        void n(int i6, androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar) {
            c(i6);
            this.f23266a[i6] = fVar.f23286e;
        }

        int o(int i6) {
            int length = this.f23266a.length;
            while (length <= i6) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.e> CREATOR = new androidx.recyclerview.widget.StaggeredGridLayoutManager.e.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f23272C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f23273D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f23274E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int[] f23275F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f23276G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int[] f23277H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.util.List f23278I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        boolean f23279J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        boolean f23280K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        boolean f23281L;

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.e createFromParcel(android.os.Parcel parcel) {
                return new androidx.recyclerview.widget.StaggeredGridLayoutManager.e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.e[] newArray(int i6) {
                return new androidx.recyclerview.widget.StaggeredGridLayoutManager.e[i6];
            }
        }

        public e() {
        }

        e(android.os.Parcel parcel) {
            this.f23272C = parcel.readInt();
            this.f23273D = parcel.readInt();
            int i6 = parcel.readInt();
            this.f23274E = i6;
            if (i6 > 0) {
                int[] iArr = new int[i6];
                this.f23275F = iArr;
                parcel.readIntArray(iArr);
            }
            int i10 = parcel.readInt();
            this.f23276G = i10;
            if (i10 > 0) {
                int[] iArr2 = new int[i10];
                this.f23277H = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f23279J = parcel.readInt() == 1;
            this.f23280K = parcel.readInt() == 1;
            this.f23281L = parcel.readInt() == 1;
            this.f23278I = parcel.readArrayList(androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a.class.getClassLoader());
        }

        public e(androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar) {
            this.f23274E = eVar.f23274E;
            this.f23272C = eVar.f23272C;
            this.f23273D = eVar.f23273D;
            this.f23275F = eVar.f23275F;
            this.f23276G = eVar.f23276G;
            this.f23277H = eVar.f23277H;
            this.f23279J = eVar.f23279J;
            this.f23280K = eVar.f23280K;
            this.f23281L = eVar.f23281L;
            this.f23278I = eVar.f23278I;
        }

        void a() {
            this.f23275F = null;
            this.f23274E = 0;
            this.f23272C = -1;
            this.f23273D = -1;
        }

        void b() {
            this.f23275F = null;
            this.f23274E = 0;
            this.f23276G = 0;
            this.f23277H = null;
            this.f23278I = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            parcel.writeInt(this.f23272C);
            parcel.writeInt(this.f23273D);
            parcel.writeInt(this.f23274E);
            if (this.f23274E > 0) {
                parcel.writeIntArray(this.f23275F);
            }
            parcel.writeInt(this.f23276G);
            if (this.f23276G > 0) {
                parcel.writeIntArray(this.f23277H);
            }
            parcel.writeInt(this.f23279J ? 1 : 0);
            parcel.writeInt(this.f23280K ? 1 : 0);
            parcel.writeInt(this.f23281L ? 1 : 0);
            parcel.writeList(this.f23278I);
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.ArrayList f23282a = new java.util.ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23283b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23284c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23285d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f23286e;

        f(int i6) {
            this.f23286e = i6;
        }

        void a(android.view.View view) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            cVarN.f23264e = this;
            this.f23282a.add(view);
            this.f23284c = Integer.MIN_VALUE;
            if (this.f23282a.size() == 1) {
                this.f23283b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f23285d += androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.e(view);
            }
        }

        void b(boolean z6, int i6) {
            int iL = z6 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z6 || iL >= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.i()) {
                if (z6 || iL <= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.m()) {
                    if (i6 != Integer.MIN_VALUE) {
                        iL += i6;
                    }
                    this.f23284c = iL;
                    this.f23283b = iL;
                }
            }
        }

        void c() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarF;
            java.util.ArrayList arrayList = this.f23282a;
            android.view.View view = (android.view.View) arrayList.get(arrayList.size() - 1);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            this.f23284c = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.d(view);
            if (cVarN.f23265f && (aVarF = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23236E.f(cVarN.a())) != null && aVarF.f23269D == 1) {
                this.f23284c += aVarF.a(this.f23286e);
            }
        }

        void d() {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarF;
            android.view.View view = (android.view.View) this.f23282a.get(0);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            this.f23283b = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.g(view);
            if (cVarN.f23265f && (aVarF = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23236E.f(cVarN.a())) != null && aVarF.f23269D == -1) {
                this.f23283b -= aVarF.a(this.f23286e);
            }
        }

        void e() {
            this.f23282a.clear();
            q();
            this.f23285d = 0;
        }

        public int f() {
            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23255z ? i(this.f23282a.size() - 1, -1, true) : i(0, this.f23282a.size(), true);
        }

        public int g() {
            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23255z ? i(0, this.f23282a.size(), true) : i(this.f23282a.size() - 1, -1, true);
        }

        int h(int i6, int i10, boolean z6, boolean z10, boolean z11) {
            int iM = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.m();
            int i11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.i();
            int i12 = i10 > i6 ? 1 : -1;
            while (i6 != i10) {
                android.view.View view = (android.view.View) this.f23282a.get(i6);
                int iG = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.g(view);
                int iD = androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.d(view);
                boolean z12 = false;
                boolean z13 = !z11 ? iG >= i11 : iG > i11;
                if (!z11 ? iD > iM : iD >= iM) {
                    z12 = true;
                }
                if (z13 && z12) {
                    if (z6 && z10) {
                        if (iG >= iM && iD <= i11) {
                            return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else if (z10 || iG < iM || iD > i11) {
                        return androidx.recyclerview.widget.StaggeredGridLayoutManager.this.l0(view);
                    }
                }
                i6 += i12;
            }
            return -1;
        }

        int i(int i6, int i10, boolean z6) {
            return h(i6, i10, false, false, z6);
        }

        public int j() {
            return this.f23285d;
        }

        int k() {
            int i6 = this.f23284c;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            c();
            return this.f23284c;
        }

        int l(int i6) {
            int i10 = this.f23284c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f23282a.size() == 0) {
                return i6;
            }
            c();
            return this.f23284c;
        }

        public android.view.View m(int i6, int i10) {
            android.view.View view = null;
            if (i10 != -1) {
                int size = this.f23282a.size() - 1;
                while (size >= 0) {
                    android.view.View view2 = (android.view.View) this.f23282a.get(size);
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = androidx.recyclerview.widget.StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f23255z && staggeredGridLayoutManager.l0(view2) >= i6) {
                        break;
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager2 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f23255z && staggeredGridLayoutManager2.l0(view2) <= i6) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f23282a.size();
                int i11 = 0;
                while (i11 < size2) {
                    android.view.View view3 = (android.view.View) this.f23282a.get(i11);
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager3 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f23255z && staggeredGridLayoutManager3.l0(view3) <= i6) {
                        break;
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager4 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f23255z && staggeredGridLayoutManager4.l0(view3) >= i6) || !view3.hasFocusable()) {
                        break;
                    }
                    i11++;
                    view = view3;
                }
            }
            return view;
        }

        androidx.recyclerview.widget.StaggeredGridLayoutManager.c n(android.view.View view) {
            return (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) view.getLayoutParams();
        }

        int o() {
            int i6 = this.f23283b;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            d();
            return this.f23283b;
        }

        int p(int i6) {
            int i10 = this.f23283b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f23282a.size() == 0) {
                return i6;
            }
            d();
            return this.f23283b;
        }

        void q() {
            this.f23283b = Integer.MIN_VALUE;
            this.f23284c = Integer.MIN_VALUE;
        }

        void r(int i6) {
            int i10 = this.f23283b;
            if (i10 != Integer.MIN_VALUE) {
                this.f23283b = i10 + i6;
            }
            int i11 = this.f23284c;
            if (i11 != Integer.MIN_VALUE) {
                this.f23284c = i11 + i6;
            }
        }

        void s() {
            int size = this.f23282a.size();
            android.view.View view = (android.view.View) this.f23282a.remove(size - 1);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            cVarN.f23264e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f23285d -= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.e(view);
            }
            if (size == 1) {
                this.f23283b = Integer.MIN_VALUE;
            }
            this.f23284c = Integer.MIN_VALUE;
        }

        void t() {
            android.view.View view = (android.view.View) this.f23282a.remove(0);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            cVarN.f23264e = null;
            if (this.f23282a.size() == 0) {
                this.f23284c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f23285d -= androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.e(view);
            }
            this.f23283b = Integer.MIN_VALUE;
        }

        void u(android.view.View view) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVarN = n(view);
            cVarN.f23264e = this;
            this.f23282a.add(0, view);
            this.f23283b = Integer.MIN_VALUE;
            if (this.f23282a.size() == 1) {
                this.f23284c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f23285d += androidx.recyclerview.widget.StaggeredGridLayoutManager.this.f23250u.e(view);
            }
        }

        void v(int i6) {
            this.f23283b = i6;
            this.f23284c = i6;
        }
    }

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p.d dVarM0 = androidx.recyclerview.widget.RecyclerView.p.m0(context, attributeSet, i6, i10);
        L2(dVarM0.f23193a);
        N2(dVarM0.f23194b);
        M2(dVarM0.f23195c);
        this.f23254y = new androidx.recyclerview.widget.f();
        e2();
    }

    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    private void A2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        boolean z10;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.b bVar = this.f23243L;
        if (!(this.f23240I == null && this.f23234C == -1) && a6.b() == 0) {
            o1(vVar);
            bVar.c();
            return;
        }
        boolean z11 = (bVar.f23261e && this.f23234C == -1 && this.f23240I == null) ? false : true;
        if (z11) {
            bVar.c();
            if (this.f23240I != null) {
                R1(bVar);
            } else {
                I2();
                bVar.f23259c = this.f23232A;
            }
            R2(a6, bVar);
            bVar.f23261e = true;
        }
        if (this.f23240I == null && this.f23234C == -1 && (bVar.f23259c != this.f23238G || x2() != this.f23239H)) {
            this.f23236E.b();
            bVar.f23260d = true;
        }
        if (O() > 0 && ((eVar = this.f23240I) == null || eVar.f23274E < 1)) {
            if (bVar.f23260d) {
                for (int i6 = 0; i6 < this.f23248s; i6++) {
                    this.f23249t[i6].e();
                    int i10 = bVar.f23258b;
                    if (i10 != Integer.MIN_VALUE) {
                        this.f23249t[i6].v(i10);
                    }
                }
            } else if (z11 || this.f23243L.f23262f == null) {
                for (int i11 = 0; i11 < this.f23248s; i11++) {
                    this.f23249t[i11].b(this.f23232A, bVar.f23258b);
                }
                this.f23243L.d(this.f23249t);
            } else {
                for (int i12 = 0; i12 < this.f23248s; i12++) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar = this.f23249t[i12];
                    fVar.e();
                    fVar.v(this.f23243L.f23262f[i12]);
                }
            }
        }
        B(vVar);
        this.f23254y.f23407a = false;
        this.f23244M = false;
        T2(this.f23251v.n());
        S2(bVar.f23257a, a6);
        if (bVar.f23259c) {
            K2(-1);
            f2(vVar, this.f23254y, a6);
            K2(1);
        } else {
            K2(1);
            f2(vVar, this.f23254y, a6);
            K2(-1);
        }
        androidx.recyclerview.widget.f fVar2 = this.f23254y;
        fVar2.f23409c = bVar.f23257a + fVar2.f23410d;
        f2(vVar, fVar2, a6);
        H2();
        if (O() > 0) {
            if (this.f23232A) {
                l2(vVar, a6, true);
                m2(vVar, a6, false);
            } else {
                m2(vVar, a6, true);
                l2(vVar, a6, false);
            }
        }
        if (z6 && !a6.e() && this.f23237F != 0 && O() > 0 && (this.f23244M || v2() != null)) {
            s1(this.f23247P);
            z10 = W1();
        }
        if (a6.e()) {
            this.f23243L.c();
        }
        this.f23238G = bVar.f23259c;
        this.f23239H = x2();
        if (z10) {
            this.f23243L.c();
            A2(vVar, a6, false);
        }
    }

    private boolean B2(int i6) {
        if (this.f23252w == 0) {
            return (i6 == -1) != this.f23232A;
        }
        return ((i6 == -1) == this.f23232A) == x2();
    }

    private void D2(android.view.View view) {
        for (int i6 = this.f23248s - 1; i6 >= 0; i6--) {
            this.f23249t[i6].u(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f23411e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void E2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f23407a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f23415i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f23408b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f23411e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f23413g
        L14:
            r2.F2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f23412f
        L1a:
            r2.G2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f23411e
            if (r0 != r1) goto L37
            int r0 = r4.f23412f
            int r1 = r2.q2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f23413g
            int r4 = r4.f23408b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f23413g
            int r0 = r2.r2(r0)
            int r1 = r4.f23413g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f23412f
            int r4 = r4.f23408b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void F2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            android.view.View viewN = N(iO);
            if (this.f23250u.g(viewN) < i6 || this.f23250u.q(viewN) < i6) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN.getLayoutParams();
            if (cVar.f23265f) {
                for (int i10 = 0; i10 < this.f23248s; i10++) {
                    if (this.f23249t[i10].f23282a.size() == 1) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < this.f23248s; i11++) {
                    this.f23249t[i11].s();
                }
            } else if (cVar.f23264e.f23282a.size() == 1) {
                return;
            } else {
                cVar.f23264e.s();
            }
            q1(viewN, vVar);
        }
    }

    private void G2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6) {
        while (O() > 0) {
            android.view.View viewN = N(0);
            if (this.f23250u.d(viewN) > i6 || this.f23250u.p(viewN) > i6) {
                return;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN.getLayoutParams();
            if (cVar.f23265f) {
                for (int i10 = 0; i10 < this.f23248s; i10++) {
                    if (this.f23249t[i10].f23282a.size() == 1) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < this.f23248s; i11++) {
                    this.f23249t[i11].t();
                }
            } else if (cVar.f23264e.f23282a.size() == 1) {
                return;
            } else {
                cVar.f23264e.t();
            }
            q1(viewN, vVar);
        }
    }

    private void H2() {
        if (this.f23251v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i6 = 0; i6 < iO; i6++) {
            android.view.View viewN = N(i6);
            float fE = this.f23251v.e(viewN);
            if (fE >= fMax) {
                if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f23248s;
                }
                fMax = java.lang.Math.max(fMax, fE);
            }
        }
        int i10 = this.f23253x;
        int iRound = java.lang.Math.round(fMax * this.f23248s);
        if (this.f23251v.k() == Integer.MIN_VALUE) {
            iRound = java.lang.Math.min(iRound, this.f23251v.n());
        }
        T2(iRound);
        if (this.f23253x == i10) {
            return;
        }
        for (int i11 = 0; i11 < iO; i11++) {
            android.view.View viewN2 = N(i11);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN2.getLayoutParams();
            if (!cVar.f23265f) {
                if (x2() && this.f23252w == 1) {
                    int i12 = this.f23248s;
                    int i13 = cVar.f23264e.f23286e;
                    viewN2.offsetLeftAndRight(((-((i12 - 1) - i13)) * this.f23253x) - ((-((i12 - 1) - i13)) * i10));
                } else {
                    int i14 = cVar.f23264e.f23286e;
                    int i15 = this.f23252w;
                    int i16 = (this.f23253x * i14) - (i14 * i10);
                    if (i15 == 1) {
                        viewN2.offsetLeftAndRight(i16);
                    } else {
                        viewN2.offsetTopAndBottom(i16);
                    }
                }
            }
        }
    }

    private void I2() {
        this.f23232A = (this.f23252w == 1 || !x2()) ? this.f23255z : !this.f23255z;
    }

    private void K2(int i6) {
        androidx.recyclerview.widget.f fVar = this.f23254y;
        fVar.f23411e = i6;
        fVar.f23410d = this.f23232A != (i6 == -1) ? -1 : 1;
    }

    private void O2(int i6, int i10) {
        for (int i11 = 0; i11 < this.f23248s; i11++) {
            if (!this.f23249t[i11].f23282a.isEmpty()) {
                U2(this.f23249t[i11], i6, i10);
            }
        }
    }

    private boolean P2(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.StaggeredGridLayoutManager.b bVar) {
        boolean z6 = this.f23238G;
        int iB = a6.b();
        bVar.f23257a = z6 ? k2(iB) : g2(iB);
        bVar.f23258b = Integer.MIN_VALUE;
        return true;
    }

    private void Q1(android.view.View view) {
        for (int i6 = this.f23248s - 1; i6 >= 0; i6--) {
            this.f23249t[i6].a(view);
        }
    }

    private void R1(androidx.recyclerview.widget.StaggeredGridLayoutManager.b bVar) {
        boolean z6;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = this.f23240I;
        int i6 = eVar.f23274E;
        if (i6 > 0) {
            if (i6 == this.f23248s) {
                for (int i10 = 0; i10 < this.f23248s; i10++) {
                    this.f23249t[i10].e();
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar2 = this.f23240I;
                    int i11 = eVar2.f23275F[i10];
                    if (i11 != Integer.MIN_VALUE) {
                        i11 += eVar2.f23280K ? this.f23250u.i() : this.f23250u.m();
                    }
                    this.f23249t[i10].v(i11);
                }
            } else {
                eVar.b();
                androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar3 = this.f23240I;
                eVar3.f23272C = eVar3.f23273D;
            }
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar4 = this.f23240I;
        this.f23239H = eVar4.f23281L;
        M2(eVar4.f23279J);
        I2();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar5 = this.f23240I;
        int i12 = eVar5.f23272C;
        if (i12 != -1) {
            this.f23234C = i12;
            z6 = eVar5.f23280K;
        } else {
            z6 = this.f23232A;
        }
        bVar.f23259c = z6;
        if (eVar5.f23276G > 1) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d dVar = this.f23236E;
            dVar.f23266a = eVar5.f23277H;
            dVar.f23267b = eVar5.f23278I;
        }
    }

    private void S2(int i6, androidx.recyclerview.widget.RecyclerView.A a6) {
        int iN;
        int iN2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f23254y;
        boolean z6 = false;
        fVar.f23408b = 0;
        fVar.f23409c = i6;
        if (!B0() || (iC = a6.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f23232A == (iC < i6)) {
                iN = this.f23250u.n();
                iN2 = 0;
            } else {
                iN2 = this.f23250u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f23254y.f23412f = this.f23250u.m() - iN2;
            this.f23254y.f23413g = this.f23250u.i() + iN;
        } else {
            this.f23254y.f23413g = this.f23250u.h() + iN;
            this.f23254y.f23412f = -iN2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f23254y;
        fVar2.f23414h = false;
        fVar2.f23407a = true;
        if (this.f23250u.k() == 0 && this.f23250u.h() == 0) {
            z6 = true;
        }
        fVar2.f23415i = z6;
    }

    private void U1(android.view.View view, androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f23411e == 1) {
            if (cVar.f23265f) {
                Q1(view);
                return;
            } else {
                cVar.f23264e.a(view);
                return;
            }
        }
        if (cVar.f23265f) {
            D2(view);
        } else {
            cVar.f23264e.u(view);
        }
    }

    private void U2(androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar, int i6, int i10) {
        int iJ = fVar.j();
        if (i6 == -1) {
            if (fVar.o() + iJ > i10) {
                return;
            }
        } else if (fVar.k() - iJ < i10) {
            return;
        }
        this.f23233B.set(fVar.f23286e, false);
    }

    private int V1(int i6) {
        if (O() == 0) {
            return this.f23232A ? 1 : -1;
        }
        return (i6 < n2()) != this.f23232A ? -1 : 1;
    }

    private int V2(int i6, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i6;
        }
        int mode = android.view.View.MeasureSpec.getMode(i6);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i6) - i10) - i11), mode) : i6;
    }

    private boolean X1(androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar) {
        if (this.f23232A) {
            if (fVar.k() < this.f23250u.i()) {
                java.util.ArrayList arrayList = fVar.f23282a;
                return !fVar.n((android.view.View) arrayList.get(arrayList.size() - 1)).f23265f;
            }
        } else if (fVar.o() > this.f23250u.m()) {
            return !fVar.n((android.view.View) fVar.f23282a.get(0)).f23265f;
        }
        return false;
    }

    private int Y1(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.l.a(a6, this.f23250u, i2(!this.f23245N), h2(!this.f23245N), this, this.f23245N);
    }

    private int Z1(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.l.b(a6, this.f23250u, i2(!this.f23245N), h2(!this.f23245N), this, this.f23245N, this.f23232A);
    }

    private int a2(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0) {
            return 0;
        }
        return androidx.recyclerview.widget.l.c(a6, this.f23250u, i2(!this.f23245N), h2(!this.f23245N), this, this.f23245N);
    }

    private int b2(int i6) {
        if (i6 == 1) {
            return (this.f23252w != 1 && x2()) ? 1 : -1;
        }
        if (i6 == 2) {
            return (this.f23252w != 1 && x2()) ? -1 : 1;
        }
        if (i6 == 17) {
            return this.f23252w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i6 == 33) {
            return this.f23252w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i6 != 66) {
            return (i6 == 130 && this.f23252w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f23252w == 0 ? 1 : Integer.MIN_VALUE;
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a c2(int i6) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a();
        aVar.f23270E = new int[this.f23248s];
        for (int i10 = 0; i10 < this.f23248s; i10++) {
            aVar.f23270E[i10] = i6 - this.f23249t[i10].l(i6);
        }
        return aVar;
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a d2(int i6) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVar = new androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a();
        aVar.f23270E = new int[this.f23248s];
        for (int i10 = 0; i10 < this.f23248s; i10++) {
            aVar.f23270E[i10] = this.f23249t[i10].p(i6) - i6;
        }
        return aVar;
    }

    private void e2() {
        this.f23250u = androidx.recyclerview.widget.i.b(this, this.f23252w);
        this.f23251v = androidx.recyclerview.widget.i.b(this, 1 - this.f23252w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int f2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        int i6;
        int iP2;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVarT2;
        int iE;
        int i10;
        int iE2;
        int iE3;
        int i11;
        int i12;
        boolean z6;
        ?? r10 = 0;
        this.f23233B.set(0, this.f23248s, true);
        if (this.f23254y.f23415i) {
            i6 = fVar.f23411e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i6 = fVar.f23411e == 1 ? fVar.f23413g + fVar.f23408b : fVar.f23412f - fVar.f23408b;
        }
        int i13 = i6;
        O2(fVar.f23411e, i13);
        int i14 = this.f23232A ? this.f23250u.i() : this.f23250u.m();
        ?? r6 = false;
        while (fVar.a(a6) && (this.f23254y.f23415i || !this.f23233B.isEmpty())) {
            android.view.View viewB = fVar.b(vVar);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.f23236E.g(iA);
            ?? r11 = iG == -1 ? 1 : r10;
            if (r11 != 0) {
                fVarT2 = cVar.f23265f ? this.f23249t[r10] : t2(fVar);
                this.f23236E.n(iA, fVarT2);
            } else {
                fVarT2 = this.f23249t[iG];
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar2 = fVarT2;
            cVar.f23264e = fVar2;
            if (fVar.f23411e == 1) {
                i(viewB);
            } else {
                j(viewB, r10);
            }
            z2(viewB, cVar, r10);
            if (fVar.f23411e == 1) {
                int iP3 = cVar.f23265f ? p2(i14) : fVar2.l(i14);
                int iE4 = this.f23250u.e(viewB) + iP3;
                if (r11 != 0 && cVar.f23265f) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarC2 = c2(iP3);
                    aVarC2.f23269D = -1;
                    aVarC2.f23268C = iA;
                    this.f23236E.a(aVarC2);
                }
                i10 = iE4;
                iE = iP3;
            } else {
                int iS2 = cVar.f23265f ? s2(i14) : fVar2.p(i14);
                iE = iS2 - this.f23250u.e(viewB);
                if (r11 != 0 && cVar.f23265f) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarD2 = d2(iS2);
                    aVarD2.f23269D = 1;
                    aVarD2.f23268C = iA;
                    this.f23236E.a(aVarD2);
                }
                i10 = iS2;
            }
            if (cVar.f23265f && fVar.f23410d == -1) {
                if (r11 == 0) {
                    if (!(fVar.f23411e == 1 ? S1() : T1())) {
                        androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarF = this.f23236E.f(iA);
                        if (aVarF != null) {
                            aVarF.f23271F = true;
                        }
                        this.f23244M = true;
                    }
                } else {
                    this.f23244M = true;
                }
            }
            U1(viewB, cVar, fVar);
            if (x2() && this.f23252w == 1) {
                int i15 = cVar.f23265f ? this.f23251v.i() : this.f23251v.i() - (((this.f23248s - 1) - fVar2.f23286e) * this.f23253x);
                iE3 = i15;
                iE2 = i15 - this.f23251v.e(viewB);
            } else {
                int iM = cVar.f23265f ? this.f23251v.m() : (fVar2.f23286e * this.f23253x) + this.f23251v.m();
                iE2 = iM;
                iE3 = this.f23251v.e(viewB) + iM;
            }
            if (this.f23252w == 1) {
                i11 = iE2;
                iE2 = iE;
                i12 = iE3;
            } else {
                i11 = iE;
                i12 = i10;
                i10 = iE3;
            }
            D0(viewB, i11, iE2, i12, i10);
            if (cVar.f23265f) {
                O2(this.f23254y.f23411e, i13);
            } else {
                U2(fVar2, this.f23254y.f23411e, i13);
            }
            E2(vVar, this.f23254y);
            if (!this.f23254y.f23414h || !viewB.hasFocusable()) {
                z6 = false;
            } else if (cVar.f23265f) {
                this.f23233B.clear();
                z6 = false;
            } else {
                z6 = false;
                this.f23233B.set(fVar2.f23286e, false);
            }
            r10 = z6;
            r6 = true;
        }
        ?? r12 = r10;
        if (r6 == false) {
            E2(vVar, this.f23254y);
        }
        if (this.f23254y.f23411e == -1) {
            iP2 = this.f23250u.m() - s2(this.f23250u.m());
        } else {
            iP2 = p2(this.f23250u.i()) - this.f23250u.i();
        }
        return iP2 > 0 ? java.lang.Math.min(fVar.f23408b, iP2) : r12 == true ? 1 : 0;
    }

    private int g2(int i6) {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            int iL0 = l0(N(i10));
            if (iL0 >= 0 && iL0 < i6) {
                return iL0;
            }
        }
        return 0;
    }

    private int k2(int i6) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i6) {
                return iL0;
            }
        }
        return 0;
    }

    private void l2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        int i6;
        int iP2 = p2(Integer.MIN_VALUE);
        if (iP2 != Integer.MIN_VALUE && (i6 = this.f23250u.i() - iP2) > 0) {
            int i10 = i6 - (-J2(-i6, vVar, a6));
            if (!z6 || i10 <= 0) {
                return;
            }
            this.f23250u.r(i10);
        }
    }

    private void m2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6) {
        int iM;
        int iS2 = s2(Integer.MAX_VALUE);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.f23250u.m()) > 0) {
            int iJ2 = iM - J2(iM, vVar, a6);
            if (!z6 || iJ2 <= 0) {
                return;
            }
            this.f23250u.r(-iJ2);
        }
    }

    private int p2(int i6) {
        int iL = this.f23249t[0].l(i6);
        for (int i10 = 1; i10 < this.f23248s; i10++) {
            int iL2 = this.f23249t[i10].l(i6);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int q2(int i6) {
        int iP = this.f23249t[0].p(i6);
        for (int i10 = 1; i10 < this.f23248s; i10++) {
            int iP2 = this.f23249t[i10].p(i6);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int r2(int i6) {
        int iL = this.f23249t[0].l(i6);
        for (int i10 = 1; i10 < this.f23248s; i10++) {
            int iL2 = this.f23249t[i10].l(i6);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i6) {
        int iP = this.f23249t[0].p(i6);
        for (int i10 = 1; i10 < this.f23248s; i10++) {
            int iP2 = this.f23249t[i10].p(i6);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.f t2(androidx.recyclerview.widget.f fVar) {
        int i6;
        int i10;
        int i11;
        if (B2(fVar.f23411e)) {
            i10 = this.f23248s - 1;
            i6 = -1;
            i11 = -1;
        } else {
            i6 = this.f23248s;
            i10 = 0;
            i11 = 1;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar2 = null;
        if (fVar.f23411e == 1) {
            int iM = this.f23250u.m();
            int i12 = Integer.MAX_VALUE;
            while (i10 != i6) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar3 = this.f23249t[i10];
                int iL = fVar3.l(iM);
                if (iL < i12) {
                    fVar2 = fVar3;
                    i12 = iL;
                }
                i10 += i11;
            }
            return fVar2;
        }
        int i13 = this.f23250u.i();
        int i14 = Integer.MIN_VALUE;
        while (i10 != i6) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar4 = this.f23249t[i10];
            int iP = fVar4.p(i13);
            if (iP > i14) {
                fVar2 = fVar4;
                i14 = iP;
            }
            i10 += i11;
        }
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private void u2(int i6, int i10, int i11) {
        int i12;
        int i13;
        int iO2;
        int iO3 = this.f23232A ? o2() : n2();
        if (i11 == 8) {
            if (i6 < i10) {
                i12 = i10 + 1;
            } else {
                i12 = i6 + 1;
                i13 = i10;
            }
            this.f23236E.h(i13);
            if (i11 != 1) {
                this.f23236E.j(i6, i10);
            } else if (i11 != 2) {
                this.f23236E.k(i6, i10);
            } else if (i11 == 8) {
                this.f23236E.k(i6, 1);
                this.f23236E.j(i10, 1);
            }
            if (i12 <= iO3) {
                return;
            }
            if (this.f23232A) {
                iO2 = n2();
            } else {
                iO2 = o2();
            }
            if (i13 <= iO2) {
                x1();
            }
        }
        i12 = i6 + i10;
        i13 = i6;
        this.f23236E.h(i13);
        if (i11 != 1) {
            this.f23236E.j(i6, i10);
        } else if (i11 != 2) {
            this.f23236E.k(i6, i10);
        } else if (i11 == 8) {
            this.f23236E.k(i6, 1);
            this.f23236E.j(i10, 1);
        }
        if (i12 <= iO3) {
            return;
        }
        if (this.f23232A) {
            iO2 = n2();
        } else {
            iO2 = o2();
        }
        if (i13 <= iO2) {
            x1();
        }
    }

    private void y2(android.view.View view, int i6, int i10, boolean z6) {
        o(view, this.f23242K);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) view.getLayoutParams();
        int i11 = ((android.view.ViewGroup.MarginLayoutParams) cVar).leftMargin;
        android.graphics.Rect rect = this.f23242K;
        int iV2 = V2(i6, i11 + rect.left, ((android.view.ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i12 = ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin;
        android.graphics.Rect rect2 = this.f23242K;
        int iV3 = V2(i10, i12 + rect2.top, ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z6 ? L1(view, iV2, iV3, cVar) : J1(view, iV2, iV3, cVar)) {
            view.measure(iV2, iV3);
        }
    }

    private void z2(android.view.View view, androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar, boolean z6) {
        int iP;
        int iP2;
        if (!cVar.f23265f) {
            if (this.f23252w == 1) {
                iP = androidx.recyclerview.widget.RecyclerView.p.P(this.f23253x, t0(), 0, ((android.view.ViewGroup.MarginLayoutParams) cVar).width, false);
            } else {
                iP = androidx.recyclerview.widget.RecyclerView.p.P(s0(), t0(), i0() + j0(), ((android.view.ViewGroup.MarginLayoutParams) cVar).width, true);
                iP2 = androidx.recyclerview.widget.RecyclerView.p.P(this.f23253x, c0(), 0, ((android.view.ViewGroup.MarginLayoutParams) cVar).height, false);
            }
            y2(view, iP, iP2, z6);
        }
        if (this.f23252w != 1) {
            y2(view, androidx.recyclerview.widget.RecyclerView.p.P(s0(), t0(), i0() + j0(), ((android.view.ViewGroup.MarginLayoutParams) cVar).width, true), this.f23241J, z6);
            return;
        }
        iP = this.f23241J;
        iP2 = androidx.recyclerview.widget.RecyclerView.p.P(b0(), c0(), k0() + h0(), ((android.view.ViewGroup.MarginLayoutParams) cVar).height, true);
        y2(view, iP, iP2, z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(androidx.recyclerview.widget.RecyclerView.A a6) {
        return a2(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        return J2(i6, vVar, a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i6) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = this.f23240I;
        if (eVar != null && eVar.f23272C != i6) {
            eVar.a();
        }
        this.f23234C = i6;
        this.f23235D = Integer.MIN_VALUE;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        return J2(i6, vVar, a6);
    }

    void C2(int i6, androidx.recyclerview.widget.RecyclerView.A a6) {
        int iN2;
        int i10;
        if (i6 > 0) {
            iN2 = o2();
            i10 = 1;
        } else {
            iN2 = n2();
            i10 = -1;
        }
        this.f23254y.f23407a = true;
        S2(iN2, a6);
        K2(i10);
        androidx.recyclerview.widget.f fVar = this.f23254y;
        fVar.f23409c = iN2 + fVar.f23410d;
        fVar.f23408b = java.lang.Math.abs(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i6) {
        super.G0(i6);
        for (int i10 = 0; i10 < this.f23248s; i10++) {
            this.f23249t[i10].r(i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(android.graphics.Rect rect, int i6, int i10) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f23252w == 1) {
            iS2 = androidx.recyclerview.widget.RecyclerView.p.s(i10, rect.height() + iK0, f0());
            iS = androidx.recyclerview.widget.RecyclerView.p.s(i6, (this.f23253x * this.f23248s) + iI0, g0());
        } else {
            iS = androidx.recyclerview.widget.RecyclerView.p.s(i6, rect.width() + iI0, g0());
            iS2 = androidx.recyclerview.widget.RecyclerView.p.s(i10, (this.f23253x * this.f23248s) + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(int i6) {
        super.H0(i6);
        for (int i10 = 0; i10 < this.f23248s; i10++) {
            this.f23249t[i10].r(i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q I() {
        return this.f23252w == 0 ? new androidx.recyclerview.widget.StaggeredGridLayoutManager.c(-2, -1) : new androidx.recyclerview.widget.StaggeredGridLayoutManager.c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(androidx.recyclerview.widget.RecyclerView.h hVar, androidx.recyclerview.widget.RecyclerView.h hVar2) {
        this.f23236E.b();
        for (int i6 = 0; i6 < this.f23248s; i6++) {
            this.f23249t[i6].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q J(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.StaggeredGridLayoutManager.c(context, attributeSet);
    }

    int J2(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0 || i6 == 0) {
            return 0;
        }
        C2(i6, a6);
        int iF2 = f2(vVar, this.f23254y, a6);
        if (this.f23254y.f23408b >= iF2) {
            i6 = i6 < 0 ? -iF2 : iF2;
        }
        this.f23250u.r(-i6);
        this.f23238G = this.f23232A;
        androidx.recyclerview.widget.f fVar = this.f23254y;
        fVar.f23408b = 0;
        E2(vVar, fVar);
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q K(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.recyclerview.widget.StaggeredGridLayoutManager.c((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.recyclerview.widget.StaggeredGridLayoutManager.c(layoutParams);
    }

    public void L2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i6 == this.f23252w) {
            return;
        }
        this.f23252w = i6;
        androidx.recyclerview.widget.i iVar = this.f23250u;
        this.f23250u = this.f23251v;
        this.f23251v = iVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.v vVar) {
        super.M0(recyclerView, vVar);
        s1(this.f23247P);
        for (int i6 = 0; i6 < this.f23248s; i6++) {
            this.f23249t[i6].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g(recyclerView.getContext());
        gVar.p(i6);
        N1(gVar);
    }

    public void M2(boolean z6) {
        l(null);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = this.f23240I;
        if (eVar != null && eVar.f23279J != z6) {
            eVar.f23279J = z6;
        }
        this.f23255z = z6;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.view.View N0(android.view.View view, int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        android.view.View viewG;
        android.view.View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i6);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewG.getLayoutParams();
        boolean z6 = cVar.f23265f;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.f fVar = cVar.f23264e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, a6);
        K2(iB2);
        androidx.recyclerview.widget.f fVar2 = this.f23254y;
        fVar2.f23409c = fVar2.f23410d + iO2;
        fVar2.f23408b = (int) (this.f23250u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f23254y;
        fVar3.f23414h = true;
        fVar3.f23407a = false;
        f2(vVar, fVar3, a6);
        this.f23238G = this.f23232A;
        if (!z6 && (viewM = fVar.m(iO2, iB2)) != null && viewM != viewG) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i10 = this.f23248s - 1; i10 >= 0; i10--) {
                android.view.View viewM2 = this.f23249t[i10].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i11 = 0; i11 < this.f23248s; i11++) {
                android.view.View viewM3 = this.f23249t[i11].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z10 = (this.f23255z ^ true) == (iB2 == -1);
        if (!z6) {
            android.view.View viewH = H(z10 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (B2(iB2)) {
            for (int i12 = this.f23248s - 1; i12 >= 0; i12--) {
                if (i12 != fVar.f23286e) {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.f[] fVarArr = this.f23249t;
                    android.view.View viewH2 = H(z10 ? fVarArr[i12].f() : fVarArr[i12].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f23248s; i13++) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.f[] fVarArr2 = this.f23249t;
                android.view.View viewH3 = H(z10 ? fVarArr2[i13].f() : fVarArr2[i13].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void N2(int i6) {
        l(null);
        if (i6 != this.f23248s) {
            w2();
            this.f23248s = i6;
            this.f23233B = new java.util.BitSet(this.f23248s);
            this.f23249t = new androidx.recyclerview.widget.StaggeredGridLayoutManager.f[this.f23248s];
            for (int i10 = 0; i10 < this.f23248s; i10++) {
                this.f23249t[i10] = new androidx.recyclerview.widget.StaggeredGridLayoutManager.f(i10);
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            android.view.View viewI2 = i2(false);
            android.view.View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iL0 = l0(viewI2);
            int iL1 = l0(viewH2);
            if (iL0 < iL1) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL1);
            } else {
                accessibilityEvent.setFromIndex(iL1);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f23240I == null;
    }

    boolean Q2(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.StaggeredGridLayoutManager.b bVar) {
        int i6;
        int iM;
        int iG;
        if (!a6.e() && (i6 = this.f23234C) != -1) {
            if (i6 >= 0 && i6 < a6.b()) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = this.f23240I;
                if (eVar == null || eVar.f23272C == -1 || eVar.f23274E < 1) {
                    android.view.View viewH = H(this.f23234C);
                    if (viewH != null) {
                        bVar.f23257a = this.f23232A ? o2() : n2();
                        if (this.f23235D != Integer.MIN_VALUE) {
                            if (bVar.f23259c) {
                                iM = this.f23250u.i() - this.f23235D;
                                iG = this.f23250u.d(viewH);
                            } else {
                                iM = this.f23250u.m() + this.f23235D;
                                iG = this.f23250u.g(viewH);
                            }
                            bVar.f23258b = iM - iG;
                            return true;
                        }
                        if (this.f23250u.e(viewH) > this.f23250u.n()) {
                            bVar.f23258b = bVar.f23259c ? this.f23250u.i() : this.f23250u.m();
                            return true;
                        }
                        int iG2 = this.f23250u.g(viewH) - this.f23250u.m();
                        if (iG2 < 0) {
                            bVar.f23258b = -iG2;
                            return true;
                        }
                        int i10 = this.f23250u.i() - this.f23250u.d(viewH);
                        if (i10 < 0) {
                            bVar.f23258b = i10;
                            return true;
                        }
                        bVar.f23258b = Integer.MIN_VALUE;
                    } else {
                        int i11 = this.f23234C;
                        bVar.f23257a = i11;
                        int i12 = this.f23235D;
                        if (i12 == Integer.MIN_VALUE) {
                            bVar.f23259c = V1(i11) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i12);
                        }
                        bVar.f23260d = true;
                    }
                } else {
                    bVar.f23258b = Integer.MIN_VALUE;
                    bVar.f23257a = this.f23234C;
                }
                return true;
            }
            this.f23234C = -1;
            this.f23235D = Integer.MIN_VALUE;
        }
        return false;
    }

    void R2(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.StaggeredGridLayoutManager.b bVar) {
        if (Q2(a6, bVar) || P2(a6, bVar)) {
            return;
        }
        bVar.a();
        bVar.f23257a = 0;
    }

    boolean S1() {
        int iL = this.f23249t[0].l(Integer.MIN_VALUE);
        for (int i6 = 1; i6 < this.f23248s; i6++) {
            if (this.f23249t[i6].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean T1() {
        int iP = this.f23249t[0].p(Integer.MIN_VALUE);
        for (int i6 = 1; i6 < this.f23248s; i6++) {
            if (this.f23249t[i6].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void T2(int i6) {
        this.f23253x = i6 / this.f23248s;
        this.f23241J = android.view.View.MeasureSpec.makeMeasureSpec(i6, this.f23251v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        u2(i6, i10, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f23236E.b();
        x1();
    }

    boolean W1() {
        int iN2;
        int iO2;
        if (O() == 0 || this.f23237F == 0 || !v0()) {
            return false;
        }
        if (this.f23232A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.f23236E.b();
        } else {
            if (!this.f23244M) {
                return false;
            }
            int i6 = this.f23232A ? -1 : 1;
            int i10 = iO2 + 1;
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarE = this.f23236E.e(iN2, i10, i6, true);
            if (aVarE == null) {
                this.f23244M = false;
                this.f23236E.d(i10);
                return false;
            }
            androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a aVarE2 = this.f23236E.e(iN2, aVarE.f23268C, i6 * (-1), true);
            if (aVarE2 == null) {
                this.f23236E.d(aVarE.f23268C);
            } else {
                this.f23236E.d(aVarE2.f23268C + 1);
            }
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, int i11) {
        u2(i6, i10, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        u2(i6, i10, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, java.lang.Object obj) {
        u2(i6, i10, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        A2(vVar, a6, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(androidx.recyclerview.widget.RecyclerView.A a6) {
        super.c1(a6);
        this.f23234C = -1;
        this.f23235D = Integer.MIN_VALUE;
        this.f23240I = null;
        this.f23243L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public android.graphics.PointF d(int i6) {
        int iV1 = V1(i6);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.f23252w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(android.os.Parcelable parcelable) {
        if (parcelable instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.e) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.e) parcelable;
            this.f23240I = eVar;
            if (this.f23234C != -1) {
                eVar.a();
                this.f23240I.b();
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.os.Parcelable h1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f23240I != null) {
            return new androidx.recyclerview.widget.StaggeredGridLayoutManager.e(this.f23240I);
        }
        androidx.recyclerview.widget.StaggeredGridLayoutManager.e eVar = new androidx.recyclerview.widget.StaggeredGridLayoutManager.e();
        eVar.f23279J = this.f23255z;
        eVar.f23280K = this.f23238G;
        eVar.f23281L = this.f23239H;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.d dVar = this.f23236E;
        if (dVar == null || (iArr = dVar.f23266a) == null) {
            eVar.f23276G = 0;
        } else {
            eVar.f23277H = iArr;
            eVar.f23276G = iArr.length;
            eVar.f23278I = dVar.f23267b;
        }
        if (O() > 0) {
            eVar.f23272C = this.f23238G ? o2() : n2();
            eVar.f23273D = j2();
            int i6 = this.f23248s;
            eVar.f23274E = i6;
            eVar.f23275F = new int[i6];
            for (int i10 = 0; i10 < this.f23248s; i10++) {
                if (this.f23238G) {
                    iP = this.f23249t[i10].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f23250u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f23249t[i10].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f23250u.m();
                        iP -= iM;
                    }
                }
                eVar.f23275F[i10] = iP;
            }
        } else {
            eVar.f23272C = -1;
            eVar.f23273D = -1;
            eVar.f23274E = 0;
        }
        return eVar;
    }

    android.view.View h2(boolean z6) {
        int iM = this.f23250u.m();
        int i6 = this.f23250u.i();
        android.view.View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            android.view.View viewN = N(iO);
            int iG = this.f23250u.g(viewN);
            int iD = this.f23250u.d(viewN);
            if (iD > iM && iG < i6) {
                if (iD <= i6 || !z6) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(int i6) {
        if (i6 == 0) {
            W1();
        }
    }

    android.view.View i2(boolean z6) {
        int iM = this.f23250u.m();
        int i6 = this.f23250u.i();
        int iO = O();
        android.view.View view = null;
        for (int i10 = 0; i10 < iO; i10++) {
            android.view.View viewN = N(i10);
            int iG = this.f23250u.g(viewN);
            if (this.f23250u.d(viewN) > iM && iG < i6) {
                if (iG >= iM || !z6) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int j2() {
        android.view.View viewH2 = this.f23232A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(java.lang.String str) {
        if (this.f23240I == null) {
            super.l(str);
        }
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    int o2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f23252w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f23252w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(androidx.recyclerview.widget.RecyclerView.q qVar) {
        return qVar instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i6, int i10, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f23252w != 0) {
            i6 = i10;
        }
        if (O() == 0 || i6 == 0) {
            return;
        }
        C2(i6, a6);
        int[] iArr = this.f23246O;
        if (iArr == null || iArr.length < this.f23248s) {
            this.f23246O = new int[this.f23248s];
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f23248s; i12++) {
            androidx.recyclerview.widget.f fVar = this.f23254y;
            if (fVar.f23410d == -1) {
                iL = fVar.f23412f;
                iP = this.f23249t[i12].p(iL);
            } else {
                iL = this.f23249t[i12].l(fVar.f23413g);
                iP = this.f23254y.f23413g;
            }
            int i13 = iL - iP;
            if (i13 >= 0) {
                this.f23246O[i11] = i13;
                i11++;
            }
        }
        java.util.Arrays.sort(this.f23246O, 0, i11);
        for (int i14 = 0; i14 < i11 && this.f23254y.a(a6); i14++) {
            cVar.a(this.f23254y.f23409c, this.f23246O[i14]);
            androidx.recyclerview.widget.f fVar2 = this.f23254y;
            fVar2.f23409c += fVar2.f23410d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(androidx.recyclerview.widget.RecyclerView.A a6) {
        return Y1(a6);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    android.view.View v2() {
        int i6;
        boolean z6;
        boolean z10;
        int iO = O();
        int i10 = iO - 1;
        java.util.BitSet bitSet = new java.util.BitSet(this.f23248s);
        bitSet.set(0, this.f23248s, true);
        byte b6 = (this.f23252w == 1 && x2()) ? (byte) 1 : (byte) -1;
        if (this.f23232A) {
            iO = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iO ? 1 : -1;
        while (i10 != iO) {
            android.view.View viewN = N(i10);
            androidx.recyclerview.widget.StaggeredGridLayoutManager.c cVar = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN.getLayoutParams();
            if (bitSet.get(cVar.f23264e.f23286e)) {
                if (X1(cVar.f23264e)) {
                    return viewN;
                }
                bitSet.clear(cVar.f23264e.f23286e);
            }
            if (!cVar.f23265f && (i6 = i10 + i11) != iO) {
                android.view.View viewN2 = N(i6);
                if (this.f23232A) {
                    int iD = this.f23250u.d(viewN);
                    int iD2 = this.f23250u.d(viewN2);
                    if (iD < iD2) {
                        return viewN;
                    }
                    if (iD == iD2) {
                        if (cVar.f23264e.f23286e - ((androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN2.getLayoutParams()).f23264e.f23286e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b6 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z6 != z10) {
                            return viewN;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iG = this.f23250u.g(viewN);
                    int iG2 = this.f23250u.g(viewN2);
                    if (iG > iG2) {
                        return viewN;
                    }
                    if (iG == iG2) {
                        if (cVar.f23264e.f23286e - ((androidx.recyclerview.widget.StaggeredGridLayoutManager.c) viewN2.getLayoutParams()).f23264e.f23286e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b6 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z6 != z10) {
                            return viewN;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10 += i11;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(androidx.recyclerview.widget.RecyclerView.A a6) {
        return Z1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return this.f23237F != 0;
    }

    public void w2() {
        this.f23236E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(androidx.recyclerview.widget.RecyclerView.A a6) {
        return a2(a6);
    }

    boolean x2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(androidx.recyclerview.widget.RecyclerView.A a6) {
        return Y1(a6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(androidx.recyclerview.widget.RecyclerView.A a6) {
        return Z1(a6);
    }
}
