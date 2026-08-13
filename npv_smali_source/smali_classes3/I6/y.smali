.class public abstract LI6/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Set;

.field private static final b:Lfa/d;

.field private static final c:LS6/a;

.field private static final d:LJ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, LT6/A;->b:LT6/A$a;

    invoke-virtual {v0}, LT6/A$a;->a()LT6/A;

    move-result-object v1

    invoke-virtual {v0}, LT6/A$a;->b()LT6/A;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [LT6/A;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LI6/y;->a:Ljava/util/Set;

    const-string v0, "io.ktor.client.plugins.HttpRedirect"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/y;->b:Lfa/d;

    new-instance v0, LS6/a;

    invoke-direct {v0}, LS6/a;-><init>()V

    sput-object v0, LI6/y;->c:LS6/a;

    sget-object v0, LI6/y$a;->L:LI6/y$a;

    new-instance v1, LI6/x;

    invoke-direct {v1}, LI6/x;-><init>()V

    const-string v2, "HttpRedirect"

    invoke-static {v2, v0, v1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/y;->d:LJ6/b;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/y;->b(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LJ6/d;)Li7/M;
    .locals 5

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/w;

    invoke-virtual {v0}, LI6/w;->b()Z

    move-result v0

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/w;

    invoke-virtual {v1}, LI6/w;->a()Z

    move-result v1

    sget-object v2, LJ6/k;->a:LJ6/k;

    new-instance v3, LI6/y$b;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, p0, v4}, LI6/y$b;-><init>(ZZLJ6/d;Lm7/e;)V

    invoke-virtual {p0, v2, v3}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final c(LJ6/k$a;LO6/d;LD6/b;ZLC6/c;Lm7/e;)Ljava/lang/Object;
    .locals 18

    .prologue
    move-object/from16 v0, p2

    move-object/from16 v1, p5

    instance-of v2, v1, LI6/y$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LI6/y$c;

    iget v3, v2, LI6/y$c;->P:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LI6/y$c;->P:I

    goto :goto_0

    :cond_0
    new-instance v2, LI6/y$c;

    invoke-direct {v2, v1}, LI6/y$c;-><init>(Lm7/e;)V

    :goto_0
    iget-object v1, v2, LI6/y$c;->O:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LI6/y$c;->P:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v0, v2, LI6/y$c;->N:Z

    iget-object v4, v2, LI6/y$c;->M:Ljava/lang/Object;

    check-cast v4, Ly7/O;

    iget-object v6, v2, LI6/y$c;->L:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v2, LI6/y$c;->K:Ljava/lang/Object;

    check-cast v7, LT6/U;

    iget-object v8, v2, LI6/y$c;->J:Ljava/lang/Object;

    check-cast v8, Ly7/O;

    iget-object v9, v2, LI6/y$c;->I:Ljava/lang/Object;

    check-cast v9, Ly7/O;

    iget-object v10, v2, LI6/y$c;->H:Ljava/lang/Object;

    check-cast v10, LC6/c;

    iget-object v11, v2, LI6/y$c;->G:Ljava/lang/Object;

    check-cast v11, LO6/d;

    iget-object v12, v2, LI6/y$c;->F:Ljava/lang/Object;

    check-cast v12, LJ6/k$a;

    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v0

    move-object v0, v12

    move-object v12, v8

    move-object v8, v6

    move-object/from16 v6, v16

    move-object/from16 v17, v9

    move-object v9, v7

    move-object/from16 v7, v17

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, LD6/b;->e()LQ6/c;

    move-result-object v1

    invoke-virtual {v1}, LQ6/c;->e()LT6/C;

    move-result-object v1

    invoke-static {v1}, LI6/y;->g(LT6/C;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iput-object v0, v1, Ly7/O;->C:Ljava/lang/Object;

    new-instance v4, Ly7/O;

    invoke-direct {v4}, Ly7/O;-><init>()V

    move-object/from16 v6, p1

    iput-object v6, v4, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, LD6/b;->d()LO6/b;

    move-result-object v7

    invoke-interface {v7}, LO6/b;->r()LT6/g0;

    move-result-object v7

    invoke-virtual {v7}, LT6/g0;->r()LT6/U;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, LD6/b;->d()LO6/b;

    move-result-object v0

    invoke-interface {v0}, LO6/b;->r()LT6/g0;

    move-result-object v0

    invoke-static {v0}, LT6/j0;->a(LT6/g0;)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    move-object v10, v4

    move-object v9, v7

    move-object/from16 v0, p0

    move-object v7, v1

    move-object v4, v2

    move/from16 v1, p3

    move-object/from16 v2, p4

    :goto_1
    invoke-virtual {v2}, LC6/c;->s()LS6/b;

    move-result-object v11

    sget-object v12, LI6/y;->c:LS6/a;

    iget-object v13, v7, Ly7/O;->C:Ljava/lang/Object;

    check-cast v13, LD6/b;

    invoke-virtual {v13}, LD6/b;->e()LQ6/c;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    iget-object v11, v7, Ly7/O;->C:Ljava/lang/Object;

    check-cast v11, LD6/b;

    invoke-virtual {v11}, LD6/b;->e()LQ6/c;

    move-result-object v11

    invoke-interface {v11}, LT6/x;->a()LT6/p;

    move-result-object v11

    sget-object v12, LT6/v;->a:LT6/v;

    invoke-virtual {v12}, LT6/v;->o()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v11, v13}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v13, LI6/y;->b:Lfa/d;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Received redirect response to "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, " for request "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LO6/d;->j()LT6/M;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Lfa/d;->g(Ljava/lang/String;)V

    new-instance v14, LO6/d;

    invoke-direct {v14}, LO6/d;-><init>()V

    iget-object v15, v10, Ly7/O;->C:Ljava/lang/Object;

    check-cast v15, LO6/d;

    invoke-virtual {v14, v15}, LO6/d;->r(LO6/d;)LO6/d;

    invoke-virtual {v14}, LO6/d;->j()LT6/M;

    move-result-object v15

    invoke-virtual {v15}, LT6/M;->k()LT6/H;

    move-result-object v15

    invoke-interface {v15}, LW6/z;->clear()V

    if-eqz v11, :cond_4

    invoke-virtual {v14}, LO6/d;->j()LT6/M;

    move-result-object v15

    invoke-static {v15, v11}, LT6/T;->l(LT6/M;Ljava/lang/String;)LT6/M;

    :cond_4
    if-nez v1, :cond_5

    invoke-static {v9}, LT6/V;->a(LT6/U;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v14}, LO6/d;->j()LT6/M;

    move-result-object v11

    invoke-virtual {v11}, LT6/M;->o()LT6/U;

    move-result-object v11

    invoke-static {v11}, LT6/V;->a(LT6/U;)Z

    move-result v11

    if-nez v11, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can not redirect "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LO6/d;->j()LT6/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " because of security downgrade"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v13, v0}, Lfa/d;->g(Ljava/lang/String;)V

    iget-object v0, v7, Ly7/O;->C:Ljava/lang/Object;

    return-object v0

    :cond_5
    invoke-virtual {v14}, LO6/d;->j()LT6/M;

    move-result-object v11

    invoke-static {v11}, LT6/O;->f(LT6/M;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    invoke-virtual {v14}, LO6/d;->a()LT6/q;

    move-result-object v11

    invoke-virtual {v12}, LT6/v;->e()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, LW6/B;->m(Ljava/lang/String;)V

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Removing Authorization header from redirect for "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LO6/d;->j()LT6/M;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v13, v11}, Lfa/d;->g(Ljava/lang/String;)V

    :cond_6
    iput-object v14, v10, Ly7/O;->C:Ljava/lang/Object;

    iput-object v0, v4, LI6/y$c;->F:Ljava/lang/Object;

    iput-object v6, v4, LI6/y$c;->G:Ljava/lang/Object;

    iput-object v2, v4, LI6/y$c;->H:Ljava/lang/Object;

    iput-object v7, v4, LI6/y$c;->I:Ljava/lang/Object;

    iput-object v10, v4, LI6/y$c;->J:Ljava/lang/Object;

    iput-object v9, v4, LI6/y$c;->K:Ljava/lang/Object;

    iput-object v8, v4, LI6/y$c;->L:Ljava/lang/Object;

    iput-object v7, v4, LI6/y$c;->M:Ljava/lang/Object;

    iput-boolean v1, v4, LI6/y$c;->N:Z

    iput v5, v4, LI6/y$c;->P:I

    invoke-virtual {v0, v14, v4}, LJ6/k$a;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_7

    return-object v3

    :cond_7
    move-object v12, v10

    move-object v10, v2

    move v2, v1

    move-object v1, v11

    move-object v11, v6

    move-object v6, v4

    move-object v4, v7

    :goto_2
    iput-object v1, v4, Ly7/O;->C:Ljava/lang/Object;

    iget-object v1, v7, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, LD6/b;

    invoke-virtual {v1}, LD6/b;->e()LQ6/c;

    move-result-object v1

    invoke-virtual {v1}, LQ6/c;->e()LT6/C;

    move-result-object v1

    invoke-static {v1}, LI6/y;->g(LT6/C;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v0, v7, Ly7/O;->C:Ljava/lang/Object;

    return-object v0

    :cond_8
    move v1, v2

    move-object v4, v6

    move-object v2, v10

    move-object v6, v11

    move-object v10, v12

    goto/16 :goto_1
.end method

.method public static final synthetic d(LJ6/k$a;LO6/d;LD6/b;ZLC6/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, LI6/y;->c(LJ6/k$a;LO6/d;LD6/b;ZLC6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e()Ljava/util/Set;
    .locals 1

    sget-object v0, LI6/y;->a:Ljava/util/Set;

    return-object v0
.end method

.method public static final f()LJ6/b;
    .locals 1

    sget-object v0, LI6/y;->d:LJ6/b;

    return-object v0
.end method

.method private static final g(LT6/C;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LT6/C;->m0()I

    move-result p0

    sget-object v0, LT6/C;->E:LT6/C$a;

    invoke-virtual {v0}, LT6/C$a;->r()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    if-eq p0, v1, :cond_1

    invoke-virtual {v0}, LT6/C$a;->j()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    if-eq p0, v1, :cond_1

    invoke-virtual {v0}, LT6/C$a;->R()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    if-eq p0, v1, :cond_1

    invoke-virtual {v0}, LT6/C$a;->E()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    if-eq p0, v1, :cond_1

    invoke-virtual {v0}, LT6/C$a;->N()LT6/C;

    move-result-object v0

    invoke-virtual {v0}, LT6/C;->m0()I

    move-result v0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
