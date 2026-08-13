package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public interface g {

    public static final class a implements p129m9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f51236a;

        public a(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "conflicting");
            this.f51236a = obj;
        }

        @Override // p129m9.g
        public java.lang.String a() {
            return "attempted to overwrite the existing value '" + this.f51236a + '\'';
        }
    }

    public static final class b implements p129m9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m9.g.b f51237a = new m9.g.b();

        private b() {
        }

        @Override // p129m9.g
        public java.lang.String a() {
            return "expected an Int value";
        }
    }

    public static final class c implements p129m9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51238a;

        public c(int i6) {
            this.f51238a = i6;
        }

        @Override // p129m9.g
        public java.lang.String a() {
            return "expected at least " + this.f51238a + " digits";
        }
    }

    public static final class d implements p129m9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51239a;

        public d(int i6) {
            this.f51239a = i6;
        }

        @Override // p129m9.g
        public java.lang.String a() {
            return "expected at most " + this.f51239a + " digits";
        }
    }

    public static final class e implements p129m9.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f51240a;

        public e(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "expected");
            this.f51240a = str;
        }

        @Override // p129m9.g
        public java.lang.String a() {
            return "expected '" + this.f51240a + '\'';
        }
    }

    java.lang.String a();
}
