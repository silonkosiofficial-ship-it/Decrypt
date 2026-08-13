.class public final Landroidx/room/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/room/d;


# direct methods
.method constructor <init>(Landroidx/room/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$d;->a:Landroidx/room/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/d$d;->a:Landroidx/room/d;

    invoke-static {p2}, Landroidx/room/b$a;->q0(Landroid/os/IBinder;)Landroidx/room/b;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/room/d;->g(Landroidx/room/d;Landroidx/room/b;)V

    iget-object p1, p0, Landroidx/room/d$d;->a:Landroidx/room/d;

    invoke-static {p1}, Landroidx/room/d;->f(Landroidx/room/d;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/d$d;->a:Landroidx/room/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/room/d;->g(Landroidx/room/d;Landroidx/room/b;)V

    return-void
.end method
