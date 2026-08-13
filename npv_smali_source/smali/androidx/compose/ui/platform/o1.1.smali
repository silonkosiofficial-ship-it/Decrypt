.class public final Landroidx/compose/ui/platform/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LK0/k;

.field private final b:Lr/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LK0/o;Lr/n;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/o1;->a:LK0/k;

    invoke-static {}, Lr/q;->b()Lr/D;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/o1;->b:Lr/D;

    invoke-virtual {p1}, LK0/o;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK0/o;

    invoke-virtual {v2}, LK0/o;->o()I

    move-result v3

    invoke-virtual {p2, v3}, Lr/n;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroidx/compose/ui/platform/o1;->b:Lr/D;

    invoke-virtual {v2}, LK0/o;->o()I

    move-result v2

    invoke-virtual {v3, v2}, Lr/D;->f(I)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lr/D;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o1;->b:Lr/D;

    return-object v0
.end method

.method public final b()LK0/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o1;->a:LK0/k;

    return-object v0
.end method
