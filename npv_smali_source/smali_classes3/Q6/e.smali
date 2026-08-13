.class public abstract LQ6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LQ6/c;Ljava/nio/charset/Charset;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p2, LQ6/e$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LQ6/e$a;

    iget v1, v0, LQ6/e$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ6/e$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ6/e$a;

    invoke-direct {v0, p2}, LQ6/e$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LQ6/e$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQ6/e$a;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LQ6/e$a;->F:Ljava/lang/Object;

    check-cast p0, Ljava/nio/charset/CharsetDecoder;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0}, LT6/z;->a(LT6/x;)Ljava/nio/charset/Charset;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, p2

    :goto_1
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    invoke-virtual {p0}, LQ6/c;->H0()LD6/b;

    move-result-object p0

    const-class p2, Lo9/q;

    invoke-static {p2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    :try_start_0
    invoke-static {p2}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-object p2, v3

    :goto_2
    new-instance v5, Lb7/a;

    invoke-direct {v5, v2, p2}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    iput-object p1, v0, LQ6/e$a;->F:Ljava/lang/Object;

    iput v4, v0, LQ6/e$a;->H:I

    invoke-virtual {p0, v5, v0}, LD6/b;->a(Lb7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p0, p1

    :goto_3
    if-eqz p2, :cond_5

    check-cast p2, Lo9/q;

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p2, p1, v0, v3}, Lc7/b;->b(Ljava/nio/charset/CharsetDecoder;Lo9/q;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.io.Source"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(LQ6/c;Ljava/nio/charset/Charset;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, LS8/d;->b:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p0, p1, p2}, LQ6/e;->a(LQ6/c;Ljava/nio/charset/Charset;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LQ6/c;)LO6/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LQ6/c;->H0()LD6/b;

    move-result-object p0

    invoke-virtual {p0}, LD6/b;->d()LO6/b;

    move-result-object p0

    return-object p0
.end method
