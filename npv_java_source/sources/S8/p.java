package S8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final S8.InterfaceC1639l e(java.util.regex.Matcher matcher, int i6, java.lang.CharSequence charSequence) {
        if (matcher.find(i6)) {
            return new S8.C1640m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S8.InterfaceC1639l f(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        if (matcher.matches()) {
            return new S8.C1640m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E7.i g(java.util.regex.MatchResult matchResult) {
        return E7.j.q(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E7.i h(java.util.regex.MatchResult matchResult, int i6) {
        return E7.j.q(matchResult.start(i6), matchResult.end(i6));
    }
}
