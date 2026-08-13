.class final LV/R0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/R0;->h(I)Lx7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/R0;

.field final synthetic E:I

.field final synthetic F:Lr/H;


# direct methods
.method constructor <init>(LV/R0;ILr/H;)V
    .locals 0

    iput-object p1, p0, LV/R0$b;->D:LV/R0;

    iput p2, p0, LV/R0$b;->E:I

    iput-object p3, p0, LV/R0$b;->F:Lr/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/r;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LV/R0$b;->D:LV/R0;

    invoke-static {v2}, LV/R0;->b(LV/R0;)I

    move-result v2

    iget v3, v0, LV/R0$b;->E:I

    if-ne v2, v3, :cond_6

    iget-object v2, v0, LV/R0$b;->F:Lr/H;

    iget-object v3, v0, LV/R0$b;->D:LV/R0;

    invoke-static {v3}, LV/R0;->d(LV/R0;)Lr/H;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    instance-of v2, v1, LV/u;

    if-eqz v2, :cond_6

    iget-object v2, v0, LV/R0$b;->F:Lr/H;

    iget v3, v0, LV/R0$b;->E:I

    iget-object v4, v0, LV/R0$b;->D:LV/R0;

    iget-object v5, v2, Lr/N;->a:[J

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    const/4 v8, 0x0

    :goto_0
    aget-wide v9, v5, v8

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_5

    sub-int v11, v8, v6

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_4

    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_3

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    iget-object v15, v2, Lr/N;->b:[Ljava/lang/Object;

    aget-object v15, v15, v14

    iget-object v7, v2, Lr/N;->c:[I

    aget v7, v7, v14

    if-eq v7, v3, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_1

    move-object v12, v1

    check-cast v12, LV/u;

    invoke-virtual {v12, v15, v4}, LV/u;->L(Ljava/lang/Object;LV/R0;)V

    instance-of v0, v15, LV/J;

    if-eqz v0, :cond_1

    move-object v0, v15

    check-cast v0, LV/J;

    invoke-virtual {v12, v0}, LV/u;->K(LV/J;)V

    invoke-static {v4}, LV/R0;->c(LV/R0;)Lr/K;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v15}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v2, v14}, Lr/H;->q(I)V

    :cond_2
    const/16 v0, 0x8

    goto :goto_3

    :cond_3
    move v0, v12

    :goto_3
    shr-long/2addr v9, v0

    add-int/lit8 v13, v13, 0x1

    move v12, v0

    move-object/from16 v0, p0

    goto :goto_1

    :cond_4
    move v0, v12

    if-ne v11, v0, :cond_6

    :cond_5
    if-eq v8, v6, :cond_6

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    goto :goto_0

    :cond_6
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/r;

    invoke-virtual {p0, p1}, LV/R0$b;->a(LV/r;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
