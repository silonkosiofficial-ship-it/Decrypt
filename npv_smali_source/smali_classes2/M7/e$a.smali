.class public final LM7/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LM7/e$a;-><init>()V

    return-void
.end method

.method private final b(LM7/e;ILO7/f0;)LO7/j0;
    .locals 14

    .prologue
    invoke-interface/range {p3 .. p3}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "T"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "instance"

    goto :goto_0

    :cond_0
    const-string v1, "E"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "receiver"

    goto :goto_0

    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    new-instance v13, LR7/L;

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v5

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    const-string v0, "identifier(...)"

    invoke-static {v6, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p3 .. p3}, LO7/h;->w()LF8/M;

    move-result-object v7

    const-string v0, "getDefaultType(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, LO7/a0;->a:LO7/a0;

    const-string v0, "NO_SOURCE"

    invoke-static {v12, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v13

    move-object v2, p1

    move/from16 v4, p2

    invoke-direct/range {v1 .. v12}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    return-object v13
.end method


# virtual methods
.method public final a(LM7/b;Z)LM7/e;
    .locals 11

    .prologue
    const-string v0, "functionClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM7/b;->A()Ljava/util/List;

    move-result-object v0

    new-instance v10, LM7/e;

    sget-object v4, LO7/b$a;->C:LO7/b$a;

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v10

    move-object v2, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LM7/e;-><init>(LO7/m;LM7/e;LO7/b$a;ZLy7/k;)V

    invoke-virtual {p1}, LR7/a;->S0()LO7/X;

    move-result-object v3

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    move-object p1, v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/f0;

    invoke-interface {v2}, LO7/f0;->s()LF8/u0;

    move-result-object v2

    sget-object v6, LF8/u0;->H:LF8/u0;

    if-ne v2, v6, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lj7/v;->a1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p1

    new-instance v6, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p1, p2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {v6, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj7/L;

    sget-object v1, LM7/e;->g0:LM7/e$a;

    invoke-virtual {p2}, Lj7/L;->c()I

    move-result v2

    invoke-virtual {p2}, Lj7/L;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/f0;

    invoke-direct {v1, v10, v2, p2}, LM7/e$a;->b(LM7/e;ILO7/f0;)LO7/j0;

    move-result-object p2

    invoke-interface {v6, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/f0;

    invoke-interface {p1}, LO7/h;->w()LF8/M;

    move-result-object v7

    sget-object v8, LO7/D;->G:LO7/D;

    sget-object v9, LO7/t;->e:LO7/u;

    const/4 v2, 0x0

    move-object v1, v10

    invoke-virtual/range {v1 .. v9}, LR7/G;->w1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/G;

    const/4 p1, 0x1

    invoke-virtual {v10, p1}, LR7/p;->i1(Z)V

    return-object v10
.end method
