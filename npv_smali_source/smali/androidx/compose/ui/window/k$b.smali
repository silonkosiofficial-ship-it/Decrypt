.class final Landroidx/compose/ui/window/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/k;-><init>(Lx7/a;Landroidx/compose/ui/window/i;Landroid/view/View;LY0/v;LY0/e;Ljava/util/UUID;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/k;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k$b;->D:Landroidx/compose/ui/window/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le/w;)V
    .locals 0

    .prologue
    iget-object p1, p0, Landroidx/compose/ui/window/k$b;->D:Landroidx/compose/ui/window/k;

    invoke-static {p1}, Landroidx/compose/ui/window/k;->j(Landroidx/compose/ui/window/k;)Landroidx/compose/ui/window/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/window/i;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/k$b;->D:Landroidx/compose/ui/window/k;

    invoke-static {p1}, Landroidx/compose/ui/window/k;->i(Landroidx/compose/ui/window/k;)Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le/w;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/k$b;->a(Le/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
