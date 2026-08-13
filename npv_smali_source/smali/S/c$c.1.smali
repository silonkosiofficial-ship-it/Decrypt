.class final LS/c$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/c;->B(FZLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/c;

.field final synthetic I:F

.field final synthetic J:Z


# direct methods
.method constructor <init>(LS/c;FZLm7/e;)V
    .locals 0

    iput-object p1, p0, LS/c$c;->H:LS/c;

    iput p2, p0, LS/c$c;->I:F

    iput-boolean p3, p0, LS/c$c;->J:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/c$c;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS/c$c;->H:LS/c;

    invoke-virtual {p1}, LS/c;->g()I

    move-result p1

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LS/s1;->f(II)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LS/c$c;->H:LS/c;

    iget v1, p0, LS/c$c;->I:F

    invoke-static {p1, v1}, LS/c;->q(LS/c;F)I

    move-result v1

    const/16 v4, 0xc

    rem-int/2addr v1, v4

    int-to-float v1, v1

    const v5, 0x3f060a92

    mul-float/2addr v1, v5

    invoke-static {p1, v1}, LS/c;->o(LS/c;F)V

    iget-object p1, p0, LS/c$c;->H:LS/c;

    invoke-virtual {p1}, LS/c;->w()LS/t1;

    move-result-object p1

    iget-object v1, p0, LS/c$c;->H:LS/c;

    invoke-static {v1}, LS/c;->l(LS/c;)F

    move-result v5

    invoke-static {v1, v5}, LS/c;->q(LS/c;F)I

    move-result v1

    rem-int/2addr v1, v4

    iget-object v5, p0, LS/c$c;->H:LS/c;

    invoke-virtual {v5}, LS/c;->i()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    add-int/2addr v1, v4

    invoke-interface {p1, v1}, LS/t1;->d(I)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, LS/c$c;->H:LS/c;

    iget v1, p0, LS/c$c;->I:F

    invoke-static {p1, v1}, LS/c;->r(LS/c;F)I

    move-result v1

    int-to-float v1, v1

    const v4, 0x3dd67750

    mul-float/2addr v1, v4

    invoke-static {p1, v1}, LS/c;->p(LS/c;F)V

    iget-object p1, p0, LS/c$c;->H:LS/c;

    invoke-virtual {p1}, LS/c;->w()LS/t1;

    move-result-object p1

    iget-object v1, p0, LS/c$c;->H:LS/c;

    invoke-static {v1}, LS/c;->m(LS/c;)F

    move-result v4

    invoke-static {v1, v4}, LS/c;->r(LS/c;F)I

    move-result v1

    invoke-interface {p1, v1}, LS/t1;->e(I)V

    :goto_1
    iget-boolean p1, p0, LS/c$c;->J:Z

    if-nez p1, :cond_6

    iget-object p1, p0, LS/c$c;->H:LS/c;

    invoke-static {p1}, LS/c;->k(LS/c;)Lu/a;

    move-result-object p1

    iget-object v1, p0, LS/c$c;->H:LS/c;

    iget v2, p0, LS/c$c;->I:F

    invoke-static {v1, v2}, LS/c;->n(LS/c;F)F

    move-result v1

    invoke-static {v1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v1

    iput v3, p0, LS/c$c;->G:I

    invoke-virtual {p1, v1, p0}, Lu/a;->s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    goto :goto_3

    :cond_6
    iget-object p1, p0, LS/c$c;->H:LS/c;

    iget v1, p0, LS/c$c;->I:F

    invoke-static {p1, v1}, LS/c;->n(LS/c;F)F

    move-result v1

    invoke-static {p1, v1}, LS/c;->j(LS/c;F)F

    move-result p1

    iget-object v1, p0, LS/c$c;->H:LS/c;

    invoke-static {v1}, LS/c;->k(LS/c;)Lu/a;

    move-result-object v3

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 p1, 0x442f0000    # 700.0f

    const/4 v1, 0x4

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static {v5, p1, v6, v1, v6}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v5

    iput v2, p0, LS/c$c;->G:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lu/a;->f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LS/c$c;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/c$c;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LS/c$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LS/c$c;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LS/c$c;

    iget-object v1, p0, LS/c$c;->H:LS/c;

    iget v2, p0, LS/c$c;->I:F

    iget-boolean v3, p0, LS/c$c;->J:Z

    invoke-direct {v0, v1, v2, v3, p1}, LS/c$c;-><init>(LS/c;FZLm7/e;)V

    return-object v0
.end method
