.class final Lu/g0$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0;->O(FLjava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/Object;

.field final synthetic J:Lu/g0;

.field final synthetic K:Lu/s0;

.field final synthetic L:F


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/g0$h;->H:Ljava/lang/Object;

    iput-object p2, p0, Lu/g0$h;->I:Ljava/lang/Object;

    iput-object p3, p0, Lu/g0$h;->J:Lu/g0;

    iput-object p4, p0, Lu/g0$h;->K:Lu/s0;

    iput p5, p0, Lu/g0$h;->L:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/g0$h;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p1, Lu/g0$h$a;

    iget-object v4, p0, Lu/g0$h;->H:Ljava/lang/Object;

    iget-object v5, p0, Lu/g0$h;->I:Ljava/lang/Object;

    iget-object v6, p0, Lu/g0$h;->J:Lu/g0;

    iget-object v7, p0, Lu/g0$h;->K:Lu/s0;

    iget v8, p0, Lu/g0$h;->L:F

    const/4 v9, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lu/g0$h$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V

    iput v2, p0, Lu/g0$h;->G:I

    invoke-static {p1, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lu/g0$h;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/g0$h;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Lu/g0$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Lu/g0$h;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 8

    new-instance v7, Lu/g0$h;

    iget-object v1, p0, Lu/g0$h;->H:Ljava/lang/Object;

    iget-object v2, p0, Lu/g0$h;->I:Ljava/lang/Object;

    iget-object v3, p0, Lu/g0$h;->J:Lu/g0;

    iget-object v4, p0, Lu/g0$h;->K:Lu/s0;

    iget v5, p0, Lu/g0$h;->L:F

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lu/g0$h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/g0;Lu/s0;FLm7/e;)V

    return-object v7
.end method
