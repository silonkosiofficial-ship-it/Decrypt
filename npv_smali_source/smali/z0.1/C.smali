.class final Lz0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/C$a;
    }
.end annotation


# instance fields
.field private final a:Lr/v;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/v;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/v;-><init>(IILy7/k;)V

    iput-object v0, p0, Lz0/C;->a:Lr/v;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lz0/C;->a:Lr/v;

    invoke-virtual {v0}, Lr/v;->b()V

    return-void
.end method

.method public final b(Lz0/D;Lz0/Q;)Lz0/h;
    .locals 35

    .prologue
    move-object/from16 v0, p0

    new-instance v1, Lr/v;

    invoke-virtual/range {p1 .. p1}, Lz0/D;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Lr/v;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Lz0/D;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz0/E;

    iget-object v7, v0, Lz0/C;->a:Lr/v;

    invoke-virtual {v6}, Lz0/E;->d()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lr/v;->e(J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz0/C$a;

    if-nez v7, :cond_0

    invoke-virtual {v6}, Lz0/E;->k()J

    move-result-wide v7

    invoke-virtual {v6}, Lz0/E;->f()J

    move-result-wide v9

    move-wide/from16 v22, v7

    move-wide/from16 v24, v9

    const/16 v26, 0x0

    move-object/from16 v7, p2

    goto :goto_1

    :cond_0
    invoke-virtual {v7}, Lz0/C$a;->c()J

    move-result-wide v8

    invoke-virtual {v7}, Lz0/C$a;->a()Z

    move-result v10

    invoke-virtual {v7}, Lz0/C$a;->b()J

    move-result-wide v11

    move-object/from16 v7, p2

    invoke-interface {v7, v11, v12}, Lz0/Q;->s(J)J

    move-result-wide v11

    move-wide/from16 v22, v8

    move/from16 v26, v10

    move-wide/from16 v24, v11

    :goto_1
    invoke-virtual {v6}, Lz0/E;->d()J

    move-result-wide v8

    new-instance v10, Lz0/B;

    move-object v13, v10

    invoke-virtual {v6}, Lz0/E;->d()J

    move-result-wide v14

    invoke-virtual {v6}, Lz0/E;->k()J

    move-result-wide v16

    invoke-virtual {v6}, Lz0/E;->f()J

    move-result-wide v18

    invoke-virtual {v6}, Lz0/E;->b()Z

    move-result v20

    invoke-virtual {v6}, Lz0/E;->h()F

    move-result v21

    invoke-virtual {v6}, Lz0/E;->j()I

    move-result v28

    invoke-virtual {v6}, Lz0/E;->c()Ljava/util/List;

    move-result-object v29

    invoke-virtual {v6}, Lz0/E;->i()J

    move-result-wide v30

    invoke-virtual {v6}, Lz0/E;->e()J

    move-result-wide v32

    const/16 v34, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v13 .. v34}, Lz0/B;-><init>(JJJZFJJZZILjava/util/List;JJLy7/k;)V

    invoke-virtual {v1, v8, v9, v10}, Lr/v;->m(JLjava/lang/Object;)V

    invoke-virtual {v6}, Lz0/E;->b()Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v0, Lz0/C;->a:Lr/v;

    invoke-virtual {v6}, Lz0/E;->d()J

    move-result-wide v9

    new-instance v14, Lz0/C$a;

    invoke-virtual {v6}, Lz0/E;->k()J

    move-result-wide v12

    invoke-virtual {v6}, Lz0/E;->g()J

    move-result-wide v15

    invoke-virtual {v6}, Lz0/E;->b()Z

    move-result v17

    invoke-virtual {v6}, Lz0/E;->j()I

    move-result v6

    const/16 v18, 0x0

    move-object v11, v14

    move-object v4, v14

    move-wide v14, v15

    move/from16 v16, v17

    move/from16 v17, v6

    invoke-direct/range {v11 .. v18}, Lz0/C$a;-><init>(JJZILy7/k;)V

    invoke-virtual {v8, v9, v10, v4}, Lr/v;->m(JLjava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object v4, v0, Lz0/C;->a:Lr/v;

    invoke-virtual {v6}, Lz0/E;->d()J

    move-result-wide v8

    invoke-virtual {v4, v8, v9}, Lr/v;->n(J)V

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_2
    new-instance v2, Lz0/h;

    move-object/from16 v3, p1

    invoke-direct {v2, v1, v3}, Lz0/h;-><init>(Lr/v;Lz0/D;)V

    return-object v2
.end method
