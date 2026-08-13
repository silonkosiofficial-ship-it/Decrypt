.class final Landroidx/compose/ui/platform/W$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/W;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/W;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/W;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/W$a;->D:Landroidx/compose/ui/platform/W;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/W$a;->D:Landroidx/compose/ui/platform/W;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/W;->c(Landroidx/compose/ui/platform/W;Landroid/view/ActionMode;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/W$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
