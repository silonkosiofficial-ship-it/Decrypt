.class public abstract LX2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/p$a;,
        LX2/p$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LX2/p$a;
    .locals 1

    new-instance v0, LX2/f$b;

    invoke-direct {v0}, LX2/f$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()LX2/s;
.end method

.method public abstract c()LX2/p$b;
.end method
