.class final Landroidx/compose/animation/g$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;-><init>(Lu/s0;Lu/s0$a;Lu/s0$a;Lu/s0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Lt/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/g;


# direct methods
.method constructor <init>(Landroidx/compose/animation/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$j;->D:Landroidx/compose/animation/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;)Lu/I;
    .locals 2

    .prologue
    sget-object v0, Lt/m;->C:Lt/m;

    sget-object v1, Lt/m;->D:Lt/m;

    invoke-interface {p1, v0, v1}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/g$j;->D:Landroidx/compose/animation/g;

    invoke-virtual {p1}, Landroidx/compose/animation/g;->U1()Landroidx/compose/animation/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->f()Lt/y;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lt/y;->a()Lu/I;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_0
    :goto_0
    invoke-static {}, Landroidx/compose/animation/f;->c()Lu/l0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object v0, Lt/m;->E:Lt/m;

    invoke-interface {p1, v1, v0}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/g$j;->D:Landroidx/compose/animation/g;

    invoke-virtual {p1}, Landroidx/compose/animation/g;->V1()Landroidx/compose/animation/j;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->f()Lt/y;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lt/y;->a()Lu/I;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/s0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$j;->a(Lu/s0$b;)Lu/I;

    move-result-object p1

    return-object p1
.end method
