.class public final synthetic Lcom/google/android/gms/internal/ads/PI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ZI;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZI;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PI;->C:Lcom/google/android/gms/internal/ads/ZI;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PI;->C:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZI;->Y(Lcom/google/android/gms/internal/ads/ZI;)V

    return-void
.end method
