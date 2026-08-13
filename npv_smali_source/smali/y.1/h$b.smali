.class final Ly/h$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/h;->f(Lx/w;FLu/l;Lu/B;Lx7/l;Lm7/e;)Ljava/lang/Object;
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

    iput p1, p0, Ly/h$b;->D:F

    iput-object p2, p0, Ly/h$b;->E:Ly7/L;

    iput-object p3, p0, Ly/h$b;->F:Lx/w;

    iput-object p4, p0, Ly/h$b;->G:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Ly/h$b;->D:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Ly/h$b;->D:F

    invoke-static {v0, v1}, Ly/h;->e(FF)F

    move-result v0

    iget-object v1, p0, Ly/h$b;->E:Ly7/L;

    iget v1, v1, Ly7/L;->C:F

    sub-float v1, v0, v1

    iget-object v2, p0, Ly/h$b;->F:Lx/w;

    iget-object v3, p0, Ly/h$b;->G:Lx7/l;

    invoke-static {p1, v2, v3, v1}, Ly/h;->b(Lu/i;Lx/w;Lx7/l;F)V

    invoke-virtual {p1}, Lu/i;->a()V

    iget-object p1, p0, Ly/h$b;->E:Ly7/L;

    iput v0, p1, Ly7/L;->C:F

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Ly/h$b;->E:Ly7/L;

    iget v1, v1, Ly7/L;->C:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Ly/h$b;->F:Lx/w;

    iget-object v2, p0, Ly/h$b;->G:Lx7/l;

    invoke-static {p1, v1, v2, v0}, Ly/h;->b(Lu/i;Lx/w;Lx7/l;F)V

    iget-object v0, p0, Ly/h$b;->E:Ly7/L;

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Ly7/L;->C:F

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Ly/h$b;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
