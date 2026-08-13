.class final Landroidx/compose/ui/viewinterop/c$c;
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
.field final synthetic D:LF0/J;

.field final synthetic E:Landroidx/compose/ui/d;


# direct methods
.method constructor <init>(LF0/J;Landroidx/compose/ui/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$c;->D:LF0/J;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$c;->E:Landroidx/compose/ui/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$c;->D:LF0/J;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c$c;->E:Landroidx/compose/ui/d;

    invoke-interface {p1, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-virtual {v0, p1}, LF0/J;->g(Landroidx/compose/ui/d;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$c;->a(Landroidx/compose/ui/d;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
