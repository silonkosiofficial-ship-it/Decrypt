package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1981v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Class[] f20336a = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f20337D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p233x2.d f20338E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.String f20339F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z6, p233x2.d dVar, java.lang.String str) {
            super(0);
            this.f20337D = z6;
            this.f20338E = dVar;
            this.f20339F = str;
        }

        public final void a() {
            if (this.f20337D) {
                this.f20338E.j(this.f20339F);
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.AbstractC1981v0.b f20340D = new androidx.compose.ui.platform.AbstractC1981v0.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(androidx.compose.ui.platform.AbstractC1981v0.f(obj));
        }
    }

    public static final androidx.compose.ui.platform.C1977t0 b(android.view.View view, p233x2.f fVar) {
        java.lang.Object parent = view.getParent();
        p247y7.AbstractC7350t.d(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) parent;
        java.lang.Object tag = view2.getTag(p071h0.l.f45812H);
        java.lang.String strValueOf = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (strValueOf == null) {
            strValueOf = java.lang.String.valueOf(view2.getId());
        }
        return c(strValueOf, fVar);
    }

    public static final androidx.compose.ui.platform.C1977t0 c(java.lang.String str, p233x2.f fVar) {
        boolean z6;
        java.lang.String str2 = p041e0.g.class.getSimpleName() + ':' + str;
        p233x2.d dVarP = fVar.p();
        android.os.Bundle bundleB = dVarP.b(str2);
        final p041e0.g gVarA = p041e0.i.a(bundleB != null ? h(bundleB) : null, androidx.compose.ui.platform.AbstractC1981v0.b.f20340D);
        try {
            dVarP.h(str2, new x2.d.c() { // from class: androidx.compose.ui.platform.u0
                @Override // x2.d.c
                public final android.os.Bundle a() {
                    return androidx.compose.ui.platform.AbstractC1981v0.d(gVarA);
                }
            });
            z6 = true;
        } catch (java.lang.IllegalArgumentException unused) {
            z6 = false;
        }
        return new androidx.compose.ui.platform.C1977t0(gVarA, new androidx.compose.ui.platform.AbstractC1981v0.a(z6, dVarP, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle d(p041e0.g gVar) {
        return g(gVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(java.lang.Object obj) {
        if (obj instanceof p051f0.q) {
            p051f0.q qVar = (p051f0.q) obj;
            if (qVar.c() != V.v1.j() && qVar.c() != V.v1.p() && qVar.c() != V.v1.m()) {
                return false;
            }
            java.lang.Object value = qVar.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof p087i7.InterfaceC6663i) && (obj instanceof java.io.Serializable)) {
            return false;
        }
        for (java.lang.Class cls : f20336a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final android.os.Bundle g(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
        }
        return bundle;
    }

    private static final java.util.Map h(android.os.Bundle bundle) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            p247y7.AbstractC7350t.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
