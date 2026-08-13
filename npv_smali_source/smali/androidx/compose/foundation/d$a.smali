.class final Landroidx/compose/foundation/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:LK0/h;

.field final synthetic G:Lx7/a;


# direct methods
.method constructor <init>(ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$a;->D:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$a;->E:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$a;->F:LK0/h;

    iput-object p4, p0, Landroidx/compose/foundation/d$a;->G:Lx7/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 7

    .prologue
    const p1, -0x2d10e1f7

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/foundation/h;->a()LV/O0;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lv/G;

    instance-of p1, v2, Lv/I;

    if-eqz p1, :cond_1

    const p1, 0x24c8cff8

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    const/4 p1, 0x0

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    const p1, 0x24ca75bd

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, Lz/l;

    invoke-interface {p2}, LV/n;->J()V

    goto :goto_0

    :goto_1
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-boolean v3, p0, Landroidx/compose/foundation/d$a;->D:Z

    iget-object v4, p0, Landroidx/compose/foundation/d$a;->E:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/d$a;->F:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/d$a;->G:Lx7/a;

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
