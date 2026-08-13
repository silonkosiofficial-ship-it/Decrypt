package p040e;

/* JADX INFO: loaded from: classes.dex */
public final class v implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final e.v.c f44429D = new e.v.c(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f44430E = p087i7.AbstractC6669o.b(e.v.b.f44432D);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Activity f44431C;

    public static abstract class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public abstract boolean a(android.view.inputmethod.InputMethodManager inputMethodManager);

        public abstract java.lang.Object b(android.view.inputmethod.InputMethodManager inputMethodManager);

        public abstract android.view.View c(android.view.inputmethod.InputMethodManager inputMethodManager);
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e.v.b f44432D = new e.v.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.v.a b() {
            try {
                java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                java.lang.reflect.Field declaredField2 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                p247y7.AbstractC7350t.e(declaredField3, "hField");
                p247y7.AbstractC7350t.e(declaredField, "servedViewField");
                p247y7.AbstractC7350t.e(declaredField2, "nextServedViewField");
                return new e.v.e(declaredField3, declaredField, declaredField2);
            } catch (java.lang.NoSuchFieldException unused) {
                return e.v.d.f44433a;
            }
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final e.v.a a() {
            return (e.v.a) p040e.v.f44430E.getValue();
        }
    }

    public static final class d extends e.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e.v.d f44433a = new e.v.d();

        private d() {
            super(null);
        }

        @Override // e.v.a
        public boolean a(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            return false;
        }

        @Override // e.v.a
        public java.lang.Object b(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            return null;
        }

        @Override // e.v.a
        public android.view.View c(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends e.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Field f44434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Field f44435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.reflect.Field f44436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(java.lang.reflect.Field field, java.lang.reflect.Field field2, java.lang.reflect.Field field3) {
            super(null);
            p247y7.AbstractC7350t.f(field, "hField");
            p247y7.AbstractC7350t.f(field2, "servedViewField");
            p247y7.AbstractC7350t.f(field3, "nextServedViewField");
            this.f44434a = field;
            this.f44435b = field2;
            this.f44436c = field3;
        }

        @Override // e.v.a
        public boolean a(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            try {
                this.f44436c.set(inputMethodManager, null);
                return true;
            } catch (java.lang.IllegalAccessException unused) {
                return false;
            }
        }

        @Override // e.v.a
        public java.lang.Object b(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            try {
                return this.f44434a.get(inputMethodManager);
            } catch (java.lang.IllegalAccessException unused) {
                return null;
            }
        }

        @Override // e.v.a
        public android.view.View c(android.view.inputmethod.InputMethodManager inputMethodManager) {
            p247y7.AbstractC7350t.f(inputMethodManager, "<this>");
            try {
                return (android.view.View) this.f44435b.get(inputMethodManager);
            } catch (java.lang.ClassCastException | java.lang.IllegalAccessException unused) {
                return null;
            }
        }
    }

    public v(android.app.Activity activity) {
        p247y7.AbstractC7350t.f(activity, "activity");
        this.f44431C = activity;
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_DESTROY) {
            return;
        }
        java.lang.Object systemService = this.f44431C.getSystemService("input_method");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        e.v.a aVarA = f44429D.a();
        java.lang.Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            android.view.View viewC = aVarA.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVarA.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
