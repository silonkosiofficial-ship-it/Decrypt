package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.j f22677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ClassLoader f22678b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f22680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f22684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f22685i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    java.lang.String f22687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f22688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    java.lang.CharSequence f22689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f22690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    java.lang.CharSequence f22691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    java.util.ArrayList f22692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    java.util.ArrayList f22693q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    java.util.ArrayList f22695s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.util.ArrayList f22679c = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f22686j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f22694r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.fragment.app.f f22697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.AbstractC2079k.b f22703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.lifecycle.AbstractC2079k.b f22704i;

        a() {
        }

        a(int i6, androidx.fragment.app.f fVar) {
            this.f22696a = i6;
            this.f22697b = fVar;
            this.f22698c = false;
            androidx.lifecycle.AbstractC2079k.b bVar = androidx.lifecycle.AbstractC2079k.b.RESUMED;
            this.f22703h = bVar;
            this.f22704i = bVar;
        }

        a(int i6, androidx.fragment.app.f fVar, boolean z6) {
            this.f22696a = i6;
            this.f22697b = fVar;
            this.f22698c = z6;
            androidx.lifecycle.AbstractC2079k.b bVar = androidx.lifecycle.AbstractC2079k.b.RESUMED;
            this.f22703h = bVar;
            this.f22704i = bVar;
        }
    }

    u(androidx.fragment.app.j jVar, java.lang.ClassLoader classLoader) {
        this.f22677a = jVar;
        this.f22678b = classLoader;
    }

    public androidx.fragment.app.u b(int i6, androidx.fragment.app.f fVar, java.lang.String str) {
        k(i6, fVar, str, 1);
        return this;
    }

    androidx.fragment.app.u c(android.view.ViewGroup viewGroup, androidx.fragment.app.f fVar, java.lang.String str) {
        fVar.f22506j0 = viewGroup;
        return b(viewGroup.getId(), fVar, str);
    }

    public androidx.fragment.app.u d(androidx.fragment.app.f fVar, java.lang.String str) {
        k(0, fVar, str, 1);
        return this;
    }

    void e(androidx.fragment.app.u.a aVar) {
        this.f22679c.add(aVar);
        aVar.f22699d = this.f22680d;
        aVar.f22700e = this.f22681e;
        aVar.f22701f = this.f22682f;
        aVar.f22702g = this.f22683g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public androidx.fragment.app.u j() {
        if (this.f22685i) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f22686j = false;
        return this;
    }

    void k(int i6, androidx.fragment.app.f fVar, java.lang.String str, int i10) {
        java.lang.String str2 = fVar.f22516t0;
        if (str2 != null) {
            W1.c.f(fVar, str2);
        }
        java.lang.Class<?> cls = fVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str3 = fVar.f22498b0;
            if (str3 != null && !str.equals(str3)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + fVar + ": was " + fVar.f22498b0 + " now " + str);
            }
            fVar.f22498b0 = str;
        }
        if (i6 != 0) {
            if (i6 == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + fVar + " with tag " + str + " to container view with no id");
            }
            int i11 = fVar.f22496Z;
            if (i11 != 0 && i11 != i6) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + fVar + ": was " + fVar.f22496Z + " now " + i6);
            }
            fVar.f22496Z = i6;
            fVar.f22497a0 = i6;
        }
        e(new androidx.fragment.app.u.a(i10, fVar));
    }

    public androidx.fragment.app.u l(androidx.fragment.app.f fVar) {
        e(new androidx.fragment.app.u.a(3, fVar));
        return this;
    }

    public androidx.fragment.app.u m(int i6, androidx.fragment.app.f fVar) {
        return n(i6, fVar, null);
    }

    public androidx.fragment.app.u n(int i6, androidx.fragment.app.f fVar, java.lang.String str) {
        if (i6 == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i6, fVar, str, 2);
        return this;
    }

    public androidx.fragment.app.u o(boolean z6) {
        this.f22694r = z6;
        return this;
    }
}
