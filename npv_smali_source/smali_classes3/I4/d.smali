.class public abstract LI4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI4/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LI4/d$a;
    .locals 1

    new-instance v0, LI4/p;

    invoke-direct {v0}, LI4/p;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/net/Network;
.end method

.method public abstract c()Ljava/lang/Long;
.end method

.method public abstract d()Ljava/lang/String;
.end method
