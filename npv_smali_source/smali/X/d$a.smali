.class final LX/d$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field I:I

.field J:I

.field K:J

.field L:I

.field private synthetic M:Ljava/lang/Object;

.field final synthetic N:LX/d;


# direct methods
.method constructor <init>(LX/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LX/d$a;->N:LX/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LX/d$a;->L:I

    const/4 v3, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    iget v2, v0, LX/d$a;->J:I

    iget v6, v0, LX/d$a;->I:I

    iget-wide v7, v0, LX/d$a;->K:J

    iget v9, v0, LX/d$a;->H:I

    iget v10, v0, LX/d$a;->G:I

    iget-object v11, v0, LX/d$a;->F:Ljava/lang/Object;

    check-cast v11, [J

    iget-object v12, v0, LX/d$a;->E:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    iget-object v13, v0, LX/d$a;->M:Ljava/lang/Object;

    check-cast v13, LR8/j;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LX/d$a;->M:Ljava/lang/Object;

    check-cast v2, LR8/j;

    iget-object v6, v0, LX/d$a;->N:LX/d;

    invoke-virtual {v6}, LX/d;->d()Lr/W;

    move-result-object v6

    iget-object v7, v6, Lr/W;->b:[Ljava/lang/Object;

    iget-object v6, v6, Lr/W;->a:[J

    array-length v8, v6

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_5

    move v9, v3

    :goto_0
    aget-wide v10, v6, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_4

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-object v13, v2

    move v2, v3

    move-wide/from16 v18, v10

    move-object v11, v6

    move v10, v8

    move v6, v12

    move-object v12, v7

    move-wide/from16 v7, v18

    :goto_1
    if-ge v2, v6, :cond_3

    const-wide/16 v14, 0xff

    and-long/2addr v14, v7

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_2

    shl-int/lit8 v14, v9, 0x3

    add-int/2addr v14, v2

    aget-object v14, v12, v14

    iput-object v13, v0, LX/d$a;->M:Ljava/lang/Object;

    iput-object v12, v0, LX/d$a;->E:Ljava/lang/Object;

    iput-object v11, v0, LX/d$a;->F:Ljava/lang/Object;

    iput v10, v0, LX/d$a;->G:I

    iput v9, v0, LX/d$a;->H:I

    iput-wide v7, v0, LX/d$a;->K:J

    iput v6, v0, LX/d$a;->I:I

    iput v2, v0, LX/d$a;->J:I

    iput v5, v0, LX/d$a;->L:I

    invoke-virtual {v13, v14, v0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v1, :cond_2

    return-object v1

    :cond_2
    :goto_2
    shr-long/2addr v7, v4

    add-int/2addr v2, v5

    goto :goto_1

    :cond_3
    if-ne v6, v4, :cond_5

    move v8, v10

    move-object v6, v11

    move-object v7, v12

    move-object v2, v13

    :cond_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method public final E(LR8/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LX/d$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LX/d$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LX/d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/j;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LX/d$a;->E(LR8/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LX/d$a;

    iget-object v1, p0, LX/d$a;->N:LX/d;

    invoke-direct {v0, v1, p2}, LX/d$a;-><init>(LX/d;Lm7/e;)V

    iput-object p1, v0, LX/d$a;->M:Ljava/lang/Object;

    return-object v0
.end method
