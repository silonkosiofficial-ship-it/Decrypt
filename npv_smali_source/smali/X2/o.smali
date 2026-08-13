.class public abstract LX2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/o$a;,
        LX2/o$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LX2/o$a;
    .locals 1

    new-instance v0, LX2/e$b;

    invoke-direct {v0}, LX2/e$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()LX2/a;
.end method

.method public abstract c()LX2/o$b;
.end method
