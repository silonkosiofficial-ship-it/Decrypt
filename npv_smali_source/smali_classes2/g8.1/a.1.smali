.class public abstract Lg8/a;
.super Lg8/b;
.source "SourceFile"

# interfaces
.implements LB8/c;


# instance fields
.field private final c:LE8/g;


# direct methods
.method public constructor <init>(LE8/n;Lg8/r;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lg8/b;-><init>(Lg8/r;)V

    new-instance p2, Lg8/a$d;

    invoke-direct {p2, p0}, Lg8/a$d;-><init>(Lg8/a;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, Lg8/a;->c:LE8/g;

    return-void
.end method

.method public static final synthetic B(Lg8/a;Lg8/t;)Lg8/d;
    .locals 0

    invoke-direct {p0, p1}, Lg8/a;->E(Lg8/t;)Lg8/d;

    move-result-object p0

    return-object p0
.end method

.method private final E(Lg8/t;)Lg8/d;
    .locals 10

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    new-instance v9, Lg8/a$b;

    move-object v0, v9

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, v8

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lg8/a$b;-><init>(Lg8/a;Ljava/util/HashMap;Lg8/t;Ljava/util/HashMap;Ljava/util/HashMap;)V

    invoke-virtual {p0, p1}, Lg8/b;->q(Lg8/t;)[B

    move-result-object v0

    invoke-interface {p1, v9, v0}, Lg8/t;->a(Lg8/t$d;[B)V

    new-instance p1, Lg8/d;

    invoke-direct {p1, v6, v7, v8}, Lg8/d;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-object p1
.end method

.method private final G(LB8/A;Li8/n;LB8/b;LF8/E;Lx7/p;)Ljava/lang/Object;
    .locals 10

    .prologue
    sget-object v0, Lg8/b;->b:Lg8/b$b;

    sget-object v1, Lk8/b;->B:Lk8/b$b;

    invoke-virtual {p2}, Li8/n;->a0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p2}, Lm8/i;->f(Li8/n;)Z

    move-result v5

    invoke-virtual {p0}, Lg8/b;->u()Lg8/r;

    move-result-object v6

    invoke-virtual {p0}, Lg8/b;->t()Lm8/e;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lg8/b$b;->a(LB8/A;ZZLjava/lang/Boolean;ZLg8/r;Lm8/e;)Lg8/t;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lg8/b;->o(LB8/A;Lg8/t;)Lg8/t;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Lg8/t;->b()Lh8/a;

    move-result-object v2

    invoke-virtual {v2}, Lh8/a;->d()Lm8/e;

    move-result-object v2

    sget-object v3, Lg8/j;->b:Lg8/j$a;

    invoke-virtual {v3}, Lg8/j$a;->a()Lm8/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lk8/a;->d(Lk8/a;)Z

    move-result v9

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v6

    invoke-virtual {p1}, LB8/A;->d()Lk8/g;

    move-result-object v7

    move-object v4, p0

    move-object v5, p2

    move-object v8, p3

    invoke-virtual/range {v4 .. v9}, Lg8/b;->r(Lp8/p;Lk8/c;Lk8/g;LB8/b;Z)Lg8/w;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    iget-object p2, p0, Lg8/a;->c:LE8/g;

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p5, p2, p1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-static {p4}, LL7/n;->d(LF8/E;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, Lg8/a;->H(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_3
    return-object p1
.end method


# virtual methods
.method protected C(Lg8/t;)Lg8/d;
    .locals 1

    const-string v0, "binaryClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/a;->c:LE8/g;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/d;

    return-object p1
.end method

.method protected final D(Ln8/b;Ljava/util/Map;)Z
    .locals 2

    .prologue
    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK7/a;->a:LK7/a;

    invoke-virtual {v0}, LK7/a;->a()Ln8/b;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string p1, "value"

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lt8/p;

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    check-cast p1, Lt8/p;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lt8/p$b$b;

    if-eqz p2, :cond_3

    move-object v1, p1

    check-cast v1, Lt8/p$b$b;

    :cond_3
    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {v1}, Lt8/p$b$b;->b()Ln8/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg8/b;->v(Ln8/b;)Z

    move-result p1

    return p1
.end method

.method protected abstract F(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract H(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public e(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LB8/b;->D:LB8/b;

    sget-object v6, Lg8/a$c;->D:Lg8/a$c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lg8/a;->G(LB8/A;Li8/n;LB8/b;LF8/E;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LB8/b;->E:LB8/b;

    sget-object v6, Lg8/a$a;->D:Lg8/a$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lg8/a;->G(LB8/A;Li8/n;LB8/b;LF8/E;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Lg8/t;)Lg8/b$a;
    .locals 0

    invoke-virtual {p0, p1}, Lg8/a;->C(Lg8/t;)Lg8/d;

    move-result-object p1

    return-object p1
.end method
