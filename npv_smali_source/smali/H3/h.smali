.class public abstract LH3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN3/d;

.field public static final b:[LN3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LN3/d;

    const-string v1, "app_set_id"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, LN3/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, LH3/h;->a:LN3/d;

    const/4 v1, 0x1

    new-array v1, v1, [LN3/d;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LH3/h;->b:[LN3/d;

    return-void
.end method
