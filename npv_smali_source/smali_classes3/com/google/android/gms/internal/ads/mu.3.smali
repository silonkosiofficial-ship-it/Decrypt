.class public final synthetic Lcom/google/android/gms/internal/ads/mu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nd;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/mu;->a:Z

    iput p2, p0, Lcom/google/android/gms/internal/ads/mu;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Xe;)V
    .locals 3

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/qu;->D0:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ee;->d0()Lcom/google/android/gms/internal/ads/De;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/De;->B()Z

    move-result v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/mu;->a:Z

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/De;->z(Z)Lcom/google/android/gms/internal/ads/De;

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/mu;->b:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/De;->A(I)Lcom/google/android/gms/internal/ads/De;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ee;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xe;->F(Lcom/google/android/gms/internal/ads/Ee;)Lcom/google/android/gms/internal/ads/Xe;

    return-void
.end method
