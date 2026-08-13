.class public final synthetic Lcom/google/android/gms/internal/ads/j90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/l90;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/a90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/l90;Lcom/google/android/gms/internal/ads/a90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j90;->C:Lcom/google/android/gms/internal/ads/l90;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j90;->D:Lcom/google/android/gms/internal/ads/a90;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j90;->C:Lcom/google/android/gms/internal/ads/l90;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n90;->c(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/o90;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j90;->D:Lcom/google/android/gms/internal/ads/a90;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/o90;->G(Lcom/google/android/gms/internal/ads/a90;)V

    return-void
.end method
