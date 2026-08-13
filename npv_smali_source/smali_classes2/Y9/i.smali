.class public final LY9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LX9/Q;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:I

.field private final h:J

.field private final i:I

.field private final j:I

.field private final k:Ljava/lang/Long;

.field private final l:Ljava/lang/Long;

.field private final m:Ljava/lang/Long;

.field private final n:Ljava/lang/Integer;

.field private final o:Ljava/lang/Integer;

.field private final p:Ljava/lang/Integer;

.field private final q:Ljava/util/List;


# direct methods
.method public constructor <init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    const-string v3, "canonicalPath"

    invoke-static {p1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "comment"

    invoke-static {p3, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LY9/i;->a:LX9/Q;

    move v1, p2

    iput-boolean v1, v0, LY9/i;->b:Z

    iput-object v2, v0, LY9/i;->c:Ljava/lang/String;

    move-wide v1, p4

    iput-wide v1, v0, LY9/i;->d:J

    move-wide v1, p6

    iput-wide v1, v0, LY9/i;->e:J

    move-wide v1, p8

    iput-wide v1, v0, LY9/i;->f:J

    move v1, p10

    iput v1, v0, LY9/i;->g:I

    move-wide v1, p11

    iput-wide v1, v0, LY9/i;->h:J

    move/from16 v1, p13

    iput v1, v0, LY9/i;->i:I

    move/from16 v1, p14

    iput v1, v0, LY9/i;->j:I

    move-object/from16 v1, p15

    iput-object v1, v0, LY9/i;->k:Ljava/lang/Long;

    move-object/from16 v1, p16

    iput-object v1, v0, LY9/i;->l:Ljava/lang/Long;

    move-object/from16 v1, p17

    iput-object v1, v0, LY9/i;->m:Ljava/lang/Long;

    move-object/from16 v1, p18

    iput-object v1, v0, LY9/i;->n:Ljava/lang/Integer;

    move-object/from16 v1, p19

    iput-object v1, v0, LY9/i;->o:Ljava/lang/Integer;

    move-object/from16 v1, p20

    iput-object v1, v0, LY9/i;->p:Ljava/lang/Integer;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LY9/i;->q:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V
    .locals 19

    .prologue
    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_1

    const-string v2, ""

    goto :goto_1

    :cond_1
    move-object/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    const-wide/16 v4, -0x1

    if-eqz v3, :cond_2

    move-wide v6, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p4

    :goto_2
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_3

    move-wide v8, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p6

    :goto_3
    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_4

    move-wide v10, v4

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p8

    :goto_4
    and-int/lit8 v3, v0, 0x40

    const/4 v12, -0x1

    if-eqz v3, :cond_5

    move v3, v12

    goto :goto_5

    :cond_5
    move/from16 v3, p10

    :goto_5
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    move-wide/from16 v4, p11

    :goto_6
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_7

    move v13, v12

    goto :goto_7

    :cond_7
    move/from16 v13, p13

    :goto_7
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v12, p14

    :goto_8
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p15

    :goto_9
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p16

    :goto_a
    move-object/from16 p22, v15

    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v15, p17

    :goto_b
    move-object/from16 v16, v15

    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v15, p18

    :goto_c
    move-object/from16 v17, v15

    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p19

    :goto_d
    const v18, 0x8000

    and-int v0, v0, v18

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v0, p20

    :goto_e
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move/from16 p4, v1

    move-object/from16 p5, v2

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move/from16 p12, v3

    move-wide/from16 p13, v4

    move/from16 p15, v13

    move/from16 p16, v12

    move-object/from16 p17, v14

    move-object/from16 p18, p22

    move-object/from16 p19, v16

    move-object/from16 p20, v17

    move-object/from16 p21, v15

    move-object/from16 p22, v0

    invoke-direct/range {p2 .. p22}, LY9/i;-><init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)LY9/i;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    move-object/from16 v20, p2

    move-object/from16 v21, p3

    new-instance v22, LY9/i;

    move-object/from16 v1, v22

    iget-object v2, v0, LY9/i;->a:LX9/Q;

    iget-boolean v3, v0, LY9/i;->b:Z

    iget-object v4, v0, LY9/i;->c:Ljava/lang/String;

    iget-wide v5, v0, LY9/i;->d:J

    iget-wide v7, v0, LY9/i;->e:J

    iget-wide v9, v0, LY9/i;->f:J

    iget v11, v0, LY9/i;->g:I

    iget-wide v12, v0, LY9/i;->h:J

    iget v14, v0, LY9/i;->i:I

    iget v15, v0, LY9/i;->j:I

    move-object/from16 p1, v1

    iget-object v1, v0, LY9/i;->k:Ljava/lang/Long;

    move-object/from16 v16, v1

    iget-object v1, v0, LY9/i;->l:Ljava/lang/Long;

    move-object/from16 v17, v1

    iget-object v1, v0, LY9/i;->m:Ljava/lang/Long;

    move-object/from16 v18, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v21}, LY9/i;-><init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v22
.end method

.method public final b()LX9/Q;
    .locals 1

    iget-object v0, p0, LY9/i;->a:LX9/Q;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LY9/i;->q:Ljava/util/List;

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LY9/i;->e:J

    return-wide v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LY9/i;->g:I

    return v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 4

    .prologue
    iget-object v0, p0, LY9/i;->m:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LY9/j;->d(J)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LY9/i;->p:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final g()Ljava/lang/Long;
    .locals 4

    .prologue
    iget-object v0, p0, LY9/i;->l:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LY9/j;->d(J)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LY9/i;->o:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final h()Ljava/lang/Long;
    .locals 4

    .prologue
    iget-object v0, p0, LY9/i;->k:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LY9/j;->d(J)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LY9/i;->n:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    goto :goto_0

    :cond_1
    iget v0, p0, LY9/i;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget v1, p0, LY9/i;->i:I

    invoke-static {v1, v0}, LY9/j;->c(II)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, LY9/i;->h:J

    return-wide v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, LY9/i;->f:J

    return-wide v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, LY9/i;->b:Z

    return v0
.end method
