.class final Landroidx/compose/ui/platform/P1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P1;->h(Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/P1;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/P1;Lx7/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    iput-object p2, p0, Landroidx/compose/ui/platform/P1$a;->E:Lx7/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/r$b;)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-static {v0}, Landroidx/compose/ui/platform/P1;->B(Landroidx/compose/ui/platform/P1;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/r;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    iget-object v1, p0, Landroidx/compose/ui/platform/P1$a;->E:Lx7/p;

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/P1;->E(Landroidx/compose/ui/platform/P1;Lx7/p;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-static {v0}, Landroidx/compose/ui/platform/P1;->A(Landroidx/compose/ui/platform/P1;)Landroidx/lifecycle/k;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/P1;->C(Landroidx/compose/ui/platform/P1;Landroidx/lifecycle/k;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->E:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/P1;->F()LV/r;

    move-result-object p1

    new-instance v0, Landroidx/compose/ui/platform/P1$a$a;

    iget-object v1, p0, Landroidx/compose/ui/platform/P1$a;->D:Landroidx/compose/ui/platform/P1;

    iget-object v2, p0, Landroidx/compose/ui/platform/P1$a;->E:Lx7/p;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/P1$a$a;-><init>(Landroidx/compose/ui/platform/P1;Lx7/p;)V

    const v1, -0x773f589e

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    invoke-interface {p1, v0}, LV/r;->h(Lx7/p;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/r$b;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/P1$a;->a(Landroidx/compose/ui/platform/r$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
