.class public abstract LS8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LS8/l;
    .locals 0

    invoke-static {p0, p1, p2}, LS8/p;->e(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LS8/l;
    .locals 0

    invoke-static {p0, p1}, LS8/p;->f(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ljava/util/regex/MatchResult;)LE7/i;
    .locals 0

    invoke-static {p0}, LS8/p;->g(Ljava/util/regex/MatchResult;)LE7/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ljava/util/regex/MatchResult;I)LE7/i;
    .locals 0

    invoke-static {p0, p1}, LS8/p;->h(Ljava/util/regex/MatchResult;I)LE7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LS8/l;
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, LS8/m;

    invoke-direct {p1, p0, p2}, LS8/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method private static final f(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LS8/l;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, LS8/m;

    invoke-direct {v0, p0, p1}, LS8/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private static final g(Ljava/util/regex/MatchResult;)LE7/i;
    .locals 1

    invoke-interface {p0}, Ljava/util/regex/MatchResult;->start()I

    move-result v0

    invoke-interface {p0}, Ljava/util/regex/MatchResult;->end()I

    move-result p0

    invoke-static {v0, p0}, LE7/j;->q(II)LE7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/util/regex/MatchResult;I)LE7/i;
    .locals 1

    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->start(I)I

    move-result v0

    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->end(I)I

    move-result p0

    invoke-static {v0, p0}, LE7/j;->q(II)LE7/i;

    move-result-object p0

    return-object p0
.end method
