package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f22575S;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p070h.c f22579D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p070h.c f22580E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p070h.c f22581F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f22583H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f22584I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f22585J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f22586K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f22587L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.util.ArrayList f22588M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private java.util.ArrayList f22589N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.ArrayList f22590O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.fragment.app.q f22591P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private W1.c.C0293c f22592Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22595b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.util.ArrayList f22597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f22598e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p040e.x f22600g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.util.ArrayList f22606m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.k f22615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private V1.e f22616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.fragment.app.f f22617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.fragment.app.f f22618y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f22594a = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.fragment.app.t f22596c = new androidx.fragment.app.t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.l f22599f = new androidx.fragment.app.l(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p040e.w f22601h = new androidx.fragment.app.n.b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f22602i = new java.util.concurrent.atomic.AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.Map f22603j = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.Map f22604k = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.Map f22605l = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.fragment.app.m f22607n = new androidx.fragment.app.m(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f22608o = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final B1.a f22609p = new B1.a() { // from class: V1.f
        @Override // B1.a
        public final void accept(java.lang.Object obj) {
            this.f15104a.N0((android.content.res.Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B1.a f22610q = new B1.a() { // from class: V1.g
        @Override // B1.a
        public final void accept(java.lang.Object obj) {
            this.f15105a.O0((java.lang.Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B1.a f22611r = new B1.a() { // from class: V1.h
        @Override // B1.a
        public final void accept(java.lang.Object obj) {
            this.f15106a.P0((androidx.core.app.g) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final B1.a f22612s = new B1.a() { // from class: V1.i
        @Override // B1.a
        public final void accept(java.lang.Object obj) {
            this.f15107a.Q0((androidx.core.app.p) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.core.view.InterfaceC2039z f22613t = new androidx.fragment.app.n.c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f22614u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.j f22619z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private androidx.fragment.app.j f22576A = new androidx.fragment.app.n.d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.fragment.app.B f22577B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.fragment.app.B f22578C = new androidx.fragment.app.n.e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.util.ArrayDeque f22582G = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private java.lang.Runnable f22593R = new androidx.fragment.app.n.f();

    class a implements p070h.b {
        a() {
        }

        @Override // p070h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(java.util.Map map) {
            java.lang.StringBuilder sb;
            java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
            java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                iArr[i6] = ((java.lang.Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
            }
            androidx.fragment.app.n.k kVar = (androidx.fragment.app.n.k) androidx.fragment.app.n.this.f22582G.pollFirst();
            if (kVar == null) {
                sb = new java.lang.StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                java.lang.String str = kVar.f22630C;
                int i10 = kVar.f22631D;
                androidx.fragment.app.f fVarI = androidx.fragment.app.n.this.f22596c.i(str);
                if (fVarI != null) {
                    fVarI.I0(i10, strArr, iArr);
                    return;
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            sb.toString();
        }
    }

    class b extends p040e.w {
        b(boolean z6) {
            super(z6);
        }

        @Override // p040e.w
        public void d() {
            androidx.fragment.app.n.this.A0();
        }
    }

    class c implements androidx.core.view.InterfaceC2039z {
        c() {
        }

        @Override // androidx.core.view.InterfaceC2039z
        public boolean a(android.view.MenuItem menuItem) {
            return androidx.fragment.app.n.this.H(menuItem);
        }

        @Override // androidx.core.view.InterfaceC2039z
        public void b(android.view.Menu menu) {
            androidx.fragment.app.n.this.I(menu);
        }

        @Override // androidx.core.view.InterfaceC2039z
        public void c(android.view.Menu menu, android.view.MenuInflater menuInflater) {
            androidx.fragment.app.n.this.A(menu, menuInflater);
        }

        @Override // androidx.core.view.InterfaceC2039z
        public void d(android.view.Menu menu) {
            androidx.fragment.app.n.this.M(menu);
        }
    }

    class d extends androidx.fragment.app.j {
        d() {
        }

        @Override // androidx.fragment.app.j
        public androidx.fragment.app.f a(java.lang.ClassLoader classLoader, java.lang.String str) {
            return androidx.fragment.app.n.this.r0().g(androidx.fragment.app.n.this.r0().o(), str, null);
        }
    }

    class e implements androidx.fragment.app.B {
        e() {
        }

        @Override // androidx.fragment.app.B
        public androidx.fragment.app.A a(android.view.ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    class f implements java.lang.Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.n.this.Y(true);
        }
    }

    class g implements V1.k {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.f f22626C;

        g(androidx.fragment.app.f fVar) {
            this.f22626C = fVar;
        }

        @Override // V1.k
        public void a(androidx.fragment.app.n nVar, androidx.fragment.app.f fVar) {
            this.f22626C.m0(fVar);
        }
    }

    class h implements p070h.b {
        h() {
        }

        @Override // p070h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p070h.a aVar) {
            androidx.fragment.app.n.k kVar = (androidx.fragment.app.n.k) androidx.fragment.app.n.this.f22582G.pollFirst();
            if (kVar == null) {
                java.lang.String str = "No Activities were started for result for " + this;
                return;
            }
            java.lang.String str2 = kVar.f22630C;
            int i6 = kVar.f22631D;
            androidx.fragment.app.f fVarI = androidx.fragment.app.n.this.f22596c.i(str2);
            if (fVarI != null) {
                fVarI.j0(i6, aVar.b(), aVar.a());
                return;
            }
            java.lang.String str3 = "Activity result delivered for unknown Fragment " + str2;
        }
    }

    class i implements p070h.b {
        i() {
        }

        @Override // p070h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p070h.a aVar) {
            androidx.fragment.app.n.k kVar = (androidx.fragment.app.n.k) androidx.fragment.app.n.this.f22582G.pollFirst();
            if (kVar == null) {
                java.lang.String str = "No IntentSenders were started for " + this;
                return;
            }
            java.lang.String str2 = kVar.f22630C;
            int i6 = kVar.f22631D;
            androidx.fragment.app.f fVarI = androidx.fragment.app.n.this.f22596c.i(str2);
            if (fVarI != null) {
                fVarI.j0(i6, aVar.b(), aVar.a());
                return;
            }
            java.lang.String str3 = "Intent Sender result delivered for unknown Fragment " + str2;
        }
    }

    static class j extends p080i.a {
        j() {
        }

        @Override // p080i.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public android.content.Intent a(android.content.Context context, p070h.g gVar) {
            android.os.Bundle bundleExtra;
            android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            android.content.Intent intentA = gVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new h.g.a(gVar.d()).b(null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "CreateIntent created the following intent: " + intent;
            }
            return intent;
        }

        @Override // p080i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p070h.a c(int i6, android.content.Intent intent) {
            return new p070h.a(i6, intent);
        }
    }

    static class k implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.n.k> CREATOR = new androidx.fragment.app.n.k.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.lang.String f22630C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f22631D;

        class a implements android.os.Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public androidx.fragment.app.n.k createFromParcel(android.os.Parcel parcel) {
                return new androidx.fragment.app.n.k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public androidx.fragment.app.n.k[] newArray(int i6) {
                return new androidx.fragment.app.n.k[i6];
            }
        }

        k(android.os.Parcel parcel) {
            this.f22630C = parcel.readString();
            this.f22631D = parcel.readInt();
        }

        k(java.lang.String str, int i6) {
            this.f22630C = str;
            this.f22631D = i6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            parcel.writeString(this.f22630C);
            parcel.writeInt(this.f22631D);
        }
    }

    interface l {
        boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2);
    }

    private class m implements androidx.fragment.app.n.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f22632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f22633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f22634c;

        m(java.lang.String str, int i6, int i10) {
            this.f22632a = str;
            this.f22633b = i6;
            this.f22634c = i10;
        }

        @Override // androidx.fragment.app.n.l
        public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
            androidx.fragment.app.f fVar = androidx.fragment.app.n.this.f22618y;
            if (fVar == null || this.f22633b >= 0 || this.f22632a != null || !fVar.s().X0()) {
                return androidx.fragment.app.n.this.a1(arrayList, arrayList2, this.f22632a, this.f22633b, this.f22634c);
            }
            return false;
        }
    }

    public static boolean E0(int i6) {
        return f22575S || android.util.Log.isLoggable("FragmentManager", i6);
    }

    private boolean F0(androidx.fragment.app.f fVar) {
        return (fVar.f22503g0 && fVar.f22504h0) || fVar.f22494X.n();
    }

    private boolean G0() {
        androidx.fragment.app.f fVar = this.f22617x;
        if (fVar == null) {
            return true;
        }
        return fVar.a0() && this.f22617x.H().G0();
    }

    private void J(androidx.fragment.app.f fVar) {
        if (fVar == null || !fVar.equals(c0(fVar.f22478H))) {
            return;
        }
        fVar.h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(android.content.res.Configuration configuration) {
        if (G0()) {
            x(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(java.lang.Integer num) {
        if (G0() && num.intValue() == 80) {
            D(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(androidx.core.app.g gVar) {
        if (G0()) {
            E(gVar.a(), false);
        }
    }

    private void Q(int i6) {
        try {
            this.f22595b = true;
            this.f22596c.d(i6);
            S0(i6, false);
            java.util.Iterator it = r().iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.A) it.next()).j();
            }
            this.f22595b = false;
            Y(true);
        } catch (java.lang.Throwable th) {
            this.f22595b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(androidx.core.app.p pVar) {
        if (G0()) {
            L(pVar.a(), false);
        }
    }

    private void T() {
        if (this.f22587L) {
            this.f22587L = false;
            n1();
        }
    }

    private void V() {
        java.util.Iterator it = r().iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.A) it.next()).j();
        }
    }

    private void X(boolean z6) {
        if (this.f22595b) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f22615v == null) {
            if (!this.f22586K) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.f22615v.r().getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            o();
        }
        if (this.f22588M == null) {
            this.f22588M = new java.util.ArrayList();
            this.f22589N = new java.util.ArrayList();
        }
    }

    private boolean Z0(java.lang.String str, int i6, int i10) {
        Y(false);
        X(true);
        androidx.fragment.app.f fVar = this.f22618y;
        if (fVar != null && i6 < 0 && str == null && fVar.s().X0()) {
            return true;
        }
        boolean zA1 = a1(this.f22588M, this.f22589N, str, i6, i10);
        if (zA1) {
            this.f22595b = true;
            try {
                c1(this.f22588M, this.f22589N);
                p();
            } catch (java.lang.Throwable th) {
                p();
                throw th;
            }
        }
        p1();
        T();
        this.f22596c.b();
        return zA1;
    }

    private static void a0(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i6, int i10) {
        while (i6 < i10) {
            androidx.fragment.app.C2066a c2066a = (androidx.fragment.app.C2066a) arrayList.get(i6);
            if (((java.lang.Boolean) arrayList2.get(i6)).booleanValue()) {
                c2066a.p(-1);
                c2066a.u();
            } else {
                c2066a.p(1);
                c2066a.t();
            }
            i6++;
        }
    }

    private void b0(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i6, int i10) {
        boolean z6 = ((androidx.fragment.app.C2066a) arrayList.get(i6)).f22694r;
        java.util.ArrayList arrayList3 = this.f22590O;
        if (arrayList3 == null) {
            this.f22590O = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f22590O.addAll(this.f22596c.o());
        androidx.fragment.app.f fVarV0 = v0();
        boolean z10 = false;
        for (int i11 = i6; i11 < i10; i11++) {
            androidx.fragment.app.C2066a c2066a = (androidx.fragment.app.C2066a) arrayList.get(i11);
            fVarV0 = !((java.lang.Boolean) arrayList2.get(i11)).booleanValue() ? c2066a.v(this.f22590O, fVarV0) : c2066a.y(this.f22590O, fVarV0);
            z10 = z10 || c2066a.f22685i;
        }
        this.f22590O.clear();
        if (!z6 && this.f22614u >= 1) {
            for (int i12 = i6; i12 < i10; i12++) {
                java.util.Iterator it = ((androidx.fragment.app.C2066a) arrayList.get(i12)).f22679c.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.f fVar = ((androidx.fragment.app.u.a) it.next()).f22697b;
                    if (fVar != null && fVar.f22492V != null) {
                        this.f22596c.r(t(fVar));
                    }
                }
            }
        }
        a0(arrayList, arrayList2, i6, i10);
        boolean zBooleanValue = ((java.lang.Boolean) arrayList2.get(i10 - 1)).booleanValue();
        for (int i13 = i6; i13 < i10; i13++) {
            androidx.fragment.app.C2066a c2066a2 = (androidx.fragment.app.C2066a) arrayList.get(i13);
            if (zBooleanValue) {
                for (int size = c2066a2.f22679c.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.f fVar2 = ((androidx.fragment.app.u.a) c2066a2.f22679c.get(size)).f22697b;
                    if (fVar2 != null) {
                        t(fVar2).m();
                    }
                }
            } else {
                java.util.Iterator it2 = c2066a2.f22679c.iterator();
                while (it2.hasNext()) {
                    androidx.fragment.app.f fVar3 = ((androidx.fragment.app.u.a) it2.next()).f22697b;
                    if (fVar3 != null) {
                        t(fVar3).m();
                    }
                }
            }
        }
        S0(this.f22614u, true);
        for (androidx.fragment.app.A a6 : s(arrayList, i6, i10)) {
            a6.r(zBooleanValue);
            a6.p();
            a6.g();
        }
        while (i6 < i10) {
            androidx.fragment.app.C2066a c2066a3 = (androidx.fragment.app.C2066a) arrayList.get(i6);
            if (((java.lang.Boolean) arrayList2.get(i6)).booleanValue() && c2066a3.f22382v >= 0) {
                c2066a3.f22382v = -1;
            }
            c2066a3.x();
            i6++;
        }
        if (z10) {
            d1();
        }
    }

    private void c1(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i6 < size) {
            if (!((androidx.fragment.app.C2066a) arrayList.get(i6)).f22694r) {
                if (i10 != i6) {
                    b0(arrayList, arrayList2, i10, i6);
                }
                i10 = i6 + 1;
                if (((java.lang.Boolean) arrayList2.get(i6)).booleanValue()) {
                    while (i10 < size && ((java.lang.Boolean) arrayList2.get(i10)).booleanValue() && !((androidx.fragment.app.C2066a) arrayList.get(i10)).f22694r) {
                        i10++;
                    }
                }
                b0(arrayList, arrayList2, i6, i10);
                i6 = i10 - 1;
            }
            i6++;
        }
        if (i10 != size) {
            b0(arrayList, arrayList2, i10, size);
        }
    }

    private int d0(java.lang.String str, int i6, boolean z6) {
        java.util.ArrayList arrayList = this.f22597d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i6 < 0) {
            if (z6) {
                return 0;
            }
            return this.f22597d.size() - 1;
        }
        int size = this.f22597d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.C2066a c2066a = (androidx.fragment.app.C2066a) this.f22597d.get(size);
            if ((str != null && str.equals(c2066a.w())) || (i6 >= 0 && i6 == c2066a.f22382v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f22597d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.C2066a c2066a2 = (androidx.fragment.app.C2066a) this.f22597d.get(size - 1);
            if ((str == null || !str.equals(c2066a2.w())) && (i6 < 0 || i6 != c2066a2.f22382v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private void d1() {
        java.util.ArrayList arrayList = this.f22606m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.D.a(this.f22606m.get(0));
        throw null;
    }

    static int f1(int i6) {
        int i10 = 4097;
        if (i6 == 4097) {
            return 8194;
        }
        if (i6 != 8194) {
            i10 = 8197;
            if (i6 == 8197) {
                return 4100;
            }
            if (i6 == 4099) {
                return 4099;
            }
            if (i6 != 4100) {
                return 0;
            }
        }
        return i10;
    }

    static androidx.fragment.app.n h0(android.view.View view) {
        androidx.fragment.app.g gVar;
        androidx.fragment.app.f fVarI0 = i0(view);
        if (fVarI0 != null) {
            if (fVarI0.a0()) {
                return fVarI0.s();
            }
            throw new java.lang.IllegalStateException("The Fragment " + fVarI0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        android.content.Context context = view.getContext();
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                gVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.g) {
                gVar = (androidx.fragment.app.g) context;
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (gVar != null) {
            return gVar.e0();
        }
        throw new java.lang.IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static androidx.fragment.app.f i0(android.view.View view) {
        while (view != null) {
            androidx.fragment.app.f fVarY0 = y0(view);
            if (fVarY0 != null) {
                return fVarY0;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    private void j0() {
        java.util.Iterator it = r().iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.A) it.next()).k();
        }
    }

    private boolean k0(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        synchronized (this.f22594a) {
            if (this.f22594a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f22594a.size();
                boolean zA = false;
                for (int i6 = 0; i6 < size; i6++) {
                    zA |= ((androidx.fragment.app.n.l) this.f22594a.get(i6)).a(arrayList, arrayList2);
                }
                this.f22594a.clear();
                this.f22615v.r().removeCallbacks(this.f22593R);
                return zA;
            } catch (java.lang.Throwable th) {
                this.f22594a.clear();
                this.f22615v.r().removeCallbacks(this.f22593R);
                throw th;
            }
        }
    }

    private void l1(androidx.fragment.app.f fVar) {
        android.view.ViewGroup viewGroupO0 = o0(fVar);
        if (viewGroupO0 == null || fVar.v() + fVar.y() + fVar.J() + fVar.K() <= 0) {
            return;
        }
        if (viewGroupO0.getTag(U1.b.f14459c) == null) {
            viewGroupO0.setTag(U1.b.f14459c, fVar);
        }
        ((androidx.fragment.app.f) viewGroupO0.getTag(U1.b.f14459c)).y1(fVar.I());
    }

    private androidx.fragment.app.q m0(androidx.fragment.app.f fVar) {
        return this.f22591P.m(fVar);
    }

    private void n1() {
        java.util.Iterator it = this.f22596c.k().iterator();
        while (it.hasNext()) {
            V0((androidx.fragment.app.s) it.next());
        }
    }

    private void o() {
        if (L0()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private android.view.ViewGroup o0(androidx.fragment.app.f fVar) {
        android.view.ViewGroup viewGroup = fVar.f22506j0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fVar.f22497a0 > 0 && this.f22616w.j()) {
            android.view.View viewH = this.f22616w.h(fVar.f22497a0);
            if (viewH instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) viewH;
            }
        }
        return null;
    }

    private void o1(java.lang.RuntimeException runtimeException) {
        runtimeException.getMessage();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.z("FragmentManager"));
        androidx.fragment.app.k kVar = this.f22615v;
        try {
            if (kVar != null) {
                kVar.w("  ", null, printWriter, new java.lang.String[0]);
            } else {
                U("  ", null, printWriter, new java.lang.String[0]);
            }
            throw runtimeException;
        } catch (java.lang.Exception e6) {
            throw runtimeException;
        }
    }

    private void p() {
        this.f22595b = false;
        this.f22589N.clear();
        this.f22588M.clear();
    }

    private void p1() {
        synchronized (this.f22594a) {
            try {
                if (this.f22594a.isEmpty()) {
                    this.f22601h.j(l0() > 0 && J0(this.f22617x));
                } else {
                    this.f22601h.j(true);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void q() {
        boolean zQ;
        androidx.fragment.app.k kVar = this.f22615v;
        if (kVar instanceof androidx.lifecycle.Y) {
            zQ = this.f22596c.p().q();
        } else {
            zQ = kVar.o() instanceof android.app.Activity ? !((android.app.Activity) this.f22615v.o()).isChangingConfigurations() : true;
        }
        if (zQ) {
            java.util.Iterator it = this.f22603j.values().iterator();
            while (it.hasNext()) {
                java.util.Iterator it2 = ((androidx.fragment.app.C2068c) it.next()).f22398C.iterator();
                while (it2.hasNext()) {
                    this.f22596c.p().j((java.lang.String) it2.next());
                }
            }
        }
    }

    private java.util.Set r() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f22596c.k().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((androidx.fragment.app.s) it.next()).k().f22506j0;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.A.o(viewGroup, w0()));
            }
        }
        return hashSet;
    }

    private java.util.Set s(java.util.ArrayList arrayList, int i6, int i10) {
        android.view.ViewGroup viewGroup;
        java.util.HashSet hashSet = new java.util.HashSet();
        while (i6 < i10) {
            java.util.Iterator it = ((androidx.fragment.app.C2066a) arrayList.get(i6)).f22679c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.f fVar = ((androidx.fragment.app.u.a) it.next()).f22697b;
                if (fVar != null && (viewGroup = fVar.f22506j0) != null) {
                    hashSet.add(androidx.fragment.app.A.n(viewGroup, this));
                }
            }
            i6++;
        }
        return hashSet;
    }

    static androidx.fragment.app.f y0(android.view.View view) {
        java.lang.Object tag = view.getTag(U1.b.f14457a);
        if (tag instanceof androidx.fragment.app.f) {
            return (androidx.fragment.app.f) tag;
        }
        return null;
    }

    boolean A(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.f22614u < 1) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        boolean z6 = false;
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null && I0(fVar) && fVar.U0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(fVar);
                z6 = true;
            }
        }
        if (this.f22598e != null) {
            for (int i6 = 0; i6 < this.f22598e.size(); i6++) {
                androidx.fragment.app.f fVar2 = (androidx.fragment.app.f) this.f22598e.get(i6);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.u0();
                }
            }
        }
        this.f22598e = arrayList;
        return z6;
    }

    void A0() {
        Y(true);
        if (this.f22601h.g()) {
            X0();
        } else {
            this.f22600g.l();
        }
    }

    void B() {
        this.f22586K = true;
        Y(true);
        V();
        q();
        Q(-1);
        java.lang.Object obj = this.f22615v;
        if (obj instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj).q(this.f22610q);
        }
        java.lang.Object obj2 = this.f22615v;
        if (obj2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj2).t(this.f22609p);
        }
        java.lang.Object obj3 = this.f22615v;
        if (obj3 instanceof androidx.core.app.n) {
            ((androidx.core.app.n) obj3).c(this.f22611r);
        }
        java.lang.Object obj4 = this.f22615v;
        if (obj4 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj4).l(this.f22612s);
        }
        java.lang.Object obj5 = this.f22615v;
        if ((obj5 instanceof androidx.core.view.InterfaceC2033w) && this.f22617x == null) {
            ((androidx.core.view.InterfaceC2033w) obj5).d(this.f22613t);
        }
        this.f22615v = null;
        this.f22616w = null;
        this.f22617x = null;
        if (this.f22600g != null) {
            this.f22601h.h();
            this.f22600g = null;
        }
        p070h.c cVar = this.f22579D;
        if (cVar != null) {
            cVar.c();
            this.f22580E.c();
            this.f22581F.c();
        }
    }

    void B0(androidx.fragment.app.f fVar) {
        if (E0(2)) {
            java.lang.String str = "hide: " + fVar;
        }
        if (fVar.f22499c0) {
            return;
        }
        fVar.f22499c0 = true;
        fVar.f22513q0 = true ^ fVar.f22513q0;
        l1(fVar);
    }

    void C() {
        Q(1);
    }

    void C0(androidx.fragment.app.f fVar) {
        if (fVar.f22484N && F0(fVar)) {
            this.f22583H = true;
        }
    }

    void D(boolean z6) {
        if (z6 && (this.f22615v instanceof androidx.core.content.c)) {
            o1(new java.lang.IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.a1();
                if (z6) {
                    fVar.f22494X.D(true);
                }
            }
        }
    }

    public boolean D0() {
        return this.f22586K;
    }

    void E(boolean z6, boolean z10) {
        if (z10 && (this.f22615v instanceof androidx.core.app.n)) {
            o1(new java.lang.IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.b1(z6);
                if (z10) {
                    fVar.f22494X.E(z6, true);
                }
            }
        }
    }

    void F(androidx.fragment.app.f fVar) {
        java.util.Iterator it = this.f22608o.iterator();
        while (it.hasNext()) {
            ((V1.k) it.next()).a(this, fVar);
        }
    }

    void G() {
        for (androidx.fragment.app.f fVar : this.f22596c.l()) {
            if (fVar != null) {
                fVar.y0(fVar.b0());
                fVar.f22494X.G();
            }
        }
    }

    boolean H(android.view.MenuItem menuItem) {
        if (this.f22614u < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null && fVar.c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean H0(androidx.fragment.app.f fVar) {
        if (fVar == null) {
            return false;
        }
        return fVar.b0();
    }

    void I(android.view.Menu menu) {
        if (this.f22614u < 1) {
            return;
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.d1(menu);
            }
        }
    }

    boolean I0(androidx.fragment.app.f fVar) {
        if (fVar == null) {
            return true;
        }
        return fVar.d0();
    }

    boolean J0(androidx.fragment.app.f fVar) {
        if (fVar == null) {
            return true;
        }
        androidx.fragment.app.n nVar = fVar.f22492V;
        return fVar.equals(nVar.v0()) && J0(nVar.f22617x);
    }

    void K() {
        Q(5);
    }

    boolean K0(int i6) {
        return this.f22614u >= i6;
    }

    void L(boolean z6, boolean z10) {
        if (z10 && (this.f22615v instanceof androidx.core.app.o)) {
            o1(new java.lang.IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.f1(z6);
                if (z10) {
                    fVar.f22494X.L(z6, true);
                }
            }
        }
    }

    public boolean L0() {
        return this.f22584I || this.f22585J;
    }

    boolean M(android.view.Menu menu) {
        boolean z6 = false;
        if (this.f22614u < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null && I0(fVar) && fVar.g1(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    void N() {
        p1();
        J(this.f22618y);
    }

    void O() {
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        Q(7);
    }

    void P() {
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        Q(5);
    }

    void R() {
        this.f22585J = true;
        this.f22591P.s(true);
        Q(4);
    }

    void R0(androidx.fragment.app.f fVar, android.content.Intent intent, int i6, android.os.Bundle bundle) {
        if (this.f22579D == null) {
            this.f22615v.z(fVar, intent, i6, bundle);
            return;
        }
        this.f22582G.addLast(new androidx.fragment.app.n.k(fVar.f22478H, i6));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f22579D.a(intent);
    }

    void S() {
        Q(2);
    }

    void S0(int i6, boolean z6) {
        androidx.fragment.app.k kVar;
        if (this.f22615v == null && i6 != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z6 || i6 != this.f22614u) {
            this.f22614u = i6;
            this.f22596c.t();
            n1();
            if (this.f22583H && (kVar = this.f22615v) != null && this.f22614u == 7) {
                kVar.A();
                this.f22583H = false;
            }
        }
    }

    void T0() {
        if (this.f22615v == null) {
            return;
        }
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.h0();
            }
        }
    }

    public void U(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String str2 = str + "    ";
        this.f22596c.e(str, fileDescriptor, printWriter, strArr);
        java.util.ArrayList arrayList = this.f22598e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size2; i6++) {
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f22598e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(fVar.toString());
            }
        }
        java.util.ArrayList arrayList2 = this.f22597d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.C2066a c2066a = (androidx.fragment.app.C2066a) this.f22597d.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c2066a.toString());
                c2066a.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f22602i.get());
        synchronized (this.f22594a) {
            try {
                int size3 = this.f22594a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i11 = 0; i11 < size3; i11++) {
                        androidx.fragment.app.n.l lVar = (androidx.fragment.app.n.l) this.f22594a.get(i11);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i11);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f22615v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f22616w);
        if (this.f22617x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f22617x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f22614u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f22584I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f22585J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f22586K);
        if (this.f22583H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f22583H);
        }
    }

    void U0(androidx.fragment.app.FragmentContainerView fragmentContainerView) {
        android.view.View view;
        for (androidx.fragment.app.s sVar : this.f22596c.k()) {
            androidx.fragment.app.f fVarK = sVar.k();
            if (fVarK.f22497a0 == fragmentContainerView.getId() && (view = fVarK.f22507k0) != null && view.getParent() == null) {
                fVarK.f22506j0 = fragmentContainerView;
                sVar.b();
            }
        }
    }

    void V0(androidx.fragment.app.s sVar) {
        androidx.fragment.app.f fVarK = sVar.k();
        if (fVarK.f22508l0) {
            if (this.f22595b) {
                this.f22587L = true;
            } else {
                fVarK.f22508l0 = false;
                sVar.m();
            }
        }
    }

    void W(androidx.fragment.app.n.l lVar, boolean z6) {
        if (!z6) {
            if (this.f22615v == null) {
                if (!this.f22586K) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f22594a) {
            try {
                if (this.f22615v == null) {
                    if (!z6) {
                        throw new java.lang.IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f22594a.add(lVar);
                    h1();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    void W0(int i6, int i10, boolean z6) {
        if (i6 >= 0) {
            W(new androidx.fragment.app.n.m(null, i6, i10), z6);
            return;
        }
        throw new java.lang.IllegalArgumentException("Bad id: " + i6);
    }

    public boolean X0() {
        return Z0(null, -1, 0);
    }

    boolean Y(boolean z6) {
        X(z6);
        boolean z10 = false;
        while (k0(this.f22588M, this.f22589N)) {
            z10 = true;
            this.f22595b = true;
            try {
                c1(this.f22588M, this.f22589N);
                p();
            } catch (java.lang.Throwable th) {
                p();
                throw th;
            }
        }
        p1();
        T();
        this.f22596c.b();
        return z10;
    }

    public boolean Y0(int i6, int i10) {
        if (i6 >= 0) {
            return Z0(null, i6, i10);
        }
        throw new java.lang.IllegalArgumentException("Bad id: " + i6);
    }

    void Z(androidx.fragment.app.n.l lVar, boolean z6) {
        if (z6 && (this.f22615v == null || this.f22586K)) {
            return;
        }
        X(z6);
        if (lVar.a(this.f22588M, this.f22589N)) {
            this.f22595b = true;
            try {
                c1(this.f22588M, this.f22589N);
                p();
            } catch (java.lang.Throwable th) {
                p();
                throw th;
            }
        }
        p1();
        T();
        this.f22596c.b();
    }

    boolean a1(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, int i6, int i10) {
        int iD0 = d0(str, i6, (i10 & 1) != 0);
        if (iD0 < 0) {
            return false;
        }
        for (int size = this.f22597d.size() - 1; size >= iD0; size--) {
            arrayList.add((androidx.fragment.app.C2066a) this.f22597d.remove(size));
            arrayList2.add(java.lang.Boolean.TRUE);
        }
        return true;
    }

    void b1(androidx.fragment.app.f fVar) {
        if (E0(2)) {
            java.lang.String str = "remove: " + fVar + " nesting=" + fVar.f22491U;
        }
        boolean z6 = !fVar.c0();
        if (!fVar.f22500d0 || z6) {
            this.f22596c.u(fVar);
            if (F0(fVar)) {
                this.f22583H = true;
            }
            fVar.f22485O = true;
            l1(fVar);
        }
    }

    androidx.fragment.app.f c0(java.lang.String str) {
        return this.f22596c.f(str);
    }

    public androidx.fragment.app.f e0(int i6) {
        return this.f22596c.g(i6);
    }

    void e1(android.os.Parcelable parcelable) {
        androidx.fragment.app.s sVar;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        android.os.Bundle bundle3 = (android.os.Bundle) parcelable;
        for (java.lang.String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f22615v.o().getClassLoader());
                this.f22604k.put(str.substring(7), bundle2);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f22615v.o().getClassLoader());
                arrayList.add((androidx.fragment.app.r) bundle.getParcelable("state"));
            }
        }
        this.f22596c.x(arrayList);
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) bundle3.getParcelable("state");
        if (pVar == null) {
            return;
        }
        this.f22596c.v();
        java.util.Iterator it = pVar.f22636C.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.r rVarB = this.f22596c.B((java.lang.String) it.next(), null);
            if (rVarB != null) {
                androidx.fragment.app.f fVarL = this.f22591P.l(rVarB.f22653D);
                if (fVarL != null) {
                    if (E0(2)) {
                        java.lang.String str3 = "restoreSaveState: re-attaching retained " + fVarL;
                    }
                    sVar = new androidx.fragment.app.s(this.f22607n, this.f22596c, fVarL, rVarB);
                } else {
                    sVar = new androidx.fragment.app.s(this.f22607n, this.f22596c, this.f22615v.o().getClassLoader(), p0(), rVarB);
                }
                androidx.fragment.app.f fVarK = sVar.k();
                fVarK.f22492V = this;
                if (E0(2)) {
                    java.lang.String str4 = "restoreSaveState: active (" + fVarK.f22478H + "): " + fVarK;
                }
                sVar.o(this.f22615v.o().getClassLoader());
                this.f22596c.r(sVar);
                sVar.t(this.f22614u);
            }
        }
        for (androidx.fragment.app.f fVar : this.f22591P.o()) {
            if (!this.f22596c.c(fVar.f22478H)) {
                if (E0(2)) {
                    java.lang.String str5 = "Discarding retained Fragment " + fVar + " that was not found in the set of active Fragments " + pVar.f22636C;
                }
                this.f22591P.r(fVar);
                fVar.f22492V = this;
                androidx.fragment.app.s sVar2 = new androidx.fragment.app.s(this.f22607n, this.f22596c, fVar);
                sVar2.t(1);
                sVar2.m();
                fVar.f22485O = true;
                sVar2.m();
            }
        }
        this.f22596c.w(pVar.f22637D);
        if (pVar.f22638E != null) {
            this.f22597d = new java.util.ArrayList(pVar.f22638E.length);
            int i6 = 0;
            while (true) {
                androidx.fragment.app.C2067b[] c2067bArr = pVar.f22638E;
                if (i6 >= c2067bArr.length) {
                    break;
                }
                androidx.fragment.app.C2066a c2066aB = c2067bArr[i6].b(this);
                if (E0(2)) {
                    java.lang.String str6 = "restoreAllState: back stack #" + i6 + " (index " + c2066aB.f22382v + "): " + c2066aB;
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.z("FragmentManager"));
                    c2066aB.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f22597d.add(c2066aB);
                i6++;
            }
        } else {
            this.f22597d = null;
        }
        this.f22602i.set(pVar.f22639F);
        java.lang.String str7 = pVar.f22640G;
        if (str7 != null) {
            androidx.fragment.app.f fVarC0 = c0(str7);
            this.f22618y = fVarC0;
            J(fVarC0);
        }
        java.util.ArrayList arrayList2 = pVar.f22641H;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                this.f22603j.put((java.lang.String) arrayList2.get(i10), (androidx.fragment.app.C2068c) pVar.f22642I.get(i10));
            }
        }
        this.f22582G = new java.util.ArrayDeque(pVar.f22643J);
    }

    public androidx.fragment.app.f f0(java.lang.String str) {
        return this.f22596c.h(str);
    }

    void g(androidx.fragment.app.C2066a c2066a) {
        if (this.f22597d == null) {
            this.f22597d = new java.util.ArrayList();
        }
        this.f22597d.add(c2066a);
    }

    androidx.fragment.app.f g0(java.lang.String str) {
        return this.f22596c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public android.os.Bundle M0() {
        androidx.fragment.app.C2067b[] c2067bArr;
        int size;
        android.os.Bundle bundle = new android.os.Bundle();
        j0();
        V();
        Y(true);
        this.f22584I = true;
        this.f22591P.s(true);
        java.util.ArrayList arrayListY = this.f22596c.y();
        java.util.ArrayList<androidx.fragment.app.r> arrayListM = this.f22596c.m();
        if (!arrayListM.isEmpty()) {
            java.util.ArrayList arrayListZ = this.f22596c.z();
            java.util.ArrayList arrayList = this.f22597d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c2067bArr = null;
            } else {
                c2067bArr = new androidx.fragment.app.C2067b[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c2067bArr[i6] = new androidx.fragment.app.C2067b((androidx.fragment.app.C2066a) this.f22597d.get(i6));
                    if (E0(2)) {
                        java.lang.String str = "saveAllState: adding back stack #" + i6 + ": " + this.f22597d.get(i6);
                    }
                }
            }
            androidx.fragment.app.p pVar = new androidx.fragment.app.p();
            pVar.f22636C = arrayListY;
            pVar.f22637D = arrayListZ;
            pVar.f22638E = c2067bArr;
            pVar.f22639F = this.f22602i.get();
            androidx.fragment.app.f fVar = this.f22618y;
            if (fVar != null) {
                pVar.f22640G = fVar.f22478H;
            }
            pVar.f22641H.addAll(this.f22603j.keySet());
            pVar.f22642I.addAll(this.f22603j.values());
            pVar.f22643J = new java.util.ArrayList(this.f22582G);
            bundle.putParcelable("state", pVar);
            for (java.lang.String str2 : this.f22604k.keySet()) {
                bundle.putBundle("result_" + str2, (android.os.Bundle) this.f22604k.get(str2));
            }
            for (androidx.fragment.app.r rVar : arrayListM) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("state", rVar);
                bundle.putBundle("fragment_" + rVar.f22653D, bundle2);
            }
        } else if (E0(2)) {
        }
        return bundle;
    }

    androidx.fragment.app.s h(androidx.fragment.app.f fVar) {
        java.lang.String str = fVar.f22516t0;
        if (str != null) {
            W1.c.f(fVar, str);
        }
        if (E0(2)) {
            java.lang.String str2 = "add: " + fVar;
        }
        androidx.fragment.app.s sVarT = t(fVar);
        fVar.f22492V = this;
        this.f22596c.r(sVarT);
        if (!fVar.f22500d0) {
            this.f22596c.a(fVar);
            fVar.f22485O = false;
            if (fVar.f22507k0 == null) {
                fVar.f22513q0 = false;
            }
            if (F0(fVar)) {
                this.f22583H = true;
            }
        }
        return sVarT;
    }

    void h1() {
        synchronized (this.f22594a) {
            try {
                if (this.f22594a.size() == 1) {
                    this.f22615v.r().removeCallbacks(this.f22593R);
                    this.f22615v.r().post(this.f22593R);
                    p1();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void i(V1.k kVar) {
        this.f22608o.add(kVar);
    }

    void i1(androidx.fragment.app.f fVar, boolean z6) {
        android.view.ViewGroup viewGroupO0 = o0(fVar);
        if (viewGroupO0 == null || !(viewGroupO0 instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) viewGroupO0).setDrawDisappearingViewsLast(!z6);
    }

    int j() {
        return this.f22602i.getAndIncrement();
    }

    void j1(androidx.fragment.app.f fVar, androidx.lifecycle.AbstractC2079k.b bVar) {
        if (fVar.equals(c0(fVar.f22478H)) && (fVar.f22493W == null || fVar.f22492V == this)) {
            fVar.f22517u0 = bVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + fVar + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0099, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    void k(androidx.fragment.app.k kVar, V1.e eVar, androidx.fragment.app.f fVar) {
        V1.k gVar;
        androidx.fragment.app.q qVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.String str;
        android.os.Bundle bundleB;
        p040e.A a6;
        androidx.lifecycle.r rVar;
        if (this.f22615v != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.f22615v = kVar;
        this.f22616w = eVar;
        this.f22617x = fVar;
        if (fVar == null) {
            if (kVar instanceof V1.k) {
                gVar = (V1.k) kVar;
            }
            if (this.f22617x != null) {
                p1();
            }
            if (kVar instanceof p040e.A) {
                a6 = (p040e.A) kVar;
                p040e.x xVarB = a6.b();
                this.f22600g = xVarB;
                if (fVar != null) {
                    rVar = a6;
                    rVar = fVar;
                }
                rVar = a6;
                xVarB.h(rVar, this.f22601h);
            }
            if (fVar != null) {
                qVar = fVar.f22492V.m0(fVar);
            } else if (kVar instanceof androidx.lifecycle.Y) {
                qVar = androidx.fragment.app.q.n(((androidx.lifecycle.Y) kVar).n());
            } else {
                qVar = new androidx.fragment.app.q(false);
            }
            this.f22591P = qVar;
            this.f22591P.s(L0());
            this.f22596c.A(this.f22591P);
            obj = this.f22615v;
            if ((obj instanceof p233x2.f) && fVar == null) {
                p233x2.d dVarP = ((p233x2.f) obj).p();
                dVarP.h("android:support:fragments", new x2.d.c() { // from class: V1.j
                    @Override // x2.d.c
                    public final android.os.Bundle a() {
                        return this.f15108a.M0();
                    }
                });
                bundleB = dVarP.b("android:support:fragments");
                if (bundleB != null) {
                    e1(bundleB);
                }
            }
            obj2 = this.f22615v;
            if (obj2 instanceof p070h.f) {
                p070h.e eVarM = ((p070h.f) obj2).m();
                if (fVar != null) {
                    str = fVar.f22478H + ":";
                } else {
                    str = "";
                }
                java.lang.String str2 = "FragmentManager:" + str;
                this.f22579D = eVarM.m(str2 + "StartActivityForResult", new p080i.d(), new androidx.fragment.app.n.h());
                this.f22580E = eVarM.m(str2 + "StartIntentSenderForResult", new androidx.fragment.app.n.j(), new androidx.fragment.app.n.i());
                this.f22581F = eVarM.m(str2 + "RequestPermissions", new p080i.b(), new androidx.fragment.app.n.a());
            }
            obj3 = this.f22615v;
            if (obj3 instanceof androidx.core.content.b) {
                ((androidx.core.content.b) obj3).i(this.f22609p);
            }
            obj4 = this.f22615v;
            if (obj4 instanceof androidx.core.content.c) {
                ((androidx.core.content.c) obj4).e(this.f22610q);
            }
            obj5 = this.f22615v;
            if (obj5 instanceof androidx.core.app.n) {
                ((androidx.core.app.n) obj5).v(this.f22611r);
            }
            obj6 = this.f22615v;
            if (obj6 instanceof androidx.core.app.o) {
                ((androidx.core.app.o) obj6).f(this.f22612s);
            }
            obj7 = this.f22615v;
            if ((obj7 instanceof androidx.core.view.InterfaceC2033w) || fVar != null) {
            }
            ((androidx.core.view.InterfaceC2033w) obj7).s(this.f22613t);
            return;
        }
        gVar = new androidx.fragment.app.n.g(fVar);
        i(gVar);
        if (this.f22617x != null) {
            p1();
        }
        if (kVar instanceof p040e.A) {
            a6 = (p040e.A) kVar;
            p040e.x xVarB2 = a6.b();
            this.f22600g = xVarB2;
            if (fVar != null) {
                rVar = a6;
                rVar = fVar;
            }
            rVar = a6;
            xVarB2.h(rVar, this.f22601h);
        }
        if (fVar != null) {
            qVar = fVar.f22492V.m0(fVar);
        } else if (kVar instanceof androidx.lifecycle.Y) {
            qVar = androidx.fragment.app.q.n(((androidx.lifecycle.Y) kVar).n());
        } else {
            qVar = new androidx.fragment.app.q(false);
        }
        this.f22591P = qVar;
        this.f22591P.s(L0());
        this.f22596c.A(this.f22591P);
        obj = this.f22615v;
        if (obj instanceof p233x2.f) {
            p233x2.d dVarP2 = ((p233x2.f) obj).p();
            dVarP2.h("android:support:fragments", new x2.d.c() { // from class: V1.j
                @Override // x2.d.c
                public final android.os.Bundle a() {
                    return this.f15108a.M0();
                }
            });
            bundleB = dVarP2.b("android:support:fragments");
            if (bundleB != null) {
                e1(bundleB);
            }
        }
        obj2 = this.f22615v;
        if (obj2 instanceof p070h.f) {
            p070h.e eVarM2 = ((p070h.f) obj2).m();
            if (fVar != null) {
                str = fVar.f22478H + ":";
            } else {
                str = "";
            }
            java.lang.String str3 = "FragmentManager:" + str;
            this.f22579D = eVarM2.m(str3 + "StartActivityForResult", new p080i.d(), new androidx.fragment.app.n.h());
            this.f22580E = eVarM2.m(str3 + "StartIntentSenderForResult", new androidx.fragment.app.n.j(), new androidx.fragment.app.n.i());
            this.f22581F = eVarM2.m(str3 + "RequestPermissions", new p080i.b(), new androidx.fragment.app.n.a());
        }
        obj3 = this.f22615v;
        if (obj3 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj3).i(this.f22609p);
        }
        obj4 = this.f22615v;
        if (obj4 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj4).e(this.f22610q);
        }
        obj5 = this.f22615v;
        if (obj5 instanceof androidx.core.app.n) {
            ((androidx.core.app.n) obj5).v(this.f22611r);
        }
        obj6 = this.f22615v;
        if (obj6 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) obj6).f(this.f22612s);
        }
        obj7 = this.f22615v;
        if (obj7 instanceof androidx.core.view.InterfaceC2033w) {
        }
    }

    void k1(androidx.fragment.app.f fVar) {
        if (fVar == null || (fVar.equals(c0(fVar.f22478H)) && (fVar.f22493W == null || fVar.f22492V == this))) {
            androidx.fragment.app.f fVar2 = this.f22618y;
            this.f22618y = fVar;
            J(fVar2);
            J(this.f22618y);
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + fVar + " is not an active fragment of FragmentManager " + this);
    }

    void l(androidx.fragment.app.f fVar) {
        if (E0(2)) {
            java.lang.String str = "attach: " + fVar;
        }
        if (fVar.f22500d0) {
            fVar.f22500d0 = false;
            if (fVar.f22484N) {
                return;
            }
            this.f22596c.a(fVar);
            if (E0(2)) {
                java.lang.String str2 = "add from attach: " + fVar;
            }
            if (F0(fVar)) {
                this.f22583H = true;
            }
        }
    }

    public int l0() {
        java.util.ArrayList arrayList = this.f22597d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public androidx.fragment.app.u m() {
        return new androidx.fragment.app.C2066a(this);
    }

    void m1(androidx.fragment.app.f fVar) {
        if (E0(2)) {
            java.lang.String str = "show: " + fVar;
        }
        if (fVar.f22499c0) {
            fVar.f22499c0 = false;
            fVar.f22513q0 = !fVar.f22513q0;
        }
    }

    boolean n() {
        boolean zF0 = false;
        for (androidx.fragment.app.f fVar : this.f22596c.l()) {
            if (fVar != null) {
                zF0 = F0(fVar);
            }
            if (zF0) {
                return true;
            }
        }
        return false;
    }

    V1.e n0() {
        return this.f22616w;
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.f22619z;
        if (jVar != null) {
            return jVar;
        }
        androidx.fragment.app.f fVar = this.f22617x;
        return fVar != null ? fVar.f22492V.p0() : this.f22576A;
    }

    public java.util.List q0() {
        return this.f22596c.o();
    }

    public androidx.fragment.app.k r0() {
        return this.f22615v;
    }

    android.view.LayoutInflater.Factory2 s0() {
        return this.f22599f;
    }

    androidx.fragment.app.s t(androidx.fragment.app.f fVar) {
        androidx.fragment.app.s sVarN = this.f22596c.n(fVar.f22478H);
        if (sVarN != null) {
            return sVarN;
        }
        androidx.fragment.app.s sVar = new androidx.fragment.app.s(this.f22607n, this.f22596c, fVar);
        sVar.o(this.f22615v.o().getClassLoader());
        sVar.t(this.f22614u);
        return sVar;
    }

    androidx.fragment.app.m t0() {
        return this.f22607n;
    }

    public java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.f fVar = this.f22617x;
        if (fVar == null) {
            androidx.fragment.app.k kVar = this.f22615v;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f22615v;
            } else {
                sb.append("null");
            }
            sb.append("}}");
            return sb.toString();
        }
        sb.append(fVar.getClass().getSimpleName());
        sb.append("{");
        obj = this.f22617x;
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    void u(androidx.fragment.app.f fVar) {
        if (E0(2)) {
            java.lang.String str = "detach: " + fVar;
        }
        if (fVar.f22500d0) {
            return;
        }
        fVar.f22500d0 = true;
        if (fVar.f22484N) {
            if (E0(2)) {
                java.lang.String str2 = "remove from detach: " + fVar;
            }
            this.f22596c.u(fVar);
            if (F0(fVar)) {
                this.f22583H = true;
            }
            l1(fVar);
        }
    }

    androidx.fragment.app.f u0() {
        return this.f22617x;
    }

    void v() {
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        Q(4);
    }

    public androidx.fragment.app.f v0() {
        return this.f22618y;
    }

    void w() {
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        Q(0);
    }

    androidx.fragment.app.B w0() {
        androidx.fragment.app.B b6 = this.f22577B;
        if (b6 != null) {
            return b6;
        }
        androidx.fragment.app.f fVar = this.f22617x;
        return fVar != null ? fVar.f22492V.w0() : this.f22578C;
    }

    void x(android.content.res.Configuration configuration, boolean z6) {
        if (z6 && (this.f22615v instanceof androidx.core.content.b)) {
            o1(new java.lang.IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null) {
                fVar.R0(configuration);
                if (z6) {
                    fVar.f22494X.x(configuration, true);
                }
            }
        }
    }

    public W1.c.C0293c x0() {
        return this.f22592Q;
    }

    boolean y(android.view.MenuItem menuItem) {
        if (this.f22614u < 1) {
            return false;
        }
        for (androidx.fragment.app.f fVar : this.f22596c.o()) {
            if (fVar != null && fVar.S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void z() {
        this.f22584I = false;
        this.f22585J = false;
        this.f22591P.s(false);
        Q(1);
    }

    androidx.lifecycle.X z0(androidx.fragment.app.f fVar) {
        return this.f22591P.p(fVar);
    }
}
