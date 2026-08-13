.class final Lcom/google/android/gms/internal/ads/sn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/tn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sn;->C:Lcom/google/android/gms/internal/ads/tn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sn;->C:Lcom/google/android/gms/internal/ads/tn;

    const-string p2, "User canceled the download."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/wn;->c(Ljava/lang/String;)V

    return-void
.end method
