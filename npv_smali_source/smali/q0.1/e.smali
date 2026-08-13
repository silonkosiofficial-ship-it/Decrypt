.class public abstract Lq0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LY0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, LY0/g;->a(FF)LY0/e;

    move-result-object v0

    sput-object v0, Lq0/e;->a:LY0/e;

    return-void
.end method

.method public static final a()LY0/e;
    .locals 1

    sget-object v0, Lq0/e;->a:LY0/e;

    return-object v0
.end method
