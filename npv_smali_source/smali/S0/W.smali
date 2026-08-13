.class public abstract LS0/W;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LS0/V;)LM0/d;
    .locals 3

    invoke-virtual {p0}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LS0/V;->h()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LM0/d;->p(J)LM0/d;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LS0/V;I)LM0/d;
    .locals 4

    invoke-virtual {p0}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result v1

    invoke-virtual {p0}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->k(J)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {p0}, LS0/V;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {v2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-virtual {v0, v1, p0}, LM0/d;->o(II)LM0/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LS0/V;I)LM0/d;
    .locals 3

    invoke-virtual {p0}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-virtual {p0}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result p0

    invoke-virtual {v0, p1, p0}, LM0/d;->o(II)LM0/d;

    move-result-object p0

    return-object p0
.end method
