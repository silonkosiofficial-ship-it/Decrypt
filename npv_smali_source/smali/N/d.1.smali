.class final LN/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/ui/platform/A1;

.field private b:I

.field private c:Lz0/B;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/A1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/d;->a:Landroidx/compose/ui/platform/A1;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LN/d;->b:I

    return v0
.end method

.method public final b(Lz0/B;Lz0/B;)Z
    .locals 1

    iget-object v0, p0, LN/d;->a:Landroidx/compose/ui/platform/A1;

    invoke-static {v0, p1, p2}, LN/s;->b(Landroidx/compose/ui/platform/A1;Lz0/B;Lz0/B;)Z

    move-result p1

    return p1
.end method

.method public final c(Lz0/B;Lz0/B;)Z
    .locals 2

    .prologue
    invoke-virtual {p2}, Lz0/B;->o()J

    move-result-wide v0

    invoke-virtual {p1}, Lz0/B;->o()J

    move-result-wide p1

    sub-long/2addr v0, p1

    iget-object p1, p0, LN/d;->a:Landroidx/compose/ui/platform/A1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/A1;->a()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(Lz0/p;)V
    .locals 3

    .prologue
    iget-object v0, p0, LN/d;->c:Lz0/B;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/B;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, LN/d;->c(Lz0/B;Lz0/B;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, p1}, LN/d;->b(Lz0/B;Lz0/B;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LN/d;->b:I

    add-int/2addr v0, v1

    iput v0, p0, LN/d;->b:I

    goto :goto_0

    :cond_0
    iput v1, p0, LN/d;->b:I

    :goto_0
    iput-object p1, p0, LN/d;->c:Lz0/B;

    return-void
.end method
