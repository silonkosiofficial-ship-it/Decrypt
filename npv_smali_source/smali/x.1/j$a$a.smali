.class final Lx/j$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/j$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/L;

.field final synthetic E:Lx/w;

.field final synthetic F:Ly7/L;

.field final synthetic G:Lx/j;


# direct methods
.method constructor <init>(Ly7/L;Lx/w;Ly7/L;Lx/j;)V
    .locals 0

    iput-object p1, p0, Lx/j$a$a;->D:Ly7/L;

    iput-object p2, p0, Lx/j$a$a;->E:Lx/w;

    iput-object p3, p0, Lx/j$a$a;->F:Ly7/L;

    iput-object p4, p0, Lx/j$a$a;->G:Lx/j;

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

    iget-object v1, p0, Lx/j$a$a;->D:Ly7/L;

    iget v1, v1, Ly7/L;->C:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lx/j$a$a;->E:Lx/w;

    invoke-interface {v1, v0}, Lx/w;->a(F)F

    move-result v1

    iget-object v2, p0, Lx/j$a$a;->D:Ly7/L;

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Ly7/L;->C:F

    iget-object v2, p0, Lx/j$a$a;->F:Ly7/L;

    invoke-virtual {p1}, Lu/i;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Ly7/L;->C:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lu/i;->a()V

    :cond_0
    iget-object p1, p0, Lx/j$a$a;->G:Lx/j;

    invoke-virtual {p1}, Lx/j;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lx/j;->f(I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Lx/j$a$a;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
