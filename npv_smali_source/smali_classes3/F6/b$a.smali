.class public abstract LF6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static final synthetic a(LF6/b;LO6/e;)V
    .locals 0

    invoke-static {p0, p1}, LF6/b$a;->d(LF6/b;LO6/e;)V

    return-void
.end method

.method public static final synthetic b(LF6/b;LO6/e;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LF6/b$a;->e(LF6/b;LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LF6/b;)Z
    .locals 0

    invoke-static {p0}, LF6/b$a;->f(LF6/b;)Z

    move-result p0

    return p0
.end method

.method private static d(LF6/b;LO6/e;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, LO6/e;->g()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF6/h;

    invoke-interface {p0}, LF6/b;->W()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Engine doesn\'t support "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method private static e(LF6/b;LO6/e;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p2, LF6/b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LF6/b$a$a;

    iget v1, v0, LF6/b$a$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LF6/b$a$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LF6/b$a$a;

    invoke-direct {v0, p2}, LF6/b$a$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LF6/b$a$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LF6/b$a$a;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LF6/b$a$a;->G:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LO6/e;

    iget-object p0, v0, LF6/b$a$a;->F:Ljava/lang/Object;

    check-cast p0, LF6/b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p0

    goto :goto_1

    :cond_4
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, LO6/e;->d()LW8/z0;

    move-result-object p2

    iput-object p0, v0, LF6/b$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LF6/b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, LF6/b$a$a;->I:I

    invoke-static {p0, p2, v0}, LF6/l;->b(LF6/b;LW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :goto_1
    check-cast p2, Lm7/i;

    new-instance p0, LF6/m;

    invoke-direct {p0, p2}, LF6/m;-><init>(Lm7/i;)V

    invoke-interface {p2, p0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v5

    new-instance v7, LF6/b$a$b;

    const/4 p0, 0x0

    invoke-direct {v7, v4, p1, p0}, LF6/b$a$b;-><init>(LF6/b;LO6/e;Lm7/e;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    iput-object p0, v0, LF6/b$a$a;->F:Ljava/lang/Object;

    iput-object p0, v0, LF6/b$a$a;->G:Ljava/lang/Object;

    iput v3, v0, LF6/b$a$a;->I:I

    invoke-interface {p1, v0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p2
.end method

.method private static f(LF6/b;)Z
    .locals 1

    .prologue
    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, LW8/z0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LW8/z0;->f()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static g(LF6/b;)Ljava/util/Set;
    .locals 0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static h(LF6/b;LC6/c;)V
    .locals 4

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC6/c;->N()LO6/i;

    move-result-object v0

    sget-object v1, LO6/i;->g:LO6/i$a;

    invoke-virtual {v1}, LO6/i$a;->a()La7/i;

    move-result-object v1

    new-instance v2, LF6/b$a$c;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, LF6/b$a$c;-><init>(LC6/c;LF6/b;Lm7/e;)V

    invoke-virtual {v0, v1, v2}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method
