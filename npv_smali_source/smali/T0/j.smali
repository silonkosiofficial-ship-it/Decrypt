.class public abstract LT0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LT0/f;->a()LT0/i;

    move-result-object v0

    sput-object v0, LT0/j;->a:LT0/i;

    return-void
.end method

.method public static final a()LT0/i;
    .locals 1

    sget-object v0, LT0/j;->a:LT0/i;

    return-object v0
.end method
