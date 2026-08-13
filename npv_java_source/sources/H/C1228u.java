package H;

/* JADX INFO: renamed from: H.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H.C1228u.a f4175g = new H.C1228u.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final H.C1228u f4176h = new H.C1228u(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f4177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f4178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f4179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.l f4180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f4181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x7.l f4182f;

    /* JADX INFO: renamed from: H.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final H.C1228u a() {
            return H.C1228u.f4176h;
        }
    }

    public C1228u(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, p237x7.l lVar4, p237x7.l lVar5, p237x7.l lVar6) {
        this.f4177a = lVar;
        this.f4178b = lVar2;
        this.f4179c = lVar3;
        this.f4180d = lVar4;
        this.f4181e = lVar5;
        this.f4182f = lVar6;
    }

    public /* synthetic */ C1228u(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, p237x7.l lVar4, p237x7.l lVar5, p237x7.l lVar6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : lVar, (i6 & 2) != 0 ? null : lVar2, (i6 & 4) != 0 ? null : lVar3, (i6 & 8) != 0 ? null : lVar4, (i6 & 16) != 0 ? null : lVar5, (i6 & 32) != 0 ? null : lVar6);
    }

    public final p237x7.l b() {
        return this.f4177a;
    }

    public final p237x7.l c() {
        return this.f4178b;
    }

    public final p237x7.l d() {
        return this.f4179c;
    }

    public final p237x7.l e() {
        return this.f4180d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H.C1228u)) {
            return false;
        }
        H.C1228u c1228u = (H.C1228u) obj;
        return this.f4177a == c1228u.f4177a && this.f4178b == c1228u.f4178b && this.f4179c == c1228u.f4179c && this.f4180d == c1228u.f4180d && this.f4181e == c1228u.f4181e && this.f4182f == c1228u.f4182f;
    }

    public final p237x7.l f() {
        return this.f4181e;
    }

    public final p237x7.l g() {
        return this.f4182f;
    }

    public int hashCode() {
        p237x7.l lVar = this.f4177a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        p237x7.l lVar2 = this.f4178b;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        p237x7.l lVar3 = this.f4179c;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        p237x7.l lVar4 = this.f4180d;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        p237x7.l lVar5 = this.f4181e;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        p237x7.l lVar6 = this.f4182f;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }
}
