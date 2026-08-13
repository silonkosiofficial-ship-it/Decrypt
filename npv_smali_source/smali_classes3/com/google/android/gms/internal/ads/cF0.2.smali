.class public final synthetic Lcom/google/android/gms/internal/ads/cF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/OE0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/LE0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/OE0;Lcom/google/android/gms/internal/ads/LE0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cF0;->C:Lcom/google/android/gms/internal/ads/OE0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cF0;->D:Lcom/google/android/gms/internal/ads/LE0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cF0;->C:Lcom/google/android/gms/internal/ads/OE0;

    check-cast v0, Lcom/google/android/gms/internal/ads/IF0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/IF0;->a:Lcom/google/android/gms/internal/ads/KF0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KF0;->e1(Lcom/google/android/gms/internal/ads/KF0;)Lcom/google/android/gms/internal/ads/JE0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cF0;->D:Lcom/google/android/gms/internal/ads/LE0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/JE0;->d(Lcom/google/android/gms/internal/ads/LE0;)V

    return-void
.end method
