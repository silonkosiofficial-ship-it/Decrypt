.class public final LW0/a;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field private final a:Lq0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lq0/h;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, LW0/a;->a:Lq0/h;

    return-void
.end method

.method private final a(I)Landroid/graphics/Paint$Cap;
    .locals 2

    .prologue
    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lo0/g2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo0/g2$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lo0/g2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lo0/g2$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Lo0/g2;->e(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    :goto_0
    return-object p1
.end method

.method private final b(I)Landroid/graphics/Paint$Join;
    .locals 2

    .prologue
    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lo0/h2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo0/h2$a;->c()I

    move-result v1

    invoke-static {p1, v1}, Lo0/h2;->e(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lo0/h2$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Lo0/h2;->e(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_1

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    sget-object v1, Lq0/l;->a:Lq0/l;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lq0/m;

    if-eqz v0, :cond_1

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    check-cast v0, Lq0/m;

    invoke-virtual {v0}, Lq0/m;->f()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    check-cast v0, Lq0/m;

    invoke-virtual {v0}, Lq0/m;->d()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    check-cast v0, Lq0/m;

    invoke-virtual {v0}, Lq0/m;->c()I

    move-result v0

    invoke-direct {p0, v0}, LW0/a;->b(I)Landroid/graphics/Paint$Join;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    check-cast v0, Lq0/m;

    invoke-virtual {v0}, Lq0/m;->b()I

    move-result v0

    invoke-direct {p0, v0}, LW0/a;->a(I)Landroid/graphics/Paint$Cap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, LW0/a;->a:Lq0/h;

    check-cast v0, Lq0/m;

    invoke-virtual {v0}, Lq0/m;->e()Lo0/R1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_1
    :goto_0
    return-void
.end method
