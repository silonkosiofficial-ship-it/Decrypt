package p041e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p041e0.j f44516a = a(e0.k.a.f44517D, e0.k.b.f44518D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e0.k.a f44517D = new e0.k.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p041e0.l lVar, java.lang.Object obj) {
            return obj;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e0.k.b f44518D = new e0.k.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return obj;
        }
    }

    public static final class c implements p041e0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.p f44519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44520b;

        c(p237x7.p pVar, p237x7.l lVar) {
            this.f44519a = pVar;
            this.f44520b = lVar;
        }

        @Override // p041e0.j
        public java.lang.Object a(java.lang.Object obj) {
            return this.f44520b.l(obj);
        }

        @Override // p041e0.j
        public java.lang.Object b(p041e0.l lVar, java.lang.Object obj) {
            return this.f44519a.u(lVar, obj);
        }
    }

    public static final p041e0.j a(p237x7.p pVar, p237x7.l lVar) {
        return new e0.k.c(pVar, lVar);
    }

    public static final p041e0.j b() {
        p041e0.j jVar = f44516a;
        p247y7.AbstractC7350t.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return jVar;
    }
}
