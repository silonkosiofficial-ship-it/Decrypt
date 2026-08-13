.class final Landroidx/compose/ui/viewinterop/e$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->d(Lx7/l;LV/n;I)Lx7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroid/content/Context;

.field final synthetic E:Lx7/l;

.field final synthetic F:LV/s;

.field final synthetic G:Le0/g;

.field final synthetic H:I

.field final synthetic I:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/content/Context;Lx7/l;LV/s;Le0/g;ILandroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/e$i;->D:Landroid/content/Context;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/e$i;->E:Lx7/l;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/e$i;->F:LV/s;

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/e$i;->G:Le0/g;

    iput p5, p0, Landroidx/compose/ui/viewinterop/e$i;->H:I

    iput-object p6, p0, Landroidx/compose/ui/viewinterop/e$i;->I:Landroid/view/View;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF0/J;
    .locals 8

    new-instance v7, Landroidx/compose/ui/viewinterop/i;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/e$i;->D:Landroid/content/Context;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/e$i;->E:Lx7/l;

    iget-object v3, p0, Landroidx/compose/ui/viewinterop/e$i;->F:LV/s;

    iget-object v4, p0, Landroidx/compose/ui/viewinterop/e$i;->G:Le0/g;

    iget v5, p0, Landroidx/compose/ui/viewinterop/e$i;->H:I

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/e$i;->I:Landroid/view/View;

    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.node.Owner"

    invoke-static {v0, v6}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, LF0/o0;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;Lx7/l;LV/s;Le0/g;ILF0/o0;)V

    invoke-virtual {v7}, Landroidx/compose/ui/viewinterop/c;->getLayoutNode()LF0/J;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/e$i;->a()LF0/J;

    move-result-object v0

    return-object v0
.end method
