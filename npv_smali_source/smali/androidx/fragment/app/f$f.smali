.class Landroidx/fragment/app/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f;->T0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/fragment/app/f;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/f$f;->C:Landroidx/fragment/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    .prologue
    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/f$f;->C:Landroidx/fragment/app/f;

    iget-object p1, p1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroidx/fragment/app/f$h;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
