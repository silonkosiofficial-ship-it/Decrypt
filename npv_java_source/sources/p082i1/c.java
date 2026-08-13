package p082i1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final i1.c.a f46636I = new i1.c.a(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f46637J = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final char[] f46638C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f46639D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f46640E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p082i1.b f46641F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46642G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final float f46643H;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(p082i1.c cVar) {
        this(cVar.f46638C);
        p247y7.AbstractC7350t.f(cVar, "clElement");
        this.f46639D = cVar.C();
        this.f46640E = cVar.f();
        this.f46641F = cVar.f46641F;
        this.f46642G = cVar.f46642G;
    }

    public c(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "content");
        this.f46638C = cArr;
        this.f46639D = -1L;
        this.f46640E = Long.MAX_VALUE;
    }

    public final long C() {
        return this.f46639D;
    }

    public final java.lang.String D() {
        java.lang.String string = p247y7.P.b(getClass()).toString();
        java.lang.String strSubstring = string.substring(S8.r.v0(string, '.', 0, false, 6, null) + 1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean E() {
        return !(this.f46638C.length == 0);
    }

    public final void M(p082i1.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "element");
        this.f46641F = bVar;
    }

    public final void N(long j6) {
        if (this.f46640E != Long.MAX_VALUE) {
            return;
        }
        this.f46640E = j6;
        p082i1.b bVar = this.f46641F;
        if (bVar != null) {
            bVar.P(this);
        }
    }

    public final void O(long j6) {
        this.f46639D = j6;
    }

    public abstract p082i1.c d();

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public final java.lang.String e() {
        int i6;
        java.lang.String strV0 = p097j7.AbstractC6872n.v0(this.f46638C, "", null, null, 0, null, null, 62, null);
        if (strV0.length() == 0) {
            return "";
        }
        long j6 = this.f46640E;
        if (j6 != Long.MAX_VALUE) {
            long j10 = this.f46639D;
            if (j6 < j10) {
                j6 = this.f46639D;
                i6 = (int) j6;
            } else {
                i6 = (int) j10;
            }
        } else {
            j6 = this.f46639D;
            i6 = (int) j6;
        }
        java.lang.String strSubstring = strV0.substring(i6, ((int) j6) + 1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p082i1.c)) {
            return false;
        }
        p082i1.c cVar = (p082i1.c) obj;
        if (this.f46639D == cVar.f46639D && this.f46640E == cVar.f46640E && this.f46642G == cVar.f46642G && java.util.Arrays.equals(this.f46638C, cVar.f46638C)) {
            return p247y7.AbstractC7350t.b(this.f46641F, cVar.f46641F);
        }
        return false;
    }

    public final long f() {
        return this.f46640E;
    }

    public float g() {
        if (this instanceof p082i1.e) {
            return this.f46643H;
        }
        return Float.NaN;
    }

    public int hashCode() {
        int iHashCode = this.f46638C.hashCode() * 31;
        long j6 = this.f46639D;
        int i6 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f46640E;
        int i10 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        p082i1.b bVar = this.f46641F;
        int iHashCode2 = 0;
        if (bVar != null && bVar != null) {
            iHashCode2 = bVar.hashCode();
        }
        return ((i10 + iHashCode2) * 31) + this.f46642G;
    }

    public int o() {
        if (this instanceof p082i1.e) {
            return o();
        }
        return 0;
    }

    public final int s() {
        return this.f46642G;
    }

    public java.lang.String toString() {
        long j6 = this.f46639D;
        long j10 = this.f46640E;
        if (j6 > j10 || j10 == Long.MAX_VALUE) {
            return p247y7.P.b(getClass()) + " (INVALID, " + this.f46639D + "-" + this.f46640E + ")";
        }
        java.lang.String strSubstring = p097j7.AbstractC6872n.v0(this.f46638C, "", null, null, 0, null, null, 62, null).substring((int) this.f46639D, ((int) this.f46640E) + 1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return D() + " (" + this.f46639D + " : " + this.f46640E + ") <<" + strSubstring + ">>";
    }
}
