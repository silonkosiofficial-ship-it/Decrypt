.class public abstract LU0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LU0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU0/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/p;-><init>(Z)V

    sput-object v0, LU0/o;->a:LU0/p;

    return-void
.end method

.method public static final synthetic a()LU0/p;
    .locals 1

    sget-object v0, LU0/o;->a:LU0/p;

    return-object v0
.end method
