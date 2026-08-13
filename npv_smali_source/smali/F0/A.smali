.class final LF0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LF0/A;->a:F

    iput v0, p0, LF0/A;->b:F

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, LF0/A;->h:F

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LF0/A;->i:J

    return-void
.end method


# virtual methods
.method public final a(LF0/A;)V
    .locals 2

    iget v0, p1, LF0/A;->a:F

    iput v0, p0, LF0/A;->a:F

    iget v0, p1, LF0/A;->b:F

    iput v0, p0, LF0/A;->b:F

    iget v0, p1, LF0/A;->c:F

    iput v0, p0, LF0/A;->c:F

    iget v0, p1, LF0/A;->d:F

    iput v0, p0, LF0/A;->d:F

    iget v0, p1, LF0/A;->e:F

    iput v0, p0, LF0/A;->e:F

    iget v0, p1, LF0/A;->f:F

    iput v0, p0, LF0/A;->f:F

    iget v0, p1, LF0/A;->g:F

    iput v0, p0, LF0/A;->g:F

    iget v0, p1, LF0/A;->h:F

    iput v0, p0, LF0/A;->h:F

    iget-wide v0, p1, LF0/A;->i:J

    iput-wide v0, p0, LF0/A;->i:J

    return-void
.end method

.method public final b(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->o()F

    move-result v0

    iput v0, p0, LF0/A;->a:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->E()F

    move-result v0

    iput v0, p0, LF0/A;->b:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->z()F

    move-result v0

    iput v0, p0, LF0/A;->c:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->v()F

    move-result v0

    iput v0, p0, LF0/A;->d:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->B()F

    move-result v0

    iput v0, p0, LF0/A;->e:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->r()F

    move-result v0

    iput v0, p0, LF0/A;->f:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->u()F

    move-result v0

    iput v0, p0, LF0/A;->g:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->x()F

    move-result v0

    iput v0, p0, LF0/A;->h:F

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->N0()J

    move-result-wide v0

    iput-wide v0, p0, LF0/A;->i:J

    return-void
.end method

.method public final c(LF0/A;)Z
    .locals 4

    .prologue
    iget v0, p0, LF0/A;->a:F

    iget v1, p1, LF0/A;->a:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->b:F

    iget v1, p1, LF0/A;->b:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->c:F

    iget v1, p1, LF0/A;->c:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->d:F

    iget v1, p1, LF0/A;->d:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->e:F

    iget v1, p1, LF0/A;->e:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->f:F

    iget v1, p1, LF0/A;->f:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->g:F

    iget v1, p1, LF0/A;->g:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, LF0/A;->h:F

    iget v1, p1, LF0/A;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget-wide v0, p0, LF0/A;->i:J

    iget-wide v2, p1, LF0/A;->i:J

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
