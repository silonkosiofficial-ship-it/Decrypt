.class final Landroidx/compose/ui/window/a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lx7/a;Landroidx/compose/ui/window/i;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;


# direct methods
.method constructor <init>(LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/a$d;->D:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 5

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)"

    const v2, 0x1d1a4619

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v0, Landroidx/compose/ui/window/a$d$a;->D:Landroidx/compose/ui/window/a$d$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    new-instance v0, Landroidx/compose/ui/window/a$d$b;

    iget-object v1, p0, Landroidx/compose/ui/window/a$d;->D:LV/G1;

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/a$d$b;-><init>(LV/G1;)V

    const/16 v1, 0x36

    const v4, -0x1fcf3bc7

    invoke-static {v4, v3, v0, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {p2, v0, p1, v1, v2}, Landroidx/compose/ui/window/a;->e(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/a$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
