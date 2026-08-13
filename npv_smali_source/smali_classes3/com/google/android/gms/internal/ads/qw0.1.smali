.class final Lcom/google/android/gms/internal/ads/qw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Ew0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/mw0;

.field private final b:Lcom/google/android/gms/internal/ads/Lw0;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/ads/yv0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/Lw0;Lcom/google/android/gms/internal/ads/yv0;Lcom/google/android/gms/internal/ads/mw0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qw0;->b:Lcom/google/android/gms/internal/ads/Lw0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/qw0;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qw0;->d:Lcom/google/android/gms/internal/ads/yv0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qw0;->a:Lcom/google/android/gms/internal/ads/mw0;

    return-void
.end method

.method static k(Lcom/google/android/gms/internal/ads/Lw0;Lcom/google/android/gms/internal/ads/yv0;Lcom/google/android/gms/internal/ads/mw0;)Lcom/google/android/gms/internal/ads/qw0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/qw0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/qw0;-><init>(Lcom/google/android/gms/internal/ads/Lw0;Lcom/google/android/gms/internal/ads/yv0;Lcom/google/android/gms/internal/ads/mw0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qw0;->b:Lcom/google/android/gms/internal/ads/Lw0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Lw0;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qw0;->d:Lcom/google/android/gms/internal/ads/yv0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yv0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 2

    .prologue
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Mw0;->b()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qw0;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 2

    .prologue
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/qw0;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qw0;->a:Lcom/google/android/gms/internal/ads/mw0;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/Jv0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->K()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mw0;->b()Lcom/google/android/gms/internal/ads/lw0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/lw0;->s()Lcom/google/android/gms/internal/ads/mw0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qw0;->b:Lcom/google/android/gms/internal/ads/Lw0;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Gw0;->A(Lcom/google/android/gms/internal/ads/Lw0;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/qw0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qw0;->d:Lcom/google/android/gms/internal/ads/yv0;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Gw0;->z(Lcom/google/android/gms/internal/ads/yv0;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    check-cast p2, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/qw0;->c:Z

    if-nez p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/Yw0;)V
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/Su0;)V
    .locals 0

    .prologue
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/ads/Jv0;

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->c()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->f()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    :goto_0
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/yw0;Lcom/google/android/gms/internal/ads/xv0;)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/qw0;->b:Lcom/google/android/gms/internal/ads/Lw0;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Lw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
