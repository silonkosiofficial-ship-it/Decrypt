.class abstract LI4/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LI4/C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI4/C;

    invoke-direct {v0}, LI4/C;-><init>()V

    sput-object v0, LI4/B;->a:LI4/C;

    return-void
.end method

.method static bridge synthetic a()LI4/C;
    .locals 1

    sget-object v0, LI4/B;->a:LI4/C;

    return-object v0
.end method
