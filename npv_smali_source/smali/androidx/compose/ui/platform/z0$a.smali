.class final Landroidx/compose/ui/platform/z0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/z0;-><init>(Lr0/c;Lo0/C1;Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/z0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/z0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/z0$a;->D:Landroidx/compose/ui/platform/z0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/z0$a;->D:Landroidx/compose/ui/platform/z0;

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v1

    invoke-interface {v1}, Lq0/d;->h()Lo0/q0;

    move-result-object v1

    invoke-static {v0}, Landroidx/compose/ui/platform/z0;->l(Landroidx/compose/ui/platform/z0;)Lx7/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->f()Lr0/c;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/z0$a;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
