.class public final Lcom/google/android/gms/internal/ads/Ac;
.super Lcom/google/android/gms/internal/ads/Jc;
.source "SourceFile"


# instance fields
.field private final C:Lm3/a$a;

.field private final D:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lm3/a$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ac;->C:Lm3/a$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ac;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B(I)V
    .locals 0

    return-void
.end method

.method public final B3(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ac;->C:Lm3/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ac;->C:Lm3/a$a;

    invoke-virtual {v0, p1}, Lk3/e;->a(Lk3/m;)V

    :cond_0
    return-void
.end method

.method public final Q0(Lcom/google/android/gms/internal/ads/Hc;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ac;->C:Lm3/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ac;->D:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/Bc;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Bc;-><init>(Lcom/google/android/gms/internal/ads/Hc;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ac;->C:Lm3/a$a;

    invoke-virtual {p1, v1}, Lk3/e;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
