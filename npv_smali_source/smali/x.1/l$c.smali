.class final Lx/l$c;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/l;->c(Lz0/c;JLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ly7/O;

.field final synthetic J:Ly7/O;


# direct methods
.method constructor <init>(Ly7/O;Ly7/O;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/l$c;->I:Ly7/O;

    iput-object p2, p0, Lx/l$c;->J:Ly7/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/l$c;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v3, :cond_0

    iget v2, v0, Lx/l$c;->F:I

    iget-object v7, v0, Lx/l$c;->E:Ljava/lang/Object;

    check-cast v7, Lz0/p;

    iget-object v8, v0, Lx/l$c;->H:Ljava/lang/Object;

    check-cast v8, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lx/l$c;->F:I

    iget-object v7, v0, Lx/l$c;->H:Ljava/lang/Object;

    check-cast v7, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lx/l$c;->H:Ljava/lang/Object;

    check-cast v2, Lz0/c;

    move-object v7, v2

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_12

    sget-object v8, Lz0/r;->D:Lz0/r;

    iput-object v7, v0, Lx/l$c;->H:Ljava/lang/Object;

    iput-object v4, v0, Lx/l$c;->E:Ljava/lang/Object;

    iput v2, v0, Lx/l$c;->F:I

    iput v6, v0, Lx/l$c;->G:I

    invoke-interface {v7, v8, v0}, Lz0/c;->X0(Lz0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast v8, Lz0/p;

    invoke-virtual {v8}, Lz0/p;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_5

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lz0/B;

    invoke-static {v12}, Lz0/q;->d(Lz0/B;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    move v2, v6

    :goto_3
    invoke-virtual {v8}, Lz0/p;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_8

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lz0/B;

    invoke-virtual {v12}, Lz0/B;->p()Z

    move-result v13

    if-nez v13, :cond_7

    invoke-interface {v7}, Lz0/c;->a()J

    move-result-wide v13

    invoke-interface {v7}, Lz0/c;->H0()J

    move-result-wide v4

    invoke-static {v12, v13, v14, v4, v5}, Lz0/q;->f(Lz0/B;JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x0

    goto :goto_4

    :cond_7
    :goto_5
    move v2, v6

    :cond_8
    sget-object v4, Lz0/r;->E:Lz0/r;

    iput-object v7, v0, Lx/l$c;->H:Ljava/lang/Object;

    iput-object v8, v0, Lx/l$c;->E:Ljava/lang/Object;

    iput v2, v0, Lx/l$c;->F:I

    iput v3, v0, Lx/l$c;->G:I

    invoke-interface {v7, v4, v0}, Lz0/c;->X0(Lz0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_9

    return-object v1

    :cond_9
    move-object v15, v8

    move-object v8, v7

    move-object v7, v15

    :goto_6
    check-cast v4, Lz0/p;

    invoke-virtual {v4}, Lz0/p;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v5, :cond_b

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lz0/B;

    invoke-virtual {v10}, Lz0/B;->p()Z

    move-result v10

    if-eqz v10, :cond_a

    move v2, v6

    goto :goto_8

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_b
    :goto_8
    iget-object v4, v0, Lx/l$c;->I:Ly7/O;

    iget-object v4, v4, Ly7/O;->C:Ljava/lang/Object;

    check-cast v4, Lz0/B;

    invoke-virtual {v4}, Lz0/B;->f()J

    move-result-wide v4

    invoke-static {v7, v4, v5}, Lx/l;->a(Lz0/p;J)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v7}, Lz0/p;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_9
    if-ge v7, v5, :cond_d

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lz0/B;

    invoke-virtual {v10}, Lz0/B;->i()Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_a

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_a
    check-cast v9, Lz0/B;

    if-eqz v9, :cond_e

    iget-object v4, v0, Lx/l$c;->I:Ly7/O;

    iput-object v9, v4, Ly7/O;->C:Ljava/lang/Object;

    iget-object v4, v0, Lx/l$c;->J:Ly7/O;

    iput-object v9, v4, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_d

    :cond_e
    move v2, v6

    move-object v7, v8

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_f
    iget-object v4, v0, Lx/l$c;->J:Ly7/O;

    invoke-virtual {v7}, Lz0/p;->c()Ljava/util/List;

    move-result-object v5

    iget-object v7, v0, Lx/l$c;->I:Ly7/O;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_b
    if-ge v10, v9, :cond_11

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lz0/B;

    invoke-virtual {v12}, Lz0/B;->f()J

    move-result-wide v12

    iget-object v14, v7, Ly7/O;->C:Ljava/lang/Object;

    check-cast v14, Lz0/B;

    move-object/from16 p1, v7

    invoke-virtual {v14}, Lz0/B;->f()J

    move-result-wide v6

    invoke-static {v12, v13, v6, v7}, Lz0/A;->d(JJ)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_c

    :cond_10
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, p1

    const/4 v6, 0x1

    goto :goto_b

    :cond_11
    const/4 v11, 0x0

    :goto_c
    iput-object v11, v4, Ly7/O;->C:Ljava/lang/Object;

    :goto_d
    move-object v7, v8

    const/4 v4, 0x0

    const/4 v6, 0x1

    goto/16 :goto_0

    :cond_12
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/l$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/l$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/l$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/l$c;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lx/l$c;

    iget-object v1, p0, Lx/l$c;->I:Ly7/O;

    iget-object v2, p0, Lx/l$c;->J:Ly7/O;

    invoke-direct {v0, v1, v2, p2}, Lx/l$c;-><init>(Ly7/O;Ly7/O;Lm7/e;)V

    iput-object p1, v0, Lx/l$c;->H:Ljava/lang/Object;

    return-object v0
.end method
