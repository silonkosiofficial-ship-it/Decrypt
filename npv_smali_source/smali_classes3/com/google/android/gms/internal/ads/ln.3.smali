.class final Lcom/google/android/gms/internal/ads/ln;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/nn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/nn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ln;->C:Lcom/google/android/gms/internal/ads/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ln;->C:Lcom/google/android/gms/internal/ads/nn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nn;->i()Landroid/content/Intent;

    move-result-object p2

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/nn;->h(Lcom/google/android/gms/internal/ads/nn;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lv3/E0;->t(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
