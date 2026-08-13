.class public final Lcom/google/android/gms/internal/ads/HB0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Zz0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ut;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Zz0;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Zz0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ut;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/HB0;->a:Lcom/google/android/gms/internal/ads/Zz0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/WA0;)Lcom/google/android/gms/internal/ads/HB0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HB0;->a:Lcom/google/android/gms/internal/ads/Zz0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->r:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/android/gms/internal/ads/Rz0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Rz0;-><init>(Lcom/google/android/gms/internal/ads/WA0;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->f:Lcom/google/android/gms/internal/ads/Tg0;

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/PJ0;)Lcom/google/android/gms/internal/ads/HB0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HB0;->a:Lcom/google/android/gms/internal/ads/Zz0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->r:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/android/gms/internal/ads/Yz0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Yz0;-><init>(Lcom/google/android/gms/internal/ads/PJ0;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->e:Lcom/google/android/gms/internal/ads/Tg0;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/IB0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HB0;->a:Lcom/google/android/gms/internal/ads/Zz0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zz0;->r:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/Zz0;->r:Z

    new-instance v1, Lcom/google/android/gms/internal/ads/IB0;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/IB0;-><init>(Lcom/google/android/gms/internal/ads/Zz0;)V

    return-object v1
.end method
