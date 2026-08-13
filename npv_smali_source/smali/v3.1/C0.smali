.class final Lv3/C0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lv3/E0;


# direct methods
.method synthetic constructor <init>(Lv3/E0;Lv3/D0;)V
    .locals 0

    iput-object p1, p0, Lv3/C0;->a:Lv3/E0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv3/C0;->a:Lv3/E0;

    const/4 p2, 0x1

    :goto_0
    invoke-static {p1, p2}, Lv3/E0;->J(Lv3/E0;Z)V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv3/C0;->a:Lv3/E0;

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    return-void
.end method
