.class public final Lu3/E;
.super Lu3/x;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/x;-><init>(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final W3(Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "AdOverlayParcel is null or does not contain valid overlay type."

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    const/4 p1, 0x4

    iput p1, p0, Lu3/x;->X:I

    iget-object p1, p0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
