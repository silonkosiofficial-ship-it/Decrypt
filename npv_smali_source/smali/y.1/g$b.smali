.class final Ly/g$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/g;->h(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:Ly/g;

.field final synthetic J:F

.field final synthetic K:Lx7/l;

.field final synthetic L:Lx/w;


# direct methods
.method constructor <init>(Ly/g;FLx7/l;Lx/w;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Ly/g$b;->I:Ly/g;

    iput p2, p0, Ly/g$b;->J:F

    iput-object p3, p0, Ly/g$b;->K:Lx7/l;

    iput-object p4, p0, Ly/g$b;->L:Lx/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly/g$b;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ly/g$b;->G:Ljava/lang/Object;

    check-cast v1, Ly7/L;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly/g$b;->I:Ly/g;

    invoke-static {p1}, Ly/g;->d(Ly/g;)Lu/B;

    move-result-object p1

    const/4 v1, 0x0

    iget v4, p0, Ly/g$b;->J:F

    invoke-static {p1, v1, v4}, Lu/D;->a(Lu/B;FF)F

    move-result p1

    iget-object v1, p0, Ly/g$b;->I:Ly/g;

    invoke-static {v1}, Ly/g;->f(Ly/g;)Ly/i;

    move-result-object v1

    iget v4, p0, Ly/g$b;->J:F

    invoke-interface {v1, v4, p1}, Ly/i;->a(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    xor-int/2addr v1, v3

    if-eqz v1, :cond_6

    new-instance v1, Ly7/L;

    invoke-direct {v1}, Ly7/L;-><init>()V

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v4, p0, Ly/g$b;->J:F

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    mul-float/2addr p1, v4

    iput p1, v1, Ly7/L;->C:F

    iget-object v4, p0, Ly/g$b;->K:Lx7/l;

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Ly/g$b;->I:Ly/g;

    iget-object v6, p0, Ly/g$b;->L:Lx/w;

    iget v7, v1, Ly7/L;->C:F

    iget v8, p0, Ly/g$b;->J:F

    new-instance v9, Ly/g$b$b;

    iget-object p1, p0, Ly/g$b;->K:Lx7/l;

    invoke-direct {v9, v1, p1}, Ly/g$b$b;-><init>(Ly7/L;Lx7/l;)V

    iput-object v1, p0, Ly/g$b;->G:Ljava/lang/Object;

    iput v3, p0, Ly/g$b;->H:I

    move-object v10, p0

    invoke-static/range {v5 .. v10}, Ly/g;->g(Ly/g;Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    move-object v4, p1

    check-cast v4, Lu/l;

    iget-object p1, p0, Ly/g$b;->I:Ly/g;

    invoke-static {p1}, Ly/g;->f(Ly/g;)Ly/i;

    move-result-object p1

    invoke-virtual {v4}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-interface {p1, v5}, Ly/i;->b(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    xor-int/2addr v3, v5

    if-eqz v3, :cond_5

    iput p1, v1, Ly7/L;->C:F

    iget-object v3, p0, Ly/g$b;->L:Lx/w;

    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lu/m;->g(Lu/l;FFJJZILjava/lang/Object;)Lu/l;

    move-result-object v9

    iget-object v4, p0, Ly/g$b;->I:Ly/g;

    invoke-static {v4}, Ly/g;->e(Ly/g;)Lu/j;

    move-result-object v10

    new-instance v11, Ly/g$b$a;

    iget-object v4, p0, Ly/g$b;->K:Lx7/l;

    invoke-direct {v11, v1, v4}, Ly/g$b$a;-><init>(Ly7/L;Lx7/l;)V

    const/4 v1, 0x0

    iput-object v1, p0, Ly/g$b;->G:Ljava/lang/Object;

    iput v2, p0, Ly/g$b;->H:I

    move-object v6, v3

    move v7, p1

    move v8, p1

    move-object v12, p0

    invoke-static/range {v6 .. v12}, Ly/h;->c(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "calculateSnapOffset returned NaN. Please use a valid value."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "calculateApproachOffset returned NaN. Please use a valid value."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly/g$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Ly/g$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Ly/g$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Ly/g$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Ly/g$b;

    iget-object v1, p0, Ly/g$b;->I:Ly/g;

    iget v2, p0, Ly/g$b;->J:F

    iget-object v3, p0, Ly/g$b;->K:Lx7/l;

    iget-object v4, p0, Ly/g$b;->L:Lx/w;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ly/g$b;-><init>(Ly/g;FLx7/l;Lx/w;Lm7/e;)V

    return-object p1
.end method
