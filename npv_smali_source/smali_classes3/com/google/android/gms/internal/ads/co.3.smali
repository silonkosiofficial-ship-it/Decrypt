.class final Lcom/google/android/gms/internal/ads/co;
.super Lcom/google/android/gms/internal/ads/xq;
.source "SourceFile"


# instance fields
.field final synthetic C:LD3/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eo;LD3/b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/co;->C:LD3/b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/xq;-><init>()V

    return-void
.end method


# virtual methods
.method public final M1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    new-instance v0, LD3/a;

    new-instance v1, Ls3/s1;

    invoke-direct {v1, p1, p3, p2}, Ls3/s1;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LD3/a;-><init>(Ls3/s1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/co;->C:LD3/b;

    invoke-virtual {p1, v0}, LD3/b;->b(LD3/a;)V

    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/co;->C:LD3/b;

    invoke-virtual {v0, p1}, LD3/b;->a(Ljava/lang/String;)V

    return-void
.end method
