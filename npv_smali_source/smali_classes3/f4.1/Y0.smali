.class public final Lf4/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# direct methods
.method public constructor <init>(Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lf4/v;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lf4/X0;

    invoke-direct {v1, v0}, Lf4/X0;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v1
.end method
