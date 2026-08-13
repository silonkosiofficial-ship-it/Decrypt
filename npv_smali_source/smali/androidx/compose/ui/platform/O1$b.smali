.class public final Landroidx/compose/ui/platform/O1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O1;->b(Landroid/view/View;Lm7/i;Landroidx/lifecycle/k;)LV/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/O1$b$a;
    }
.end annotation


# instance fields
.field final synthetic C:LW8/N;

.field final synthetic D:LV/E0;

.field final synthetic E:LV/U0;

.field final synthetic F:Ly7/O;

.field final synthetic G:Landroid/view/View;


# direct methods
.method constructor <init>(LW8/N;LV/E0;LV/U0;Ly7/O;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O1$b;->C:LW8/N;

    iput-object p2, p0, Landroidx/compose/ui/platform/O1$b;->D:LV/E0;

    iput-object p3, p0, Landroidx/compose/ui/platform/O1$b;->E:LV/U0;

    iput-object p4, p0, Landroidx/compose/ui/platform/O1$b;->F:Ly7/O;

    iput-object p5, p0, Landroidx/compose/ui/platform/O1$b;->G:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 10

    .prologue
    sget-object v0, Landroidx/compose/ui/platform/O1$b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    if-eq p2, p1, :cond_2

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b;->E:LV/U0;

    invoke-virtual {p1}, LV/U0;->Y()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b;->E:LV/U0;

    invoke-virtual {p1}, LV/U0;->l0()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b;->D:LV/E0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LV/E0;->b()V

    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/platform/O1$b;->E:LV/U0;

    invoke-virtual {p1}, LV/U0;->y0()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/O1$b;->C:LW8/N;

    sget-object v2, LW8/P;->F:LW8/P;

    new-instance p2, Landroidx/compose/ui/platform/O1$b$b;

    iget-object v4, p0, Landroidx/compose/ui/platform/O1$b;->F:Ly7/O;

    iget-object v5, p0, Landroidx/compose/ui/platform/O1$b;->E:LV/U0;

    iget-object v8, p0, Landroidx/compose/ui/platform/O1$b;->G:Landroid/view/View;

    const/4 v9, 0x0

    move-object v3, p2

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v3 .. v9}, Landroidx/compose/ui/platform/O1$b$b;-><init>(Ly7/O;LV/U0;Landroidx/lifecycle/r;Landroidx/compose/ui/platform/O1$b;Landroid/view/View;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :goto_0
    return-void
.end method
