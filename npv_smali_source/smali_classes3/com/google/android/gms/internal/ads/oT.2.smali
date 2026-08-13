.class public final synthetic Lcom/google/android/gms/internal/ads/oT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/tT;

.field public final synthetic D:Lu3/x;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/tT;Lu3/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oT;->C:Lcom/google/android/gms/internal/ads/tT;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/oT;->D:Lu3/x;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oT;->C:Lcom/google/android/gms/internal/ads/tT;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/oT;->D:Lu3/x;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/tT;->t6(Lu3/x;Landroid/content/DialogInterface;)V

    return-void
.end method
