.class public final synthetic Lcom/google/android/gms/internal/ads/pT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/tT;

.field public final synthetic D:Landroid/app/Activity;

.field public final synthetic E:Lu3/x;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/tT;Landroid/app/Activity;Lu3/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pT;->C:Lcom/google/android/gms/internal/ads/tT;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pT;->D:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/pT;->E:Lu3/x;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pT;->C:Lcom/google/android/gms/internal/ads/tT;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pT;->D:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pT;->E:Lu3/x;

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/google/android/gms/internal/ads/tT;->u6(Landroid/app/Activity;Lu3/x;Landroid/content/DialogInterface;I)V

    return-void
.end method
