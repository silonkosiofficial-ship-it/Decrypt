.class final Landroidx/compose/ui/viewinterop/c$j;
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

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->D:Landroidx/compose/ui/viewinterop/c;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$j;->E:LF0/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/t;)V
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->D:Landroidx/compose/ui/viewinterop/c;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$j;->E:LF0/J;

    invoke-static {p1, v0}, Landroidx/compose/ui/viewinterop/d;->b(Landroid/view/View;LF0/J;)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c$j;->D:Landroidx/compose/ui/viewinterop/c;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/c;->e(Landroidx/compose/ui/viewinterop/c;)LF0/o0;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$j;->D:Landroidx/compose/ui/viewinterop/c;

    invoke-interface {p1, v0}, LF0/o0;->e(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/t;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$j;->a(LD0/t;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
