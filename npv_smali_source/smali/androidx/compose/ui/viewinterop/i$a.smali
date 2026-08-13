.class final Landroidx/compose/ui/viewinterop/i$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/i;->y()V
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

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i$a;->D:Landroidx/compose/ui/viewinterop/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i$a;->D:Landroidx/compose/ui/viewinterop/i;

    invoke-static {v1}, Landroidx/compose/ui/viewinterop/i;->w(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    return-object v0
.end method
