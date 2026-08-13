.class public abstract LH/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LH/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/s$a;

    invoke-direct {v0}, LH/s$a;-><init>()V

    sput-object v0, LH/s;->a:LH/q;

    return-void
.end method

.method public static final a()LH/q;
    .locals 1

    sget-object v0, LH/s;->a:LH/q;

    return-object v0
.end method
