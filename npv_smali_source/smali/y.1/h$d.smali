.class final Ly/h$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/h;->h(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:F

.field final synthetic E:Ly7/L;

.field final synthetic F:Lx/w;

.field final synthetic G:Lx7/l;


# direct methods
.method constructor <init>(FLy7/L;Lx/w;Lx7/l;)V
    .locals 0

    iput p1, p0, Ly/h$d;->D:F

    iput-object p2, p0, Ly/h$d;->E:Ly7/L;

    iput-object p3, p0, Ly/h$d;->F:Lx/w;

    iput-object p4, p0, Ly/h$d;->G:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 5

    .prologue
    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Ly/h$d;->D:F

    invoke-static {v0, v1}, Ly/h;->e(FF)F

    move-result v0

    iget-object v1, p0, Ly/h$d;->E:Ly7/L;

    iget v1, v1, Ly7/L;->C:F

    sub-float v1, v0, v1

    iget-object v2, p0, Ly/h$d;->F:Lx/w;

    invoke-interface {v2, v1}, Lx/w;->a(F)F

    move-result v2

    iget-object v3, p0, Ly/h$d;->G:Lx7/l;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v1, v1, v3

    if-gtz v1, :cond_0

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lu/i;->a()V

    :goto_0
    iget-object p1, p0, Ly/h$d;->E:Ly7/L;

    iget v0, p1, Ly7/L;->C:F

    add-float/2addr v0, v2

    iput v0, p1, Ly7/L;->C:F

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Ly/h$d;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
