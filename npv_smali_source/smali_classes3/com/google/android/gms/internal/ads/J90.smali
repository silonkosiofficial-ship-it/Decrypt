.class public final Lcom/google/android/gms/internal/ads/J90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Z

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/google/android/gms/internal/ads/V90;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:J

.field private final m:I

.field private final n:I

.field private final o:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/G90;Lcom/google/android/gms/internal/ads/H90;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->v(Lcom/google/android/gms/internal/ads/G90;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/J90;->m:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->B(Lcom/google/android/gms/internal/ads/G90;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->z(Lcom/google/android/gms/internal/ads/G90;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/J90;->a:J

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->t(Lcom/google/android/gms/internal/ads/G90;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/J90;->b:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->w(Lcom/google/android/gms/internal/ads/G90;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/J90;->n:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->x(Lcom/google/android/gms/internal/ads/G90;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/J90;->o:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->y(Lcom/google/android/gms/internal/ads/G90;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/J90;->c:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->f(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->i(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->n(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->q(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->e(Lcom/google/android/gms/internal/ads/G90;)Lcom/google/android/gms/internal/ads/V90;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->h:Lcom/google/android/gms/internal/ads/V90;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->s(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->r(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->j:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->g(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/J90;->k:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/G90;->z(Lcom/google/android/gms/internal/ads/G90;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/J90;->l:J

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/J90;->c:I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/J90;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/J90;->l:J

    return-wide v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/V90;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->h:Lcom/google/android/gms/internal/ads/V90;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J90;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/J90;->b:Z

    return v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/J90;->m:I

    return v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/J90;->n:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/J90;->o:I

    return v0
.end method
