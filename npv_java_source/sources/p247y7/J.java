package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J extends p247y7.AbstractC7337f implements F7.k {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final boolean f57249J;

    public J(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f57249J = (i6 & 2) == 2;
    }

    @Override // p247y7.AbstractC7337f
    public F7.b a() {
        return this.f57249J ? this : super.a();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p247y7.J) {
            p247y7.J j6 = (p247y7.J) obj;
            return k().equals(j6.k()) && getName().equals(j6.getName()) && n().equals(j6.n()) && p247y7.AbstractC7350t.b(f(), j6.f());
        }
        if (obj instanceof F7.k) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((k().hashCode() * 31) + getName().hashCode()) * 31) + n().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p247y7.AbstractC7337f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public F7.k m() {
        if (this.f57249J) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (F7.k) super.m();
    }

    public java.lang.String toString() {
        F7.b bVarA = a();
        if (bVarA != this) {
            return bVarA.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
