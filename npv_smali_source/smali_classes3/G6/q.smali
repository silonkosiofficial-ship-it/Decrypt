.class public abstract LG6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/q$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(LO6/e;Ljava/io/IOException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0, p1}, LG6/q;->f(LO6/e;Ljava/io/IOException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LH9/x;LH9/z;LO6/e;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p4}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    invoke-virtual {p0, p1}, LH9/x;->E(LH9/z;)LH9/e;

    move-result-object p0

    sget-object p1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p3, p1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, LW8/z0;

    new-instance v4, LG6/q$b;

    invoke-direct {v4, p0}, LG6/q$b;-><init>(LH9/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/z0$a;->d(LW8/z0;ZZLx7/l;ILjava/lang/Object;)LW8/f0;

    new-instance p1, LG6/b;

    invoke-direct {p1, p2, v0}, LG6/b;-><init>(LO6/e;LW8/l;)V

    invoke-interface {p0, p1}, LH9/e;->N(LH9/f;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p4}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p0
.end method

.method public static final c(LH9/t;)LT6/p;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG6/q$c;

    invoke-direct {v0, p0}, LG6/q$c;-><init>(LH9/t;)V

    return-object v0
.end method

.method public static final d(LH9/y;)LT6/B;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LG6/q$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, LT6/B;->d:LT6/B$a;

    invoke-virtual {p0}, LT6/B$a;->d()LT6/B;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    sget-object p0, LT6/B;->d:LT6/B$a;

    invoke-virtual {p0}, LT6/B$a;->c()LT6/B;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    sget-object p0, LT6/B;->d:LT6/B$a;

    invoke-virtual {p0}, LT6/B$a;->e()LT6/B;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    sget-object p0, LT6/B;->d:LT6/B$a;

    invoke-virtual {p0}, LT6/B$a;->b()LT6/B;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    sget-object p0, LT6/B;->d:LT6/B$a;

    invoke-virtual {p0}, LT6/B$a;->a()LT6/B;

    move-result-object p0

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final e(Ljava/io/IOException;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "connect"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, LS8/r;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method private static final f(LO6/e;Ljava/io/IOException;)Ljava/lang/Throwable;
    .locals 1

    .prologue
    instance-of v0, p1, LG6/r;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, p0

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_3

    invoke-static {p1}, LG6/q;->e(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, LI6/I;->b(LO6/e;Ljava/lang/Throwable;)LH6/a;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, LI6/I;->e(LO6/e;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;

    move-result-object p0

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method
