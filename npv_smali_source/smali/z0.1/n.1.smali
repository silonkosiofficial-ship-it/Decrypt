.class public Lz0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:I


# instance fields
.field private final a:LX/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LX/b;->F:I

    sput v0, Lz0/n;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [Lz0/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Lz0/n;->a:LX/b;

    return-void
.end method


# virtual methods
.method public a(Lr/v;LD0/t;Lz0/h;Z)Z
    .locals 6

    .prologue
    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lz0/m;

    invoke-virtual {v5, p1, p2, p3, p4}, Lz0/m;->a(Lr/v;LD0/t;Lz0/h;Z)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    :cond_3
    return v2
.end method

.method public b(Lz0/h;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lz0/n;->a:LX/b;

    invoke-virtual {p1}, LX/b;->t()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    const/4 v0, -0x1

    if-ge v0, p1, :cond_1

    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, p1

    check-cast v0, Lz0/m;

    invoke-virtual {v0}, Lz0/m;->l()LA0/b;

    move-result-object v0

    invoke-virtual {v0}, LA0/b;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->D(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    return-void
.end method

.method public d()V
    .locals 4

    .prologue
    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Lz0/m;

    invoke-virtual {v3}, Lz0/m;->d()V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method

.method public e(Lz0/h;)Z
    .locals 6

    .prologue
    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lz0/m;

    invoke-virtual {v5, p1}, Lz0/m;->e(Lz0/h;)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    :cond_3
    invoke-virtual {p0, p1}, Lz0/n;->b(Lz0/h;)V

    return v2
.end method

.method public f(Lr/v;LD0/t;Lz0/h;Z)Z
    .locals 6

    .prologue
    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lz0/m;

    invoke-virtual {v5, p1, p2, p3, p4}, Lz0/m;->f(Lr/v;LD0/t;Lz0/h;Z)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    :cond_3
    return v2
.end method

.method public final g()LX/b;
    .locals 1

    iget-object v0, p0, Lz0/n;->a:LX/b;

    return-object v0
.end method

.method public final h()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, v0

    check-cast v1, Lz0/m;

    invoke-virtual {v1}, Lz0/m;->k()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lz0/m;->d()V

    iget-object v1, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v1, v0}, LX/b;->D(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1}, Lz0/n;->h()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i(JLr/I;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lz0/n;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Lz0/m;

    invoke-virtual {v3, p1, p2, p3}, Lz0/m;->i(JLr/I;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method
