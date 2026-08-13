package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    public static final class a extends p007a7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p007a7.i f17083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p007a7.i iVar) {
            super(null);
            p247y7.AbstractC7350t.f(iVar, "relativeTo");
            this.f17083a = iVar;
        }

        public final p007a7.i a() {
            return this.f17083a;
        }
    }

    public static final class b extends p007a7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p007a7.i f17084a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p007a7.i iVar) {
            super(null);
            p247y7.AbstractC7350t.f(iVar, "relativeTo");
            this.f17084a = iVar;
        }
    }

    public static final class c extends p007a7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a7.j.c f17085a = new a7.j.c();

        private c() {
            super(null);
        }

        public boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof a7.j.c);
        }

        public int hashCode() {
            return 967869129;
        }

        public java.lang.String toString() {
            return "Last";
        }
    }

    private j() {
    }

    public /* synthetic */ j(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }
}
