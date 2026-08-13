.class public abstract LY8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/N;Lm7/i;ILW8/P;Lx7/l;Lx7/p;)LY8/C;
    .locals 1

    .prologue
    invoke-static {p0, p1}, LW8/H;->j(LW8/N;Lm7/i;)Lm7/i;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x6

    invoke-static {p2, p1, p1, v0, p1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    invoke-virtual {p3}, LW8/P;->i()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LY8/w;

    invoke-direct {p2, p0, p1, p5}, LY8/w;-><init>(Lm7/i;LY8/j;Lx7/p;)V

    goto :goto_0

    :cond_0
    new-instance p2, LY8/a;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, LY8/a;-><init>(Lm7/i;LY8/j;Z)V

    :goto_0
    if-eqz p4, :cond_1

    invoke-virtual {p2, p4}, LW8/F0;->e1(Lx7/l;)LW8/f0;

    :cond_1
    invoke-virtual {p2, p3, p2, p5}, LW8/a;->j1(LW8/P;Ljava/lang/Object;Lx7/p;)V

    return-object p2
.end method

.method public static synthetic b(LW8/N;Lm7/i;ILW8/P;Lx7/l;Lx7/p;ILjava/lang/Object;)LY8/C;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LW8/P;->C:LW8/P;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move-object v4, p4

    move-object v0, p0

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LY8/b;->a(LW8/N;Lm7/i;ILW8/P;Lx7/l;Lx7/p;)LY8/C;

    move-result-object p0

    return-object p0
.end method
