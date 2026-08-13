.class final Landroidx/compose/ui/platform/C0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/C0;->c(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/C0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/C0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/C0$a;->D:Landroidx/compose/ui/platform/C0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/z;)V
    .locals 4

    .prologue
    invoke-interface {p1}, LS0/z;->a()V

    iget-object v0, p0, Landroidx/compose/ui/platform/C0$a;->D:Landroidx/compose/ui/platform/C0;

    invoke-static {v0}, Landroidx/compose/ui/platform/C0;->a(Landroidx/compose/ui/platform/C0;)LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-static {v3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    const/4 v2, -0x1

    :goto_0
    if-ltz v2, :cond_3

    iget-object p1, p0, Landroidx/compose/ui/platform/C0$a;->D:Landroidx/compose/ui/platform/C0;

    invoke-static {p1}, Landroidx/compose/ui/platform/C0;->a(Landroidx/compose/ui/platform/C0;)LX/b;

    move-result-object p1

    invoke-virtual {p1, v2}, LX/b;->D(I)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Landroidx/compose/ui/platform/C0$a;->D:Landroidx/compose/ui/platform/C0;

    invoke-static {p1}, Landroidx/compose/ui/platform/C0;->a(Landroidx/compose/ui/platform/C0;)LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->w()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/compose/ui/platform/C0$a;->D:Landroidx/compose/ui/platform/C0;

    invoke-static {p1}, Landroidx/compose/ui/platform/C0;->b(Landroidx/compose/ui/platform/C0;)Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/z;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/C0$a;->a(LS0/z;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
