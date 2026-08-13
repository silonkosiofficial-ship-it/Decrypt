package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p198t8.o {
    public e(char c6) {
        super(java.lang.Character.valueOf(c6));
    }

    private final java.lang.String c(char c6) {
        if (c6 == '\b') {
            return "\\b";
        }
        if (c6 == '\t') {
            return "\\t";
        }
        if (c6 == '\n') {
            return "\\n";
        }
        if (c6 == '\f') {
            return "\\f";
        }
        if (c6 == '\r') {
            return "\\r";
        }
        return e(c6) ? java.lang.String.valueOf(c6) : "?";
    }

    private final boolean e(char c6) {
        byte type = (byte) java.lang.Character.getType(c6);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // p198t8.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public F8.M a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.M mU = g6.t().u();
        p247y7.AbstractC7350t.e(mU, "getCharType(...)");
        return mU;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        java.lang.String str = java.lang.String.format("\\u%04X ('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(((java.lang.Character) b()).charValue()), c(((java.lang.Character) b()).charValue())}, 2));
        p247y7.AbstractC7350t.e(str, "format(...)");
        return str;
    }
}
