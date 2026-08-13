.class final Landroidx/compose/foundation/m$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/m;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/m;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    invoke-virtual {v0}, Landroidx/compose/foundation/m;->l()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, p1

    iget-object v1, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    invoke-static {v1}, Landroidx/compose/foundation/m;->f(Landroidx/compose/foundation/m;)F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    invoke-virtual {v1}, Landroidx/compose/foundation/m;->k()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LE7/j;->j(FFF)F

    move-result v1

    cmpg-float v0, v0, v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v2

    iget-object v2, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    invoke-virtual {v2}, Landroidx/compose/foundation/m;->l()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    invoke-virtual {v3}, Landroidx/compose/foundation/m;->l()I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {v3, v4}, Landroidx/compose/foundation/m;->i(Landroidx/compose/foundation/m;I)V

    iget-object v3, p0, Landroidx/compose/foundation/m$f;->D:Landroidx/compose/foundation/m;

    int-to-float v2, v2

    sub-float v2, v1, v2

    invoke-static {v3, v2}, Landroidx/compose/foundation/m;->h(Landroidx/compose/foundation/m;F)V

    if-eqz v0, :cond_1

    move p1, v1

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/m$f;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
