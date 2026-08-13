.class final Lu/g0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0;-><init>(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/g0;


# direct methods
.method constructor <init>(Lu/g0;)V
    .locals 0

    iput-object p1, p0, Lu/g0$c;->D:Lu/g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 9

    .prologue
    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->m(Lu/g0;)J

    move-result-wide v0

    sub-long v0, p1, v0

    iget-object v2, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v2, p1, p2}, Lu/g0;->w(Lu/g0;J)V

    long-to-double p1, v0

    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->k(Lu/g0;)F

    move-result v0

    float-to-double v0, v0

    div-double/2addr p1, v0

    invoke-static {p1, p2}, LA7/a;->e(D)J

    move-result-wide p1

    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->l(Lu/g0;)Lr/I;

    move-result-object v0

    invoke-virtual {v0}, Lr/P;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->l(Lu/g0;)Lr/I;

    move-result-object v0

    iget-object v2, p0, Lu/g0$c;->D:Lu/g0;

    iget-object v3, v0, Lr/P;->a:[Ljava/lang/Object;

    iget v0, v0, Lr/P;->b:I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    aget-object v6, v3, v5

    check-cast v6, Lu/g0$b;

    invoke-static {v2, v6, p1, p2}, Lu/g0;->r(Lu/g0;Lu/g0$b;J)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lu/g0$b;->k(Z)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->o(Lu/g0;)Lu/s0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu/s0;->Q()V

    :cond_1
    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->l(Lu/g0;)Lr/I;

    move-result-object v0

    iget v2, v0, Lr/P;->b:I

    iget-object v3, v0, Lr/P;->a:[Ljava/lang/Object;

    invoke-static {v4, v2}, LE7/j;->q(II)LE7/i;

    move-result-object v5

    invoke-virtual {v5}, LE7/g;->f()I

    move-result v6

    invoke-virtual {v5}, LE7/g;->g()I

    move-result v5

    if-gt v6, v5, :cond_3

    :goto_1
    sub-int v7, v6, v4

    aget-object v8, v3, v6

    aput-object v8, v3, v7

    aget-object v7, v3, v6

    check-cast v7, Lu/g0$b;

    invoke-virtual {v7}, Lu/g0$b;->h()Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v4, v4, 0x1

    :cond_2
    if-eq v6, v5, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    sub-int v5, v2, v4

    invoke-static {v3, v1, v5, v2}, Lj7/n;->w([Ljava/lang/Object;Ljava/lang/Object;II)V

    iget v2, v0, Lr/P;->b:I

    sub-int/2addr v2, v4

    iput v2, v0, Lr/P;->b:I

    :cond_4
    iget-object v0, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->j(Lu/g0;)Lu/g0$b;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v2, p0, Lu/g0$c;->D:Lu/g0;

    invoke-virtual {v2}, Lu/g0;->I()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lu/g0$b;->l(J)V

    iget-object v2, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {v2, v0, p1, p2}, Lu/g0;->r(Lu/g0;Lu/g0$b;J)V

    iget-object p1, p0, Lu/g0$c;->D:Lu/g0;

    invoke-virtual {v0}, Lu/g0$b;->g()F

    move-result p2

    invoke-static {p1, p2}, Lu/g0;->v(Lu/g0;F)V

    invoke-virtual {v0}, Lu/g0$b;->g()F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p1, p1, p2

    if-nez p1, :cond_5

    iget-object p1, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {p1, v1}, Lu/g0;->u(Lu/g0;Lu/g0$b;)V

    :cond_5
    iget-object p1, p0, Lu/g0$c;->D:Lu/g0;

    invoke-static {p1}, Lu/g0;->t(Lu/g0;)V

    :cond_6
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/g0$c;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
