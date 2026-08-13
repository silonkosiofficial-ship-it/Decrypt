.class public final Lcom/google/android/gms/internal/ads/UO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/GO;


# instance fields
.field private final a:J

.field private final b:Lcom/google/android/gms/internal/ads/cY;


# direct methods
.method constructor <init>(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/NO;Lcom/google/android/gms/internal/ads/Su;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/UO;->a:J

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/Su;->B()Lcom/google/android/gms/internal/ads/T50;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/T50;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/T50;

    new-instance p2, Ls3/c2;

    invoke-direct {p2}, Ls3/c2;-><init>()V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/T50;->b(Ls3/c2;)Lcom/google/android/gms/internal/ads/T50;

    invoke-interface {p1, p6}, Lcom/google/android/gms/internal/ads/T50;->y(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/T50;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/T50;->f()Lcom/google/android/gms/internal/ads/U50;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/U50;->a()Lcom/google/android/gms/internal/ads/cY;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UO;->b:Lcom/google/android/gms/internal/ads/cY;

    new-instance p2, Lcom/google/android/gms/internal/ads/TO;

    invoke-direct {p2, p0, p4}, Lcom/google/android/gms/internal/ads/TO;-><init>(Lcom/google/android/gms/internal/ads/UO;Lcom/google/android/gms/internal/ads/NO;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/cY;->u3(Ls3/H;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/UO;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/UO;->a:J

    return-wide v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UO;->b:Lcom/google/android/gms/internal/ads/cY;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cY;->C()V

    return-void
.end method

.method public final b(Ls3/X1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UO;->b:Lcom/google/android/gms/internal/ads/cY;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cY;->K3(Ls3/X1;)Z

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UO;->b:Lcom/google/android/gms/internal/ads/cY;

    const/4 v1, 0x0

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cY;->m6(LX3/a;)V

    return-void
.end method
