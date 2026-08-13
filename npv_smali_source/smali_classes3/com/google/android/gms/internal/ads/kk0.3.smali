.class public final synthetic Lcom/google/android/gms/internal/ads/kk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/mk0;

.field public final synthetic D:I

.field public final synthetic E:LP4/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/mk0;ILP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kk0;->C:Lcom/google/android/gms/internal/ads/mk0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/kk0;->D:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kk0;->E:LP4/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kk0;->C:Lcom/google/android/gms/internal/ads/mk0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/kk0;->D:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kk0;->E:LP4/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mk0;->U(ILP4/d;)V

    return-void
.end method
