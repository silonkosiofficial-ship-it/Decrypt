.class final Landroidx/compose/animation/a$f$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/j;


# direct methods
.method constructor <init>(Landroidx/compose/animation/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$c;->D:Landroidx/compose/animation/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;Lt/m;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    sget-object v0, Lt/m;->E:Lt/m;

    if-ne p1, v0, :cond_0

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/a$f$c;->D:Landroidx/compose/animation/j;

    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p1

    invoke-virtual {p1}, Lt/C;->d()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/m;

    check-cast p2, Lt/m;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$f$c;->a(Lt/m;Lt/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
