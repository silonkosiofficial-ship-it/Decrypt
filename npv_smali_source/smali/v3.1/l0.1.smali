.class final Lv3/l0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lv3/m0;


# direct methods
.method constructor <init>(Lv3/m0;)V
    .locals 0

    iput-object p1, p0, Lv3/l0;->a:Lv3/m0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lv3/l0;->a:Lv3/m0;

    invoke-static {v0, p1, p2}, Lv3/m0;->a(Lv3/m0;Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
