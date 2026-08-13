.class final Landroidx/compose/animation/f$d;
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
        Landroidx/compose/animation/f$d$a;
    }
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/h;

.field final synthetic E:Landroidx/compose/animation/j;


# direct methods
.method constructor <init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/f$d;->D:Landroidx/compose/animation/h;

    iput-object p2, p0, Landroidx/compose/animation/f$d;->E:Landroidx/compose/animation/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;)Ljava/lang/Float;
    .locals 2

    .prologue
    sget-object v0, Landroidx/compose/animation/f$d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/f$d;->E:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->c()Lt/o;

    move-result-object p1

    if-eqz p1, :cond_2

    :goto_0
    invoke-virtual {p1}, Lt/o;->a()F

    move-result v1

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Landroidx/compose/animation/f$d;->D:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->c()Lt/o;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$d;->a(Lt/m;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
