package W6;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15371b;

    public l(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "content");
        this.f15370a = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i6 = 0; i6 < length; i6++) {
            lowerCase = (lowerCase * 31) + java.lang.Character.toLowerCase(str.charAt(i6));
        }
        this.f15371b = lowerCase;
    }

    public final java.lang.String a() {
        return this.f15370a;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        W6.l lVar = obj instanceof W6.l ? (W6.l) obj : null;
        return (lVar == null || (str = lVar.f15370a) == null || !S8.r.K(str, this.f15370a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f15371b;
    }

    public java.lang.String toString() {
        return this.f15370a;
    }
}
