package L4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public interface a {
        void b(L4.e eVar);
    }

    public interface b {
        void a(L4.b bVar);
    }

    public static L4.c a(android.content.Context context) {
        return p055f4.AbstractC6543a.a(context).b();
    }

    public static void b(final android.app.Activity activity, final L4.b.a aVar) {
        if (p055f4.AbstractC6543a.a(activity).b().b()) {
            aVar.a(null);
            return;
        }
        p055f4.P pC = p055f4.AbstractC6543a.a(activity).c();
        p055f4.AbstractC6585v0.a();
        L4.f.b bVar = new L4.f.b() { // from class: f4.N
            @Override // L4.f.b
            public final void a(L4.b bVar2) {
                bVar2.a(activity, aVar);
            }
        };
        j$.util.Objects.requireNonNull(aVar);
        pC.b(bVar, new L4.f.a() { // from class: f4.O
            @Override // L4.f.a
            public final void b(L4.e eVar) {
                aVar.a(eVar);
            }
        });
    }

    public static void c(android.app.Activity activity, L4.b.a aVar) {
        p055f4.AbstractC6543a.a(activity).c().e(activity, aVar);
    }
}
