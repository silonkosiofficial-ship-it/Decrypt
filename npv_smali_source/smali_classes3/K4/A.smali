.class public final synthetic LK4/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:LK4/d;


# direct methods
.method public synthetic constructor <init>(LK4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK4/A;->a:LK4/d;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, LK4/A;->a:LK4/d;

    invoke-static {v0}, LK4/d;->k(LK4/d;)V

    return-void
.end method
