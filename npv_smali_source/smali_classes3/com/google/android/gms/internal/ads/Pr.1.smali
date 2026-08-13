.class public final synthetic Lcom/google/android/gms/internal/ads/Pr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Tr;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Tr;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pr;->C:Lcom/google/android/gms/internal/ads/Tr;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/Pr;->D:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pr;->C:Lcom/google/android/gms/internal/ads/Tr;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/Pr;->D:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Tr;->A(Z)V

    return-void
.end method
