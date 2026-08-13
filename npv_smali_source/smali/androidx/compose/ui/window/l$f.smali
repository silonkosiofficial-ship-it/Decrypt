.class final Landroidx/compose/ui/window/l$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/l;-><init>(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;LY0/e;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l$f;->D:Landroidx/compose/ui/window/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l$f;->D:Landroidx/compose/ui/window/l;

    invoke-static {v0}, Landroidx/compose/ui/window/l;->l(Landroidx/compose/ui/window/l;)LD0/t;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/l$f;->D:Landroidx/compose/ui/window/l;

    invoke-virtual {v0}, Landroidx/compose/ui/window/l;->getPopupContentSize-bOM6tXw()LY0/t;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/window/l$f;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
