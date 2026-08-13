.class public final Lf4/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private a:Lf4/V0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lf4/V0;Lf4/V0;)V
    .locals 1

    .prologue
    check-cast p0, Lf4/Q0;

    iget-object v0, p0, Lf4/Q0;->a:Lf4/V0;

    if-nez v0, :cond_0

    iput-object p1, p0, Lf4/Q0;->a:Lf4/V0;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lf4/Q0;->a:Lf4/V0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
