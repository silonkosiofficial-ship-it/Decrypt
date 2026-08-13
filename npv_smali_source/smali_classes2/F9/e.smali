.class public abstract LF9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF9/d;

    invoke-direct {v0}, LF9/d;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, LF9/e;->a:LV/O0;

    return-void
.end method

.method public static synthetic a()LF9/b;
    .locals 1

    invoke-static {}, LF9/e;->b()LF9/b;

    move-result-object v0

    return-object v0
.end method

.method private static final b()LF9/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final c()LV/O0;
    .locals 1

    sget-object v0, LF9/e;->a:LV/O0;

    return-object v0
.end method
