.class final LI6/I$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/lang/Long;

.field final synthetic K:Ljava/lang/Long;

.field final synthetic L:Ljava/lang/Long;


# direct methods
.method constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/I$b;->J:Ljava/lang/Long;

    iput-object p2, p0, LI6/I$b;->K:Ljava/lang/Long;

    iput-object p3, p0, LI6/I$b;->L:Ljava/lang/Long;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(LW8/z0;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LI6/I$b;->K(LW8/z0;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final K(LW8/z0;Ljava/lang/Throwable;)Li7/M;
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI6/I$b;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_5

    :cond_2
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LI6/I$b;->H:Ljava/lang/Object;

    check-cast v2, LJ6/k$a;

    iget-object v5, v0, LI6/I$b;->I:Ljava/lang/Object;

    move-object v11, v5

    check-cast v11, LO6/d;

    invoke-virtual {v11}, LO6/d;->j()LT6/M;

    move-result-object v5

    invoke-virtual {v5}, LT6/M;->o()LT6/U;

    move-result-object v5

    invoke-static {v5}, LT6/V;->b(LT6/U;)Z

    move-result v5

    const/4 v12, 0x0

    if-nez v5, :cond_a

    invoke-virtual {v11}, LO6/d;->e()Ljava/lang/Object;

    invoke-virtual {v11}, LO6/d;->e()Ljava/lang/Object;

    sget-object v4, LI6/F;->a:LI6/F;

    invoke-virtual {v11, v4}, LO6/d;->g(LF6/h;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LI6/G;

    if-nez v5, :cond_3

    iget-object v6, v0, LI6/I$b;->J:Ljava/lang/Long;

    iget-object v7, v0, LI6/I$b;->K:Ljava/lang/Long;

    iget-object v8, v0, LI6/I$b;->L:Ljava/lang/Long;

    invoke-static {v6, v7, v8}, LI6/I;->f(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v5, LI6/G;

    const/16 v17, 0x7

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, LI6/G;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILy7/k;)V

    invoke-virtual {v11, v4, v5}, LO6/d;->m(LF6/h;Ljava/lang/Object;)V

    :cond_3
    if-eqz v5, :cond_8

    iget-object v4, v0, LI6/I$b;->K:Ljava/lang/Long;

    iget-object v6, v0, LI6/I$b;->L:Ljava/lang/Long;

    iget-object v7, v0, LI6/I$b;->J:Ljava/lang/Long;

    invoke-virtual {v5}, LI6/G;->b()Ljava/lang/Long;

    move-result-object v8

    if-nez v8, :cond_4

    goto :goto_0

    :cond_4
    move-object v4, v8

    :goto_0
    invoke-virtual {v5, v4}, LI6/G;->e(Ljava/lang/Long;)V

    invoke-virtual {v5}, LI6/G;->d()Ljava/lang/Long;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    move-object v6, v4

    :goto_1
    invoke-virtual {v5, v6}, LI6/G;->g(Ljava/lang/Long;)V

    invoke-virtual {v5}, LI6/G;->c()Ljava/lang/Long;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    move-object v7, v4

    :goto_2
    invoke-virtual {v5, v7}, LI6/G;->f(Ljava/lang/Long;)V

    invoke-virtual {v5}, LI6/G;->c()Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_8

    const-wide v5, 0x7fffffffffffffffL

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v5, v7, v5

    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v11}, LO6/d;->h()LW8/z0;

    move-result-object v5

    new-instance v8, LI6/I$b$a;

    invoke-direct {v8, v4, v11, v5, v12}, LI6/I$b$a;-><init>(Ljava/lang/Long;LO6/d;LW8/z0;Lm7/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v2

    invoke-static/range {v5 .. v10}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object v4

    invoke-virtual {v11}, LO6/d;->h()LW8/z0;

    move-result-object v5

    new-instance v6, LI6/J;

    invoke-direct {v6, v4}, LI6/J;-><init>(LW8/z0;)V

    invoke-interface {v5, v6}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    :cond_8
    :goto_3
    iput-object v12, v0, LI6/I$b;->H:Ljava/lang/Object;

    iput v3, v0, LI6/I$b;->G:I

    invoke-virtual {v2, v11, v0}, LJ6/k$a;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    return-object v2

    :cond_a
    iput-object v12, v0, LI6/I$b;->H:Ljava/lang/Object;

    iput v4, v0, LI6/I$b;->G:I

    invoke-virtual {v2, v11, v0}, LJ6/k$a;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_5
    return-object v2
.end method

.method public final I(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LI6/I$b;

    iget-object v1, p0, LI6/I$b;->J:Ljava/lang/Long;

    iget-object v2, p0, LI6/I$b;->K:Ljava/lang/Long;

    iget-object v3, p0, LI6/I$b;->L:Ljava/lang/Long;

    invoke-direct {v0, v1, v2, v3, p3}, LI6/I$b;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lm7/e;)V

    iput-object p1, v0, LI6/I$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/I$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/I$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ6/k$a;

    check-cast p2, LO6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/I$b;->I(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
