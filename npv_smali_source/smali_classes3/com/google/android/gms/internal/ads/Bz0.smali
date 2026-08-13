.class public final synthetic Lcom/google/android/gms/internal/ads/Bz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Cz0;

.field public final synthetic D:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Cz0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bz0;->C:Lcom/google/android/gms/internal/ads/Cz0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Bz0;->D:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bz0;->C:Lcom/google/android/gms/internal/ads/Cz0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Cz0;->b:Lcom/google/android/gms/internal/ads/Ez0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Bz0;->D:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Ez0;->c(Lcom/google/android/gms/internal/ads/Ez0;I)V

    return-void
.end method
