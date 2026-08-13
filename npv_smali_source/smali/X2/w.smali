.class public abstract LX2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/w$a;,
        LX2/w$b;,
        LX2/w$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LX2/w$a;
    .locals 1

    new-instance v0, LX2/m$b;

    invoke-direct {v0}, LX2/m$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()LX2/w$b;
.end method

.method public abstract c()LX2/w$c;
.end method
