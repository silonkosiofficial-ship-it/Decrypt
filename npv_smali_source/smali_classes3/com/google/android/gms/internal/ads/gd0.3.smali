.class public final Lcom/google/android/gms/internal/ads/gd0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gd0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gd0;->b:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/xd0;->b0()Lcom/google/android/gms/internal/ads/ud0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gd0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ud0;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ud0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ud0;->B(I)Lcom/google/android/gms/internal/ads/ud0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/td0;->b0()Lcom/google/android/gms/internal/ads/rd0;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/rd0;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rd0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/rd0;->A(I)Lcom/google/android/gms/internal/ads/rd0;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/ud0;->A(Lcom/google/android/gms/internal/ads/rd0;)Lcom/google/android/gms/internal/ads/ud0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/xd0;

    new-instance v0, Lcom/google/android/gms/internal/ads/hd0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gd0;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gd0;->b:Landroid/os/Looper;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/hd0;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/ads/xd0;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hd0;->a()V

    return-void
.end method
