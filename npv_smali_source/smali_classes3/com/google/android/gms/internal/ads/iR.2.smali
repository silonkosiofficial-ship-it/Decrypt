.class public final Lcom/google/android/gms/internal/ads/iR;
.super Lcom/google/android/gms/internal/ads/Go;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/kR;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/kR;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iR;->C:Lcom/google/android/gms/internal/ads/kR;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Go;-><init>()V

    return-void
.end method


# virtual methods
.method public final C3(Lv3/D;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iR;->C:Lcom/google/android/gms/internal/ads/kR;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {p1}, Lv3/D;->e()Lv3/C;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final C5(Landroid/os/ParcelFileDescriptor;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/BR;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v1, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/ads/BR;-><init>(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/iR;->C:Lcom/google/android/gms/internal/ads/kR;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public final H3(Landroid/os/ParcelFileDescriptor;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/BR;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v1, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/iR;->C:Lcom/google/android/gms/internal/ads/kR;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/kR;->e:Lcom/google/android/gms/internal/ads/Po;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/BR;-><init>(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void
.end method
