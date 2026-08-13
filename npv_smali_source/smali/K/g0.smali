.class public final synthetic LK/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:LN/F;


# direct methods
.method public synthetic constructor <init>(LN/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/g0;->a:LN/F;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, LK/g0;->a:LN/F;

    invoke-static {v0}, LK/i0;->a(LN/F;)V

    return-void
.end method
