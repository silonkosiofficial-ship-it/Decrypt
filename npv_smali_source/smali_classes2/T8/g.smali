.class public abstract LT8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(J)J
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gez p0, :cond_0

    sget-object p0, LT8/a;->D:LT8/a$a;

    invoke-virtual {p0}, LT8/a$a;->b()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object p0, LT8/a;->D:LT8/a$a;

    invoke-virtual {p0}, LT8/a$a;->a()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final b(JJLT8/d;)J
    .locals 4

    .prologue
    const-string v0, "unit"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x1

    sub-long v2, p2, v0

    or-long/2addr v0, v2

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {p2, p3}, LT8/g;->a(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LT8/a;->S(J)J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LT8/g;->c(JJLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final c(JJLT8/d;)J
    .locals 7

    .prologue
    sub-long v0, p0, p2

    xor-long v2, v0, p0

    xor-long v4, v0, p2

    not-long v4, v4

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    sget-object v2, LT8/d;->F:LT8/d;

    invoke-virtual {p4, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    const-wide/16 v0, 0x1

    invoke-static {v0, v1, v2, p4}, LT8/e;->b(JLT8/d;LT8/d;)J

    move-result-wide v0

    div-long v3, p0, v0

    div-long v5, p2, v0

    sub-long/2addr v3, v5

    rem-long/2addr p0, v0

    rem-long/2addr p2, v0

    sub-long/2addr p0, p2

    sget-object p2, LT8/a;->D:LT8/a$a;

    invoke-static {v3, v4, v2}, LT8/c;->t(JLT8/d;)J

    move-result-wide p2

    invoke-static {p0, p1, p4}, LT8/c;->t(JLT8/d;)J

    move-result-wide p0

    invoke-static {p2, p3, p0, p1}, LT8/a;->O(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {v0, v1}, LT8/g;->a(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LT8/a;->S(J)J

    move-result-wide p0

    return-wide p0

    :cond_1
    invoke-static {v0, v1, p4}, LT8/c;->t(JLT8/d;)J

    move-result-wide p0

    return-wide p0
.end method
