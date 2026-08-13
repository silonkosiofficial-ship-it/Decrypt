.class final Lr/L$a$a$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/L$a$a;-><init>(Lr/L;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field J:I

.field K:I

.field L:J

.field M:I

.field private synthetic N:Ljava/lang/Object;

.field final synthetic O:Lr/L;

.field final synthetic P:Lr/L$a$a;


# direct methods
.method constructor <init>(Lr/L;Lr/L$a$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lr/L$a$a$a;->O:Lr/L;

    iput-object p2, p0, Lr/L$a$a$a;->P:Lr/L$a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr/L$a$a$a;->M:I

    const/16 v4, 0x8

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    iget v2, v0, Lr/L$a$a$a;->K:I

    iget v6, v0, Lr/L$a$a$a;->J:I

    iget-wide v7, v0, Lr/L$a$a$a;->L:J

    iget v9, v0, Lr/L$a$a$a;->I:I

    iget v10, v0, Lr/L$a$a$a;->H:I

    iget-object v11, v0, Lr/L$a$a$a;->G:Ljava/lang/Object;

    check-cast v11, [J

    iget-object v12, v0, Lr/L$a$a$a;->F:Ljava/lang/Object;

    check-cast v12, Lr/L;

    iget-object v13, v0, Lr/L$a$a$a;->E:Ljava/lang/Object;

    check-cast v13, Lr/L$a$a;

    iget-object v14, v0, Lr/L$a$a$a;->N:Ljava/lang/Object;

    check-cast v14, LR8/j;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lr/L$a$a$a;->N:Ljava/lang/Object;

    check-cast v2, LR8/j;

    iget-object v6, v0, Lr/L$a$a$a;->O:Lr/L;

    iget-object v7, v0, Lr/L$a$a$a;->P:Lr/L$a$a;

    iget-object v8, v6, Lr/W;->a:[J

    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_5

    const/4 v10, 0x0

    :goto_0
    aget-wide v11, v8, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v9

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    move-object v14, v2

    const/4 v2, 0x0

    move-wide/from16 v19, v11

    move-object v12, v6

    move-object v11, v8

    move v6, v13

    move-object v13, v7

    move-wide/from16 v7, v19

    move/from16 v21, v10

    move v10, v9

    move/from16 v9, v21

    :goto_1
    if-ge v2, v6, :cond_3

    const-wide/16 v15, 0xff

    and-long/2addr v15, v7

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_2

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v2

    invoke-virtual {v13, v15}, Lr/L$a$a;->b(I)V

    iget-object v3, v12, Lr/W;->b:[Ljava/lang/Object;

    aget-object v3, v3, v15

    iput-object v14, v0, Lr/L$a$a$a;->N:Ljava/lang/Object;

    iput-object v13, v0, Lr/L$a$a$a;->E:Ljava/lang/Object;

    iput-object v12, v0, Lr/L$a$a$a;->F:Ljava/lang/Object;

    iput-object v11, v0, Lr/L$a$a$a;->G:Ljava/lang/Object;

    iput v10, v0, Lr/L$a$a$a;->H:I

    iput v9, v0, Lr/L$a$a$a;->I:I

    iput-wide v7, v0, Lr/L$a$a$a;->L:J

    iput v6, v0, Lr/L$a$a$a;->J:I

    iput v2, v0, Lr/L$a$a$a;->K:I

    iput v5, v0, Lr/L$a$a$a;->M:I

    invoke-virtual {v14, v3, v0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    :goto_2
    shr-long/2addr v7, v4

    add-int/2addr v2, v5

    goto :goto_1

    :cond_3
    if-ne v6, v4, :cond_5

    move-object v8, v11

    move-object v6, v12

    move-object v7, v13

    move-object v2, v14

    move/from16 v19, v10

    move v10, v9

    move/from16 v9, v19

    :cond_4
    if-eq v10, v9, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_5
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method public final E(LR8/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/L$a$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lr/L$a$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lr/L$a$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/j;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lr/L$a$a$a;->E(LR8/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lr/L$a$a$a;

    iget-object v1, p0, Lr/L$a$a$a;->O:Lr/L;

    iget-object v2, p0, Lr/L$a$a$a;->P:Lr/L$a$a;

    invoke-direct {v0, v1, v2, p2}, Lr/L$a$a$a;-><init>(Lr/L;Lr/L$a$a;Lm7/e;)V

    iput-object p1, v0, Lr/L$a$a$a;->N:Ljava/lang/Object;

    return-object v0
.end method
