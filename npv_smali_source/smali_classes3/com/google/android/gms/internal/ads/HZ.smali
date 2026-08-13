.class public final Lcom/google/android/gms/internal/ads/HZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/HZ;->a:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x3a

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HZ;->a:Lcom/google/android/gms/internal/ads/n70;

    new-instance v1, Lcom/google/android/gms/internal/ads/IZ;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/n70;->p:Z

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/IZ;-><init>(Z)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
