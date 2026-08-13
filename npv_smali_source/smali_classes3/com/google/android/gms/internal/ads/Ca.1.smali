.class final Lcom/google/android/gms/internal/ads/Ca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/Da;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Da;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ca;->C:Lcom/google/android/gms/internal/ads/Da;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ca;->C:Lcom/google/android/gms/internal/ads/Da;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Da;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    return-void
.end method
