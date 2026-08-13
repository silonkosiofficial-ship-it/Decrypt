.class final Landroidx/compose/ui/platform/r$w;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r$w;->D:Landroidx/compose/ui/platform/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lx7/a;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r$w;->f(Lx7/a;)V

    return-void
.end method

.method private static final f(Lx7/a;)V
    .locals 0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Lx7/a;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/r$w;->D:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/r$w;->D:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Landroidx/compose/ui/platform/s;

    invoke-direct {v1, p1}, Landroidx/compose/ui/platform/s;-><init>(Lx7/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$w;->e(Lx7/a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
