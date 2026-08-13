.class public final Lr8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr8/d;

    invoke-direct {v0}, Lr8/d;-><init>()V

    sput-object v0, Lr8/d;->a:Lr8/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(ZLO7/a;LO7/a;LF8/e0;LF8/e0;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lr8/d;->d(ZLO7/a;LO7/a;LF8/e0;LF8/e0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lr8/d;LO7/a;LO7/a;ZZZLG8/g;ILjava/lang/Object;)Z
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lr8/d;->b(LO7/a;LO7/a;ZZZLG8/g;)Z

    move-result p0

    return p0
.end method

.method private static final d(ZLO7/a;LO7/a;LF8/e0;LF8/e0;)Z
    .locals 2

    .prologue
    const-string v0, "$a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c1"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {p3}, LF8/e0;->w()LO7/h;

    move-result-object p3

    invoke-interface {p4}, LF8/e0;->w()LO7/h;

    move-result-object p4

    instance-of v0, p3, LO7/f0;

    if-eqz v0, :cond_2

    instance-of v0, p4, LO7/f0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lr8/d;->a:Lr8/d;

    check-cast p3, LO7/f0;

    check-cast p4, LO7/f0;

    new-instance v1, Lr8/d$b;

    invoke-direct {v1, p1, p2}, Lr8/d$b;-><init>(LO7/a;LO7/a;)V

    invoke-virtual {v0, p3, p4, p0, v1}, Lr8/d;->i(LO7/f0;LO7/f0;ZLx7/p;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private final e(LO7/e;LO7/e;)Z
    .locals 0

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p2}, LO7/h;->p()LF8/e0;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static synthetic g(Lr8/d;LO7/m;LO7/m;ZZILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lr8/d;->f(LO7/m;LO7/m;ZZ)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lr8/d;LO7/f0;LO7/f0;ZLx7/p;ILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lr8/d$c;->D:Lr8/d$c;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lr8/d;->i(LO7/f0;LO7/f0;ZLx7/p;)Z

    move-result p0

    return p0
.end method

.method private final k(LO7/m;LO7/m;Lx7/p;Z)Z
    .locals 7

    .prologue
    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object v1

    invoke-interface {p2}, LO7/m;->b()LO7/m;

    move-result-object v2

    instance-of p1, v1, LO7/b;

    if-nez p1, :cond_1

    instance-of p1, v2, LO7/b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v3, p4

    invoke-static/range {v0 .. v6}, Lr8/d;->g(Lr8/d;LO7/m;LO7/m;ZZILjava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p3, v1, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_1
    return p1
.end method

.method private final l(LO7/a;)LO7/a0;
    .locals 3

    .prologue
    :goto_0
    instance-of v0, p1, LO7/b;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LO7/b;

    invoke-interface {v0}, LO7/b;->j()LO7/b$a;

    move-result-object v1

    sget-object v2, LO7/b$a;->D:LO7/b$a;

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, LO7/b;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, LO7/p;->o()LO7/a0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(LO7/a;LO7/a;ZZZLG8/g;)Z
    .locals 3

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    if-eqz p4, :cond_2

    instance-of p4, p1, LO7/C;

    if-eqz p4, :cond_2

    instance-of p4, p2, LO7/C;

    if-eqz p4, :cond_2

    move-object p4, p1

    check-cast p4, LO7/C;

    invoke-interface {p4}, LO7/C;->R()Z

    move-result p4

    move-object v0, p2

    check-cast v0, LO7/C;

    invoke-interface {v0}, LO7/C;->R()Z

    move-result v0

    if-eq p4, v0, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p4

    invoke-interface {p2}, LO7/n;->b()LO7/m;

    move-result-object v0

    invoke-static {p4, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_4

    if-nez p3, :cond_3

    return v2

    :cond_3
    invoke-direct {p0, p1}, Lr8/d;->l(LO7/a;)LO7/a0;

    move-result-object p4

    invoke-direct {p0, p2}, Lr8/d;->l(LO7/a;)LO7/a0;

    move-result-object v0

    invoke-static {p4, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_4

    return v2

    :cond_4
    invoke-static {p1}, Lr8/f;->E(LO7/m;)Z

    move-result p4

    if-nez p4, :cond_8

    invoke-static {p2}, Lr8/f;->E(LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_5

    goto :goto_1

    :cond_5
    sget-object p4, Lr8/d$a;->D:Lr8/d$a;

    invoke-direct {p0, p1, p2, p4, p3}, Lr8/d;->k(LO7/m;LO7/m;Lx7/p;Z)Z

    move-result p4

    if-nez p4, :cond_6

    return v2

    :cond_6
    new-instance p4, Lr8/c;

    invoke-direct {p4, p3, p1, p2}, Lr8/c;-><init>(ZLO7/a;LO7/a;)V

    invoke-static {p6, p4}, Lr8/l;->i(LG8/g;LG8/e$a;)Lr8/l;

    move-result-object p3

    const-string p4, "create(...)"

    invoke-static {p3, p4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 p4, p5, 0x1

    const/4 p6, 0x0

    invoke-virtual {p3, p1, p2, p6, p4}, Lr8/l;->E(LO7/a;LO7/a;LO7/e;Z)Lr8/l$i;

    move-result-object p4

    invoke-virtual {p4}, Lr8/l$i;->c()Lr8/l$i$a;

    move-result-object p4

    sget-object v0, Lr8/l$i$a;->C:Lr8/l$i$a;

    if-ne p4, v0, :cond_7

    xor-int/lit8 p4, p5, 0x1

    invoke-virtual {p3, p2, p1, p6, p4}, Lr8/l;->E(LO7/a;LO7/a;LO7/e;Z)Lr8/l$i;

    move-result-object p1

    invoke-virtual {p1}, Lr8/l$i;->c()Lr8/l$i$a;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_7
    move v1, v2

    :goto_0
    return v1

    :cond_8
    :goto_1
    return v2
.end method

.method public final f(LO7/m;LO7/m;ZZ)Z
    .locals 10

    .prologue
    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_0

    instance-of v0, p2, LO7/e;

    if-eqz v0, :cond_0

    check-cast p1, LO7/e;

    check-cast p2, LO7/e;

    invoke-direct {p0, p1, p2}, Lr8/d;->e(LO7/e;LO7/e;)Z

    move-result p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LO7/f0;

    if-eqz v0, :cond_1

    instance-of v0, p2, LO7/f0;

    if-eqz v0, :cond_1

    move-object v2, p1

    check-cast v2, LO7/f0;

    move-object v3, p2

    check-cast v3, LO7/f0;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v4, p3

    invoke-static/range {v1 .. v7}, Lr8/d;->j(Lr8/d;LO7/f0;LO7/f0;ZLx7/p;ILjava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LO7/a;

    if-eqz v0, :cond_2

    instance-of v0, p2, LO7/a;

    if-eqz v0, :cond_2

    move-object v2, p1

    check-cast v2, LO7/a;

    move-object v3, p2

    check-cast v3, LO7/a;

    sget-object v7, LG8/g$a;->a:LG8/g$a;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v9}, Lr8/d;->c(Lr8/d;LO7/a;LO7/a;ZZZLG8/g;ILjava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_2
    instance-of p3, p1, LO7/K;

    if-eqz p3, :cond_3

    instance-of p3, p2, LO7/K;

    if-eqz p3, :cond_3

    check-cast p1, LO7/K;

    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object p1

    check-cast p2, LO7/K;

    invoke-interface {p2}, LO7/K;->e()Ln8/c;

    move-result-object p2

    :cond_3
    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final h(LO7/f0;LO7/f0;Z)Z
    .locals 8

    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v7}, Lr8/d;->j(Lr8/d;LO7/f0;LO7/f0;ZLx7/p;ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final i(LO7/f0;LO7/f0;ZLx7/p;)Z
    .locals 3

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equivalentCallables"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object v0

    invoke-interface {p2}, LO7/n;->b()LO7/m;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-direct {p0, p1, p2, p4, p3}, Lr8/d;->k(LO7/m;LO7/m;Lx7/p;Z)Z

    move-result p3

    if-nez p3, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, LO7/f0;->getIndex()I

    move-result p1

    invoke-interface {p2}, LO7/f0;->getIndex()I

    move-result p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1
.end method
