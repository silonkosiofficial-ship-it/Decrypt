.class final Lx/I$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/I;->h(Lx7/l;Lx7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/I;

.field final synthetic E:F

.field final synthetic F:Lx7/l;


# direct methods
.method constructor <init>(Lx/I;FLx7/l;)V
    .locals 0

    iput-object p1, p0, Lx/I$c;->D:Lx/I;

    iput p2, p0, Lx/I$c;->E:F

    iput-object p3, p0, Lx/I$c;->F:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 11

    .prologue
    iget-object v0, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v0}, Lx/I;->b(Lx/I;)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v0, p1, p2}, Lx/I;->f(Lx/I;J)V

    :cond_0
    new-instance v0, Lu/n;

    iget-object v1, p0, Lx/I$c;->D:Lx/I;

    invoke-virtual {v1}, Lx/I;->i()F

    move-result v1

    invoke-direct {v0, v1}, Lu/n;-><init>(F)V

    iget v1, p0, Lx/I$c;->E:F

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    iget-object v1, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v1}, Lx/I;->d(Lx/I;)Lu/B0;

    move-result-object v1

    new-instance v2, Lu/n;

    iget-object v3, p0, Lx/I$c;->D:Lx/I;

    invoke-virtual {v3}, Lx/I;->i()F

    move-result v3

    invoke-direct {v2, v3}, Lu/n;-><init>(F)V

    invoke-static {}, Lx/I;->a()Lx/I$a;

    move-result-object v3

    invoke-virtual {v3}, Lx/I$a;->a()Lu/n;

    move-result-object v3

    iget-object v4, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v4}, Lx/I;->c(Lx/I;)Lu/n;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lu/B0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide v1

    :goto_0
    move-wide v7, v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v1}, Lx/I;->b(Lx/I;)J

    move-result-wide v1

    sub-long v1, p1, v1

    long-to-float v1, v1

    iget v2, p0, Lx/I$c;->E:F

    div-float/2addr v1, v2

    invoke-static {v1}, LA7/a;->f(F)J

    move-result-wide v1

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v1}, Lx/I;->d(Lx/I;)Lu/B0;

    move-result-object v1

    invoke-static {}, Lx/I;->a()Lx/I$a;

    move-result-object v2

    invoke-virtual {v2}, Lx/I$a;->a()Lu/n;

    move-result-object v5

    iget-object v2, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v2}, Lx/I;->c(Lx/I;)Lu/n;

    move-result-object v6

    move-wide v2, v7

    move-object v4, v0

    invoke-interface/range {v1 .. v6}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v1

    check-cast v1, Lu/n;

    invoke-virtual {v1}, Lu/n;->f()F

    move-result v9

    iget-object v10, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v10}, Lx/I;->d(Lx/I;)Lu/B0;

    move-result-object v1

    invoke-static {}, Lx/I;->a()Lx/I$a;

    move-result-object v2

    invoke-virtual {v2}, Lx/I$a;->a()Lu/n;

    move-result-object v5

    iget-object v2, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v2}, Lx/I;->c(Lx/I;)Lu/n;

    move-result-object v6

    move-wide v2, v7

    invoke-interface/range {v1 .. v6}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v0

    check-cast v0, Lu/n;

    invoke-static {v10, v0}, Lx/I;->g(Lx/I;Lu/n;)V

    iget-object v0, p0, Lx/I$c;->D:Lx/I;

    invoke-static {v0, p1, p2}, Lx/I;->f(Lx/I;J)V

    iget-object p1, p0, Lx/I$c;->D:Lx/I;

    invoke-virtual {p1}, Lx/I;->i()F

    move-result p1

    sub-float/2addr p1, v9

    iget-object p2, p0, Lx/I$c;->D:Lx/I;

    invoke-virtual {p2, v9}, Lx/I;->j(F)V

    iget-object p2, p0, Lx/I$c;->F:Lx7/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lx/I$c;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
