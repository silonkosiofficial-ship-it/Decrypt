.class public final Lcom/google/android/material/progressindicator/f;
.super Lcom/google/android/material/progressindicator/g;
.source "SourceFile"


# static fields
.field private static final W:LR1/c;


# instance fields
.field private R:Lcom/google/android/material/progressindicator/h;

.field private final S:LR1/e;

.field private final T:LR1/d;

.field private final U:Lcom/google/android/material/progressindicator/h$a;

.field private V:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/material/progressindicator/f$a;

    const-string v1, "indicatorLevel"

    invoke-direct {v0, v1}, Lcom/google/android/material/progressindicator/f$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/material/progressindicator/f;->W:LR1/c;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/b;Lcom/google/android/material/progressindicator/h;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/progressindicator/g;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/b;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/material/progressindicator/f;->V:Z

    invoke-virtual {p0, p3}, Lcom/google/android/material/progressindicator/f;->y(Lcom/google/android/material/progressindicator/h;)V

    new-instance p1, Lcom/google/android/material/progressindicator/h$a;

    invoke-direct {p1}, Lcom/google/android/material/progressindicator/h$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/progressindicator/f;->U:Lcom/google/android/material/progressindicator/h$a;

    new-instance p1, LR1/e;

    invoke-direct {p1}, LR1/e;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/progressindicator/f;->S:LR1/e;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, LR1/e;->d(F)LR1/e;

    const/high16 p3, 0x42480000    # 50.0f

    invoke-virtual {p1, p3}, LR1/e;->f(F)LR1/e;

    new-instance p3, LR1/d;

    sget-object v0, Lcom/google/android/material/progressindicator/f;->W:LR1/c;

    invoke-direct {p3, p0, v0}, LR1/d;-><init>(Ljava/lang/Object;LR1/c;)V

    iput-object p3, p0, Lcom/google/android/material/progressindicator/f;->T:LR1/d;

    invoke-virtual {p3, p1}, LR1/d;->p(LR1/e;)LR1/d;

    invoke-virtual {p0, p2}, Lcom/google/android/material/progressindicator/g;->n(F)V

    return-void
.end method

.method static synthetic t(Lcom/google/android/material/progressindicator/f;)F
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/f;->x()F

    move-result p0

    return p0
.end method

.method static synthetic u(Lcom/google/android/material/progressindicator/f;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/f;->z(F)V

    return-void
.end method

.method static v(Landroid/content/Context;Lcom/google/android/material/progressindicator/e;Lcom/google/android/material/progressindicator/c;)Lcom/google/android/material/progressindicator/f;
    .locals 1

    new-instance v0, Lcom/google/android/material/progressindicator/f;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/material/progressindicator/f;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/b;Lcom/google/android/material/progressindicator/h;)V

    return-object v0
.end method

.method private x()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->U:Lcom/google/android/material/progressindicator/h$a;

    iget v0, v0, Lcom/google/android/material/progressindicator/h$a;->b:F

    return v0
.end method

.method private z(F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->U:Lcom/google/android/material/progressindicator/h$a;

    iput p1, v0, Lcom/google/android/material/progressindicator/h$a;->b:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method A(F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/g;->h()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->k()Z

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->j()Z

    move-result v5

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/progressindicator/h;->g(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    iget-object v0, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->U:Lcom/google/android/material/progressindicator/h$a;

    iget-object v1, p0, Lcom/google/android/material/progressindicator/g;->D:Lcom/google/android/material/progressindicator/b;

    iget-object v2, v1, Lcom/google/android/material/progressindicator/b;->c:[I

    const/4 v8, 0x0

    aget v2, v2, v8

    iput v2, v0, Lcom/google/android/material/progressindicator/h$a;->c:I

    iget v0, v1, Lcom/google/android/material/progressindicator/b;->g:I

    if-lez v0, :cond_1

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/f;->x()F

    move-result v1

    const/4 v2, 0x0

    const v3, 0x3c23d70a    # 0.01f

    invoke-static {v1, v2, v3}, Lw1/a;->a(FFF)F

    move-result v1

    mul-float/2addr v0, v1

    div-float/2addr v0, v3

    float-to-int v7, v0

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    iget-object v2, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/f;->x()F

    move-result v3

    iget-object v1, p0, Lcom/google/android/material/progressindicator/g;->D:Lcom/google/android/material/progressindicator/b;

    iget v5, v1, Lcom/google/android/material/progressindicator/b;->d:I

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->getAlpha()I

    move-result v6

    :goto_0
    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/progressindicator/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    iget-object v2, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    iget v5, v1, Lcom/google/android/material/progressindicator/b;->d:I

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->getAlpha()I

    move-result v6

    const/4 v7, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    iget-object v1, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/google/android/material/progressindicator/f;->U:Lcom/google/android/material/progressindicator/h$a;

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->getAlpha()I

    move-result v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/google/android/material/progressindicator/h;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lcom/google/android/material/progressindicator/h$a;I)V

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    iget-object v1, p0, Lcom/google/android/material/progressindicator/g;->O:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/google/android/material/progressindicator/g;->D:Lcom/google/android/material/progressindicator/b;

    iget-object v2, v2, Lcom/google/android/material/progressindicator/b;->c:[I

    aget v2, v2, v8

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/f;->getAlpha()I

    move-result v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/google/android/material/progressindicator/h;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    :goto_2
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/h;->e()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/h;->f()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->i()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->isRunning()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->j()Z

    move-result v0

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->T:LR1/d;

    invoke-virtual {v0}, LR1/d;->q()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/google/android/material/progressindicator/f;->z(F)V

    return-void
.end method

.method public bridge synthetic k()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->k()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Landroidx/vectordrawable/graphics/drawable/b;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/g;->m(Landroidx/vectordrawable/graphics/drawable/b;)V

    return-void
.end method

.method protected onLevelChange(I)Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/material/progressindicator/f;->V:Z

    const v1, 0x461c4000    # 10000.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->T:LR1/d;

    invoke-virtual {v0}, LR1/d;->q()V

    int-to-float p1, p1

    div-float/2addr p1, v1

    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/f;->z(F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->T:LR1/d;

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/f;->x()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {v0, v2}, LR1/b;->h(F)LR1/b;

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->T:LR1/d;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, LR1/d;->l(F)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic q(ZZZ)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/progressindicator/g;->q(ZZZ)Z

    move-result p1

    return p1
.end method

.method r(ZZZ)Z
    .locals 1

    .prologue
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/progressindicator/g;->r(ZZZ)Z

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/progressindicator/g;->E:Lz4/a;

    iget-object p3, p0, Lcom/google/android/material/progressindicator/g;->C:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p2, p3}, Lz4/a;->a(Landroid/content/ContentResolver;)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/material/progressindicator/f;->V:Z

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Lcom/google/android/material/progressindicator/f;->V:Z

    iget-object p3, p0, Lcom/google/android/material/progressindicator/f;->S:LR1/e;

    const/high16 v0, 0x42480000    # 50.0f

    div-float/2addr v0, p2

    invoke-virtual {p3, v0}, LR1/e;->f(F)LR1/e;

    :goto_0
    return p1
.end method

.method public bridge synthetic s(Landroidx/vectordrawable/graphics/drawable/b;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/g;->s(Landroidx/vectordrawable/graphics/drawable/b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/g;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/android/material/progressindicator/g;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/progressindicator/g;->stop()V

    return-void
.end method

.method w()Lcom/google/android/material/progressindicator/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    return-object v0
.end method

.method y(Lcom/google/android/material/progressindicator/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/progressindicator/f;->R:Lcom/google/android/material/progressindicator/h;

    return-void
.end method
