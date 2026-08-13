.class public final synthetic Lcom/google/android/gms/internal/ads/lT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic C:Lu3/x;


# direct methods
.method public synthetic constructor <init>(Lu3/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lT;->C:Lu3/x;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lT;->C:Lu3/x;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu3/x;->b()V

    :cond_0
    return-void
.end method
