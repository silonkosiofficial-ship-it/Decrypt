.class public final Lcom/google/android/gms/internal/ads/S5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/a6;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/D;

.field private b:Lcom/google/android/gms/internal/ads/bV;

.field private c:Lcom/google/android/gms/internal/ads/a1;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/S5;->a:Lcom/google/android/gms/internal/ads/D;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/bV;Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/S5;->b:Lcom/google/android/gms/internal/ads/bV;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/S5;->c:Lcom/google/android/gms/internal/ads/a1;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/S5;->a:Lcom/google/android/gms/internal/ads/D;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/S5;->b:Lcom/google/android/gms/internal/ads/bV;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/S5;->b:Lcom/google/android/gms/internal/ads/bV;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bV;->e()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/S5;->b:Lcom/google/android/gms/internal/ads/bV;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bV;->f()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/S5;->a:Lcom/google/android/gms/internal/ads/D;

    iget-wide v5, v4, Lcom/google/android/gms/internal/ads/D;->t:J

    cmp-long v5, v0, v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->F(J)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/S5;->a:Lcom/google/android/gms/internal/ads/D;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/S5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/S5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v0, p1, v5}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/S5;->c:Lcom/google/android/gms/internal/ads/a1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    :cond_2
    :goto_0
    return-void
.end method
