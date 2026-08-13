.class final Landroidx/compose/ui/viewinterop/i$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/i;->setUpdateBlock(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/viewinterop/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i$d;->D:Landroidx/compose/ui/viewinterop/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i$d;->D:Landroidx/compose/ui/viewinterop/i;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/i;->w(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i$d;->D:Landroidx/compose/ui/viewinterop/i;

    invoke-virtual {v1}, Landroidx/compose/ui/viewinterop/i;->getUpdateBlock()Lx7/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/i$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
