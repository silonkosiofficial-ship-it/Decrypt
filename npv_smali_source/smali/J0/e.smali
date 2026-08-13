.class public final synthetic LJ0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:LW8/z0;


# direct methods
.method public synthetic constructor <init>(LW8/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ0/e;->a:LW8/z0;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, LJ0/e;->a:LW8/z0;

    invoke-static {v0}, LJ0/f;->a(LW8/z0;)V

    return-void
.end method
