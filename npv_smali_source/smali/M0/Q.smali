.class public abstract LM0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0/Q$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LM0/z;LM0/y;)LM0/A;
    .locals 0

    invoke-static {p0, p1}, LM0/Q;->b(LM0/z;LM0/y;)LM0/A;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LM0/z;LM0/y;)LM0/A;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LM0/c;->a(LM0/z;LM0/y;)LM0/A;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(LM0/P;LM0/P;F)LM0/P;
    .locals 3

    new-instance v0, LM0/P;

    invoke-virtual {p0}, LM0/P;->M()LM0/C;

    move-result-object v1

    invoke-virtual {p1}, LM0/P;->M()LM0/C;

    move-result-object v2

    invoke-static {v1, v2, p2}, LM0/D;->c(LM0/C;LM0/C;F)LM0/C;

    move-result-object v1

    invoke-virtual {p0}, LM0/P;->L()LM0/v;

    move-result-object p0

    invoke-virtual {p1}, LM0/P;->L()LM0/v;

    move-result-object p1

    invoke-static {p0, p1, p2}, LM0/w;->b(LM0/v;LM0/v;F)LM0/v;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LM0/P;-><init>(LM0/C;LM0/v;)V

    return-object v0
.end method

.method public static final d(LM0/P;LY0/v;)LM0/P;
    .locals 3

    new-instance v0, LM0/P;

    invoke-virtual {p0}, LM0/P;->y()LM0/C;

    move-result-object v1

    invoke-static {v1}, LM0/D;->h(LM0/C;)LM0/C;

    move-result-object v1

    invoke-virtual {p0}, LM0/P;->v()LM0/v;

    move-result-object v2

    invoke-static {v2, p1}, LM0/w;->e(LM0/v;LY0/v;)LM0/v;

    move-result-object p1

    invoke-virtual {p0}, LM0/P;->w()LM0/A;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0}, LM0/P;-><init>(LM0/C;LM0/v;LM0/A;)V

    return-object v0
.end method

.method public static final e(LY0/v;I)I
    .locals 4

    .prologue
    sget-object v0, LX0/l;->b:LX0/l$a;

    invoke-virtual {v0}, LX0/l$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LX0/l;->j(II)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    sget-object p1, LM0/Q$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_1

    if-ne p0, v2, :cond_0

    invoke-virtual {v0}, LX0/l$a;->c()I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {v0}, LX0/l$a;->b()I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LX0/l$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LX0/l;->j(II)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object p1, LM0/Q$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    if-eq p0, v3, :cond_4

    if-ne p0, v2, :cond_3

    invoke-virtual {v0}, LX0/l$a;->e()I

    move-result p1

    goto :goto_0

    :cond_3
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_4
    invoke-virtual {v0}, LX0/l$a;->d()I

    move-result p1

    :cond_5
    :goto_0
    return p1
.end method
