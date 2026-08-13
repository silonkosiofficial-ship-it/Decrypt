.class public final Landroidx/compose/ui/platform/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/t1;


# instance fields
.field private final a:Landroid/view/View;

.field private b:Landroid/view/ActionMode;

.field private final c:LH0/c;

.field private d:Landroidx/compose/ui/platform/v1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->a:Landroid/view/View;

    new-instance p1, LH0/c;

    new-instance v1, Landroidx/compose/ui/platform/W$a;

    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/W$a;-><init>(Landroidx/compose/ui/platform/W;)V

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, LH0/c;-><init>(Lx7/a;Ln0/i;Lx7/a;Lx7/a;Lx7/a;Lx7/a;ILy7/k;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    sget-object p1, Landroidx/compose/ui/platform/v1;->D:Landroidx/compose/ui/platform/v1;

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->d:Landroidx/compose/ui/platform/v1;

    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/platform/W;Landroid/view/ActionMode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->b:Landroid/view/ActionMode;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    sget-object v0, Landroidx/compose/ui/platform/v1;->D:Landroidx/compose/ui/platform/v1;

    iput-object v0, p0, Landroidx/compose/ui/platform/W;->d:Landroidx/compose/ui/platform/v1;

    iget-object v0, p0, Landroidx/compose/ui/platform/W;->b:Landroid/view/ActionMode;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/W;->b:Landroid/view/ActionMode;

    return-void
.end method

.method public b(Ln0/i;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-virtual {v0, p1}, LH0/c;->l(Ln0/i;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-virtual {p1, p2}, LH0/c;->h(Lx7/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-virtual {p1, p4}, LH0/c;->i(Lx7/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-virtual {p1, p3}, LH0/c;->j(Lx7/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-virtual {p1, p5}, LH0/c;->k(Lx7/a;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/W;->b:Landroid/view/ActionMode;

    if-nez p1, :cond_0

    sget-object p1, Landroidx/compose/ui/platform/v1;->C:Landroidx/compose/ui/platform/v1;

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->d:Landroidx/compose/ui/platform/v1;

    sget-object p1, Landroidx/compose/ui/platform/u1;->a:Landroidx/compose/ui/platform/u1;

    iget-object p2, p0, Landroidx/compose/ui/platform/W;->a:Landroid/view/View;

    new-instance p3, LH0/a;

    iget-object p4, p0, Landroidx/compose/ui/platform/W;->c:LH0/c;

    invoke-direct {p3, p4}, LH0/a;-><init>(LH0/c;)V

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/ui/platform/u1;->b(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/W;->b:Landroid/view/ActionMode;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public d()Landroidx/compose/ui/platform/v1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/W;->d:Landroidx/compose/ui/platform/v1;

    return-object v0
.end method
