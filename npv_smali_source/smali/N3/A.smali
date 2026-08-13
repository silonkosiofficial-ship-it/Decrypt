.class abstract LN3/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[LN3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LN3/x;

    sget-object v1, LN3/B;->c:LN3/z;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LN3/B;->d:LN3/z;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, LN3/A;->a:[LN3/x;

    return-void
.end method
