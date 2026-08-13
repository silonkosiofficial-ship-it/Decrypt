package P1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P1.d.a f8282a = new P1.d.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final P1.f a(java.io.InputStream inputStream) throws M1.c {
            p247y7.AbstractC7350t.f(inputStream, "input");
            try {
                P1.f fVarV = P1.f.V(inputStream);
                p247y7.AbstractC7350t.e(fVarV, "{\n                Prefer…From(input)\n            }");
                return fVarV;
            } catch (androidx.datastore.preferences.protobuf.C2065z e6) {
                throw new M1.c("Unable to parse preferences proto.", e6);
            }
        }
    }
}
