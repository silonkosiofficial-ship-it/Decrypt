.class final Landroidx/compose/ui/platform/r$y;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;->u(Lx7/p;Lm7/e;)Ljava/lang/Object;
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

    iput-object p1, p0, Landroidx/compose/ui/platform/r$y;->D:Landroidx/compose/ui/platform/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LW8/N;)Landroidx/compose/ui/platform/V;
    .locals 3

    new-instance v0, Landroidx/compose/ui/platform/V;

    iget-object v1, p0, Landroidx/compose/ui/platform/r$y;->D:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getTextInputService()LS0/X;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/ui/platform/V;-><init>(Landroid/view/View;LS0/X;LW8/N;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$y;->a(LW8/N;)Landroidx/compose/ui/platform/V;

    move-result-object p1

    return-object p1
.end method
