.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super LZ1/a;
.source "SourceFile"

# interfaces
.implements Li4/l$a;


# instance fields
.field private E:Li4/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LZ1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, LZ1/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->E:Li4/l;

    if-nez v0, :cond_0

    new-instance v0, Li4/l;

    invoke-direct {v0, p0}, Li4/l;-><init>(Li4/l$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->E:Li4/l;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->E:Li4/l;

    invoke-virtual {v0, p1, p2}, Li4/l;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
