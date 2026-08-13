.class public final LU0/g;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field private a:Lo0/N1;

.field private b:LX0/k;

.field private c:I

.field private d:Lo0/c2;

.field private e:Lo0/n0;

.field private f:LV/G1;

.field private g:Ln0/m;

.field private h:Lq0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/text/TextPaint;-><init>(I)V

    iput p2, p0, Landroid/text/TextPaint;->density:F

    sget-object p1, LX0/k;->b:LX0/k$a;

    invoke-virtual {p1}, LX0/k$a;->c()LX0/k;

    move-result-object p1

    iput-object p1, p0, LU0/g;->b:LX0/k;

    sget-object p1, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {p1}, Lq0/g$a;->a()I

    move-result p1

    iput p1, p0, LU0/g;->c:I

    sget-object p1, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {p1}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object p1

    iput-object p1, p0, LU0/g;->d:Lo0/c2;

    return-void
.end method

.method private final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LU0/g;->f:LV/G1;

    iput-object v0, p0, LU0/g;->e:Lo0/n0;

    iput-object v0, p0, LU0/g;->g:Ln0/m;

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method private final c()Lo0/N1;
    .locals 1

    .prologue
    iget-object v0, p0, LU0/g;->a:Lo0/N1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lo0/U;->b(Landroid/graphics/Paint;)Lo0/N1;

    move-result-object v0

    iput-object v0, p0, LU0/g;->a:Lo0/N1;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LU0/g;->c:I

    return v0
.end method

.method public final d(I)V
    .locals 1

    .prologue
    iget v0, p0, LU0/g;->c:I

    invoke-static {p1, v0}, Lo0/f0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    invoke-interface {v0, p1}, Lo0/N1;->u(I)V

    iput p1, p0, LU0/g;->c:I

    return-void
.end method

.method public final e(Lo0/n0;JF)V
    .locals 4

    .prologue
    if-nez p1, :cond_0

    invoke-direct {p0}, LU0/g;->a()V

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lo0/f2;

    if-eqz v0, :cond_1

    check-cast p1, Lo0/f2;

    invoke-virtual {p1}, Lo0/f2;->b()J

    move-result-wide p1

    invoke-static {p1, p2, p4}, LX0/m;->c(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LU0/g;->f(J)V

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lo0/a2;

    if-eqz v0, :cond_7

    iget-object v0, p0, LU0/g;->e:Lo0/n0;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LU0/g;->g:Ln0/m;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ln0/m;->m()J

    move-result-wide v2

    invoke-static {v2, v3, p2, p3}, Ln0/m;->f(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_5

    :cond_3
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, p2, v2

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_5

    iput-object p1, p0, LU0/g;->e:Lo0/n0;

    invoke-static {p2, p3}, Ln0/m;->c(J)Ln0/m;

    move-result-object v0

    iput-object v0, p0, LU0/g;->g:Ln0/m;

    new-instance v0, LU0/g$a;

    invoke-direct {v0, p1, p2, p3}, LU0/g$a;-><init>(Lo0/n0;J)V

    invoke-static {v0}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p1

    iput-object p1, p0, LU0/g;->f:LV/G1;

    :cond_5
    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object p1

    iget-object p2, p0, LU0/g;->f:LV/G1;

    if-eqz p2, :cond_6

    invoke-interface {p2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Shader;

    goto :goto_1

    :cond_6
    const/4 p2, 0x0

    :goto_1
    invoke-interface {p1, p2}, Lo0/N1;->x(Landroid/graphics/Shader;)V

    invoke-static {p0, p4}, LU0/h;->a(Landroid/text/TextPaint;F)V

    :cond_7
    :goto_2
    return-void
.end method

.method public final f(J)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-direct {p0}, LU0/g;->a()V

    :cond_0
    return-void
.end method

.method public final g(Lq0/h;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LU0/g;->h:Lq0/h;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LU0/g;->h:Lq0/h;

    sget-object v0, Lq0/l;->a:Lq0/l;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lq0/m;

    if-eqz v0, :cond_2

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    sget-object v1, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v1}, Lo0/O1$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->F(I)V

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    check-cast p1, Lq0/m;

    invoke-virtual {p1}, Lq0/m;->f()F

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->I(F)V

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    invoke-virtual {p1}, Lq0/m;->d()F

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->z(F)V

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    invoke-virtual {p1}, Lq0/m;->c()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->E(I)V

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    invoke-virtual {p1}, Lq0/m;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->s(I)V

    invoke-direct {p0}, LU0/g;->c()Lo0/N1;

    move-result-object v0

    invoke-virtual {p1}, Lq0/m;->e()Lo0/R1;

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lo0/N1;->t(Lo0/R1;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Lo0/c2;)V
    .locals 4

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LU0/g;->d:Lo0/c2;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LU0/g;->d:Lo0/c2;

    sget-object v0, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {v0}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LU0/g;->d:Lo0/c2;

    invoke-virtual {p1}, Lo0/c2;->b()F

    move-result p1

    invoke-static {p1}, LV0/f;->b(F)F

    move-result p1

    iget-object v0, p0, LU0/g;->d:Lo0/c2;

    invoke-virtual {v0}, Lo0/c2;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    iget-object v1, p0, LU0/g;->d:Lo0/c2;

    invoke-virtual {v1}, Lo0/c2;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v1

    iget-object v2, p0, LU0/g;->d:Lo0/c2;

    invoke-virtual {v2}, Lo0/c2;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo0/A0;->k(J)I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final i(LX0/k;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LU0/g;->b:LX0/k;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LU0/g;->b:LX0/k;

    sget-object v0, LX0/k;->b:LX0/k$a;

    invoke-virtual {v0}, LX0/k$a;->d()LX0/k;

    move-result-object v1

    invoke-virtual {p1, v1}, LX0/k;->d(LX0/k;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object p1, p0, LU0/g;->b:LX0/k;

    invoke-virtual {v0}, LX0/k$a;->b()LX0/k;

    move-result-object v0

    invoke-virtual {p1, v0}, LX0/k;->d(LX0/k;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    :cond_1
    return-void
.end method
