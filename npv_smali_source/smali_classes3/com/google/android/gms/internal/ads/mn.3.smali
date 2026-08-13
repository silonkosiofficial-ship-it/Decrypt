.class final Lcom/google/android/gms/internal/ads/mn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/nn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mn;->C:Lcom/google/android/gms/internal/ads/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mn;->C:Lcom/google/android/gms/internal/ads/nn;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/wn;->c(Ljava/lang/String;)V

    return-void
.end method
