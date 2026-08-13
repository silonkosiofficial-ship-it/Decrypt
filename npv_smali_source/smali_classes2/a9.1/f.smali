.class public abstract La9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LZ8/g;Lm7/i;)LZ8/g;
    .locals 0

    invoke-static {p0, p1}, La9/f;->d(LZ8/g;Lm7/i;)LZ8/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lm7/i;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {p0, p2}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    new-instance v0, La9/A;

    invoke-direct {v0, p4, p0}, La9/A;-><init>(Lm7/e;Lm7/i;)V

    instance-of v1, p3, Lo7/a;

    if-nez v1, :cond_0

    invoke-static {p3, p1, v0}, Ln7/b;->e(Lx7/p;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    invoke-static {p3, v1}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx7/p;

    invoke-interface {p3, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p0, p2}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_1

    invoke-static {p4}, Lo7/h;->c(Lm7/e;)V

    :cond_1
    return-object p1

    :goto_1
    invoke-static {p0, p2}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    throw p1
.end method

.method public static synthetic c(Lm7/i;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    invoke-static {p0}, Lb9/K;->g(Lm7/i;)Ljava/lang/Object;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, La9/f;->b(Lm7/i;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LZ8/g;Lm7/i;)LZ8/g;
    .locals 1

    .prologue
    instance-of v0, p0, La9/z;

    if-nez v0, :cond_1

    instance-of v0, p0, La9/s;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, La9/C;

    invoke-direct {v0, p0, p1}, La9/C;-><init>(LZ8/g;Lm7/i;)V

    move-object p0, v0

    :cond_1
    :goto_0
    return-object p0
.end method
