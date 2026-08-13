.class public final Landroidx/compose/ui/viewinterop/i;
.super Landroidx/compose/ui/viewinterop/c;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/G1;


# instance fields
.field private final f0:Landroid/view/View;

.field private final g0:Ly0/c;

.field private final h0:Le0/g;

.field private final i0:I

.field private final j0:Ljava/lang/String;

.field private k0:Le0/g$a;

.field private l0:Lx7/l;

.field private m0:Lx7/l;

.field private n0:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LV/s;Landroid/view/View;Ly0/c;Le0/g;ILF0/o0;)V
    .locals 7

    .prologue
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p6

    move-object v4, p4

    move-object v5, p3

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LV/s;ILy0/c;Landroid/view/View;LF0/o0;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/i;->f0:Landroid/view/View;

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/i;->g0:Ly0/c;

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/i;->h0:Le0/g;

    iput p6, p0, Landroidx/compose/ui/viewinterop/i;->i0:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->j0:Ljava/lang/String;

    const/4 p2, 0x0

    if-eqz p5, :cond_0

    invoke-interface {p5, p1}, Le0/g;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    instance-of p4, p1, Landroid/util/SparseArray;

    if-eqz p4, :cond_1

    move-object p2, p1

    check-cast p2, Landroid/util/SparseArray;

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p3, p2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->y()V

    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->l0:Lx7/l;

    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->m0:Lx7/l;

    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->e()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->n0:Lx7/l;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LV/s;Landroid/view/View;Ly0/c;Le0/g;ILF0/o0;ILy7/k;)V
    .locals 9

    .prologue
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    new-instance v0, Ly0/c;

    invoke-direct {v0}, Ly0/c;-><init>()V

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LV/s;Landroid/view/View;Ly0/c;Le0/g;ILF0/o0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx7/l;LV/s;Le0/g;ILF0/o0;)V
    .locals 10

    move-object v1, p1

    move-object v0, p2

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LV/s;Landroid/view/View;Ly0/c;Le0/g;ILF0/o0;ILy7/k;)V

    return-void
.end method

.method private final setSavableRegistryEntry(Le0/g$a;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->k0:Le0/g$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le0/g$a;->a()V

    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->k0:Le0/g$a;

    return-void
.end method

.method public static final synthetic w(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/i;->f0:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic x(Landroidx/compose/ui/viewinterop/i;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->z()V

    return-void
.end method

.method private final y()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->h0:Le0/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i;->j0:Ljava/lang/String;

    new-instance v2, Landroidx/compose/ui/viewinterop/i$a;

    invoke-direct {v2, p0}, Landroidx/compose/ui/viewinterop/i$a;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-interface {v0, v1, v2}, Le0/g;->e(Ljava/lang/String;Lx7/a;)Le0/g$a;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Le0/g$a;)V

    :cond_0
    return-void
.end method

.method private final z()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Le0/g$a;)V

    return-void
.end method


# virtual methods
.method public final getDispatcher()Ly0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->g0:Ly0/c;

    return-object v0
.end method

.method public final getReleaseBlock()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->n0:Lx7/l;

    return-object v0
.end method

.method public final getResetBlock()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->m0:Lx7/l;

    return-object v0
.end method

.method public bridge synthetic getSubCompositionView()Landroidx/compose/ui/platform/a;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/platform/F1;->a(Landroidx/compose/ui/platform/G1;)Landroidx/compose/ui/platform/a;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdateBlock()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->l0:Lx7/l;

    return-object v0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final setReleaseBlock(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->n0:Lx7/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$b;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$b;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setRelease(Lx7/a;)V

    return-void
.end method

.method public final setResetBlock(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->m0:Lx7/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$c;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$c;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setReset(Lx7/a;)V

    return-void
.end method

.method public final setUpdateBlock(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->l0:Lx7/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/i$d;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$d;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c;->setUpdate(Lx7/a;)V

    return-void
.end method
