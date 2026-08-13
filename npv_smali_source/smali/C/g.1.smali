.class public final LC/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/m;


# instance fields
.field private final a:LC/K;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC/K;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/g;->a:LC/K;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LC/g;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->d()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LC/g;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/k;

    invoke-interface {v0}, LC/k;->getIndex()I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    .prologue
    iget-object v0, p0, LC/g;->a:LC/K;

    invoke-virtual {v0}, LC/K;->x()LD0/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/Z;->j()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LC/g;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LC/g;->a:LC/K;

    invoke-virtual {v0}, LC/K;->n()I

    move-result v0

    return v0
.end method
