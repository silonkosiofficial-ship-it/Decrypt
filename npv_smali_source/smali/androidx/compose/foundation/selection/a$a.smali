.class public final Landroidx/compose/foundation/selection/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/selection/a;->a(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv/G;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:LK0/h;

.field final synthetic H:Lx7/a;


# direct methods
.method public constructor <init>(Lv/G;ZZLK0/h;Lx7/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/selection/a$a;->D:Lv/G;

    iput-boolean p2, p0, Landroidx/compose/foundation/selection/a$a;->E:Z

    iput-boolean p3, p0, Landroidx/compose/foundation/selection/a$a;->F:Z

    iput-object p4, p0, Landroidx/compose/foundation/selection/a$a;->G:LK0/h;

    iput-object p5, p0, Landroidx/compose/foundation/selection/a$a;->H:Lx7/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    const p1, -0x5af0b3b9

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p1

    check-cast v2, Lz/l;

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object p3, p0, Landroidx/compose/foundation/selection/a$a;->D:Lv/G;

    invoke-static {p1, v2, p3}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;

    move-result-object p1

    new-instance p3, Landroidx/compose/foundation/selection/SelectableElement;

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/a$a;->E:Z

    iget-boolean v4, p0, Landroidx/compose/foundation/selection/a$a;->F:Z

    iget-object v5, p0, Landroidx/compose/foundation/selection/a$a;->G:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/selection/a$a;->H:Lx7/a;

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V

    invoke-interface {p1, p3}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/selection/a$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
