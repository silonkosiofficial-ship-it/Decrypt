.class final Lx/j$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/j;->b(Lx/w;FLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field final synthetic J:F

.field final synthetic K:Lx/j;

.field final synthetic L:Lx/w;


# direct methods
.method constructor <init>(FLx/j;Lx/w;Lm7/e;)V
    .locals 0

    iput p1, p0, Lx/j$a;->J:F

    iput-object p2, p0, Lx/j$a;->K:Lx/j;

    iput-object p3, p0, Lx/j$a;->L:Lx/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .prologue
    move-object/from16 v7, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v8

    iget v0, v7, Lx/j$a;->I:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v7, Lx/j$a;->H:Ljava/lang/Object;

    check-cast v0, Lu/l;

    iget-object v1, v7, Lx/j$a;->G:Ljava/lang/Object;

    check-cast v1, Ly7/L;

    :try_start_0
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget v0, v7, Lx/j$a;->J:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    new-instance v9, Ly7/L;

    invoke-direct {v9}, Ly7/L;-><init>()V

    iget v0, v7, Lx/j$a;->J:F

    iput v0, v9, Ly7/L;->C:F

    new-instance v0, Ly7/L;

    invoke-direct {v0}, Ly7/L;-><init>()V

    iget v11, v7, Lx/j$a;->J:F

    const/16 v17, 0x1c

    const/16 v18, 0x0

    const/4 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, Lu/m;->c(FFJJZILjava/lang/Object;)Lu/l;

    move-result-object v10

    :try_start_1
    iget-object v2, v7, Lx/j$a;->K:Lx/j;

    invoke-virtual {v2}, Lx/j;->c()Lu/B;

    move-result-object v2

    new-instance v3, Lx/j$a$a;

    iget-object v4, v7, Lx/j$a;->L:Lx/w;

    iget-object v5, v7, Lx/j$a;->K:Lx/j;

    invoke-direct {v3, v0, v4, v9, v5}, Lx/j$a$a;-><init>(Ly7/L;Lx/w;Ly7/L;Lx/j;)V

    iput-object v9, v7, Lx/j$a;->G:Ljava/lang/Object;

    iput-object v10, v7, Lx/j$a;->H:Ljava/lang/Object;

    iput v1, v7, Lx/j$a;->I:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, v10

    move-object v1, v2

    move v2, v4

    move-object/from16 v4, p0

    invoke-static/range {v0 .. v6}, Lu/q0;->h(Lu/l;Lu/B;ZLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v8, :cond_2

    return-object v8

    :cond_2
    move-object v1, v9

    goto :goto_0

    :catch_0
    move-object v1, v9

    move-object v0, v10

    :catch_1
    invoke-virtual {v0}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, v1, Ly7/L;->C:F

    :goto_0
    iget v0, v1, Ly7/L;->C:F

    goto :goto_1

    :cond_3
    iget v0, v7, Lx/j$a;->J:F

    :goto_1
    invoke-static {v0}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/j$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/j$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/j$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/j$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, Lx/j$a;

    iget v0, p0, Lx/j$a;->J:F

    iget-object v1, p0, Lx/j$a;->K:Lx/j;

    iget-object v2, p0, Lx/j$a;->L:Lx/w;

    invoke-direct {p1, v0, v1, v2, p2}, Lx/j$a;-><init>(FLx/j;Lx/w;Lm7/e;)V

    return-object p1
.end method
