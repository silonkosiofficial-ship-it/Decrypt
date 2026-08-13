.class public final Lz0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/J;

.field private final b:Lz0/g;

.field private final c:Lz0/C;

.field private final d:LF0/v;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/F;->a:LF0/J;

    new-instance v0, Lz0/g;

    invoke-virtual {p1}, LF0/J;->l()LD0/t;

    move-result-object p1

    invoke-direct {v0, p1}, Lz0/g;-><init>(LD0/t;)V

    iput-object v0, p0, Lz0/F;->b:Lz0/g;

    new-instance p1, Lz0/C;

    invoke-direct {p1}, Lz0/C;-><init>()V

    iput-object p1, p0, Lz0/F;->c:Lz0/C;

    new-instance p1, LF0/v;

    invoke-direct {p1}, LF0/v;-><init>()V

    iput-object p1, p0, Lz0/F;->d:LF0/v;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lz0/F;->b:Lz0/g;

    invoke-virtual {v0}, Lz0/g;->b()V

    return-void
.end method

.method public final b(Lz0/D;Lz0/Q;Z)I
    .locals 18

    .prologue
    move-object/from16 v1, p0

    iget-boolean v0, v1, Lz0/F;->e:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v2, v2}, Lz0/G;->a(ZZ)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v1, Lz0/F;->e:Z

    iget-object v3, v1, Lz0/F;->c:Lz0/C;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-virtual {v3, v4, v5}, Lz0/C;->b(Lz0/D;Lz0/Q;)Lz0/h;

    move-result-object v3

    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v4

    invoke-virtual {v4}, Lr/v;->q()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v6

    invoke-virtual {v6, v5}, Lr/v;->r(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz0/B;

    invoke-virtual {v6}, Lz0/B;->i()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Lz0/B;->l()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_2
    :goto_1
    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v5

    invoke-virtual {v5}, Lr/v;->q()I

    move-result v5

    move v6, v2

    :goto_3
    if-ge v6, v5, :cond_6

    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v7

    invoke-virtual {v7, v6}, Lr/v;->r(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz0/B;

    if-nez v4, :cond_4

    invoke-static {v7}, Lz0/q;->b(Lz0/B;)Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_4
    invoke-virtual {v7}, Lz0/B;->n()I

    move-result v8

    sget-object v9, Lz0/P;->a:Lz0/P$a;

    invoke-virtual {v9}, Lz0/P$a;->d()I

    move-result v9

    invoke-static {v8, v9}, Lz0/P;->g(II)Z

    move-result v14

    iget-object v10, v1, Lz0/F;->a:LF0/J;

    invoke-virtual {v7}, Lz0/B;->h()J

    move-result-wide v11

    iget-object v13, v1, Lz0/F;->d:LF0/v;

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, LF0/J;->y0(LF0/J;JLF0/v;ZZILjava/lang/Object;)V

    iget-object v8, v1, Lz0/F;->d:LF0/v;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v0

    if-eqz v8, :cond_5

    iget-object v8, v1, Lz0/F;->b:Lz0/g;

    invoke-virtual {v7}, Lz0/B;->f()J

    move-result-wide v9

    iget-object v11, v1, Lz0/F;->d:LF0/v;

    invoke-static {v7}, Lz0/q;->b(Lz0/B;)Z

    move-result v7

    invoke-virtual {v8, v9, v10, v11, v7}, Lz0/g;->a(JLjava/util/List;Z)V

    iget-object v7, v1, Lz0/F;->d:LF0/v;

    invoke-virtual {v7}, LF0/v;->clear()V

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object v4, v1, Lz0/F;->b:Lz0/g;

    invoke-virtual {v4}, Lz0/g;->e()V

    iget-object v4, v1, Lz0/F;->b:Lz0/g;

    move/from16 v5, p3

    invoke-virtual {v4, v3, v5}, Lz0/g;->c(Lz0/h;Z)Z

    move-result v4

    invoke-virtual {v3}, Lz0/h;->d()Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    move v0, v2

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v5

    invoke-virtual {v5}, Lr/v;->q()I

    move-result v5

    move v6, v2

    :goto_4
    if-ge v6, v5, :cond_7

    invoke-virtual {v3}, Lz0/h;->b()Lr/v;

    move-result-object v7

    invoke-virtual {v7, v6}, Lr/v;->r(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz0/B;

    invoke-static {v7}, Lz0/q;->j(Lz0/B;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Lz0/B;->p()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :goto_5
    invoke-static {v4, v0}, Lz0/G;->a(ZZ)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, v1, Lz0/F;->e:Z

    return v0

    :goto_6
    iput-boolean v2, v1, Lz0/F;->e:Z

    throw v0
.end method

.method public final c()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz0/F;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lz0/F;->c:Lz0/C;

    invoke-virtual {v0}, Lz0/C;->a()V

    iget-object v0, p0, Lz0/F;->b:Lz0/g;

    invoke-virtual {v0}, Lz0/g;->d()V

    :cond_0
    return-void
.end method
