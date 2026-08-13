.class final Lx/D$f$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/D$f;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:J

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field final synthetic K:LW8/N;

.field final synthetic L:Lx7/q;

.field final synthetic M:Lx7/l;

.field final synthetic N:Lx7/l;

.field final synthetic O:Lx7/l;

.field final synthetic P:Lx/u;


# direct methods
.method constructor <init>(LW8/N;Lx7/q;Lx7/l;Lx7/l;Lx7/l;Lx/u;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/D$f$a;->K:LW8/N;

    iput-object p2, p0, Lx/D$f$a;->L:Lx7/q;

    iput-object p3, p0, Lx/D$f$a;->M:Lx7/l;

    iput-object p4, p0, Lx/D$f$a;->N:Lx7/l;

    iput-object p5, p0, Lx/D$f$a;->O:Lx7/l;

    iput-object p6, p0, Lx/D$f$a;->P:Lx/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v6, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, Lx/D$f$a;->I:I

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget-object v0, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    check-cast v0, Lz0/B;

    iget-object v1, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    check-cast v1, Ly7/O;

    iget-object v2, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    check-cast v2, Lz0/c;

    :try_start_0
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lz0/s; {:try_start_0 .. :try_end_0} :catch_4

    goto/16 :goto_a

    :pswitch_2
    iget-wide v0, v6, Lx/D$f$a;->H:J

    iget-object v2, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    check-cast v2, Ly7/O;

    iget-object v3, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    check-cast v3, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v4, v2

    move-object/from16 v2, p1

    goto/16 :goto_8

    :pswitch_3
    iget-wide v0, v6, Lx/D$f$a;->H:J

    iget-object v2, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    check-cast v2, Ly7/O;

    iget-object v3, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    check-cast v3, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    iget-wide v0, v6, Lx/D$f$a;->H:J

    iget-object v2, v6, Lx/D$f$a;->G:Ljava/lang/Object;

    check-cast v2, Ly7/O;

    iget-object v3, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    check-cast v3, Ly7/O;

    iget-object v4, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    check-cast v4, Lz0/B;

    iget-object v5, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    check-cast v5, Lz0/c;

    :try_start_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lz0/s; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, v5

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, p1

    goto/16 :goto_2

    :catch_0
    move-object v2, v3

    :catch_1
    move-object v3, v5

    goto/16 :goto_4

    :pswitch_5
    iget-object v0, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    check-cast v0, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v5, v0

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v0, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lz0/c;

    iput-object v9, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, v6, Lx/D$f$a;->I:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, v9

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, Lx/D;->e(Lz0/c;ZLz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    return-object v7

    :cond_0
    move-object v5, v9

    :goto_0
    move-object v4, v0

    check-cast v4, Lz0/B;

    invoke-virtual {v4}, Lz0/B;->a()V

    iget-object v9, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v12, Lx/D$f$a$b;

    iget-object v0, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v12, v0, v8}, Lx/D$f$a$b;-><init>(Lx/u;Lm7/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object v0, v6, Lx/D$f$a;->L:Lx7/q;

    invoke-static {}, Lx/D;->c()Lx7/q;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v9, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v12, Lx/D$f$a$c;

    iget-object v0, v6, Lx/D$f$a;->L:Lx7/q;

    iget-object v1, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v12, v0, v1, v4, v8}, Lx/D$f$a$c;-><init>(Lx7/q;Lx/u;Lz0/B;Lm7/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_1
    iget-object v0, v6, Lx/D$f$a;->M:Lx7/l;

    if-eqz v0, :cond_2

    invoke-interface {v5}, Lz0/c;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/A1;->c()J

    move-result-wide v0

    goto :goto_1

    :cond_2
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    :goto_1
    new-instance v2, Ly7/O;

    invoke-direct {v2}, Ly7/O;-><init>()V

    :try_start_2
    new-instance v3, Lx/D$f$a$d;

    invoke-direct {v3, v8}, Lx/D$f$a$d;-><init>(Lm7/e;)V

    iput-object v5, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    iput-object v4, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    iput-object v2, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    iput-object v2, v6, Lx/D$f$a;->G:Ljava/lang/Object;

    iput-wide v0, v6, Lx/D$f$a;->H:J

    const/4 v9, 0x2

    iput v9, v6, Lx/D$f$a;->I:I

    invoke-interface {v5, v0, v1, v3, v6}, Lz0/c;->G0(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Lz0/s; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v3, v7, :cond_3

    return-object v7

    :cond_3
    move-object v9, v5

    move-object v5, v4

    move-object v4, v2

    :goto_2
    :try_start_3
    iput-object v3, v2, Ly7/O;->C:Ljava/lang/Object;

    iget-object v2, v4, Ly7/O;->C:Ljava/lang/Object;

    if-nez v2, :cond_4

    iget-object v10, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v13, Lx/D$f$a$e;

    iget-object v2, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v13, v2, v8}, Lx/D$f$a$e;-><init>(Lx/u;Lm7/e;)V

    :goto_3
    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_6

    :catch_2
    move-object v2, v4

    move-object v4, v5

    move-object v3, v9

    goto :goto_4

    :cond_4
    check-cast v2, Lz0/B;

    invoke-virtual {v2}, Lz0/B;->a()V

    iget-object v10, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v13, Lx/D$f$a$f;

    iget-object v2, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v13, v2, v8}, Lx/D$f$a$f;-><init>(Lx/u;Lm7/e;)V
    :try_end_3
    .catch Lz0/s; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :goto_4
    iget-object v5, v6, Lx/D$f$a;->M:Lx7/l;

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Lz0/B;->h()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/g;->d(J)Ln0/g;

    move-result-object v4

    invoke-interface {v5, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v3, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    iput-object v2, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->G:Ljava/lang/Object;

    iput-wide v0, v6, Lx/D$f$a;->H:J

    const/4 v4, 0x3

    iput v4, v6, Lx/D$f$a;->I:I

    invoke-static {v3, v6}, Lx/D;->b(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_6

    return-object v7

    :cond_6
    :goto_5
    iget-object v9, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v12, Lx/D$f$a$g;

    iget-object v4, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v12, v4, v8}, Lx/D$f$a$g;-><init>(Lx/u;Lm7/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-object v4, v2

    move-object v9, v3

    :goto_6
    iget-object v2, v4, Ly7/O;->C:Ljava/lang/Object;

    if-eqz v2, :cond_e

    iget-object v3, v6, Lx/D$f$a;->N:Lx7/l;

    if-nez v3, :cond_7

    iget-object v0, v6, Lx/D$f$a;->O:Lx7/l;

    if-eqz v0, :cond_e

    check-cast v2, Lz0/B;

    invoke-virtual {v2}, Lz0/B;->h()J

    move-result-wide v1

    :goto_7
    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    :cond_7
    check-cast v2, Lz0/B;

    iput-object v9, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    iput-object v4, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->G:Ljava/lang/Object;

    iput-wide v0, v6, Lx/D$f$a;->H:J

    const/4 v3, 0x4

    iput v3, v6, Lx/D$f$a;->I:I

    invoke-static {v9, v2, v6}, Lx/D;->a(Lz0/c;Lz0/B;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_8

    return-object v7

    :cond_8
    move-object v3, v9

    :goto_8
    check-cast v2, Lz0/B;

    if-nez v2, :cond_9

    iget-object v0, v6, Lx/D$f$a;->O:Lx7/l;

    if-eqz v0, :cond_e

    iget-object v1, v4, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lz0/B;

    invoke-virtual {v1}, Lz0/B;->h()J

    move-result-wide v1

    goto :goto_7

    :cond_9
    iget-object v9, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v12, Lx/D$f$a$h;

    iget-object v5, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v12, v5, v8}, Lx/D$f$a$h;-><init>(Lx/u;Lm7/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object v5, v6, Lx/D$f$a;->L:Lx7/q;

    invoke-static {}, Lx/D;->c()Lx7/q;

    move-result-object v9

    if-eq v5, v9, :cond_a

    iget-object v10, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v13, Lx/D$f$a$i;

    iget-object v5, v6, Lx/D$f$a;->L:Lx7/q;

    iget-object v9, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v13, v5, v9, v2, v8}, Lx/D$f$a$i;-><init>(Lx7/q;Lx/u;Lz0/B;Lm7/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_a
    :try_start_4
    new-instance v5, Lx/D$f$a$j;

    iget-object v10, v6, Lx/D$f$a;->K:LW8/N;

    iget-object v11, v6, Lx/D$f$a;->N:Lx7/l;

    iget-object v12, v6, Lx/D$f$a;->O:Lx7/l;

    iget-object v14, v6, Lx/D$f$a;->P:Lx/u;

    const/4 v15, 0x0

    move-object v9, v5

    move-object v13, v4

    invoke-direct/range {v9 .. v15}, Lx/D$f$a$j;-><init>(LW8/N;Lx7/l;Lx7/l;Ly7/O;Lx/u;Lm7/e;)V

    iput-object v3, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    iput-object v4, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    iput-object v2, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    const/4 v9, 0x5

    iput v9, v6, Lx/D$f$a;->I:I

    invoke-interface {v3, v0, v1, v5, v6}, Lz0/c;->G0(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Lz0/s; {:try_start_4 .. :try_end_4} :catch_3

    if-ne v0, v7, :cond_e

    return-object v7

    :catch_3
    move-object v0, v2

    move-object v2, v3

    move-object v1, v4

    :catch_4
    iget-object v3, v6, Lx/D$f$a;->O:Lx7/l;

    if-eqz v3, :cond_b

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lz0/B;

    invoke-virtual {v1}, Lz0/B;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/g;->d(J)Ln0/g;

    move-result-object v1

    invoke-interface {v3, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v1, v6, Lx/D$f$a;->M:Lx7/l;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lz0/B;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v8, v6, Lx/D$f$a;->J:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->E:Ljava/lang/Object;

    iput-object v8, v6, Lx/D$f$a;->F:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v6, Lx/D$f$a;->I:I

    invoke-static {v2, v6}, Lx/D;->b(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_d

    return-object v7

    :cond_d
    :goto_9
    iget-object v9, v6, Lx/D$f$a;->K:LW8/N;

    new-instance v12, Lx/D$f$a$a;

    iget-object v0, v6, Lx/D$f$a;->P:Lx/u;

    invoke-direct {v12, v0, v8}, Lx/D$f$a$a;-><init>(Lx/u;Lm7/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_e
    :goto_a
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/D$f$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/D$f$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/D$f$a;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 9

    new-instance v8, Lx/D$f$a;

    iget-object v1, p0, Lx/D$f$a;->K:LW8/N;

    iget-object v2, p0, Lx/D$f$a;->L:Lx7/q;

    iget-object v3, p0, Lx/D$f$a;->M:Lx7/l;

    iget-object v4, p0, Lx/D$f$a;->N:Lx7/l;

    iget-object v5, p0, Lx/D$f$a;->O:Lx7/l;

    iget-object v6, p0, Lx/D$f$a;->P:Lx/u;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lx/D$f$a;-><init>(LW8/N;Lx7/q;Lx7/l;Lx7/l;Lx7/l;Lx/u;Lm7/e;)V

    iput-object p1, v8, Lx/D$f$a;->J:Ljava/lang/Object;

    return-object v8
.end method
