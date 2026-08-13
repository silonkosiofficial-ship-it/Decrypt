.class final LS/c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/c;->s(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/c;

.field final synthetic I:F


# direct methods
.method constructor <init>(LS/c;FLm7/e;)V
    .locals 0

    iput-object p1, p0, LS/c$a;->H:LS/c;

    iput p2, p0, LS/c$a;->I:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/c$a;->G:I

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

    iget-object p1, p0, LS/c$a;->H:LS/c;

    invoke-static {p1}, LS/c;->k(LS/c;)Lu/a;

    move-result-object v3

    iget p1, p0, LS/c$a;->I:F

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 p1, 0x442f0000    # 700.0f

    const/4 v1, 0x4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static {v5, p1, v6, v1, v6}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v5

    iput v2, p0, LS/c$a;->G:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lu/a;->f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LS/c$a;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/c$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LS/c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LS/c$a;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LS/c$a;

    iget-object v1, p0, LS/c$a;->H:LS/c;

    iget v2, p0, LS/c$a;->I:F

    invoke-direct {v0, v1, v2, p1}, LS/c$a;-><init>(LS/c;FLm7/e;)V

    return-object v0
.end method
