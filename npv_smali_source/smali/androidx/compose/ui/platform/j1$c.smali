.class final Landroidx/compose/ui/platform/j1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/j1;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/j1$c;->D:Lx7/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/q0;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/j1$c;->D:Lx7/p;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/q0;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/j1$c;->a(Lo0/q0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
