.class public final synthetic Lcom/google/android/gms/internal/ads/IA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/SA0;

.field public final synthetic D:I

.field public final synthetic E:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/SA0;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/IA0;->C:Lcom/google/android/gms/internal/ads/SA0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/IA0;->D:I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/IA0;->E:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IA0;->C:Lcom/google/android/gms/internal/ads/SA0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/IA0;->D:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/IA0;->E:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/SA0;->a0(IZ)V

    return-void
.end method
