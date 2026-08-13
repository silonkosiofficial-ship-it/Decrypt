.class public abstract LT/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LM0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM0/A;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM0/A;-><init>(Z)V

    sput-object v0, LT/l;->a:LM0/A;

    return-void
.end method

.method public static final a()LM0/A;
    .locals 1

    sget-object v0, LT/l;->a:LM0/A;

    return-object v0
.end method
