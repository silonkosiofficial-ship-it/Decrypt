.class public abstract Lio/ktor/utils/io/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lio/ktor/utils/io/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/ktor/utils/io/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/ktor/utils/io/n;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, Lio/ktor/utils/io/o;->a:Lio/ktor/utils/io/n;

    return-void
.end method

.method public static final a()Lio/ktor/utils/io/n;
    .locals 1

    sget-object v0, Lio/ktor/utils/io/o;->a:Lio/ktor/utils/io/n;

    return-object v0
.end method
