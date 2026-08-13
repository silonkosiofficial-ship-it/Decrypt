package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.G f16060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.G f16061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f16062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f16063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16064e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String[] b() {
            X7.z zVar = X7.z.this;
            java.util.List listC = p097j7.AbstractC6879v.c();
            listC.add(zVar.a().g());
            X7.G gB = zVar.b();
            if (gB != null) {
                listC.add("under-migration:" + gB.g());
            }
            for (java.util.Map.Entry entry : zVar.c().entrySet()) {
                listC.add('@' + entry.getKey() + ':' + ((X7.G) entry.getValue()).g());
            }
            return (java.lang.String[]) p097j7.AbstractC6879v.a(listC).toArray(new java.lang.String[0]);
        }
    }

    public z(X7.G g6, X7.G g10, java.util.Map map) {
        p247y7.AbstractC7350t.f(g6, "globalLevel");
        p247y7.AbstractC7350t.f(map, "userDefinedLevelForSpecificAnnotation");
        this.f16060a = g6;
        this.f16061b = g10;
        this.f16062c = map;
        this.f16063d = p087i7.AbstractC6669o.b(new X7.z.a());
        X7.G g11 = X7.G.IGNORE;
        this.f16064e = g6 == g11 && g10 == g11 && map.isEmpty();
    }

    public /* synthetic */ z(X7.G g6, X7.G g10, java.util.Map map, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(g6, (i6 & 2) != 0 ? null : g10, (i6 & 4) != 0 ? p097j7.S.h() : map);
    }

    public final X7.G a() {
        return this.f16060a;
    }

    public final X7.G b() {
        return this.f16061b;
    }

    public final java.util.Map c() {
        return this.f16062c;
    }

    public final boolean d() {
        return this.f16064e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X7.z)) {
            return false;
        }
        X7.z zVar = (X7.z) obj;
        return this.f16060a == zVar.f16060a && this.f16061b == zVar.f16061b && p247y7.AbstractC7350t.b(this.f16062c, zVar.f16062c);
    }

    public int hashCode() {
        int iHashCode = this.f16060a.hashCode() * 31;
        X7.G g6 = this.f16061b;
        return ((iHashCode + (g6 == null ? 0 : g6.hashCode())) * 31) + this.f16062c.hashCode();
    }

    public java.lang.String toString() {
        return "Jsr305Settings(globalLevel=" + this.f16060a + ", migrationLevel=" + this.f16061b + ", userDefinedLevelForSpecificAnnotation=" + this.f16062c + ')';
    }
}
