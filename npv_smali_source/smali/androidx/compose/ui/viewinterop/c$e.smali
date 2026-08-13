.class final Landroidx/compose/ui/viewinterop/c$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LV/s;ILy0/c;Landroid/view/View;LF0/o0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/viewinterop/c;

.field final synthetic E:LF0/J;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/c;LF0/J;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$e;->D:Landroidx/compose/ui/viewinterop/c;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$e;->E:LF0/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/o0;)V
    .locals 2

    .prologue
    instance-of v0, p1, Landroidx/compose/ui/platform/r;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/ui/platform/r;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$e;->D:Landroidx/compose/ui/viewinterop/c;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c$e;->E:LF0/J;

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/r;->Y(Landroidx/compose/ui/viewinterop/c;LF0/J;)V

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$e;->D:Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p1}, Landroidx/compose/ui/viewinterop/c;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$e;->D:Landroidx/compose/ui/viewinterop/c;

    if-eq p1, v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/o0;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$e;->a(LF0/o0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
