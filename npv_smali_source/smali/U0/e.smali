.class public abstract LU0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;)LM0/s;
    .locals 8

    new-instance v7, LU0/d;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, LU0/d;-><init>(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LR0/h$b;LY0/e;)V

    return-object v7
.end method

.method public static final synthetic b(LM0/P;)Z
    .locals 0

    invoke-static {p0}, LU0/e;->c(LM0/P;)Z

    move-result p0

    return p0
.end method

.method private static final c(LM0/P;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LM0/P;->w()LM0/A;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LM0/A;->a()LM0/y;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LM0/y;->b()I

    move-result p0

    invoke-static {p0}, LM0/g;->d(I)LM0/g;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LM0/g;->b:LM0/g$a;

    invoke-virtual {v0}, LM0/g$a;->c()I

    move-result v0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LM0/g;->j()I

    move-result p0

    invoke-static {p0, v0}, LM0/g;->g(II)Z

    move-result p0

    :goto_1
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final d(ILT0/h;)I
    .locals 6

    .prologue
    sget-object v0, LX0/l;->b:LX0/l$a;

    invoke-virtual {v0}, LX0/l$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LX0/l;->j(II)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LX0/l$a;->c()I

    move-result v1

    invoke-static {p0, v1}, LX0/l;->j(II)Z

    move-result v1

    const/4 v3, 0x3

    if-eqz v1, :cond_2

    :cond_1
    move v2, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LX0/l$a;->d()I

    move-result v1

    invoke-static {p0, v1}, LX0/l;->j(II)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    move v2, v4

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LX0/l$a;->e()I

    move-result v1

    invoke-static {p0, v1}, LX0/l;->j(II)Z

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    move v2, v5

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LX0/l$a;->a()I

    move-result v1

    invoke-static {p0, v1}, LX0/l;->j(II)Z

    move-result v1

    if-eqz v1, :cond_5

    move p0, v5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LX0/l$a;->f()I

    move-result v0

    invoke-static {p0, v0}, LX0/l;->j(II)Z

    move-result p0

    :goto_0
    if-eqz p0, :cond_9

    if-eqz p1, :cond_6

    invoke-virtual {p1, v4}, LT0/h;->f(I)LT0/g;

    move-result-object p0

    invoke-virtual {p0}, LT0/g;->b()Ljava/util/Locale;

    move-result-object p0

    if-nez p0, :cond_7

    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    :cond_7
    invoke-static {p0}, Landroidx/core/text/r;->a(Ljava/util/Locale;)I

    move-result p0

    if-eqz p0, :cond_8

    if-eq p0, v5, :cond_1

    :cond_8
    :goto_1
    return v2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid TextDirection."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
