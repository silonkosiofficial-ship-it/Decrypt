.class final Landroidx/compose/animation/f$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->e(Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LV/n;I)Lt/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/f$i$a;
    }
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/graphics/f;

.field final synthetic E:Landroidx/compose/animation/h;

.field final synthetic F:Landroidx/compose/animation/j;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/f;Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/f$i;->D:Landroidx/compose/ui/graphics/f;

    iput-object p2, p0, Landroidx/compose/animation/f$i;->E:Landroidx/compose/animation/h;

    iput-object p3, p0, Landroidx/compose/animation/f$i;->F:Landroidx/compose/animation/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;)J
    .locals 2

    .prologue
    sget-object v0, Landroidx/compose/animation/f$i$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/f$i;->F:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->e()Lt/v;

    move-result-object p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p1}, Lt/v;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Landroidx/compose/animation/f$i;->E:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->e()Lt/v;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Landroidx/compose/animation/f$i;->E:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->e()Lt/v;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/compose/animation/f$i;->F:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->e()Lt/v;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/f$i;->D:Landroidx/compose/ui/graphics/f;

    :cond_5
    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    goto :goto_2

    :cond_6
    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    :goto_2
    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$i;->a(Lt/m;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    return-object p1
.end method
