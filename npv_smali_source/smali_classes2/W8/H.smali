.class public abstract LW8/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ly7/O;ZLm7/i;Lm7/i$b;)Lm7/i;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LW8/H;->e(Ly7/O;ZLm7/i;Lm7/i$b;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm7/i;Lm7/i$b;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LW8/H;->f(Lm7/i;Lm7/i$b;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLm7/i$b;)Z
    .locals 0

    invoke-static {p0, p1}, LW8/H;->i(ZLm7/i$b;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lm7/i;Lm7/i;Z)Lm7/i;
    .locals 3

    .prologue
    invoke-static {p0}, LW8/H;->h(Lm7/i;)Z

    move-result v0

    invoke-static {p1}, LW8/H;->h(Lm7/i;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, Lm7/j;->C:Lm7/j;

    new-instance v2, LW8/F;

    invoke-direct {v2, v0, p2}, LW8/F;-><init>(Ly7/O;Z)V

    invoke-interface {p0, p1, v2}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm7/i;

    if-eqz v1, :cond_1

    iget-object p2, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast p2, Lm7/i;

    new-instance v1, LW8/G;

    invoke-direct {v1}, LW8/G;-><init>()V

    invoke-interface {p2, p1, v1}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast p1, Lm7/i;

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ly7/O;ZLm7/i;Lm7/i$b;)Lm7/i;
    .locals 0

    invoke-interface {p2, p3}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lm7/i;Lm7/i$b;)Lm7/i;
    .locals 0

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lm7/i;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final h(Lm7/i;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, LW8/E;

    invoke-direct {v1}, LW8/E;-><init>()V

    invoke-interface {p0, v0, v1}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final i(ZLm7/i$b;)Z
    .locals 0

    return p0
.end method

.method public static final j(LW8/N;Lm7/i;)Lm7/i;
    .locals 1

    .prologue
    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LW8/H;->d(Lm7/i;Lm7/i;Z)Lm7/i;

    move-result-object p0

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object p1

    if-eq p0, p1, :cond_0

    sget-object p1, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p0, p1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object p1

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final k(Lm7/i;Lm7/i;)Lm7/i;
    .locals 1

    .prologue
    invoke-static {p1}, LW8/H;->h(Lm7/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LW8/H;->d(Lm7/i;Lm7/i;Z)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lo7/e;)LW8/c1;
    .locals 2

    .prologue
    :cond_0
    instance-of v0, p0, LW8/Z;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lo7/e;->e()Lo7/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, LW8/c1;

    if-eqz v0, :cond_0

    check-cast p0, LW8/c1;

    return-object p0
.end method

.method public static final m(Lm7/e;Lm7/i;Ljava/lang/Object;)LW8/c1;
    .locals 2

    .prologue
    instance-of v0, p0, Lo7/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LW8/d1;->C:LW8/d1;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast p0, Lo7/e;

    invoke-static {p0}, LW8/H;->l(Lo7/e;)LW8/c1;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1, p2}, LW8/c1;->n1(Lm7/i;Ljava/lang/Object;)V

    :cond_1
    return-object p0

    :cond_2
    return-object v1
.end method
