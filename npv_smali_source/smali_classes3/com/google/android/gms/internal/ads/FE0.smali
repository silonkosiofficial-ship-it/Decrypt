.class public final synthetic Lcom/google/android/gms/internal/ads/FE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/JE0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/D;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/Hz0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/JE0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/FE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/FE0;->D:Lcom/google/android/gms/internal/ads/D;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/FE0;->E:Lcom/google/android/gms/internal/ads/Hz0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/FE0;->D:Lcom/google/android/gms/internal/ads/D;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/FE0;->E:Lcom/google/android/gms/internal/ads/Hz0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/JE0;->r(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V

    return-void
.end method
