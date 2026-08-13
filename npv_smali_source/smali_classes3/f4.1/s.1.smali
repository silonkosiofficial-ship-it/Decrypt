.class abstract Lf4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lf4/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/t;

    invoke-direct {v0}, Lf4/t;-><init>()V

    sput-object v0, Lf4/s;->a:Lf4/t;

    return-void
.end method

.method static bridge synthetic a()Lf4/t;
    .locals 1

    sget-object v0, Lf4/s;->a:Lf4/t;

    return-object v0
.end method
